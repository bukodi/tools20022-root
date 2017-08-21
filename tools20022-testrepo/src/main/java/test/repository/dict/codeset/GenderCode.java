package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.GenderCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class GenderCode extends MMCodeSet {

	private final static AtomicReference<GenderCode> repoTypeRef = new AtomicReference<>();

	public static GenderCode repoType() {
		repoTypeRef.compareAndSet(null, new GenderCode());
		return repoTypeRef.get();
	}

	private GenderCode() {
		super.code = Arrays.asList(Male.repoType(), Female.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("MALE");
		super.name = "GenderCode";
		super.definition = "Specifies the gender of a person.";
	}

	static public class Male extends MMCode {
		private final static AtomicReference<Male> repoTypeRef = new AtomicReference<>();

		public static Male repoType() {
			repoTypeRef.compareAndSet(null, new Male());
			return repoTypeRef.get();
		}

		private Male() {
			super.owner_lazy = () -> GenderCode.repoType();
			super.codeName = "MALE";
			super.name = "Male";
			super.definition = "Individual is a male.";
		}
	}

	static public class Female extends MMCode {
		private final static AtomicReference<Female> repoTypeRef = new AtomicReference<>();

		public static Female repoType() {
			repoTypeRef.compareAndSet(null, new Female());
			return repoTypeRef.get();
		}

		private Female() {
			super.owner_lazy = () -> GenderCode.repoType();
			super.codeName = "FEMA";
			super.name = "Female";
			super.definition = "Individual is a female.";
		}
	}
}