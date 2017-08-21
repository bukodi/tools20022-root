package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTSWIFTServiceLevelCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTSWIFTServiceLevelCode extends MMCodeSet {

	private final static AtomicReference<RTSWIFTServiceLevelCode> repoTypeRef = new AtomicReference<>();

	public static RTSWIFTServiceLevelCode repoType() {
		repoTypeRef.compareAndSet(null, new RTSWIFTServiceLevelCode());
		return repoTypeRef.get();
	}

	private RTSWIFTServiceLevelCode() {
		super.code = Arrays.asList(SWIFTPay.repoType(), Priority.repoType(),
				Standard.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("SPAY");
		super.name = "SWIFTServiceLevelCode";
		super.definition = "Specifies the SWIFT service level that applies to the payment instruction.";
	}

	static public class SWIFTPay extends MMCode {
		private final static AtomicReference<SWIFTPay> repoTypeRef = new AtomicReference<>();

		public static SWIFTPay repoType() {
			repoTypeRef.compareAndSet(null, new SWIFTPay());
			return repoTypeRef.get();
		}

		private SWIFTPay() {
			super.owner_lazy = () -> RTSWIFTServiceLevelCode.repoType();
			super.codeName = "SPAY";
			super.name = "SWIFTPay";
			super.definition = "Credit transfer is to be processed according to the SWIFTPay Service Level.";
		}
	}

	static public class Priority extends MMCode {
		private final static AtomicReference<Priority> repoTypeRef = new AtomicReference<>();

		public static Priority repoType() {
			repoTypeRef.compareAndSet(null, new Priority());
			return repoTypeRef.get();
		}

		private Priority() {
			super.owner_lazy = () -> RTSWIFTServiceLevelCode.repoType();
			super.codeName = "SPRI";
			super.name = "Priority";
			super.definition = "Credit transfer is to be processed according to the Priority Service Level.";
		}
	}

	static public class Standard extends MMCode {
		private final static AtomicReference<Standard> repoTypeRef = new AtomicReference<>();

		public static Standard repoType() {
			repoTypeRef.compareAndSet(null, new Standard());
			return repoTypeRef.get();
		}

		private Standard() {
			super.owner_lazy = () -> RTSWIFTServiceLevelCode.repoType();
			super.codeName = "SSTD";
			super.name = "Standard";
			super.definition = "Credit transfer is to be processed according to the Standard Service Level.";
		}
	}
}