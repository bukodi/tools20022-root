package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.MMMessageSet;
import java.util.List;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.core.metamodel.Container;
import com.tools20022.metamodel.MMXor;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageChoreography;
import com.tools20022.metamodel.MMMessageTransmission;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMSyntaxMessageScheme;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * Formal description of the structure of a MessageInstance
 */
public class MMMessageDefinition implements MMRepositoryType {

	private GeneratedMetamodelBean container;
	protected List<MMMessageSet> messageSet;
	protected String xmlName;
	protected String xmlTag;
	protected MMBusinessArea businessArea;
	protected List<MMXor> xors;
	protected String rootElement;
	protected List<MMMessageBuildingBlock> messageBuildingBlock;
	protected List<MMMessageChoreography> choreography;
	protected List<MMMessageTransmission> trace;
	protected MMMessageDefinitionIdentifier messageDefinitionIdentifier;
	protected List<MMSyntaxMessageScheme> derivation;
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
	public MetamodelType<? extends MMMessageDefinition> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageDefinition> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageDefinition.class);
	}

	/**
	 * the MessageSet to which the MessageDefinition belongs
	 * 
	 * @see MMMessageSet#getMessageDefinition()
	 */
	@Opposite(bean = MMMessageSet.class, attribute = "messageDefinition")
	public List<MMMessageSet> getMessageSet() {
		return messageSet == null ? Collections.emptyList() : messageSet;
	}

	/**
	 * Name used in an XML schema for the ComplexType that defines the Message
	 * Definition.
	 */
	public Optional<String> getXmlName() {
		return Optional.ofNullable(xmlName);
	}

	/**
	 * Name used in an XML schema for the first element under the root element
	 * of a Message Definition.
	 */
	public Optional<String> getXmlTag() {
		return Optional.ofNullable(xmlTag);
	}

	/**
	 * The BusinessArea to which this MessageDefinition belongs
	 * 
	 * @see MMBusinessArea#getMessageDefinition()
	 */
	@Opposite(bean = MMBusinessArea.class, attribute = "messageDefinition")
	@Container
	public MMBusinessArea getBusinessArea() {
		return businessArea;
	}

	/**
	 * XORs applied to a selection of the elements of the Message Definition.
	 * 
	 * @see MMXor#getMessageDefinition()
	 */
	@Opposite(bean = MMXor.class, attribute = "messageDefinition")
	@Containment
	public List<MMXor> getXors() {
		return xors == null ? Collections.emptyList() : xors;
	}

	/**
	 * a property of MessageDefinition that specifies the top level element of
	 * the MessageDefinition
	 */
	public String getRootElement() {
		return rootElement;
	}

	/**
	 * a MessageBuildingBlock belonging to this MessageDefinition
	 */
	@Containment
	public List<MMMessageBuildingBlock> getMessageBuildingBlock() {
		return messageBuildingBlock == null
				? Collections.emptyList()
				: messageBuildingBlock;
	}

	/**
	 * the MessageChoreography to which the MessageDefinition belongs
	 * 
	 * @see MMMessageChoreography#getMessageDefinition()
	 */
	@Opposite(bean = MMMessageChoreography.class, attribute = "messageDefinition")
	public List<MMMessageChoreography> getChoreography() {
		return choreography == null ? Collections.emptyList() : choreography;
	}

	/**
	 * all of the MessageTypeTraces from one MessageDefinition that are traced
	 * to different MessageTransmissions
	 * 
	 * @see MMMessageTransmission#getDerivation()
	 */
	@Opposite(bean = MMMessageTransmission.class, attribute = "derivation")
	public List<MMMessageTransmission> getTrace() {
		return trace == null ? Collections.emptyList() : trace;
	}

	/**
	 * The MessageDefinitionIdentifier for this MessageDefinition
	 */
	@Containment
	public MMMessageDefinitionIdentifier getMessageDefinitionIdentifier() {
		return messageDefinitionIdentifier;
	}

	/**
	 * All of the SyntaxMessageSchemes that are derived from from one
	 * MessageDefinition
	 * 
	 * @see MMSyntaxMessageScheme#getMessageDefinitionTrace()
	 */
	@Opposite(bean = MMSyntaxMessageScheme.class, attribute = "messageDefinitionTrace")
	public List<MMSyntaxMessageScheme> getDerivation() {
		return derivation == null ? Collections.emptyList() : derivation;
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