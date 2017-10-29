package com.tools20022.repogenerator;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;

public class ClassDiagramGenerator {

	enum EntityRole {
		MAIN("#FEFECE", true), SUPERTYPE("#FEFEEE", true), SUBTYPE("#FEFEEE", false), RELATED("#EEEEEE",
				false), RELATED_LEVEL2("#EEEEEE", false);

		public final String color;
		public final boolean showAttributes;

		EntityRole(String color, boolean showAttributes) {
			this.color = Objects.requireNonNull(color);
			this.showAttributes = showAttributes;
		}

	}

	private final Map<MMBusinessComponent, EntityRole> addedEntities = new LinkedHashMap<>();
	private final Set<MMBusinessAssociationEnd> addedRefs = new LinkedHashSet<>();

	private final MMBusinessComponent mmBC;
	private final StringWriter sw = new StringWriter();
	private final PrintWriter pw = new PrintWriter(sw);

	ClassDiagramGenerator(MMBusinessComponent mmBC, boolean addLevel2Relations) {
		this.mmBC = Objects.requireNonNull(mmBC);
		{ // Plantuml header
			pw.println("@startuml");
			pw.println();
			pw.println("hide empty members");
			pw.println("hide circle");
		}

		{ // Add entities from inheritance hierarchy
			pw.println("together {");
			addSuperEntity(mmBC);
			addEntity(mmBC, EntityRole.MAIN);

			for (MMBusinessComponent mmSubType : mmBC.getSubType()) {
				addEntity(mmSubType, EntityRole.SUBTYPE);
				pw.println(mmSubType.getName() + " -up-|> " + mmBC.getName());
			}
			pw.println("}");

		}

		{ // Add 1. level related entities, related to MAIN or any SUPERTYPE
			for (Entry<MMBusinessComponent, EntityRole> e : new LinkedHashSet<>(addedEntities.entrySet())) {
				if (EntityRole.SUBTYPE.equals(e.getValue()))
					continue;
				pw.println("together {");
				String prevEntityName = null;
				for (MMBusinessElement mmElem : e.getKey().getElement()) {
					if (!(mmElem instanceof MMBusinessAssociationEnd))
						continue;
					MMBusinessAssociationEnd mmRef = (MMBusinessAssociationEnd) mmElem;
					MMBusinessComponent mmOtherEntity = mmRef.getType();
					if (addedEntities.containsKey(mmOtherEntity))
						continue;
					addEntity(mmOtherEntity, EntityRole.RELATED);
					if (prevEntityName != null) {
						pw.println(mmOtherEntity.getName() + " -[hidden]-> " + prevEntityName + "");
					}
					prevEntityName = mmOtherEntity.getName();
				}
				pw.println("}");
			}
		}
		if (addLevel2Relations) {
			// Add 2. level related entities, related to and previously added entity (exept
			// subtypes)
			for (Entry<MMBusinessComponent, EntityRole> e : new LinkedHashSet<>(addedEntities.entrySet())) {
				if (EntityRole.SUBTYPE.equals(e.getValue()))
					continue;
				for (MMBusinessElement mmElem : e.getKey().getElement()) {
					if (!(mmElem instanceof MMBusinessAssociationEnd))
						continue;
					MMBusinessAssociationEnd mmRef = (MMBusinessAssociationEnd) mmElem;
					MMBusinessComponent mmOtherEntity = mmRef.getType();
					if (addedEntities.containsKey(mmOtherEntity))
						continue;
					addEntity(mmOtherEntity, EntityRole.RELATED);
				}
			}
		}

		{ // Add associations
			for (Entry<MMBusinessComponent, EntityRole> e : new LinkedHashSet<>(addedEntities.entrySet())) {
				for (MMBusinessElement mmElem : e.getKey().getElement()) {
					if (!(mmElem instanceof MMBusinessAssociationEnd))
						continue;
					MMBusinessAssociationEnd mmRef = (MMBusinessAssociationEnd) mmElem;
					if( addedRefs.contains(mmRef))
						continue;
					addedRefs.add(mmRef);
					MMBusinessComponent thisEntity = e.getKey();
					MMBusinessComponent mmOtherEntity = mmRef.getType();
					if( ! addedEntities.containsKey(mmOtherEntity) )
						continue;

					String thisCardinality = mmRef.getMinOccurs().isPresent()
							? mmRef.getMinOccurs().get().toString()
							: "?";
					thisCardinality += "..";
					thisCardinality += mmRef.getMaxOccurs().isPresent() ? mmRef.getMaxOccurs().get().toString()
							: "*";
					if (thisCardinality.equals("1..1"))
						thisCardinality = "1";
					if (thisCardinality.equals("0..*"))
						thisCardinality = "*";

					String otherCardinality = "?";
					if (mmRef.getOpposite().isPresent()) {
						addedRefs.add(mmRef.getOpposite().get());
						MMBusinessAssociationEnd mmOp = mmRef.getOpposite().get();
						otherCardinality = mmOp.getMinOccurs().isPresent() ? mmOp.getMinOccurs().get().toString()
								: "?";
						otherCardinality += "..";
						otherCardinality += mmOp.getMaxOccurs().isPresent() ? mmOp.getMaxOccurs().get().toString()
								: "*";
					}
					pw.println(thisEntity.getName() + " --> \"" + thisCardinality + "\" " + mmOtherEntity.getName()
							+ " : " + mmRef.getName());
				}

			}

		}

		{ // Plantuml footer
			pw.println("@enduml");
		}
	}

	public String getPlantUmlSource() {

		return sw.toString();
	}

	void addSuperEntity(MMBusinessComponent mmBC) {
		if (!mmBC.getSuperType().isPresent())
			return;
		addSuperEntity(mmBC.getSuperType().get());
		addEntity(mmBC.getSuperType().get(), EntityRole.SUPERTYPE);
		pw.println(mmBC.getName() + " -up-|> " + mmBC.getSuperType().get().getName());
	}

	void addEntity(MMBusinessComponent mmBC, EntityRole role) {
		if (addedEntities.containsKey(mmBC))
			return;
		addedEntities.put(mmBC, role);
		pw.print("class " + mmBC.getName() + " ");
		pw.print("[[../" + mmBC.getName() + ".html{" + mmBC.getDefinition().orElse(mmBC.getName()) + "}]] ");
		pw.println(role.color + " {");
		if (role.showAttributes) {
			for (MMBusinessElement mmElem : mmBC.getElement()) {
				if (!(mmElem instanceof MMBusinessAttribute))
					continue;
				MMBusinessAttribute mmAttr = (MMBusinessAttribute) mmElem;
				String typeName;
				if( mmAttr.getSimpleType().isPresent() ) {
					typeName = mmAttr.getSimpleType().get().getName();
				} else if( mmAttr.getComplexType().isPresent() ) {
					typeName = mmAttr.getComplexType().get().getName();
				} else {
					typeName = "?";
				}
				pw.println("+" + mmAttr.getName() + " <i>(" + typeName + ")</i>");
			}
		}
		pw.println("}");
	}
}
