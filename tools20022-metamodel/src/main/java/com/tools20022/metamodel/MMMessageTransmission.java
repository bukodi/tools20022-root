package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMBusinessTransaction;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import com.tools20022.metamodel.MMMessageDefinition;
import java.util.List;
import com.tools20022.metamodel.MMSend;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMReceive;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * the passing of information from one Participant to another in the context of
 * a BusinessTransaction
 */
public class MMMessageTransmission implements MMRepositoryConcept {

	private GeneratedMetamodelBean container;
	protected MMBusinessTransaction businessTransaction;
	protected List<MMMessageDefinition> derivation;
	protected String messageTypeDescription;
	protected MMSend send;
	protected List<MMReceive> receive;
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
	public MetamodelType<? extends MMMessageTransmission> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageTransmission> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageTransmission.class);
	}

	/**
	 * the BusinessTransaction to which the MessageTransmission belongs
	 * 
	 * @see MMBusinessTransaction#getTransmission()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "transmission")
	@Container
	public MMBusinessTransaction getBusinessTransaction() {
		return businessTransaction;
	}

	/**
	 * all of the MessagetypeTraces that derive MessageDefinitions from one
	 * MessageTransmission
	 * 
	 * @see MMMessageDefinition#getTrace()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "trace")
	public List<MMMessageDefinition> getDerivation() {
		return derivation;
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
		return send;
	}

	/**
	 * the handling of a MessageTransmission passed from a sender instance
	 * 
	 * @see MMReceive#getMessageTransmission()
	 */
	@Opposite(bean = MMReceive.class, attribute = "messageTransmission")
	@Containment
	public List<MMReceive> getReceive() {
		return receive;
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