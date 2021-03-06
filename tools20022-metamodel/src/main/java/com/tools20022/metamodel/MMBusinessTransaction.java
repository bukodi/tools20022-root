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

import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.EMFName;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.constraints.MessageTransmissionsHaveUniqueNames;
import com.tools20022.metamodel.constraints.ParticipantsHaveUniqueNames;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * particular solution that meets the communication requirements and the
 * interaction requirements of a particular BusinessProcess and BusinessArea
 */
public class MMBusinessTransaction implements MMTopLevelCatalogueEntry {

	/**
	 * the BusinessProcessTrace that is used to trace the BusinessTransaction
	 */
	public final static MetamodelAttribute<MMBusinessTransaction, MMBusinessProcess> businessProcessTraceAttribute = newAttribute();
	/**
	 * the involvement of a BusinessRole in a BusinessTransaction
	 */
	public final static MetamodelAttribute<MMBusinessTransaction, List<MMParticipant>> participantsAttribute = newAttribute();
	/**
	 * he conveyance of information from a sending Participant in the context of
	 * a BusinessTransaction
	 */
	public final static MetamodelAttribute<MMBusinessTransaction, List<MMMessageTransmission>> transmissionsAttribute = newAttribute();
	/**
	 * Provides a set of characterstics for a MessageTransportMode to have in
	 * the context of a single BusinessTransaction
	 */
	public final static MetamodelAttribute<MMBusinessTransaction, MMMessageTransportMode> messageTransportModeAttribute = newAttribute();
	/**
	 * decomposition of a BusinessTransaction into a number of sub transactions
	 * which are BusinessTransactions in their own right.
	 */
	public final static MetamodelAttribute<MMBusinessTransaction, List<MMBusinessTransaction>> subTransactionsAttribute = newAttribute();
	/**
	 * assembly of a number of BusinessTransactions that together form a
	 * BusinessTransaction
	 */
	public final static MetamodelAttribute<MMBusinessTransaction, Optional<MMBusinessTransaction>> parentTransactionAttribute = newAttribute();
	/**
	 * all of the BusinessTransactionTraces that derive MessageChoreographies
	 * from one BusinessTransaction
	 */
	public final static MetamodelAttribute<MMBusinessTransaction, List<MMMessageChoreography>> tracesAttribute = newAttribute();
	/**
	 * All MessageTransmissions contained in this BusinessTransaction shall have
	 * different names. transmission-&gt;forAll(msg1,msg2 | msg1 &lt;&gt; msg2
	 * implies msg1.name &lt;&gt; msg2.name)
	 */
	public final static MetamodelConstraint<MMBusinessTransaction> checkMessageTransmissionsHaveUniqueNames = newConstraint(b -> {
		new MessageTransmissionsHaveUniqueNames().accept(b);
	});
	/**
	 * All Participants of this BusinessTransaction shall have different names.
	 * participant-&gt;forAll(p1,p2 | p1 &lt;&gt; p2 implies p1.name &lt;&gt;
	 * p2.name)
	 */
	public final static MetamodelConstraint<MMBusinessTransaction> checkParticipantsHaveUniqueNames = newConstraint(b -> {
		new ParticipantsHaveUniqueNames().accept(b);
	});
	protected Supplier<MMBusinessProcess> businessProcessTrace_lazy;
	protected Supplier<List<MMParticipant>> participants_lazy;
	protected Supplier<List<MMMessageTransmission>> transmissions_lazy;
	protected Supplier<MMMessageTransportMode> messageTransportMode_lazy;
	protected Supplier<List<MMBusinessTransaction>> subTransactions_lazy;
	protected Supplier<MMBusinessTransaction> parentTransaction_lazy;
	protected Supplier<List<MMMessageChoreography>> traces_lazy;
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
	public MetamodelType<? extends MMBusinessTransaction> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessTransaction> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMBusinessTransaction.class);
	}

	/**
	 * the BusinessProcessTrace that is used to trace the BusinessTransaction
	 * 
	 * @see MMBusinessProcess#getBusinessProcessTraces()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "businessProcessTraces")
	public MMBusinessProcess getBusinessProcessTrace() {
		return businessProcessTrace_lazy.get();
	}

	/**
	 * the involvement of a BusinessRole in a BusinessTransaction
	 * 
	 * @see MMParticipant#getBusinessTransaction()
	 */
	@Opposite(bean = MMParticipant.class, attribute = "businessTransaction")
	@Containment
	@EMFName("participant")
	public List<MMParticipant> getParticipants() {
		return participants_lazy == null ? Collections.emptyList() : participants_lazy.get();
	}

	/**
	 * he conveyance of information from a sending Participant in the context of
	 * a BusinessTransaction
	 * 
	 * @see MMMessageTransmission#getBusinessTransaction()
	 */
	@Opposite(bean = MMMessageTransmission.class, attribute = "businessTransaction")
	@Containment
	@EMFName("transmission")
	public List<MMMessageTransmission> getTransmissions() {
		return transmissions_lazy == null ? Collections.emptyList() : transmissions_lazy.get();
	}

	/**
	 * Provides a set of characterstics for a MessageTransportMode to have in
	 * the context of a single BusinessTransaction
	 * 
	 * @see MMMessageTransportMode#getBusinessTransactions()
	 */
	@Opposite(bean = MMMessageTransportMode.class, attribute = "businessTransactions")
	public MMMessageTransportMode getMessageTransportMode() {
		return messageTransportMode_lazy.get();
	}

	/**
	 * decomposition of a BusinessTransaction into a number of sub transactions
	 * which are BusinessTransactions in their own right.
	 * 
	 * @see MMBusinessTransaction#getParentTransaction()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "parentTransaction")
	@EMFName("subTransaction")
	public List<MMBusinessTransaction> getSubTransactions() {
		return subTransactions_lazy == null ? Collections.emptyList() : subTransactions_lazy.get();
	}

	/**
	 * assembly of a number of BusinessTransactions that together form a
	 * BusinessTransaction
	 * 
	 * @see MMBusinessTransaction#getSubTransactions()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "subTransactions")
	public Optional<MMBusinessTransaction> getParentTransaction() {
		return parentTransaction_lazy == null ? Optional.empty() : Optional.of(parentTransaction_lazy.get());
	}

	/**
	 * all of the BusinessTransactionTraces that derive MessageChoreographies
	 * from one BusinessTransaction
	 * 
	 * @see MMMessageChoreography#getBusinessTransactionTrace()
	 */
	@Opposite(bean = MMMessageChoreography.class, attribute = "businessTransactionTrace")
	@EMFName("trace")
	public List<MMMessageChoreography> getTraces() {
		return traces_lazy == null ? Collections.emptyList() : traces_lazy.get();
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