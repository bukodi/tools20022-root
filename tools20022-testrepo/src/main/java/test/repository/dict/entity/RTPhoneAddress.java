package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.entity.RTPhoneAddress;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPhoneAddress extends MMBusinessComponent {

	private final static AtomicReference<RTPhoneAddress> repoTypeRef = new AtomicReference<>();

	public static RTPhoneAddress repoType() {
		repoTypeRef.compareAndSet(null, new RTPhoneAddress());
		return repoTypeRef.get();
	}

	private RTPhoneAddress() {
		super.element = Arrays.asList(PhoneNumber.repoType(),
				FaxNumber.repoType(), MobileNumber.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PhoneAddress";
		super.definition = "Collection of information that identifies a phone address.";
	}

	static public class PhoneNumber extends MMBusinessAttribute {
		private final static AtomicReference<PhoneNumber> repoTypeRef = new AtomicReference<>();

		public static PhoneNumber repoType() {
			repoTypeRef.compareAndSet(null, new PhoneNumber());
			return repoTypeRef.get();
		}

		private PhoneNumber() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPhoneAddress.repoType();
			super.isDerived = false;
			super.name = "PhoneNumber";
			super.definition = "Collection of information that identifies a phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class FaxNumber extends MMBusinessAttribute {
		private final static AtomicReference<FaxNumber> repoTypeRef = new AtomicReference<>();

		public static FaxNumber repoType() {
			repoTypeRef.compareAndSet(null, new FaxNumber());
			return repoTypeRef.get();
		}

		private FaxNumber() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPhoneAddress.repoType();
			super.isDerived = false;
			super.name = "FaxNumber";
			super.definition = "Collection of information that identifies a FAX number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class MobileNumber extends MMBusinessAttribute {
		private final static AtomicReference<MobileNumber> repoTypeRef = new AtomicReference<>();

		public static MobileNumber repoType() {
			repoTypeRef.compareAndSet(null, new MobileNumber());
			return repoTypeRef.get();
		}

		private MobileNumber() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPhoneAddress.repoType();
			super.isDerived = false;
			super.name = "MobileNumber";
			super.definition = "Collection of information that identifies a mobile phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}