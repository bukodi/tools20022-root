package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTIBAN2007Identifier;
import test.repository.dict.entity.RTAccountIdentification;
import test.repository.dict.datatype.RTBBANIdentifier;
import test.repository.dict.datatype.RTUPICIdentifier;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTGenericIdentification;
import java.util.Arrays;
import test.repository.dict.datatype.RTMax70Text;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.entity.RTAccount.Identification;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAccountIdentification extends MMBusinessComponent {

	private final static AtomicReference<RTAccountIdentification> repoTypeRef = new AtomicReference<>();

	public static RTAccountIdentification repoType() {
		repoTypeRef.compareAndSet(null, new RTAccountIdentification());
		return repoTypeRef.get();
	}

	private RTAccountIdentification() {
		super.element = Arrays.asList(IBAN.repoType(), BBAN.repoType(),
				UPIC.repoType(), ProprietaryIdentification.repoType(),
				Name.repoType(), Number.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(Identification
				.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "AccountIdentification";
		super.definition = "Unique identifier of an account, as assigned by the account servicer.";
	}

	static public class IBAN extends MMBusinessAttribute {
		private final static AtomicReference<IBAN> repoTypeRef = new AtomicReference<>();

		public static IBAN repoType() {
			repoTypeRef.compareAndSet(null, new IBAN());
			return repoTypeRef.get();
		}

		private IBAN() {
			super.simpleType_lazy = () -> RTIBAN2007Identifier.repoType();
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.isDerived = false;
			super.name = "IBAN";
			super.definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class BBAN extends MMBusinessAttribute {
		private final static AtomicReference<BBAN> repoTypeRef = new AtomicReference<>();

		public static BBAN repoType() {
			repoTypeRef.compareAndSet(null, new BBAN());
			return repoTypeRef.get();
		}

		private BBAN() {
			super.simpleType_lazy = () -> RTBBANIdentifier.repoType();
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.isDerived = false;
			super.name = "BBAN";
			super.definition = "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class UPIC extends MMBusinessAttribute {
		private final static AtomicReference<UPIC> repoTypeRef = new AtomicReference<>();

		public static UPIC repoType() {
			repoTypeRef.compareAndSet(null, new UPIC());
			return repoTypeRef.get();
		}

		private UPIC() {
			super.simpleType_lazy = () -> RTUPICIdentifier.repoType();
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.isDerived = false;
			super.name = "UPIC";
			super.definition = "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class ProprietaryIdentification
			extends
				MMBusinessAssociationEnd {
		private final static AtomicReference<ProprietaryIdentification> repoTypeRef = new AtomicReference<>();

		public static ProprietaryIdentification repoType() {
			repoTypeRef.compareAndSet(null, new ProprietaryIdentification());
			return repoTypeRef.get();
		}

		private ProprietaryIdentification() {
			super.type_lazy = () -> RTGenericIdentification.repoType();
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.isDerived = false;
			super.semanticMarkup = Arrays.asList();
			super.name = "ProprietaryIdentification";
			super.definition = "Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Name extends MMBusinessAttribute {
		private final static AtomicReference<Name> repoTypeRef = new AtomicReference<>();

		public static Name repoType() {
			repoTypeRef.compareAndSet(null, new Name());
			return repoTypeRef.get();
		}

		private Name() {
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.isDerived = false;
			super.name = "Name";
			super.definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Number extends MMBusinessAttribute {
		private final static AtomicReference<Number> repoTypeRef = new AtomicReference<>();

		public static Number repoType() {
			repoTypeRef.compareAndSet(null, new Number());
			return repoTypeRef.get();
		}

		private Number() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.isDerived = false;
			super.name = "Number";
			super.definition = "String of characters (mainly numbers) used to identify an account.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}