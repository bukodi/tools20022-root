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

import com.tools20022.core.metamodel.EMFName;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * precise and complete description of a MessageInstance exchange within a
 * BusinessTransaction, describing the sequence and correlation of
 * MessageInstances within a conversation, including the constraints on the
 * interaction between Participants
 */
public class MMMessageChoreography implements MMTopLevelCatalogueEntry {

	/**
	 * the BusinessTransactionTrace from the MessageChoreography to the
	 * BusinessTransaction
	 */
	public final static MetamodelAttribute<MMMessageChoreography, Optional<MMBusinessTransaction>> businessTransactionTraceAttribute = newAttribute();
	/**
	 * The MessageDefinition that is used in a MessageChoreography.
	 */
	public final static MetamodelAttribute<MMMessageChoreography, List<MMMessageDefinition>> messageDefinitionsAttribute = newAttribute();
	protected Supplier<MMBusinessTransaction> businessTransactionTrace_lazy;
	protected Supplier<List<MMMessageDefinition>> messageDefinitions_lazy;
	protected Supplier<MMBusinessProcessCatalogue> businessProcessCatalogue_lazy;
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
	public MMBusinessProcessCatalogue getContainer() {
		return getBusinessProcessCatalogue();
	}

	@Override
	public MetamodelType<? extends MMMessageChoreography> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageChoreography> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageChoreography.class);
	}

	/**
	 * the BusinessTransactionTrace from the MessageChoreography to the
	 * BusinessTransaction
	 * 
	 * @see MMBusinessTransaction#getTraces()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "traces")
	public Optional<MMBusinessTransaction> getBusinessTransactionTrace() {
		return businessTransactionTrace_lazy == null ? Optional.empty() : Optional.of(businessTransactionTrace_lazy.get());
	}

	/**
	 * The MessageDefinition that is used in a MessageChoreography.
	 * 
	 * @see MMMessageDefinition#getChoreographies()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "choreographies")
	@EMFName("messageDefinition")
	public List<MMMessageDefinition> getMessageDefinitions() {
		return messageDefinitions_lazy == null ? Collections.emptyList() : messageDefinitions_lazy.get();
	}

	@Override
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue_lazy.get();
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