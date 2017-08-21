package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTISODate;
import test.repository.dict.entity.RTDirectDebitMandate;
import test.repository.dict.codeset.RTFrequencyCode;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTPaymentProcessing;
import test.repository.dict.datatype.RTCurrencyAndAmount;
import test.repository.dict.datatype.RTTrueFalseIndicator;
import test.repository.dict.datatype.RTNumber;
import test.repository.dict.codeset.RTMandateClassificationCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTDirectDebitMandate extends MMBusinessComponent {

	private final static AtomicReference<RTDirectDebitMandate> repoTypeRef = new AtomicReference<>();

	public static RTDirectDebitMandate repoType() {
		repoTypeRef.compareAndSet(null, new RTDirectDebitMandate());
		return repoTypeRef.get();
	}

	private RTDirectDebitMandate() {
		super.element = Arrays.asList(FinalCollectionDate.repoType(),
				Frequency.repoType(), FirstCollectionDate.repoType(),
				MandatePaymentType.repoType(), CollectionAmount.repoType(),
				MaximumAmount.repoType(), PreNotification.repoType(),
				PreNotificationThreshold.repoType(), Classification.repoType(),
				PointInTime.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "DirectDebitMandate";
		super.definition = "Authorisation in favour of the creditor given by the debtor to debit its own account.";
	}

	static public class FinalCollectionDate extends MMBusinessAttribute {
		private final static AtomicReference<FinalCollectionDate> repoTypeRef = new AtomicReference<>();

		public static FinalCollectionDate repoType() {
			repoTypeRef.compareAndSet(null, new FinalCollectionDate());
			return repoTypeRef.get();
		}

		private FinalCollectionDate() {
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.isDerived = false;
			super.name = "FinalCollectionDate";
			super.definition = "Date of the final collection of a direct debit as per the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Frequency extends MMBusinessAttribute {
		private final static AtomicReference<Frequency> repoTypeRef = new AtomicReference<>();

		public static Frequency repoType() {
			repoTypeRef.compareAndSet(null, new Frequency());
			return repoTypeRef.get();
		}

		private Frequency() {
			super.simpleType_lazy = () -> RTFrequencyCode.repoType();
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.isDerived = false;
			super.name = "Frequency";
			super.definition = "Regularity with which direct debit instructions are to be created and processed.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class FirstCollectionDate extends MMBusinessAttribute {
		private final static AtomicReference<FirstCollectionDate> repoTypeRef = new AtomicReference<>();

		public static FirstCollectionDate repoType() {
			repoTypeRef.compareAndSet(null, new FirstCollectionDate());
			return repoTypeRef.get();
		}

		private FirstCollectionDate() {
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.isDerived = false;
			super.name = "FirstCollectionDate";
			super.definition = "Date of the first collection of a direct debit as per the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class MandatePaymentType extends MMBusinessAssociationEnd {
		private final static AtomicReference<MandatePaymentType> repoTypeRef = new AtomicReference<>();

		public static MandatePaymentType repoType() {
			repoTypeRef.compareAndSet(null, new MandatePaymentType());
			return repoTypeRef.get();
		}

		private MandatePaymentType() {
			super.type_lazy = () -> RTPaymentProcessing.repoType();
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.isDerived = false;
			super.name = "MandatePaymentType";
			super.definition = "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class CollectionAmount extends MMBusinessAttribute {
		private final static AtomicReference<CollectionAmount> repoTypeRef = new AtomicReference<>();

		public static CollectionAmount repoType() {
			repoTypeRef.compareAndSet(null, new CollectionAmount());
			return repoTypeRef.get();
		}

		private CollectionAmount() {
			super.simpleType_lazy = () -> RTCurrencyAndAmount.repoType();
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.isDerived = false;
			super.name = "CollectionAmount";
			super.definition = "Fixed amount that the debtor has agreed will be collected from their account.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class MaximumAmount extends MMBusinessAttribute {
		private final static AtomicReference<MaximumAmount> repoTypeRef = new AtomicReference<>();

		public static MaximumAmount repoType() {
			repoTypeRef.compareAndSet(null, new MaximumAmount());
			return repoTypeRef.get();
		}

		private MaximumAmount() {
			super.simpleType_lazy = () -> RTCurrencyAndAmount.repoType();
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.isDerived = false;
			super.name = "MaximumAmount";
			super.definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class PreNotification extends MMBusinessAttribute {
		private final static AtomicReference<PreNotification> repoTypeRef = new AtomicReference<>();

		public static PreNotification repoType() {
			repoTypeRef.compareAndSet(null, new PreNotification());
			return repoTypeRef.get();
		}

		private PreNotification() {
			super.simpleType_lazy = () -> RTTrueFalseIndicator.repoType();
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.isDerived = false;
			super.name = "PreNotification";
			super.definition = "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class PreNotificationThreshold extends MMBusinessAttribute {
		private final static AtomicReference<PreNotificationThreshold> repoTypeRef = new AtomicReference<>();

		public static PreNotificationThreshold repoType() {
			repoTypeRef.compareAndSet(null, new PreNotificationThreshold());
			return repoTypeRef.get();
		}

		private PreNotificationThreshold() {
			super.simpleType_lazy = () -> RTNumber.repoType();
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.isDerived = false;
			super.name = "PreNotificationThreshold";
			super.definition = "Specifies the number of days before the direct debit for notifying the debtor.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Classification extends MMBusinessAttribute {
		private final static AtomicReference<Classification> repoTypeRef = new AtomicReference<>();

		public static Classification repoType() {
			repoTypeRef.compareAndSet(null, new Classification());
			return repoTypeRef.get();
		}

		private Classification() {
			super.simpleType_lazy = () -> RTMandateClassificationCode
					.repoType();
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.isDerived = false;
			super.name = "Classification";
			super.definition = "Type of direct debit instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class PointInTime extends MMBusinessAttribute {
		private final static AtomicReference<PointInTime> repoTypeRef = new AtomicReference<>();

		public static PointInTime repoType() {
			repoTypeRef.compareAndSet(null, new PointInTime());
			return repoTypeRef.get();
		}

		private PointInTime() {
			super.simpleType_lazy = () -> RTFrequencyCode.repoType();
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.isDerived = false;
			super.name = "PointInTime";
			super.definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}