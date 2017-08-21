package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTNamePrefix1Code;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTNamePrefix1Code extends MMCodeSet {

	private final static AtomicReference<RTNamePrefix1Code> repoTypeRef = new AtomicReference<>();

	public static RTNamePrefix1Code repoType() {
		repoTypeRef.compareAndSet(null, new RTNamePrefix1Code());
		return repoTypeRef.get();
	}

	private RTNamePrefix1Code() {
		super.code = Arrays.asList(Doctor.repoType(), Mister.repoType(),
				Miss.repoType(), Madam.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("DOCT");
		super.name = "NamePrefix1Code";
		super.definition = "Specifies the terms used to formally address a person.";
	}

	static public class Doctor extends MMCode {
		private final static AtomicReference<Doctor> repoTypeRef = new AtomicReference<>();

		public static Doctor repoType() {
			repoTypeRef.compareAndSet(null, new Doctor());
			return repoTypeRef.get();
		}

		private Doctor() {
			super.owner_lazy = () -> RTNamePrefix1Code.repoType();
			super.codeName = "DOCT";
			super.name = "Doctor";
			super.definition = "Title of the person is Doctor or Dr.";
		}
	}

	static public class Mister extends MMCode {
		private final static AtomicReference<Mister> repoTypeRef = new AtomicReference<>();

		public static Mister repoType() {
			repoTypeRef.compareAndSet(null, new Mister());
			return repoTypeRef.get();
		}

		private Mister() {
			super.owner_lazy = () -> RTNamePrefix1Code.repoType();
			super.codeName = "MIST";
			super.name = "Mister";
			super.definition = "Title of the person is Mister or Mr.";
		}
	}

	static public class Miss extends MMCode {
		private final static AtomicReference<Miss> repoTypeRef = new AtomicReference<>();

		public static Miss repoType() {
			repoTypeRef.compareAndSet(null, new Miss());
			return repoTypeRef.get();
		}

		private Miss() {
			super.owner_lazy = () -> RTNamePrefix1Code.repoType();
			super.codeName = "MISS";
			super.name = "Miss";
			super.definition = "Title of the person is Miss.";
		}
	}

	static public class Madam extends MMCode {
		private final static AtomicReference<Madam> repoTypeRef = new AtomicReference<>();

		public static Madam repoType() {
			repoTypeRef.compareAndSet(null, new Madam());
			return repoTypeRef.get();
		}

		private Madam() {
			super.owner_lazy = () -> RTNamePrefix1Code.repoType();
			super.codeName = "MADM";
			super.name = "Madam";
			super.definition = "Title of the person is Madam.";
		}
	}
}