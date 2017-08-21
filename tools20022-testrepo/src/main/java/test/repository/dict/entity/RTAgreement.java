package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTMax350Text;
import test.repository.dict.entity.RTAgreement;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTDateTimePeriod;
import test.repository.dict.entity.RTDocument;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAgreement extends MMBusinessComponent {

	private final static AtomicReference<RTAgreement> repoTypeRef = new AtomicReference<>();

	public static RTAgreement repoType() {
		repoTypeRef.compareAndSet(null, new RTAgreement());
		return repoTypeRef.get();
	}

	private RTAgreement() {
		super.element = Arrays.asList(Description.repoType(),
				ValidityPeriod.repoType(), Document.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Agreement";
		super.definition = "Contractual details related to an agreement between parties.";
	}

	static public class Description extends MMBusinessAttribute {
		private final static AtomicReference<Description> repoTypeRef = new AtomicReference<>();

		public static Description repoType() {
			repoTypeRef.compareAndSet(null, new Description());
			return repoTypeRef.get();
		}

		private Description() {
			super.simpleType_lazy = () -> RTMax350Text.repoType();
			super.elementContext_lazy = () -> RTAgreement.repoType();
			super.isDerived = false;
			super.name = "Description";
			super.definition = "Full name of an agreement, annexes and amendments in place between the principals.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class ValidityPeriod extends MMBusinessAssociationEnd {
		private final static AtomicReference<ValidityPeriod> repoTypeRef = new AtomicReference<>();

		public static ValidityPeriod repoType() {
			repoTypeRef.compareAndSet(null, new ValidityPeriod());
			return repoTypeRef.get();
		}

		private ValidityPeriod() {
			super.type_lazy = () -> RTDateTimePeriod.repoType();
			super.elementContext_lazy = () -> RTAgreement.repoType();
			super.isDerived = false;
			super.name = "ValidityPeriod";
			super.definition = "Period during which the agreement is valid";
			super.minOccurs = 0;
		}
	}

	static public class Document extends MMBusinessAssociationEnd {
		private final static AtomicReference<Document> repoTypeRef = new AtomicReference<>();

		public static Document repoType() {
			repoTypeRef.compareAndSet(null, new Document());
			return repoTypeRef.get();
		}

		private Document() {
			super.type_lazy = () -> RTDocument.repoType();
			super.elementContext_lazy = () -> RTAgreement.repoType();
			super.isDerived = false;
			super.name = "Document";
			super.definition = "Document which materialises the agreement.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}