package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.RTPriorityCode;
import com.tools20022.repository.dict.entity.RTPaymentProcessing;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTServiceLevel;
import com.tools20022.repository.dict.codeset.RTClearingChannelCode;
import com.tools20022.repository.dict.codeset.RTExternalCode;
import com.tools20022.repository.dict.codeset.RTPaymentCategoryPurposeCode;
import com.tools20022.repository.dict.codeset.RTSequenceTypeCode;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.RTDirectDebitMandate;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies how a payment must be processed, for instance through which specific clearing channel.
 */
public class RTPaymentProcessing extends MMBusinessComponent {

	private final static AtomicReference<RTPaymentProcessing> repoTypeRef = new AtomicReference<>();
	/**
	 * Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.
	 */
	public final MMBusinessAttribute attrPriority = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTPriorityCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.name = "Priority";
			super.definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Agreement under which or rules under which the transaction should be processed.
	 */
	public final MMBusinessAssociationEnd refServiceLevel = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTServiceLevel.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.name = "ServiceLevel";
			super.definition = "Agreement under which or rules under which the transaction should be processed.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Specifies the clearing channel to be used to process the payment instruction.
	 */
	public final MMBusinessAttribute attrClearingChannel = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTClearingChannelCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.name = "ClearingChannel";
			super.definition = "Specifies the clearing channel to be used to process the payment instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * User community specific instrument.
	Usage : When available, codes provided by local authorities should be used.
	 */
	public final MMBusinessAttribute attrLocalInstrument = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTExternalCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.name = "LocalInstrument";
			super.definition = "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the high level purpose of the instruction based on a set of pre-defined categories.
	 */
	public final MMBusinessAttribute attrCategoryPurpose = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTPaymentCategoryPurposeCode
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.name = "CategoryPurpose";
			super.definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identifies the payment sequence where applicable.
	 */
	public final MMBusinessAttribute attrSequenceType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTSequenceTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.name = "SequenceType";
			super.definition = "Identifies the payment sequence where applicable.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTPaymentProcessing repoType() {
		repoTypeRef.compareAndSet(null, new RTPaymentProcessing());
		return repoTypeRef.get();
	}

	private RTPaymentProcessing() {
		super.element = Arrays.asList(attrPriority, refServiceLevel,
				attrClearingChannel, attrLocalInstrument, attrCategoryPurpose,
				attrSequenceType);
		super.associationDomain_lazy = () -> Arrays.asList(RTDirectDebitMandate
				.repoType().refMandatePaymentType);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PaymentProcessing";
		super.definition = "Specifies how a payment must be processed, for instance through which specific clearing channel.";
	} }