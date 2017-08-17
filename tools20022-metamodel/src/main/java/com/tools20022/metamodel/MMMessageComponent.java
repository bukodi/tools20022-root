package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.MMXor;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.metamodel.constraints.DeriveMMMessageComponent_isTechnical;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Optional;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * re-usable Dictionary Item that is a building block for assembling
 * MessageDefinitions, composed of a sequence of MessageElements
 */
public class MMMessageComponent implements MMMessageElementContainer {

	private GeneratedMetamodelBean container;
	protected List<MMXor> xors;
	protected List<MMMessageElement> messageElement;
	protected List<MMMessageBuildingBlock> messageBuildingBlock;
	protected Optional<MMBusinessComponent> trace;
	protected MMDataDictionary dataDictionary;
	protected String name;
	protected Optional<String> definition;
	protected List<MMSemanticMarkup> semanticMarkup;
	protected List<MMDoclet> doclet;
	protected List<String> example;
	protected List<MMConstraint> constraint;
	protected MMRegistrationStatus registrationStatus;
	protected Optional<Date> removalDate;
	protected List<MMModelEntity> nextVersions;
	protected Optional<MMModelEntity> previousVersion;
	protected Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageComponent> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageComponent> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageComponent.class);
	}

	/**
	 * XORs applied to a selection of the elements of the Message Component.
	 * 
	 * @see MMXor#getMessageComponent()
	 */
	@Opposite(bean = MMXor.class, attribute = "messageComponent")
	@Containment
	public List<MMXor> getXors() {
		return xors;
	}

	@Override
	public List<MMMessageElement> getMessageElement() {
		return messageElement;
	}

	@Override
	public List<MMMessageBuildingBlock> getMessageBuildingBlock() {
		return messageBuildingBlock;
	}

	@Derived
	@Override
	public boolean isIsTechnical() {
		return (new DeriveMMMessageComponent_isTechnical()).apply(this);
	}

	@Override
	public Optional<MMBusinessComponent> getTrace() {
		return trace;
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