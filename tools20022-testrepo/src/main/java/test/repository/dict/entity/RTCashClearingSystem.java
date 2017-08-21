package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.codeset.RTCashClearingSystemCode;
import test.repository.dict.entity.RTCashClearingSystem;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTCashClearingSystem extends MMBusinessComponent {

	private final static AtomicReference<RTCashClearingSystem> repoTypeRef = new AtomicReference<>();

	public static RTCashClearingSystem repoType() {
		repoTypeRef.compareAndSet(null, new RTCashClearingSystem());
		return repoTypeRef.get();
	}

	private RTCashClearingSystem() {
		super.element = Arrays.asList(Identification.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "CashClearingSystem";
		super.definition = "Clearing system that processes only cash transfers.";
	}

	static public class Identification extends MMBusinessAttribute {
		private final static AtomicReference<Identification> repoTypeRef = new AtomicReference<>();

		public static Identification repoType() {
			repoTypeRef.compareAndSet(null, new Identification());
			return repoTypeRef.get();
		}

		private Identification() {
			super.simpleType_lazy = () -> RTCashClearingSystemCode.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystem.repoType();
			super.isDerived = false;
			super.name = "Identification";
			super.definition = "Information used to identify a cash clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}