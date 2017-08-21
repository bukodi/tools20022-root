package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTISODateTime;
import test.repository.dict.entity.RTDocument;
import test.repository.dict.codeset.RTCopyDuplicateCode;
import test.repository.dict.codeset.RTDocumentTypeCode;
import test.repository.dict.datatype.RTActiveCurrencyAndAmount;
import test.repository.dict.datatype.RTNumber;
import test.repository.dict.datatype.RTMax140Text;
import test.repository.dict.codeset.RTDataSetTypeCode;
import test.repository.dict.datatype.RTYesNoIndicator;
import test.repository.dict.datatype.RTCurrencyAndAmount;
import test.repository.dict.codeset.RTLanguageCode;
import test.repository.dict.datatype.RTMax35Text;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTGenericIdentification;
import java.util.Arrays;
import test.repository.dict.entity.RTAgreement.Document;
import test.repository.GeneratedRepository.DataDictionary;

public class RTDocument extends MMBusinessComponent {

	private final static AtomicReference<RTDocument> repoTypeRef = new AtomicReference<>();

	public static RTDocument repoType() {
		repoTypeRef.compareAndSet(null, new RTDocument());
		return repoTypeRef.get();
	}

	private RTDocument() {
		super.element = Arrays.asList(IssueDate.repoType(),
				CopyDuplicate.repoType(), Type.repoType(), Amount.repoType(),
				DocumentVersion.repoType(), Status.repoType(),
				DataSetType.repoType(), SignedIndicator.repoType(),
				RemittedAmount.repoType(), Language.repoType(),
				Purpose.repoType(), DocumentIdentification.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(Document.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Document";
		super.definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
	}

	static public class IssueDate extends MMBusinessAttribute {
		private final static AtomicReference<IssueDate> repoTypeRef = new AtomicReference<>();

		public static IssueDate repoType() {
			repoTypeRef.compareAndSet(null, new IssueDate());
			return repoTypeRef.get();
		}

		private IssueDate() {
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "IssueDate";
			super.definition = "Issue date of the document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class CopyDuplicate extends MMBusinessAttribute {
		private final static AtomicReference<CopyDuplicate> repoTypeRef = new AtomicReference<>();

		public static CopyDuplicate repoType() {
			repoTypeRef.compareAndSet(null, new CopyDuplicate());
			return repoTypeRef.get();
		}

		private CopyDuplicate() {
			super.simpleType_lazy = () -> RTCopyDuplicateCode.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "CopyDuplicate";
			super.definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Type extends MMBusinessAttribute {
		private final static AtomicReference<Type> repoTypeRef = new AtomicReference<>();

		public static Type repoType() {
			repoTypeRef.compareAndSet(null, new Type());
			return repoTypeRef.get();
		}

		private Type() {
			super.simpleType_lazy = () -> RTDocumentTypeCode.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "Type";
			super.definition = "Specifies the type of the document, for example commercial invoice.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Amount extends MMBusinessAttribute {
		private final static AtomicReference<Amount> repoTypeRef = new AtomicReference<>();

		public static Amount repoType() {
			repoTypeRef.compareAndSet(null, new Amount());
			return repoTypeRef.get();
		}

		private Amount() {
			super.simpleType_lazy = () -> RTActiveCurrencyAndAmount.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "Amount";
			super.definition = "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class DocumentVersion extends MMBusinessAttribute {
		private final static AtomicReference<DocumentVersion> repoTypeRef = new AtomicReference<>();

		public static DocumentVersion repoType() {
			repoTypeRef.compareAndSet(null, new DocumentVersion());
			return repoTypeRef.get();
		}

		private DocumentVersion() {
			super.simpleType_lazy = () -> RTNumber.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "DocumentVersion";
			super.definition = "Unambiguous identification of the version of a document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Status extends MMBusinessAttribute {
		private final static AtomicReference<Status> repoTypeRef = new AtomicReference<>();

		public static Status repoType() {
			repoTypeRef.compareAndSet(null, new Status());
			return repoTypeRef.get();
		}

		private Status() {
			super.simpleType_lazy = () -> RTMax140Text.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "Status";
			super.definition = "Status of the document (eg delivered, paid, etc.)";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class DataSetType extends MMBusinessAttribute {
		private final static AtomicReference<DataSetType> repoTypeRef = new AtomicReference<>();

		public static DataSetType repoType() {
			repoTypeRef.compareAndSet(null, new DataSetType());
			return repoTypeRef.get();
		}

		private DataSetType() {
			super.simpleType_lazy = () -> RTDataSetTypeCode.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "DataSetType";
			super.definition = "Specifies the type of data set in which the document is included.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class SignedIndicator extends MMBusinessAttribute {
		private final static AtomicReference<SignedIndicator> repoTypeRef = new AtomicReference<>();

		public static SignedIndicator repoType() {
			repoTypeRef.compareAndSet(null, new SignedIndicator());
			return repoTypeRef.get();
		}

		private SignedIndicator() {
			super.simpleType_lazy = () -> RTYesNoIndicator.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "SignedIndicator";
			super.definition = "Indication whether the document must be signed or not.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class RemittedAmount extends MMBusinessAttribute {
		private final static AtomicReference<RemittedAmount> repoTypeRef = new AtomicReference<>();

		public static RemittedAmount repoType() {
			repoTypeRef.compareAndSet(null, new RemittedAmount());
			return repoTypeRef.get();
		}

		private RemittedAmount() {
			super.simpleType_lazy = () -> RTCurrencyAndAmount.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "RemittedAmount";
			super.definition = "Amount of money remitted for the referred document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Language extends MMBusinessAttribute {
		private final static AtomicReference<Language> repoTypeRef = new AtomicReference<>();

		public static Language repoType() {
			repoTypeRef.compareAndSet(null, new Language());
			return repoTypeRef.get();
		}

		private Language() {
			super.simpleType_lazy = () -> RTLanguageCode.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "Language";
			super.definition = "Language used for textual information in the document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Purpose extends MMBusinessAttribute {
		private final static AtomicReference<Purpose> repoTypeRef = new AtomicReference<>();

		public static Purpose repoType() {
			repoTypeRef.compareAndSet(null, new Purpose());
			return repoTypeRef.get();
		}

		private Purpose() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "Purpose";
			super.definition = "Specifies the function of the document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class DocumentIdentification extends MMBusinessAssociationEnd {
		private final static AtomicReference<DocumentIdentification> repoTypeRef = new AtomicReference<>();

		public static DocumentIdentification repoType() {
			repoTypeRef.compareAndSet(null, new DocumentIdentification());
			return repoTypeRef.get();
		}

		private DocumentIdentification() {
			super.type_lazy = () -> RTGenericIdentification.repoType();
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.name = "DocumentIdentification";
			super.definition = "Identification of a document for instance unique identification of the purchase order, assigned by the buyer.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}