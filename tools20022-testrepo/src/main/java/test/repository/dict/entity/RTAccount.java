package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.codeset.RTCurrencyCode;
import test.repository.dict.entity.RTAccount;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTAccountIdentification;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAccount extends MMBusinessComponent {

	private final static AtomicReference<RTAccount> repoTypeRef = new AtomicReference<>();

	public static RTAccount repoType() {
		repoTypeRef.compareAndSet(null, new RTAccount());
		return repoTypeRef.get();
	}

	private RTAccount() {
		super.element = Arrays.asList(BaseCurrency.repoType(),
				Identification.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Account";
		super.definition = "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners.";
	}

	static public class BaseCurrency extends MMBusinessAttribute {
		private final static AtomicReference<BaseCurrency> repoTypeRef = new AtomicReference<>();

		public static BaseCurrency repoType() {
			repoTypeRef.compareAndSet(null, new BaseCurrency());
			return repoTypeRef.get();
		}

		private BaseCurrency() {
			super.simpleType_lazy = () -> RTCurrencyCode.repoType();
			super.elementContext_lazy = () -> RTAccount.repoType();
			super.isDerived = false;
			super.name = "BaseCurrency";
			super.definition = "Base currency of the account.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Identification extends MMBusinessAssociationEnd {
		private final static AtomicReference<Identification> repoTypeRef = new AtomicReference<>();

		public static Identification repoType() {
			repoTypeRef.compareAndSet(null, new Identification());
			return repoTypeRef.get();
		}

		private Identification() {
			super.type_lazy = () -> RTAccountIdentification.repoType();
			super.elementContext_lazy = () -> RTAccount.repoType();
			super.isDerived = false;
			super.name = "Identification";
			super.definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}