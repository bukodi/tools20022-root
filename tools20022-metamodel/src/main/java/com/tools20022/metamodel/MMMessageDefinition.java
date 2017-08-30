package com.tools20022.metamodel;


import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.MMMessageSet;
import java.util.List;
import java.util.function.Supplier;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;
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
import com.tools20022.metamodel.MMModelEntity;/**
 * Formal description of the structure of a MessageInstance
 */
public class MMMessageDefinition implements MMRepositoryType {

	protected Supplier<List<MMMessageSet>> messageSet_lazy;
	protected String xmlName;
	protected String xmlTag;
	protected Supplier<MMBusinessArea> businessArea_lazy;
	protected Supplier<List<MMXor>> xors_lazy;
	protected String rootElement;
	protected Supplier<List<MMMessageBuildingBlock>> messageBuildingBlock_lazy;
	protected Supplier<List<MMMessageChoreography>> choreography_lazy;
	protected Supplier<List<MMMessageTransmission>> trace_lazy;
	protected Supplier<MMMessageDefinitionIdentifier> messageDefinitionIdentifier_lazy;
	protected Supplier<List<MMSyntaxMessageScheme>> derivation_lazy;
	protected String name;
	protected String definition;
	protected Supplier<List<MMSemanticMarkup>> semanticMarkup_lazy;
	protected Supplier<List<MMDoclet>> doclet_lazy;
	protected List<String> example;
	protected Supplier<List<MMConstraint>> constraint_lazy;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMBusinessArea getContainer() {
		return getBusinessArea();
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
	 * @see MMMessageSet#getMessageDefinition()
	 */
	@Opposite(bean = MMMessageSet.class, attribute = "messageDefinition")
	public List<MMMessageSet> getMessageSet() {
		return messageSet_lazy == null ? Collections.emptyList()
				: messageSet_lazy.get();
	}

	/**
	 * Name used in an XML schema for the ComplexType that defines the Message Definition.
	 */
	public Optional<String> getXmlName() {
		return xmlName == null ? Optional.empty() : Optional.of(xmlName);
	}

	/**
	 * Name used in an XML schema for the first element under the root element of a Message Definition.
	 */
	public Optional<String> getXmlTag() {
		return xmlTag == null ? Optional.empty() : Optional.of(xmlTag);
	}

	/**
	 * The BusinessArea to which this MessageDefinition belongs
	 * @see MMBusinessArea#getMessageDefinition()
	 */
	@Opposite(bean = MMBusinessArea.class, attribute = "messageDefinition")
	@Container
	public MMBusinessArea getBusinessArea() {
		return businessArea_lazy.get();
	}

	/**
	 * XORs applied to a selection of the elements of the Message Definition.
	 * @see MMXor#getMessageDefinition()
	 */
	@Opposite(bean = MMXor.class, attribute = "messageDefinition")
	@Containment
	public List<MMXor> getXors() {
		return xors_lazy == null ? Collections.emptyList() : xors_lazy.get();
	}

	/**
	 * a property of MessageDefinition that specifies the top level element of the MessageDefinition
	 */
	public String getRootElement() {
		return rootElement;
	}

	/**
	 * a MessageBuildingBlock belonging to this MessageDefinition
	 */
	@Containment
	public List<MMMessageBuildingBlock> getMessageBuildingBlock() {
		return messageBuildingBlock_lazy == null ? Collections.emptyList()
				: messageBuildingBlock_lazy.get();
	}

	/**
	 * the MessageChoreography to which the MessageDefinition belongs
	 * @see MMMessageChoreography#getMessageDefinition()
	 */
	@Opposite(bean = MMMessageChoreography.class, attribute = "messageDefinition")
	public List<MMMessageChoreography> getChoreography() {
		return choreography_lazy == null ? Collections.emptyList()
				: choreography_lazy.get();
	}

	/**
	 * all of the MessageTypeTraces from one MessageDefinition that are traced to different MessageTransmissions
	 * @see MMMessageTransmission#getDerivation()
	 */
	@Opposite(bean = MMMessageTransmission.class, attribute = "derivation")
	public List<MMMessageTransmission> getTrace() {
		return trace_lazy == null ? Collections.emptyList() : trace_lazy.get();
	}

	/**
	 * The MessageDefinitionIdentifier for this MessageDefinition
	 */
	@Containment
	public MMMessageDefinitionIdentifier getMessageDefinitionIdentifier() {
		return messageDefinitionIdentifier_lazy.get();
	}

	/**
	 * All of the SyntaxMessageSchemes that are derived from from one MessageDefinition
	 * @see MMSyntaxMessageScheme#getMessageDefinitionTrace()
	 */
	@Opposite(bean = MMSyntaxMessageScheme.class, attribute = "messageDefinitionTrace")
	public List<MMSyntaxMessageScheme> getDerivation() {
		return derivation_lazy == null ? Collections.emptyList()
				: derivation_lazy.get();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition == null ? Optional.empty() : Optional.of(definition);
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup_lazy == null ? Collections.emptyList()
				: semanticMarkup_lazy.get();
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet_lazy == null ? Collections.emptyList() : doclet_lazy
				.get();
	}

	@Override
	public List<String> getExample() {
		return example == null ? Collections.emptyList() : example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint_lazy == null ? Collections.emptyList()
				: constraint_lazy.get();
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate == null ? Optional.empty() : Optional
				.of(removalDate);
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList()
				: nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional
				.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional
				.of(objectIdentifier);
	} }