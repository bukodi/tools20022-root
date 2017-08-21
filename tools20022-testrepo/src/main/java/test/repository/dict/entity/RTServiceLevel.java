package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.codeset.RTServiceLevelCode;
import test.repository.dict.entity.RTServiceLevel;
import test.repository.dict.codeset.RTSWIFTServiceLevelCode;
import test.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import test.repository.dict.entity.RTPaymentProcessing.ServiceLevel;
import test.repository.GeneratedRepository.DataDictionary;

public class RTServiceLevel extends MMBusinessComponent {

	private final static AtomicReference<RTServiceLevel> repoTypeRef = new AtomicReference<>();

	public static RTServiceLevel repoType() {
		repoTypeRef.compareAndSet(null, new RTServiceLevel());
		return repoTypeRef.get();
	}

	private RTServiceLevel() {
		super.element = Arrays.asList(Code.repoType(), Other.repoType(),
				Bilateral.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(ServiceLevel
				.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ServiceLevel";
		super.definition = "Agreement under which or rules under which the transaction should be processed.";
	}

	static public class Code extends MMBusinessAttribute {
		private final static AtomicReference<Code> repoTypeRef = new AtomicReference<>();

		public static Code repoType() {
			repoTypeRef.compareAndSet(null, new Code());
			return repoTypeRef.get();
		}

		private Code() {
			super.simpleType_lazy = () -> RTServiceLevelCode.repoType();
			super.elementContext_lazy = () -> RTServiceLevel.repoType();
			super.isDerived = false;
			super.name = "Code";
			super.definition = "Identification of a pre-agreed level of service between the parties in a coded form.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Other extends MMBusinessAttribute {
		private final static AtomicReference<Other> repoTypeRef = new AtomicReference<>();

		public static Other repoType() {
			repoTypeRef.compareAndSet(null, new Other());
			return repoTypeRef.get();
		}

		private Other() {
			super.simpleType_lazy = () -> RTSWIFTServiceLevelCode.repoType();
			super.elementContext_lazy = () -> RTServiceLevel.repoType();
			super.isDerived = false;
			super.name = "Other";
			super.definition = "SWIFT defined service level applies to the payment instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Bilateral extends MMBusinessAttribute {
		private final static AtomicReference<Bilateral> repoTypeRef = new AtomicReference<>();

		public static Bilateral repoType() {
			repoTypeRef.compareAndSet(null, new Bilateral());
			return repoTypeRef.get();
		}

		private Bilateral() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTServiceLevel.repoType();
			super.isDerived = false;
			super.name = "Bilateral";
			super.definition = "Unambiguous identification of a pre-agreed level of service between the parties.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}