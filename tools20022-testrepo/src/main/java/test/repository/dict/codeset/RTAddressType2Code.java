package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTAddressType2Code;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAddressType2Code extends MMCodeSet {

	private final static AtomicReference<RTAddressType2Code> repoTypeRef = new AtomicReference<>();

	public static RTAddressType2Code repoType() {
		repoTypeRef.compareAndSet(null, new RTAddressType2Code());
		return repoTypeRef.get();
	}

	private RTAddressType2Code() {
		super.code = Arrays.asList(Postal.repoType(), POBox.repoType(),
				Residential.repoType(), Business.repoType(), MailTo.repoType(),
				DeliveryTo.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("ADDR");
		super.name = "AddressType2Code";
		super.definition = "Specifies the type of address.";
	}

	static public class Postal extends MMCode {
		private final static AtomicReference<Postal> repoTypeRef = new AtomicReference<>();

		public static Postal repoType() {
			repoTypeRef.compareAndSet(null, new Postal());
			return repoTypeRef.get();
		}

		private Postal() {
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "Postal";
		}
	}

	static public class POBox extends MMCode {
		private final static AtomicReference<POBox> repoTypeRef = new AtomicReference<>();

		public static POBox repoType() {
			repoTypeRef.compareAndSet(null, new POBox());
			return repoTypeRef.get();
		}

		private POBox() {
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "POBox";
		}
	}

	static public class Residential extends MMCode {
		private final static AtomicReference<Residential> repoTypeRef = new AtomicReference<>();

		public static Residential repoType() {
			repoTypeRef.compareAndSet(null, new Residential());
			return repoTypeRef.get();
		}

		private Residential() {
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "Residential";
		}
	}

	static public class Business extends MMCode {
		private final static AtomicReference<Business> repoTypeRef = new AtomicReference<>();

		public static Business repoType() {
			repoTypeRef.compareAndSet(null, new Business());
			return repoTypeRef.get();
		}

		private Business() {
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "Business";
		}
	}

	static public class MailTo extends MMCode {
		private final static AtomicReference<MailTo> repoTypeRef = new AtomicReference<>();

		public static MailTo repoType() {
			repoTypeRef.compareAndSet(null, new MailTo());
			return repoTypeRef.get();
		}

		private MailTo() {
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "MailTo";
		}
	}

	static public class DeliveryTo extends MMCode {
		private final static AtomicReference<DeliveryTo> repoTypeRef = new AtomicReference<>();

		public static DeliveryTo repoType() {
			repoTypeRef.compareAndSet(null, new DeliveryTo());
			return repoTypeRef.get();
		}

		private DeliveryTo() {
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "DeliveryTo";
		}
	}
}