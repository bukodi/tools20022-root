package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.codeset.RTAuthenticationMethodCode;
import test.repository.dict.entity.RTAuthentication;
import test.repository.dict.codeset.RTAuthenticationEntityCode;
import test.repository.dict.datatype.RTMax70Text;
import test.repository.dict.codeset.RTPINFormatCode;
import test.repository.dict.datatype.RTMax140Binary;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.codeset.RTAuthenticationResultCode;
import java.util.Arrays;
import test.repository.dict.entity.RTMandate.Authentication;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAuthentication extends MMBusinessComponent {

	private final static AtomicReference<RTAuthentication> repoTypeRef = new AtomicReference<>();

	public static RTAuthentication repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthentication());
		return repoTypeRef.get();
	}

	private RTAuthentication() {
		super.element = Arrays
				.asList(AuthenticationMethod.repoType(),
						AuthenticationEntity.repoType(),
						AuthenticationValue.repoType(), PINFormat.repoType(),
						PIN.repoType(), AuthenticationSupport.repoType(),
						CollectionIndicator.repoType(),
						AuthenticationResult.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(Authentication
				.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Authentication";
		super.definition = "Data related to the authentication of the cardholder.";
	}

	static public class AuthenticationMethod extends MMBusinessAttribute {
		private final static AtomicReference<AuthenticationMethod> repoTypeRef = new AtomicReference<>();

		public static AuthenticationMethod repoType() {
			repoTypeRef.compareAndSet(null, new AuthenticationMethod());
			return repoTypeRef.get();
		}

		private AuthenticationMethod() {
			super.simpleType_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.isDerived = false;
			super.name = "AuthenticationMethod";
			super.definition = "Method used to authenticate a person.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class AuthenticationEntity extends MMBusinessAttribute {
		private final static AtomicReference<AuthenticationEntity> repoTypeRef = new AtomicReference<>();

		public static AuthenticationEntity repoType() {
			repoTypeRef.compareAndSet(null, new AuthenticationEntity());
			return repoTypeRef.get();
		}

		private AuthenticationEntity() {
			super.simpleType_lazy = () -> RTAuthenticationEntityCode.repoType();
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.isDerived = false;
			super.name = "AuthenticationEntity";
			super.definition = "Entity or object in charge of verifying the person authenticity.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class AuthenticationValue extends MMBusinessAttribute {
		private final static AtomicReference<AuthenticationValue> repoTypeRef = new AtomicReference<>();

		public static AuthenticationValue repoType() {
			repoTypeRef.compareAndSet(null, new AuthenticationValue());
			return repoTypeRef.get();
		}

		private AuthenticationValue() {
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.isDerived = false;
			super.name = "AuthenticationValue";
			super.definition = "Value used to authenticate the owner of the payment card.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class PINFormat extends MMBusinessAttribute {
		private final static AtomicReference<PINFormat> repoTypeRef = new AtomicReference<>();

		public static PINFormat repoType() {
			repoTypeRef.compareAndSet(null, new PINFormat());
			return repoTypeRef.get();
		}

		private PINFormat() {
			super.simpleType_lazy = () -> RTPINFormatCode.repoType();
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.isDerived = false;
			super.name = "PINFormat";
			super.definition = "Encrypted personal identification number (PIN) format.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class PIN extends MMBusinessAttribute {
		private final static AtomicReference<PIN> repoTypeRef = new AtomicReference<>();

		public static PIN repoType() {
			repoTypeRef.compareAndSet(null, new PIN());
			return repoTypeRef.get();
		}

		private PIN() {
			super.simpleType_lazy = () -> RTMax140Binary.repoType();
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.isDerived = false;
			super.name = "PIN";
			super.definition = "Personal Identification Number (PIN) for authentication.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class AuthenticationSupport extends MMBusinessAttribute {
		private final static AtomicReference<AuthenticationSupport> repoTypeRef = new AtomicReference<>();

		public static AuthenticationSupport repoType() {
			repoTypeRef.compareAndSet(null, new AuthenticationSupport());
			return repoTypeRef.get();
		}

		private AuthenticationSupport() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.isDerived = false;
			super.name = "AuthenticationSupport";
			super.definition = "This indicator identifies whether person authentication is supported and data is available.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class CollectionIndicator extends MMBusinessAttribute {
		private final static AtomicReference<CollectionIndicator> repoTypeRef = new AtomicReference<>();

		public static CollectionIndicator repoType() {
			repoTypeRef.compareAndSet(null, new CollectionIndicator());
			return repoTypeRef.get();
		}

		private CollectionIndicator() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.isDerived = false;
			super.name = "CollectionIndicator";
			super.definition = "Identifies in electronic commerce transactions whether customer authentication is supported and data is available.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class AuthenticationResult extends MMBusinessAttribute {
		private final static AtomicReference<AuthenticationResult> repoTypeRef = new AtomicReference<>();

		public static AuthenticationResult repoType() {
			repoTypeRef.compareAndSet(null, new AuthenticationResult());
			return repoTypeRef.get();
		}

		private AuthenticationResult() {
			super.simpleType_lazy = () -> RTAuthenticationResultCode.repoType();
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.isDerived = false;
			super.name = "AuthenticationResult";
			super.definition = "Specifies the result of the authentication.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}