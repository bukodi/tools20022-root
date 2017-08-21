package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.entity.RTGenericIdentification;
import test.repository.dict.datatype.RTISODate;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTScheme;
import java.util.Arrays;
import test.repository.dict.entity.RTPartyIdentificationInformation.OtherIdentification;
import test.repository.dict.entity.RTAccountIdentification.ProprietaryIdentification;
import test.repository.dict.entity.RTDocument.DocumentIdentification;
import test.repository.GeneratedRepository.DataDictionary;

public class RTGenericIdentification extends MMBusinessComponent {

	private final static AtomicReference<RTGenericIdentification> repoTypeRef = new AtomicReference<>();

	public static RTGenericIdentification repoType() {
		repoTypeRef.compareAndSet(null, new RTGenericIdentification());
		return repoTypeRef.get();
	}

	private RTGenericIdentification() {
		super.element = Arrays.asList(Identification.repoType(),
				IssueDate.repoType(), ExpiryDate.repoType(), Scheme.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(
				OtherIdentification.repoType(),
				ProprietaryIdentification.repoType(),
				DocumentIdentification.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "GenericIdentification";
		super.definition = "Information related to a non-standardised identification, such as a proprietary party identification or account identification.";
	}

	static public class Identification extends MMBusinessAttribute {
		private final static AtomicReference<Identification> repoTypeRef = new AtomicReference<>();

		public static Identification repoType() {
			repoTypeRef.compareAndSet(null, new Identification());
			return repoTypeRef.get();
		}

		private Identification() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTGenericIdentification
					.repoType();
			super.isDerived = false;
			super.name = "Identification";
			super.definition = "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class IssueDate extends MMBusinessAttribute {
		private final static AtomicReference<IssueDate> repoTypeRef = new AtomicReference<>();

		public static IssueDate repoType() {
			repoTypeRef.compareAndSet(null, new IssueDate());
			return repoTypeRef.get();
		}

		private IssueDate() {
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.elementContext_lazy = () -> RTGenericIdentification
					.repoType();
			super.isDerived = false;
			super.name = "IssueDate";
			super.definition = "Date at which the identification was issued.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class ExpiryDate extends MMBusinessAttribute {
		private final static AtomicReference<ExpiryDate> repoTypeRef = new AtomicReference<>();

		public static ExpiryDate repoType() {
			repoTypeRef.compareAndSet(null, new ExpiryDate());
			return repoTypeRef.get();
		}

		private ExpiryDate() {
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.elementContext_lazy = () -> RTGenericIdentification
					.repoType();
			super.isDerived = false;
			super.name = "ExpiryDate";
			super.definition = "Date at which the identification expires.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Scheme extends MMBusinessAssociationEnd {
		private final static AtomicReference<Scheme> repoTypeRef = new AtomicReference<>();

		public static Scheme repoType() {
			repoTypeRef.compareAndSet(null, new Scheme());
			return repoTypeRef.get();
		}

		private Scheme() {
			super.type_lazy = () -> RTScheme.repoType();
			super.elementContext_lazy = () -> RTGenericIdentification
					.repoType();
			super.isDerived = false;
			super.name = "Scheme";
			super.definition = "Information regarding an enumerated code list and its owner.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}