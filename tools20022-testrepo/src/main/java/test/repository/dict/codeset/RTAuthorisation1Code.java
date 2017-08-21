package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTAuthorisation1Code;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAuthorisation1Code extends MMCodeSet {

	private final static AtomicReference<RTAuthorisation1Code> repoTypeRef = new AtomicReference<>();

	public static RTAuthorisation1Code repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthorisation1Code());
		return repoTypeRef.get();
	}

	private RTAuthorisation1Code() {
		super.code = Arrays.asList(PreAuthorisedFile.repoType(),
				FileLevelAuthorisationDetails.repoType(),
				FileLevelAuthorisationSummary.repoType(),
				InstructionLevelAuthorisation.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("AUTH");
		super.name = "Authorisation1Code";
		super.definition = "Specifies the level of approval depending on a number of factors, including payment type, threshold amount or local country or operations practice.";
	}

	static public class PreAuthorisedFile extends MMCode {
		private final static AtomicReference<PreAuthorisedFile> repoTypeRef = new AtomicReference<>();

		public static PreAuthorisedFile repoType() {
			repoTypeRef.compareAndSet(null, new PreAuthorisedFile());
			return repoTypeRef.get();
		}

		private PreAuthorisedFile() {
			super.owner_lazy = () -> RTAuthorisation1Code.repoType();
			super.name = "PreAuthorisedFile";
		}
	}

	static public class FileLevelAuthorisationDetails extends MMCode {
		private final static AtomicReference<FileLevelAuthorisationDetails> repoTypeRef = new AtomicReference<>();

		public static FileLevelAuthorisationDetails repoType() {
			repoTypeRef
					.compareAndSet(null, new FileLevelAuthorisationDetails());
			return repoTypeRef.get();
		}

		private FileLevelAuthorisationDetails() {
			super.owner_lazy = () -> RTAuthorisation1Code.repoType();
			super.name = "FileLevelAuthorisationDetails";
		}
	}

	static public class FileLevelAuthorisationSummary extends MMCode {
		private final static AtomicReference<FileLevelAuthorisationSummary> repoTypeRef = new AtomicReference<>();

		public static FileLevelAuthorisationSummary repoType() {
			repoTypeRef
					.compareAndSet(null, new FileLevelAuthorisationSummary());
			return repoTypeRef.get();
		}

		private FileLevelAuthorisationSummary() {
			super.owner_lazy = () -> RTAuthorisation1Code.repoType();
			super.name = "FileLevelAuthorisationSummary";
		}
	}

	static public class InstructionLevelAuthorisation extends MMCode {
		private final static AtomicReference<InstructionLevelAuthorisation> repoTypeRef = new AtomicReference<>();

		public static InstructionLevelAuthorisation repoType() {
			repoTypeRef
					.compareAndSet(null, new InstructionLevelAuthorisation());
			return repoTypeRef.get();
		}

		private InstructionLevelAuthorisation() {
			super.owner_lazy = () -> RTAuthorisation1Code.repoType();
			super.name = "InstructionLevelAuthorisation";
		}
	}
}