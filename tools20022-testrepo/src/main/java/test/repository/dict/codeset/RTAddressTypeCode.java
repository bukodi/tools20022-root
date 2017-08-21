package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTAddressTypeCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAddressTypeCode extends MMCodeSet {

	private final static AtomicReference<RTAddressTypeCode> repoTypeRef = new AtomicReference<>();

	public static RTAddressTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new RTAddressTypeCode());
		return repoTypeRef.get();
	}

	private RTAddressTypeCode() {
		super.code = Arrays.asList(Residential.repoType(), Business.repoType(),
				Postal.repoType(), POBox.repoType(), MailTo.repoType(),
				DeliveryTo.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("HOME");
		super.name = "AddressTypeCode";
		super.definition = "Specifies the type of address.";
	}

	static public class Residential extends MMCode {
		private final static AtomicReference<Residential> repoTypeRef = new AtomicReference<>();

		public static Residential repoType() {
			repoTypeRef.compareAndSet(null, new Residential());
			return repoTypeRef.get();
		}

		private Residential() {
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "HOME";
			super.name = "Residential";
			super.definition = "Address is the home address.";
		}
	}

	static public class Business extends MMCode {
		private final static AtomicReference<Business> repoTypeRef = new AtomicReference<>();

		public static Business repoType() {
			repoTypeRef.compareAndSet(null, new Business());
			return repoTypeRef.get();
		}

		private Business() {
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "BIZZ";
			super.name = "Business";
			super.definition = "Address is the business address.";
		}
	}

	static public class Postal extends MMCode {
		private final static AtomicReference<Postal> repoTypeRef = new AtomicReference<>();

		public static Postal repoType() {
			repoTypeRef.compareAndSet(null, new Postal());
			return repoTypeRef.get();
		}

		private Postal() {
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "ADDR";
			super.name = "Postal";
			super.definition = "Address is the complete postal address.";
		}
	}

	static public class POBox extends MMCode {
		private final static AtomicReference<POBox> repoTypeRef = new AtomicReference<>();

		public static POBox repoType() {
			repoTypeRef.compareAndSet(null, new POBox());
			return repoTypeRef.get();
		}

		private POBox() {
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "PBOX";
			super.name = "POBox";
			super.definition = "Address is a postal office (PO) box.";
		}
	}

	static public class MailTo extends MMCode {
		private final static AtomicReference<MailTo> repoTypeRef = new AtomicReference<>();

		public static MailTo repoType() {
			repoTypeRef.compareAndSet(null, new MailTo());
			return repoTypeRef.get();
		}

		private MailTo() {
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "MLTO";
			super.name = "MailTo";
			super.definition = "Address is the address to which mail is sent.";
		}
	}

	static public class DeliveryTo extends MMCode {
		private final static AtomicReference<DeliveryTo> repoTypeRef = new AtomicReference<>();

		public static DeliveryTo repoType() {
			repoTypeRef.compareAndSet(null, new DeliveryTo());
			return repoTypeRef.get();
		}

		private DeliveryTo() {
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "DLVY";
			super.name = "DeliveryTo";
			super.definition = "Address is the address to which delivery is to take place.";
		}
	}
}