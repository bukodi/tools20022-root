package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMBusinessElementType;
import com.tools20022.metamodel.MMBusinessConcept;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.List;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

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
	protected List<MMBusinessComponent> subType;
	protected MMBusinessComponent superType;
	protected List<MMBusinessElement> element;
	protected List<MMMessageComponentType> derivationComponent;
	protected List<MMBusinessAssociationEnd> associationDomain;
	protected List<MMMessageElement> derivationElement;
	protected MMDataDictionary dataDictionary;
	protected String name;
	protected String definition;
	protected List<MMSemanticMarkup> semanticMarkup;
	protected List<MMDoclet> doclet;
	protected List<String> example;
	protected List<MMConstraint> constraint;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected List<MMModelEntity> nextVersions;
	protected MMModelEntity previousVersion;
	protected String objectIdentifier;

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
		return subType == null ? Collections.emptyList() : subType;
	}

	/**
	 * The BusinessComponent that is specialized by this BusinessComponent.
	 * 
	 * @see MMBusinessComponent#getSubType()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "subType")
	public Optional<MMBusinessComponent> getSuperType() {
		return Optional.ofNullable(superType);
	}

	/**
	 * A semantic property of a BusinessComponent.
	 * 
	 * @see MMBusinessElement#getElementContext()
	 */
	@Opposite(bean = MMBusinessElement.class, attribute = "elementContext")
	@Containment
	public List<MMBusinessElement> getElement() {
		return element == null ? Collections.emptyList() : element;
	}

	/**
	 * All of the MessageComponentTypes that derive from this BusinessComponent.
	 * 
	 * @see MMMessageComponentType#getTrace()
	 */
	@Opposite(bean = MMMessageComponentType.class, attribute = "trace")
	public List<MMMessageComponentType> getDerivationComponent() {
		return derivationComponent == null
				? Collections.emptyList()
				: derivationComponent;
	}

	/**
	 * Describes the semantics that determine how the BusinessComponent may
	 * participate in the BusinessAssociation.
	 * 
	 * @see MMBusinessAssociationEnd#getType()
	 */
	@Opposite(bean = MMBusinessAssociationEnd.class, attribute = "type")
	public List<MMBusinessAssociationEnd> getAssociationDomain() {
		return associationDomain == null
				? Collections.emptyList()
				: associationDomain;
	}

	/**
	 * All of the MessageElements that derive from this BusinessComponent.
	 * 
	 * @see MMMessageElement#getBusinessComponentTrace()
	 */
	@Opposite(bean = MMMessageElement.class, attribute = "businessComponentTrace")
	public List<MMMessageElement> getDerivationElement() {
		return derivationElement == null
				? Collections.emptyList()
				: derivationElement;
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
		return Optional.ofNullable(definition);
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup == null
				? Collections.emptyList()
				: semanticMarkup;
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet == null ? Collections.emptyList() : doclet;
	}

	@Override
	public List<String> getExample() {
		return example == null ? Collections.emptyList() : example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint == null ? Collections.emptyList() : constraint;
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return Optional.ofNullable(removalDate);
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions == null ? Collections.emptyList() : nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return Optional.ofNullable(previousVersion);
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return Optional.ofNullable(objectIdentifier);
	}
}