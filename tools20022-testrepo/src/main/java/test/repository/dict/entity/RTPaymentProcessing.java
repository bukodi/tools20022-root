package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.codeset.RTPriorityCode;
import test.repository.dict.entity.RTPaymentProcessing;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTServiceLevel;
import test.repository.dict.codeset.RTClearingChannelCode;
import test.repository.dict.codeset.RTExternalCode;
import test.repository.dict.codeset.RTPaymentCategoryPurposeCode;
import test.repository.dict.codeset.RTSequenceTypeCode;
import java.util.Arrays;
import test.repository.dict.entity.RTDirectDebitMandate.MandatePaymentType;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPaymentProcessing extends MMBusinessComponent {

	private final static AtomicReference<RTPaymentProcessing> repoTypeRef = new AtomicReference<>();

	public static RTPaymentProcessing repoType() {
		repoTypeRef.compareAndSet(null, new RTPaymentProcessing());
		return repoTypeRef.get();
	}

	private RTPaymentProcessing() {
		super.element = Arrays.asList(Priority.repoType(),
				ServiceLevel.repoType(), ClearingChannel.repoType(),
				LocalInstrument.repoType(), CategoryPurpose.repoType(),
				SequenceType.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(MandatePaymentType
				.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PaymentProcessing";
		super.definition = "Specifies how a payment must be processed, for instance through which specific clearing channel.";
	}

	static public class Priority extends MMBusinessAttribute {
		private final static AtomicReference<Priority> repoTypeRef = new AtomicReference<>();

		public static Priority repoType() {
			repoTypeRef.compareAndSet(null, new Priority());
			return repoTypeRef.get();
		}

		private Priority() {
			super.simpleType_lazy = () -> RTPriorityCode.repoType();
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.isDerived = false;
			super.name = "Priority";
			super.definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class ServiceLevel extends MMBusinessAssociationEnd {
		private final static AtomicReference<ServiceLevel> repoTypeRef = new AtomicReference<>();

		public static ServiceLevel repoType() {
			repoTypeRef.compareAndSet(null, new ServiceLevel());
			return repoTypeRef.get();
		}

		private ServiceLevel() {
			super.type_lazy = () -> RTServiceLevel.repoType();
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.isDerived = false;
			super.name = "ServiceLevel";
			super.definition = "Agreement under which or rules under which the transaction should be processed.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	}

	static public class ClearingChannel extends MMBusinessAttribute {
		private final static AtomicReference<ClearingChannel> repoTypeRef = new AtomicReference<>();

		public static ClearingChannel repoType() {
			repoTypeRef.compareAndSet(null, new ClearingChannel());
			return repoTypeRef.get();
		}

		private ClearingChannel() {
			super.simpleType_lazy = () -> RTClearingChannelCode.repoType();
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.isDerived = false;
			super.name = "ClearingChannel";
			super.definition = "Specifies the clearing channel to be used to process the payment instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class LocalInstrument extends MMBusinessAttribute {
		private final static AtomicReference<LocalInstrument> repoTypeRef = new AtomicReference<>();

		public static LocalInstrument repoType() {
			repoTypeRef.compareAndSet(null, new LocalInstrument());
			return repoTypeRef.get();
		}

		private LocalInstrument() {
			super.simpleType_lazy = () -> RTExternalCode.repoType();
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.isDerived = false;
			super.name = "LocalInstrument";
			super.definition = "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class CategoryPurpose extends MMBusinessAttribute {
		private final static AtomicReference<CategoryPurpose> repoTypeRef = new AtomicReference<>();

		public static CategoryPurpose repoType() {
			repoTypeRef.compareAndSet(null, new CategoryPurpose());
			return repoTypeRef.get();
		}

		private CategoryPurpose() {
			super.simpleType_lazy = () -> RTPaymentCategoryPurposeCode
					.repoType();
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.isDerived = false;
			super.name = "CategoryPurpose";
			super.definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class SequenceType extends MMBusinessAttribute {
		private final static AtomicReference<SequenceType> repoTypeRef = new AtomicReference<>();

		public static SequenceType repoType() {
			repoTypeRef.compareAndSet(null, new SequenceType());
			return repoTypeRef.get();
		}

		private SequenceType() {
			super.simpleType_lazy = () -> RTSequenceTypeCode.repoType();
			super.elementContext_lazy = () -> RTPaymentProcessing.repoType();
			super.isDerived = false;
			super.name = "SequenceType";
			super.definition = "Identifies the payment sequence where applicable.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}