package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.PriorityCode;
import com.tools20022.repository.dict.entity.PaymentProcessing;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.ServiceLevel;
import com.tools20022.repository.dict.codeset.ClearingChannelCode;
import com.tools20022.repository.dict.codeset.ExternalCode;
import com.tools20022.repository.dict.codeset.PaymentCategoryPurposeCode;
import com.tools20022.repository.dict.codeset.SequenceTypeCode;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.DirectDebitMandate;
import com.tools20022.repository.GeneratedRepository;

public class PaymentProcessing extends MMBusinessComponent {

	private final static AtomicReference<PaymentProcessing> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrPriority = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> PriorityCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PaymentProcessing.repoType();
			super.name = "Priority";
			super.definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refServiceLevel = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> ServiceLevel.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PaymentProcessing.repoType();
			super.name = "ServiceLevel";
			super.definition = "Agreement under which or rules under which the transaction should be processed.";
			super.minOccurs = 0;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrClearingChannel = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ClearingChannelCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PaymentProcessing.repoType();
			super.name = "ClearingChannel";
			super.definition = "Specifies the clearing channel to be used to process the payment instruction.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrLocalInstrument = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ExternalCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PaymentProcessing.repoType();
			super.name = "LocalInstrument";
			super.definition = "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrCategoryPurpose = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PaymentProcessing.repoType();
			super.name = "CategoryPurpose";
			super.definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrSequenceType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> SequenceTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PaymentProcessing.repoType();
			super.name = "SequenceType";
			super.definition = "Identifies the payment sequence where applicable.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static PaymentProcessing repoType() {
		repoTypeRef.compareAndSet(null, new PaymentProcessing());
		return repoTypeRef.get();
	}

	private PaymentProcessing() {
		super.element = Arrays.asList(attrPriority, refServiceLevel,
				attrClearingChannel, attrLocalInstrument, attrCategoryPurpose,
				attrSequenceType);
		super.associationDomain_lazy = () -> Arrays.asList(DirectDebitMandate
				.repoType().refMandatePaymentType);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PaymentProcessing";
		super.definition = "Specifies how a payment must be processed, for instance through which specific clearing channel.";
	}
}