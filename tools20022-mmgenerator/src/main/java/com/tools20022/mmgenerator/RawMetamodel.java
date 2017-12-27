package com.tools20022.mmgenerator;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.MetamodelDocImpl;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;

interface RawMetamodel {

	Stream<? extends MetamodelType> listTypes();

	default Set<? extends MetamodelType> getAllTypes() {
		return listTypes().collect(Collectors.toCollection(LinkedHashSet::new));
	}

	MetamodelType getTypeByName(String name);

	Stream<? extends MetamodelEnum> listEnums();

	default Set<? extends MetamodelEnum> getAllEnums() {
		return listEnums().collect(Collectors.toCollection(LinkedHashSet::new));
	}

	MetamodelEnum getEnumByName(String name);

	public interface MetamodelElement {
		String getName();

		MetamodelDocImpl getDocumentation();

	}

	/**
	 * Note: enums doesn't extend this interface!
	 */
	public interface MetamodelType extends MetamodelElement {
		boolean isAbstract();
		
		Stream<? extends MetamodelType> listSuperTypes( boolean includeThis, boolean recursive );

		Stream<? extends MetamodelType> listSubTypes( boolean includeThis, boolean recursive );

		Stream<? extends MetamodelAttribute> listDeclaredAttributes(); 

		Stream<? extends MetamodelConstraint> listDeclaredConstraints();

		Stream<? extends MetamodelAttribute> listIncomingAttributes();
		
		default Stream<? extends MetamodelAttribute> listAllAttributes() {
			return listSuperTypes( true, true).flatMap(mmType->mmType.listDeclaredAttributes() );
		}

		default Stream<? extends MetamodelConstraint> listAllConstraints() {
			return listSuperTypes(true,true).flatMap(mmType->mmType.listDeclaredConstraints());
		}

		default Set<? extends MetamodelType> getSuperTypes( boolean includeThis, boolean recursive ) {
			return listSuperTypes(includeThis, recursive ).collect(Collectors.toCollection(LinkedHashSet::new));
		}

		default Set<? extends MetamodelAttribute> getDeclaredAttributes() {
			return listDeclaredAttributes().collect(Collectors.toCollection(LinkedHashSet::new));
		}

		default Set<? extends MetamodelAttribute> getAllAttributes() {
			return listAllAttributes().collect(Collectors.toCollection(LinkedHashSet::new));
		}

		default Set<? extends MetamodelAttribute> getIncomingAttributes() {
			return listIncomingAttributes().collect(Collectors.toCollection(LinkedHashSet::new));
		}

		default Set<? extends MetamodelType> getPossibleContainers() {
			Stream<? extends MetamodelAttribute> containmentAttrs = listIncomingAttributes().filter(mmAttr->mmAttr.isContainment());
			return containmentAttrs.map(mmAttr->mmAttr.getDeclaringType()).collect(Collectors.toCollection(LinkedHashSet::new));
		}

		default Set<? extends MetamodelConstraint> getDeclaredConstraints() {
			return listDeclaredConstraints().collect(Collectors.toCollection(LinkedHashSet::new));
		}

		default Set<? extends MetamodelConstraint> getAllConstraints() {
			return listAllConstraints().collect(Collectors.toCollection(LinkedHashSet::new));
		}

	}

	public interface MetamodelAttribute extends MetamodelElement {
		boolean isDerived();
		boolean isOptional();
		boolean isMultiple();
		boolean isUnique();
		boolean isContainer();
		boolean isContainment();

		MetamodelType getDeclaringType();

		Class<?> getValueJavaClass();

		MetamodelEnum getEnumType();

		MetamodelType getReferencedType();

		MetamodelAttribute getOpposite();
		String getDeafultValueLiteral();
	}

	public interface MetamodelConstraint extends MetamodelElement {
		MetamodelType getDeclaringType();
	}

	public interface MetamodelEnum extends MetamodelElement {
		Stream<? extends MetamodelEnumLiteral> listEnumLiterals();
	}

	public interface MetamodelEnumLiteral extends MetamodelElement {
		MetamodelEnum getDeclaringEnum();
	}

}
