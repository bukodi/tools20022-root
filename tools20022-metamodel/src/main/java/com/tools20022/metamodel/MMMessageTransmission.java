package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
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

	protected Supplier<MMBusinessTransaction> businessTransaction_lazy;
	protected Supplier<List<MMMessageDefinition>> derivation_lazy;
	protected String messageTypeDescription;
	protected Supplier<MMSend> send_lazy;
	protected Supplier<List<MMReceive>> receive_lazy;
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
	public List<MMMessageDefinition> getDerivation() {
		return derivation_lazy == null ? Collections.emptyList() : derivation_lazy.get();
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
	public List<MMReceive> getReceive() {
		return receive_lazy == null ? Collections.emptyList() : receive_lazy.get();
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
		return semanticMarkup_lazy == null ? Collections.emptyList() : semanticMarkup_lazy.get();
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet_lazy == null ? Collections.emptyList() : doclet_lazy.get();
	}

	@Override
	public List<String> getExample() {
		return example == null ? Collections.emptyList() : example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint_lazy == null ? Collections.emptyList() : constraint_lazy.get();
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