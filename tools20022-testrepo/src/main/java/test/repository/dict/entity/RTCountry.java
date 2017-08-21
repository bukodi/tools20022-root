package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.codeset.RTCountryCode;
import test.repository.dict.entity.RTCountry;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTCountry extends MMBusinessComponent {

	private final static AtomicReference<RTCountry> repoTypeRef = new AtomicReference<>();

	public static RTCountry repoType() {
		repoTypeRef.compareAndSet(null, new RTCountry());
		return repoTypeRef.get();
	}

	private RTCountry() {
		super.element = Arrays.asList(Code.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Country";
		super.definition = "Nation with its own government.";
	}

	static public class Code extends MMBusinessAttribute {
		private final static AtomicReference<Code> repoTypeRef = new AtomicReference<>();

		public static Code repoType() {
			repoTypeRef.compareAndSet(null, new Code());
			return repoTypeRef.get();
		}

		private Code() {
			super.simpleType_lazy = () -> RTCountryCode.repoType();
			super.elementContext_lazy = () -> RTCountry.repoType();
			super.isDerived = false;
			super.name = "Code";
			super.definition = "Identifies a nation with its own government (ISO 3166).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}