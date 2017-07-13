package test.gen.mm;

import test.gen.mm.MMRepositoryType;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageSet;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import java.util.Optional;
import test.gen.mm.MMBusinessArea;
import test.gen.mm.MMXor;
import test.gen.mm.MMMessageBuildingBlock;
import test.gen.mm.MMMessageChoreography;
import test.gen.mm.MMMessageTransmission;
import test.gen.mm.MMMessageDefinitionIdentifier;
import test.gen.mm.MMSyntaxMessageScheme;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.Containment;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * Formal description of the structure of a MessageInstance
 */
public class MMMessageDefinition implements MMRepositoryType {

	private GeneratedMetamodelBean container;
	private List<MMMessageSet> messageSet;
	private Optional<String> xmlName;
	private Optional<String> xmlTag;
	private MMBusinessArea businessArea;
	private List<MMXor> xors;
	private String rootElement;
	private List<MMMessageBuildingBlock> messageBuildingBlock;
	private List<MMMessageChoreography> choreography;
	private List<MMMessageTransmission> trace;
	private MMMessageDefinitionIdentifier messageDefinitionIdentifier;
	private List<MMSyntaxMessageScheme> derivation;
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

	public static interface Members extends MMRepositoryType.Members {
		/**
		 * the MessageSet to which the MessageDefinition belongs
		 */
		MetamodelAttribute<MMMessageDefinition, List<MMMessageSet>> messageSet = newAttribute();
		/**
		 * Name used in an XML schema for the ComplexType that defines the
		 * Message Definition.
		 */
		MetamodelAttribute<MMMessageDefinition, Optional<String>> xmlName = newAttribute();
		/**
		 * Name used in an XML schema for the first element under the root
		 * element of a Message Definition.
		 */
		MetamodelAttribute<MMMessageDefinition, Optional<String>> xmlTag = newAttribute();
		/**
		 * The BusinessArea to which this MessageDefinition belongs
		 */
		MetamodelAttribute<MMMessageDefinition, MMBusinessArea> businessArea = newAttribute();
		/**
		 * XORs applied to a selection of the elements of the Message
		 * Definition.
		 */
		MetamodelAttribute<MMMessageDefinition, List<MMXor>> xors = newAttribute();
		/**
		 * a property of MessageDefinition that specifies the top level element
		 * of the MessageDefinition
		 */
		MetamodelAttribute<MMMessageDefinition, String> rootElement = newAttribute();
		/**
		 * a MessageBuildingBlock belonging to this MessageDefinition
		 */
		MetamodelAttribute<MMMessageDefinition, List<MMMessageBuildingBlock>> messageBuildingBlock = newAttribute();
		/**
		 * the MessageChoreography to which the MessageDefinition belongs
		 */
		MetamodelAttribute<MMMessageDefinition, List<MMMessageChoreography>> choreography = newAttribute();
		/**
		 * all of the MessageTypeTraces from one MessageDefinition that are
		 * traced to different MessageTransmissions
		 */
		MetamodelAttribute<MMMessageDefinition, List<MMMessageTransmission>> trace = newAttribute();
		/**
		 * The MessageDefinitionIdentifier for this MessageDefinition
		 */
		MetamodelAttribute<MMMessageDefinition, MMMessageDefinitionIdentifier> messageDefinitionIdentifier = newAttribute();
		/**
		 * All of the SyntaxMessageSchemes that are derived from from one
		 * MessageDefinition
		 */
		MetamodelAttribute<MMMessageDefinition, List<MMSyntaxMessageScheme>> derivation = newAttribute();
		/**
		 * The businessArea of the messageDefinitionIdentifier of this
		 * MessageDefinition is equal to the code of the BusinessArea that
		 * contains this MessageDefinition businessArea.code =
		 * messageDefinitionIdentifier.businessArea
		 */
		MetamodelConstraint<MMMessageDefinition> checkBusinessAreaNameMatch = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
	}

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
		return messageSet;
	}

	/**
	 * Name used in an XML schema for the ComplexType that defines the Message
	 * Definition.
	 */
	public Optional<String> getXmlName() {
		return xmlName;
	}

	/**
	 * Name used in an XML schema for the first element under the root element
	 * of a Message Definition.
	 */
	public Optional<String> getXmlTag() {
		return xmlTag;
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
		return xors;
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
		return messageBuildingBlock;
	}

	/**
	 * the MessageChoreography to which the MessageDefinition belongs
	 * 
	 * @see MMMessageChoreography#getMessageDefinition()
	 */
	@Opposite(bean = MMMessageChoreography.class, attribute = "messageDefinition")
	public List<MMMessageChoreography> getChoreography() {
		return choreography;
	}

	/**
	 * all of the MessageTypeTraces from one MessageDefinition that are traced
	 * to different MessageTransmissions
	 * 
	 * @see MMMessageTransmission#getDerivation()
	 */
	@Opposite(bean = MMMessageTransmission.class, attribute = "derivation")
	public List<MMMessageTransmission> getTrace() {
		return trace;
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
		return derivation;
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