package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTCopyDuplicateCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTCopyDuplicateCode extends MMCodeSet {

	private final static AtomicReference<RTCopyDuplicateCode> repoTypeRef = new AtomicReference<>();

	public static RTCopyDuplicateCode repoType() {
		repoTypeRef.compareAndSet(null, new RTCopyDuplicateCode());
		return repoTypeRef.get();
	}

	private RTCopyDuplicateCode() {
		super.code = Arrays.asList(CopyDuplicate.repoType(), Copy.repoType(),
				Duplicate.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("CODU");
		super.name = "CopyDuplicateCode";
		super.definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
	}

	static public class CopyDuplicate extends MMCode {
		private final static AtomicReference<CopyDuplicate> repoTypeRef = new AtomicReference<>();

		public static CopyDuplicate repoType() {
			repoTypeRef.compareAndSet(null, new CopyDuplicate());
			return repoTypeRef.get();
		}

		private CopyDuplicate() {
			super.owner_lazy = () -> RTCopyDuplicateCode.repoType();
			super.codeName = "CODU";
			super.name = "CopyDuplicate";
			super.definition = "Message is being sent as a copy to a party other than the account owner, for information purposes and the message is a duplicate of a message previously sent.";
		}
	}

	static public class Copy extends MMCode {
		private final static AtomicReference<Copy> repoTypeRef = new AtomicReference<>();

		public static Copy repoType() {
			repoTypeRef.compareAndSet(null, new Copy());
			return repoTypeRef.get();
		}

		private Copy() {
			super.owner_lazy = () -> RTCopyDuplicateCode.repoType();
			super.codeName = "COPY";
			super.name = "Copy";
			super.definition = "Message is being sent as a copy to a party other than the account owner, for information purposes.";
		}
	}

	static public class Duplicate extends MMCode {
		private final static AtomicReference<Duplicate> repoTypeRef = new AtomicReference<>();

		public static Duplicate repoType() {
			repoTypeRef.compareAndSet(null, new Duplicate());
			return repoTypeRef.get();
		}

		private Duplicate() {
			super.owner_lazy = () -> RTCopyDuplicateCode.repoType();
			super.codeName = "DUPL";
			super.name = "Duplicate";
			super.definition = "Message is for information/confirmation purposes. It is a duplicate of a message previously sent.";
		}
	}
}