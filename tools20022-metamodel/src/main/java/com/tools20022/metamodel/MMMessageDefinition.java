/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.metamodel;

import com.tools20022.core.metamodel.*;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.constraints.BusinessAreaNameMatch;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * Formal description of the structure of a MessageInstance
 */
public class MMMessageDefinition implements RuntimeInstanceAware, MMRepositoryType {

	/**
	 * the MessageSet to which the MessageDefinition belongs
	 */
	public final static MetamodelAttribute<MMMessageDefinition, List<MMMessageSet>> messageSetsAttribute = newAttribute();
	/**
	 * Name used in an XML schema for the ComplexType that defines the Message
	 * Definition.
	 */
	public final static MetamodelAttribute<MMMessageDefinition, Optional<String>> xmlNameAttribute = newAttribute();
	/**
	 * Name used in an XML schema for the first element under the root element
	 * of a Message Definition.
	 */
	public final static MetamodelAttribute<MMMessageDefinition, Optional<String>> xmlTagAttribute = newAttribute();
	/**
	 * The BusinessArea to which this MessageDefinition belongs
	 */
	public final static MetamodelAttribute<MMMessageDefinition, MMBusinessArea> businessAreaAttribute = newAttribute();
	/**
	 * XORs applied to a selection of the elements of the Message Definition.
	 */
	public final static MetamodelAttribute<MMMessageDefinition, List<MMXor>> xorsAttribute = newAttribute();
	/**
	 * a property of MessageDefinition that specifies the top level element of
	 * the MessageDefinition
	 */
	public final static MetamodelAttribute<MMMessageDefinition, String> rootElementAttribute = newAttribute();
	/**
	 * a MessageBuildingBlock belonging to this MessageDefinition
	 */
	public final static MetamodelAttribute<MMMessageDefinition, List<MMMessageBuildingBlock>> messageBuildingBlocksAttribute = newAttribute();
	/**
	 * the MessageChoreography to which the MessageDefinition belongs
	 */
	public final static MetamodelAttribute<MMMessageDefinition, List<MMMessageChoreography>> choreographiesAttribute = newAttribute();
	/**
	 * all of the MessageTypeTraces from one MessageDefinition that are traced
	 * to different MessageTransmissions
	 */
	public final static MetamodelAttribute<MMMessageDefinition, List<MMMessageTransmission>> tracesAttribute = newAttribute();
	/**
	 * The MessageDefinitionIdentifier for this MessageDefinition
	 */
	public final static MetamodelAttribute<MMMessageDefinition, MMMessageDefinitionIdentifier> messageDefinitionIdentifierAttribute = newAttribute();
	/**
	 * All of the SyntaxMessageSchemes that are derived from from one
	 * MessageDefinition
	 */
	public final static MetamodelAttribute<MMMessageDefinition, List<MMSyntaxMessageScheme>> derivationsAttribute = newAttribute();
	/**
	 * The businessArea of the messageDefinitionIdentifier of this
	 * MessageDefinition is equal to the code of the BusinessArea that contains
	 * this MessageDefinition businessArea.code =
	 * messageDefinitionIdentifier.businessArea
	 */
	public final static MetamodelConstraint<MMMessageDefinition> checkBusinessAreaNameMatch = newConstraint(b -> {
		new BusinessAreaNameMatch().accept(b);
	});
	protected Supplier<List<MMMessageSet>> messageSets_lazy;
	protected String xmlName;
	protected String xmlTag;
	protected Supplier<MMBusinessArea> businessArea_lazy;
	protected Supplier<List<MMXor>> xors_lazy;
	protected String rootElement;
	protected Supplier<List<MMMessageBuildingBlock>> messageBuildingBlocks_lazy;
	protected Supplier<List<MMMessageChoreography>> choreographies_lazy;
	protected Supplier<List<MMMessageTransmission>> traces_lazy;
	protected Supplier<MMMessageDefinitionIdentifier> messageDefinitionIdentifier_lazy;
	protected Supplier<List<MMSyntaxMessageScheme>> derivations_lazy;
	protected String name;
	protected String definition;
	protected Supplier<List<MMSemanticMarkup>> semanticMarkups_lazy;
	protected Supplier<List<MMDoclet>> doclets_lazy;
	protected List<String> examples;
	protected Supplier<List<MMConstraint>> constraints_lazy;
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
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageDefinition.class);
	}

	/**
	 * the MessageSet to which the MessageDefinition belongs
	 * 
	 * @see MMMessageSet#getMessageDefinition()
	 */
	@Opposite(bean = MMMessageSet.class, attribute = "messageDefinition")
	@EMFName("messageSet")
	public List<MMMessageSet> getMessageSets() {
		return messageSets_lazy == null ? Collections.emptyList() : messageSets_lazy.get();
	}

	/**
	 * Name used in an XML schema for the ComplexType that defines the Message
	 * Definition.
	 */
	public Optional<String> getXmlName() {
		return xmlName == null ? Optional.empty() : Optional.of(xmlName);
	}

	/**
	 * Name used in an XML schema for the first element under the root element
	 * of a Message Definition.
	 */
	public Optional<String> getXmlTag() {
		return xmlTag == null ? Optional.empty() : Optional.of(xmlTag);
	}

	/**
	 * The BusinessArea to which this MessageDefinition belongs
	 * 
	 * @see MMBusinessArea#getMessageDefinition()
	 */
	@Opposite(bean = MMBusinessArea.class, attribute = "messageDefinition")
	@Container
	public MMBusinessArea getBusinessArea() {
		return businessArea_lazy.get();
	}

	/**
	 * XORs applied to a selection of the elements of the Message Definition.
	 * 
	 * @see MMXor#getMessageDefinition()
	 */
	@Opposite(bean = MMXor.class, attribute = "messageDefinition")
	@Containment
	public List<MMXor> getXors() {
		return xors_lazy == null ? Collections.emptyList() : xors_lazy.get();
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
	@EMFName("messageBuildingBlock")
	public List<MMMessageBuildingBlock> getMessageBuildingBlocks() {
		return messageBuildingBlocks_lazy == null ? Collections.emptyList() : messageBuildingBlocks_lazy.get();
	}

	/**
	 * the MessageChoreography to which the MessageDefinition belongs
	 * 
	 * @see MMMessageChoreography#getMessageDefinition()
	 */
	@Opposite(bean = MMMessageChoreography.class, attribute = "messageDefinition")
	@EMFName("choreography")
	public List<MMMessageChoreography> getChoreographies() {
		return choreographies_lazy == null ? Collections.emptyList() : choreographies_lazy.get();
	}

	/**
	 * all of the MessageTypeTraces from one MessageDefinition that are traced
	 * to different MessageTransmissions
	 * 
	 * @see MMMessageTransmission#getDerivation()
	 */
	@Opposite(bean = MMMessageTransmission.class, attribute = "derivation")
	@EMFName("trace")
	public List<MMMessageTransmission> getTraces() {
		return traces_lazy == null ? Collections.emptyList() : traces_lazy.get();
	}

	/**
	 * The MessageDefinitionIdentifier for this MessageDefinition
	 */
	@Containment
	public MMMessageDefinitionIdentifier getMessageDefinitionIdentifier() {
		return messageDefinitionIdentifier_lazy.get();
	}

	/**
	 * All of the SyntaxMessageSchemes that are derived from from one
	 * MessageDefinition
	 * 
	 * @see MMSyntaxMessageScheme#getMessageDefinitionTrace()
	 */
	@Opposite(bean = MMSyntaxMessageScheme.class, attribute = "messageDefinitionTrace")
	@EMFName("derivation")
	public List<MMSyntaxMessageScheme> getDerivations() {
		return derivations_lazy == null ? Collections.emptyList() : derivations_lazy.get();
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
	public List<MMSemanticMarkup> getSemanticMarkups() {
		return semanticMarkups_lazy == null ? Collections.emptyList() : semanticMarkups_lazy.get();
	}

	@Override
	public List<MMDoclet> getDoclets() {
		return doclets_lazy == null ? Collections.emptyList() : doclets_lazy.get();
	}

	@Override
	public List<String> getExamples() {
		return examples == null ? Collections.emptyList() : examples;
	}

	@Override
	public List<MMConstraint> getConstraints() {
		return constraints_lazy == null ? Collections.emptyList() : constraints_lazy.get();
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate == null ? Optional.empty() : Optional.of(removalDate);
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList() : nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional.of(objectIdentifier);
	}
}