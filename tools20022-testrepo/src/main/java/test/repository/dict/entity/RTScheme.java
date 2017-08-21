package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.entity.RTScheme;
import test.repository.dict.datatype.RTMax70Text;
import test.repository.dict.datatype.RTMax350Text;
import java.util.Arrays;
import test.repository.dict.entity.RTGenericIdentification.Scheme;
import test.repository.GeneratedRepository.DataDictionary;

public class RTScheme extends MMBusinessComponent {

	private final static AtomicReference<RTScheme> repoTypeRef = new AtomicReference<>();

	public static RTScheme repoType() {
		repoTypeRef.compareAndSet(null, new RTScheme());
		return repoTypeRef.get();
	}

	private RTScheme() {
		super.element = Arrays.asList(NameShort.repoType(), Code.repoType(),
				Version.repoType(), NameLong.repoType(),
				Description.repoType(), DomainValueCode.repoType(),
				DomainValueName.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(Scheme.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Scheme";
		super.definition = "Information regarding an enumerated code list and its owner.";
	}

	static public class NameShort extends MMBusinessAttribute {
		private final static AtomicReference<NameShort> repoTypeRef = new AtomicReference<>();

		public static NameShort repoType() {
			repoTypeRef.compareAndSet(null, new NameShort());
			return repoTypeRef.get();
		}

		private NameShort() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.isDerived = false;
			super.name = "NameShort";
			super.definition = "Short textual description of the scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Code extends MMBusinessAttribute {
		private final static AtomicReference<Code> repoTypeRef = new AtomicReference<>();

		public static Code repoType() {
			repoTypeRef.compareAndSet(null, new Code());
			return repoTypeRef.get();
		}

		private Code() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.isDerived = false;
			super.name = "Code";
			super.definition = "Code that represents the enumerated list, for example, ISO 6166 for ISIN.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Version extends MMBusinessAttribute {
		private final static AtomicReference<Version> repoTypeRef = new AtomicReference<>();

		public static Version repoType() {
			repoTypeRef.compareAndSet(null, new Version());
			return repoTypeRef.get();
		}

		private Version() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.isDerived = false;
			super.name = "Version";
			super.definition = "Version number of the scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class NameLong extends MMBusinessAttribute {
		private final static AtomicReference<NameLong> repoTypeRef = new AtomicReference<>();

		public static NameLong repoType() {
			repoTypeRef.compareAndSet(null, new NameLong());
			return repoTypeRef.get();
		}

		private NameLong() {
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.isDerived = false;
			super.name = "NameLong";
			super.definition = "Long textual description of the scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Description extends MMBusinessAttribute {
		private final static AtomicReference<Description> repoTypeRef = new AtomicReference<>();

		public static Description repoType() {
			repoTypeRef.compareAndSet(null, new Description());
			return repoTypeRef.get();
		}

		private Description() {
			super.simpleType_lazy = () -> RTMax350Text.repoType();
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.isDerived = false;
			super.name = "Description";
			super.definition = "Textual description of the scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class DomainValueCode extends MMBusinessAttribute {
		private final static AtomicReference<DomainValueCode> repoTypeRef = new AtomicReference<>();

		public static DomainValueCode repoType() {
			repoTypeRef.compareAndSet(null, new DomainValueCode());
			return repoTypeRef.get();
		}

		private DomainValueCode() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.isDerived = false;
			super.name = "DomainValueCode";
			super.definition = "Code for a specific instance of an entry within the enumerated list, for example, ISIN.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class DomainValueName extends MMBusinessAttribute {
		private final static AtomicReference<DomainValueName> repoTypeRef = new AtomicReference<>();

		public static DomainValueName repoType() {
			repoTypeRef.compareAndSet(null, new DomainValueName());
			return repoTypeRef.get();
		}

		private DomainValueName() {
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.isDerived = false;
			super.name = "DomainValueName";
			super.definition = "Textual description of the DomainValueCode, for example, International Securities Identification Number.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}