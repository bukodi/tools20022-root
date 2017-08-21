package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTMax140Text;
import test.repository.dict.entity.RTPartyName;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPartyName extends MMBusinessComponent {

	private final static AtomicReference<RTPartyName> repoTypeRef = new AtomicReference<>();

	public static RTPartyName repoType() {
		repoTypeRef.compareAndSet(null, new RTPartyName());
		return repoTypeRef.get();
	}

	private RTPartyName() {
		super.element = Arrays.asList(Name.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PartyName";
		super.definition = "Name by which a party is known and which is usually used to identify that party.";
	}

	static public class Name extends MMBusinessAttribute {
		private final static AtomicReference<Name> repoTypeRef = new AtomicReference<>();

		public static Name repoType() {
			repoTypeRef.compareAndSet(null, new Name());
			return repoTypeRef.get();
		}

		private Name() {
			super.simpleType_lazy = () -> RTMax140Text.repoType();
			super.elementContext_lazy = () -> RTPartyName.repoType();
			super.isDerived = false;
			super.name = "Name";
			super.definition = "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}