package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.entity.RTMandate;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTAuthentication;
import test.repository.dict.datatype.RTMax35NumericText;
import test.repository.dict.datatype.RTTrueFalseIndicator;
import test.repository.dict.datatype.RTPercentageRate;
import java.util.Arrays;
import test.repository.dict.entity.RTMandate.Amendment;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMandate extends MMBusinessComponent {

	private final static AtomicReference<RTMandate> repoTypeRef = new AtomicReference<>();

	public static RTMandate repoType() {
		repoTypeRef.compareAndSet(null, new RTMandate());
		return repoTypeRef.get();
	}

	private RTMandate() {
		super.element = Arrays.asList(MandateIdentification.repoType(),
				Amendment.repoType(), Authentication.repoType(),
				TrackingDays.repoType(), TrackingIndicator.repoType(),
				Rate.repoType());
		super.associationDomain_lazy = () -> Arrays
				.asList(Amendment.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Mandate";
		super.definition = "Authorisation given by an issuing party to a holder party to act on the issuer's behalf.";
	}

	static public class MandateIdentification extends MMBusinessAttribute {
		private final static AtomicReference<MandateIdentification> repoTypeRef = new AtomicReference<>();

		public static MandateIdentification repoType() {
			repoTypeRef.compareAndSet(null, new MandateIdentification());
			return repoTypeRef.get();
		}

		private MandateIdentification() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.isDerived = false;
			super.name = "MandateIdentification";
			super.definition = "Unique and unambiguous identification of the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Amendment extends MMBusinessAssociationEnd {
		private final static AtomicReference<Amendment> repoTypeRef = new AtomicReference<>();

		public static Amendment repoType() {
			repoTypeRef.compareAndSet(null, new Amendment());
			return repoTypeRef.get();
		}

		private Amendment() {
			super.type_lazy = () -> RTMandate.repoType();
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.isDerived = false;
			super.name = "Amendment";
			super.definition = "Improvement on a mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Authentication extends MMBusinessAssociationEnd {
		private final static AtomicReference<Authentication> repoTypeRef = new AtomicReference<>();

		public static Authentication repoType() {
			repoTypeRef.compareAndSet(null, new Authentication());
			return repoTypeRef.get();
		}

		private Authentication() {
			super.type_lazy = () -> RTAuthentication.repoType();
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.isDerived = false;
			super.name = "Authentication";
			super.definition = "Specifies the transport authentication details related to the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class TrackingDays extends MMBusinessAttribute {
		private final static AtomicReference<TrackingDays> repoTypeRef = new AtomicReference<>();

		public static TrackingDays repoType() {
			repoTypeRef.compareAndSet(null, new TrackingDays());
			return repoTypeRef.get();
		}

		private TrackingDays() {
			super.simpleType_lazy = () -> RTMax35NumericText.repoType();
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.isDerived = false;
			super.name = "TrackingDays";
			super.definition = "Specifies the number of days the mandate must be tracked.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class TrackingIndicator extends MMBusinessAttribute {
		private final static AtomicReference<TrackingIndicator> repoTypeRef = new AtomicReference<>();

		public static TrackingIndicator repoType() {
			repoTypeRef.compareAndSet(null, new TrackingIndicator());
			return repoTypeRef.get();
		}

		private TrackingIndicator() {
			super.simpleType_lazy = () -> RTTrueFalseIndicator.repoType();
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.isDerived = false;
			super.name = "TrackingIndicator";
			super.definition = "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Rate extends MMBusinessAttribute {
		private final static AtomicReference<Rate> repoTypeRef = new AtomicReference<>();

		public static Rate repoType() {
			repoTypeRef.compareAndSet(null, new Rate());
			return repoTypeRef.get();
		}

		private Rate() {
			super.simpleType_lazy = () -> RTPercentageRate.repoType();
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.isDerived = false;
			super.name = "Rate";
			super.definition = "Pre-agreed increase or decrease rate that will be applied to the collection amount.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}