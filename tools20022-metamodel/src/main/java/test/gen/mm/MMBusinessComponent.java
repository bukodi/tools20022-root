package test.gen.mm;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMTopLevelDictionaryEntry;
import test.gen.mm.MMBusinessElementType;
import test.gen.mm.MMBusinessConcept;
import test.gen.mm.MMBusinessComponent;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;
import test.gen.mm.MMBusinessElement;
import com.tools20022.core.metamodel.Containment;
import test.gen.mm.MMMessageComponentType;
import test.gen.mm.MMBusinessAssociationEnd;
import test.gen.mm.MMMessageElement;
import test.gen.mm.MMDataDictionary;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * Representation of a (part of a) key business notion, characterized by
 * specific BusinessElements.
 */
public class MMBusinessComponent
		implements
			MMTopLevelDictionaryEntry,
			MMBusinessElementType,
			MMBusinessConcept {

	private GeneratedMetamodelBean container;
	private List<MMBusinessComponent> subType;
	private Optional<MMBusinessComponent> superType;
	private List<MMBusinessElement> element;
	private List<MMMessageComponentType> derivationComponent;
	private List<MMBusinessAssociationEnd> associationDomain;
	private List<MMMessageElement> derivationElement;
	private MMDataDictionary dataDictionary;
	private String name;
	private Optional<String> definition;
	private List<MMSemanticMarkup> semanticMarkup;
	private List<MMDoclet> doclet;
	private List<String> example;
	private List<MMConstraint> constraint;
	private MMRegistrationStatus registrationStatus;
	private Optional<Date> removalDate;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMBusinessComponent> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessComponent> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessComponent.class);
	}

	/**
	 * The BusinessComponents that specialize this BusinessComponent.
	 * 
	 * @see MMBusinessComponent#getSuperType()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "superType")
	public List<MMBusinessComponent> getSubType() {
		return subType;
	}

	/**
	 * The BusinessComponent that is specialized by this BusinessComponent.
	 * 
	 * @see MMBusinessComponent#getSubType()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "subType")
	public Optional<MMBusinessComponent> getSuperType() {
		return superType;
	}

	/**
	 * A semantic property of a BusinessComponent.
	 * 
	 * @see MMBusinessElement#getElementContext()
	 */
	@Opposite(bean = MMBusinessElement.class, attribute = "elementContext")
	@Containment
	public List<MMBusinessElement> getElement() {
		return element;
	}

	/**
	 * All of the MessageComponentTypes that derive from this BusinessComponent.
	 * 
	 * @see MMMessageComponentType#getTrace()
	 */
	@Opposite(bean = MMMessageComponentType.class, attribute = "trace")
	public List<MMMessageComponentType> getDerivationComponent() {
		return derivationComponent;
	}

	/**
	 * Describes the semantics that determine how the BusinessComponent may
	 * participate in the BusinessAssociation.
	 * 
	 * @see MMBusinessAssociationEnd#getType()
	 */
	@Opposite(bean = MMBusinessAssociationEnd.class, attribute = "type")
	public List<MMBusinessAssociationEnd> getAssociationDomain() {
		return associationDomain;
	}

	/**
	 * All of the MessageElements that derive from this BusinessComponent.
	 * 
	 * @see MMMessageElement#getBusinessComponentTrace()
	 */
	@Opposite(bean = MMMessageElement.class, attribute = "businessComponentTrace")
	public List<MMMessageElement> getDerivationElement() {
		return derivationElement;
	}

	@Override
	public MMDataDictionary getDataDictionary() {
		return dataDictionary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition;
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup;
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet;
	}

	@Override
	public List<String> getExample() {
		return example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint;
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate;
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion;
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier;
	}
}