package test.gen.mm.struct;

import test.gen.mm.struct.MMRepositoryType_;
import test.gen.mm.MMMessageDefinition;
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

public interface MMMessageDefinition_ extends MMRepositoryType_ {

	/**
	 * the MessageSet to which the MessageDefinition belongs
	 */
	MetamodelAttribute<MMMessageDefinition, List<MMMessageSet>> messageSet = newAttribute();
	/**
	 * Name used in an XML schema for the ComplexType that defines the Message
	 * Definition.
	 */
	MetamodelAttribute<MMMessageDefinition, Optional<String>> xmlName = newAttribute();
	/**
	 * Name used in an XML schema for the first element under the root element
	 * of a Message Definition.
	 */
	MetamodelAttribute<MMMessageDefinition, Optional<String>> xmlTag = newAttribute();
	/**
	 * The BusinessArea to which this MessageDefinition belongs
	 */
	MetamodelAttribute<MMMessageDefinition, MMBusinessArea> businessArea = newAttribute();
	/**
	 * XORs applied to a selection of the elements of the Message Definition.
	 */
	MetamodelAttribute<MMMessageDefinition, List<MMXor>> xors = newAttribute();
	/**
	 * a property of MessageDefinition that specifies the top level element of
	 * the MessageDefinition
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
	 * all of the MessageTypeTraces from one MessageDefinition that are traced
	 * to different MessageTransmissions
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
	 * MessageDefinition is equal to the code of the BusinessArea that contains
	 * this MessageDefinition businessArea.code =
	 * messageDefinitionIdentifier.businessArea
	 */
	MetamodelConstraint<MMMessageDefinition> checkBusinessAreaNameMatch = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}