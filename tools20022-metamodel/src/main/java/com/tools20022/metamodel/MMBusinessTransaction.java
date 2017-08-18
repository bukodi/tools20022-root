package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMBusinessProcess;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMParticipant;
import java.util.List;
import java.util.Collections;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMMessageTransmission;
import com.tools20022.metamodel.MMMessageTransportMode;
import com.tools20022.metamodel.MMBusinessTransaction;
import java.util.Optional;
import com.tools20022.metamodel.MMMessageChoreography;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * particular solution that meets the communication requirements and the
 * interaction requirements of a particular BusinessProcess and BusinessArea
 */
public class MMBusinessTransaction implements MMTopLevelCatalogueEntry {

	private GeneratedMetamodelBean container;
	protected MMBusinessProcess businessProcessTrace;
	protected List<MMParticipant> participant;
	protected List<MMMessageTransmission> transmission;
	protected MMMessageTransportMode messageTransportMode;
	protected List<MMBusinessTransaction> subTransaction;
	protected MMBusinessTransaction parentTransaction;
	protected List<MMMessageChoreography> trace;
	protected MMBusinessProcessCatalogue businessProcessCatalogue;
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
	public MetamodelType<? extends MMBusinessTransaction> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessTransaction> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessTransaction.class);
	}

	/**
	 * the BusinessProcessTrace that is used to trace the BusinessTransaction
	 * 
	 * @see MMBusinessProcess#getBusinessProcessTrace()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "businessProcessTrace")
	public MMBusinessProcess getBusinessProcessTrace() {
		return businessProcessTrace;
	}

	/**
	 * the involvement of a BusinessRole in a BusinessTransaction
	 * 
	 * @see MMParticipant#getBusinessTransaction()
	 */
	@Opposite(bean = MMParticipant.class, attribute = "businessTransaction")
	@Containment
	public List<MMParticipant> getParticipant() {
		return participant == null ? Collections.emptyList() : participant;
	}

	/**
	 * he conveyance of information from a sending Participant in the context of
	 * a BusinessTransaction
	 * 
	 * @see MMMessageTransmission#getBusinessTransaction()
	 */
	@Opposite(bean = MMMessageTransmission.class, attribute = "businessTransaction")
	@Containment
	public List<MMMessageTransmission> getTransmission() {
		return transmission == null ? Collections.emptyList() : transmission;
	}

	/**
	 * Provides a set of characterstics for a MessageTransportMode to have in
	 * the context of a single BusinessTransaction
	 * 
	 * @see MMMessageTransportMode#getBusinessTransaction()
	 */
	@Opposite(bean = MMMessageTransportMode.class, attribute = "businessTransaction")
	public MMMessageTransportMode getMessageTransportMode() {
		return messageTransportMode;
	}

	/**
	 * decomposition of a BusinessTransaction into a number of sub transactions
	 * which are BusinessTransactions in their own right.
	 * 
	 * @see MMBusinessTransaction#getParentTransaction()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "parentTransaction")
	public List<MMBusinessTransaction> getSubTransaction() {
		return subTransaction == null
				? Collections.emptyList()
				: subTransaction;
	}

	/**
	 * assembly of a number of BusinessTransactions that together form a
	 * BusinessTransaction
	 * 
	 * @see MMBusinessTransaction#getSubTransaction()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "subTransaction")
	public Optional<MMBusinessTransaction> getParentTransaction() {
		return Optional.ofNullable(parentTransaction);
	}

	/**
	 * all of the BusinessTransactionTraces that derive MessageChoreographies
	 * from one BusinessTransaction
	 * 
	 * @see MMMessageChoreography#getBusinessTransactionTrace()
	 */
	@Opposite(bean = MMMessageChoreography.class, attribute = "businessTransactionTrace")
	public List<MMMessageChoreography> getTrace() {
		return trace == null ? Collections.emptyList() : trace;
	}

	@Override
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue;
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