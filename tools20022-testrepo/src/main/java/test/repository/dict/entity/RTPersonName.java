package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.codeset.RTNamePrefix1Code;
import test.repository.dict.entity.RTPersonName;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPersonName extends MMBusinessComponent {

	private final static AtomicReference<RTPersonName> repoTypeRef = new AtomicReference<>();

	public static RTPersonName repoType() {
		repoTypeRef.compareAndSet(null, new RTPersonName());
		return repoTypeRef.get();
	}

	private RTPersonName() {
		super.element = Arrays.asList(NamePrefix.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PersonName";
		super.definition = "Name by which a person is known and that is usually used to identify that person.";
	}

	static public class NamePrefix extends MMBusinessAttribute {
		private final static AtomicReference<NamePrefix> repoTypeRef = new AtomicReference<>();

		public static NamePrefix repoType() {
			repoTypeRef.compareAndSet(null, new NamePrefix());
			return repoTypeRef.get();
		}

		private NamePrefix() {
			super.simpleType_lazy = () -> RTNamePrefix1Code.repoType();
			super.elementContext_lazy = () -> RTPersonName.repoType();
			super.isDerived = false;
			super.name = "NamePrefix";
			super.definition = "Specifies the terms used to formally address a person.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}