package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTMax256Text;
import test.repository.dict.entity.RTElectronicAddress;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTElectronicAddress extends MMBusinessComponent {

	private final static AtomicReference<RTElectronicAddress> repoTypeRef = new AtomicReference<>();

	public static RTElectronicAddress repoType() {
		repoTypeRef.compareAndSet(null, new RTElectronicAddress());
		return repoTypeRef.get();
	}

	private RTElectronicAddress() {
		super.element = Arrays.asList(EmailAddress.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ElectronicAddress";
		super.definition = "Address which is accessed by electronic means.";
	}

	static public class EmailAddress extends MMBusinessAttribute {
		private final static AtomicReference<EmailAddress> repoTypeRef = new AtomicReference<>();

		public static EmailAddress repoType() {
			repoTypeRef.compareAndSet(null, new EmailAddress());
			return repoTypeRef.get();
		}

		private EmailAddress() {
			super.simpleType_lazy = () -> RTMax256Text.repoType();
			super.elementContext_lazy = () -> RTElectronicAddress.repoType();
			super.isDerived = false;
			super.name = "EmailAddress";
			super.definition = "Address for electronic mail (e-mail).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}