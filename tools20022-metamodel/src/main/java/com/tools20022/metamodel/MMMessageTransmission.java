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

import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.Containment;
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
 * the passing of information from one Participant to another in the context of
 * a BusinessTransaction
 */
public class MMMessageTransmission implements MMRepositoryConcept {

	/**
	 * the BusinessTransaction to which the MessageTransmission belongs
	 */
	public final static MetamodelAttribute<MMMessageTransmission, MMBusinessTransaction> businessTransactionAttribute = newAttribute();
	/**
	 * all of the MessagetypeTraces that derive MessageDefinitions from one
	 * MessageTransmission
	 */
	public final static MetamodelAttribute<MMMessageTransmission, List<MMMessageDefinition>> derivationsAttribute = newAttribute();
	/**
	 * Describes the purpose and scope of the MessageTransmission in the
	 * BusinessTransaction
	 */
	public final static MetamodelAttribute<MMMessageTransmission, String> messageTypeDescriptionAttribute = newAttribute();
	/**
	 * the passing of a MessagTransmission from a sender instance to a receiver
	 * instance
	 */
	public final static MetamodelAttribute<MMMessageTransmission, MMSend> sendAttribute = newAttribute();
	/**
	 * the handling of a MessageTransmission passed from a sender instance
	 */
	public final static MetamodelAttribute<MMMessageTransmission, List<MMReceive>> receivesAttribute = newAttribute();
	protected Supplier<MMBusinessTransaction> businessTransaction_lazy;
	protected Supplier<List<MMMessageDefinition>> derivations_lazy;
	protected String messageTypeDescription;
	protected Supplier<MMSend> send_lazy;
	protected Supplier<List<MMReceive>> receives_lazy;
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
	public MMBusinessTransaction getContainer() {
		return getBusinessTransaction();
	}

	@Override
	public MetamodelType<? extends MMMessageTransmission> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageTransmission> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageTransmission.class);
	}

	/**
	 * the BusinessTransaction to which the MessageTransmission belongs
	 * 
	 * @see MMBusinessTransaction#getTransmission()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "transmission")
	@Container
	public MMBusinessTransaction getBusinessTransaction() {
		return businessTransaction_lazy.get();
	}

	/**
	 * all of the MessagetypeTraces that derive MessageDefinitions from one
	 * MessageTransmission
	 * 
	 * @see MMMessageDefinition#getTrace()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "trace")
	@EMFName("derivation")
	public List<MMMessageDefinition> getDerivations() {
		return derivations_lazy == null ? Collections.emptyList() : derivations_lazy.get();
	}

	/**
	 * Describes the purpose and scope of the MessageTransmission in the
	 * BusinessTransaction
	 */
	public String getMessageTypeDescription() {
		return messageTypeDescription;
	}

	/**
	 * the passing of a MessagTransmission from a sender instance to a receiver
	 * instance
	 * 
	 * @see MMSend#getMessageTransmission()
	 */
	@Opposite(bean = MMSend.class, attribute = "messageTransmission")
	@Containment
	public MMSend getSend() {
		return send_lazy.get();
	}

	/**
	 * the handling of a MessageTransmission passed from a sender instance
	 * 
	 * @see MMReceive#getMessageTransmission()
	 */
	@Opposite(bean = MMReceive.class, attribute = "messageTransmission")
	@Containment
	@EMFName("receive")
	public List<MMReceive> getReceives() {
		return receives_lazy == null ? Collections.emptyList() : receives_lazy.get();
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