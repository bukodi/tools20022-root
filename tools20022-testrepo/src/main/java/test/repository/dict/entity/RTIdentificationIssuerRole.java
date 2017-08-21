package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.codeset.RTCountryCode;
import test.repository.dict.entity.RTIdentificationIssuerRole;
import test.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTIdentificationIssuerRole extends MMBusinessComponent {

	private final static AtomicReference<RTIdentificationIssuerRole> repoTypeRef = new AtomicReference<>();

	public static RTIdentificationIssuerRole repoType() {
		repoTypeRef.compareAndSet(null, new RTIdentificationIssuerRole());
		return repoTypeRef.get();
	}

	private RTIdentificationIssuerRole() {
		super.element = Arrays.asList(Country.repoType(),
				EntityName.repoType(), OwnerCode.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "IdentificationIssuerRole";
		super.definition = "Entity that assigns the identification.";
	}

	static public class Country extends MMBusinessAttribute {
		private final static AtomicReference<Country> repoTypeRef = new AtomicReference<>();

		public static Country repoType() {
			repoTypeRef.compareAndSet(null, new Country());
			return repoTypeRef.get();
		}

		private Country() {
			super.simpleType_lazy = () -> RTCountryCode.repoType();
			super.elementContext_lazy = () -> RTIdentificationIssuerRole
					.repoType();
			super.isDerived = false;
			super.name = "Country";
			super.definition = "Country of the proprietary identification scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class EntityName extends MMBusinessAttribute {
		private final static AtomicReference<EntityName> repoTypeRef = new AtomicReference<>();

		public static EntityName repoType() {
			repoTypeRef.compareAndSet(null, new EntityName());
			return repoTypeRef.get();
		}

		private EntityName() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTIdentificationIssuerRole
					.repoType();
			super.isDerived = false;
			super.name = "EntityName";
			super.definition = "Entity that issues the proprietary identification.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class OwnerCode extends MMBusinessAttribute {
		private final static AtomicReference<OwnerCode> repoTypeRef = new AtomicReference<>();

		public static OwnerCode repoType() {
			repoTypeRef.compareAndSet(null, new OwnerCode());
			return repoTypeRef.get();
		}

		private OwnerCode() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTIdentificationIssuerRole
					.repoType();
			super.isDerived = false;
			super.name = "OwnerCode";
			super.definition = "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}