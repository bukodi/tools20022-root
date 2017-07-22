package test.gen.mm;

import test.gen.mm.MMTopLevelCatalogueEntry;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMBusinessProcess;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMParticipant;
import java.util.List;
import test.gen.mm.MMMessageTransmission;
import test.gen.mm.MMMessageTransportMode;
import test.gen.mm.MMBusinessTransaction;
import java.util.Optional;
import test.gen.mm.MMMessageChoreography;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Containment;
import test.gen.mm.MMBusinessProcessCatalogue;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * particular solution that meets the communication requirements and the
 * interaction requirements of a particular BusinessProcess and BusinessArea
 */
public class MMBusinessTransaction implements MMTopLevelCatalogueEntry {

	private GeneratedMetamodelBean container;
	private MMBusinessProcess businessProcessTrace;
	private List<MMParticipant> participant;
	private List<MMMessageTransmission> transmission;
	private MMMessageTransportMode messageTransportMode;
	private List<MMBusinessTransaction> subTransaction;
	private Optional<MMBusinessTransaction> parentTransaction;
	private List<MMMessageChoreography> trace;
	private MMBusinessProcessCatalogue businessProcessCatalogue;
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

	public static interface Members extends MMTopLevelCatalogueEntry.Members {
		/**
		 * the BusinessProcessTrace that is used to trace the
		 * BusinessTransaction
		 */
		MetamodelAttribute<MMBusinessTransaction, MMBusinessProcess> businessProcessTrace = newAttribute();
		/**
		 * the involvement of a BusinessRole in a BusinessTransaction
		 */
		MetamodelAttribute<MMBusinessTransaction, List<MMParticipant>> participant = newAttribute();
		/**
		 * he conveyance of information from a sending Participant in the
		 * context of a BusinessTransaction
		 */
		MetamodelAttribute<MMBusinessTransaction, List<MMMessageTransmission>> transmission = newAttribute();
		/**
		 * Provides a set of characterstics for a MessageTransportMode to have
		 * in the context of a single BusinessTransaction
		 */
		MetamodelAttribute<MMBusinessTransaction, MMMessageTransportMode> messageTransportMode = newAttribute();
		/**
		 * decomposition of a BusinessTransaction into a number of sub
		 * transactions which are BusinessTransactions in their own right.
		 */
		MetamodelAttribute<MMBusinessTransaction, List<MMBusinessTransaction>> subTransaction = newAttribute();
		/**
		 * assembly of a number of BusinessTransactions that together form a
		 * BusinessTransaction
		 */
		MetamodelAttribute<MMBusinessTransaction, Optional<MMBusinessTransaction>> parentTransaction = newAttribute();
		/**
		 * all of the BusinessTransactionTraces that derive
		 * MessageChoreographies from one BusinessTransaction
		 */
		MetamodelAttribute<MMBusinessTransaction, List<MMMessageChoreography>> trace = newAttribute();
		/**
		 * All MessageTransmissions contained in this BusinessTransaction shall
		 * have different names. transmission-&gt;forAll(msg1,msg2 | msg1
		 * &lt;&gt; msg2 implies msg1.name &lt;&gt; msg2.name)
		 */
		MetamodelConstraint<MMBusinessTransaction> checkMessageTransmissionsHaveUniqueNames = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
		/**
		 * All Participants of this BusinessTransaction shall have different
		 * names. participant-&gt;forAll(p1,p2 | p1 &lt;&gt; p2 implies p1.name
		 * &lt;&gt; p2.name)
		 */
		MetamodelConstraint<MMBusinessTransaction> checkParticipantsHaveUniqueNames = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
	}

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
		return participant;
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
		return transmission;
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
		return subTransaction;
	}

	/**
	 * assembly of a number of BusinessTransactions that together form a
	 * BusinessTransaction
	 * 
	 * @see MMBusinessTransaction#getSubTransaction()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "subTransaction")
	public Optional<MMBusinessTransaction> getParentTransaction() {
		return parentTransaction;
	}

	/**
	 * all of the BusinessTransactionTraces that derive MessageChoreographies
	 * from one BusinessTransaction
	 * 
	 * @see MMMessageChoreography#getBusinessTransactionTrace()
	 */
	@Opposite(bean = MMMessageChoreography.class, attribute = "businessTransactionTrace")
	public List<MMMessageChoreography> getTrace() {
		return trace;
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