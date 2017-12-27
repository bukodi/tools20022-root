/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AccountStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the current state of an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountStatusCode#Enabled
 * AccountStatusCode.Enabled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountStatusCode#Disabled
 * AccountStatusCode.Disabled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountStatusCode#Deleted
 * AccountStatusCode.Deleted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountStatusCode#ProForma
 * AccountStatusCode.ProForma}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountStatusCode#Pending
 * AccountStatusCode.Pending}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ENAB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the current state of an account."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account can be used for its intended purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusCode
	 * AccountStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENAB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account can be used for its intended purpose."</li>
	 * </ul>
	 */
	public static final AccountStatusCode Enabled = new AccountStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Enabled";
			definition = "Account can be used for its intended purpose.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountStatusCode.mmObject();
			codeName = "ENAB";
		}
	};
	/**
	 * Account cannot be used for its intended purpose, either temporarily or
	 * permanently.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusCode
	 * AccountStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account cannot be used for its intended purpose, either temporarily or permanently."
	 * </li>
	 * </ul>
	 */
	public static final AccountStatusCode Disabled = new AccountStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Disabled";
			definition = "Account cannot be used for its intended purpose, either temporarily or permanently.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountStatusCode.mmObject();
			codeName = "DISA";
		}
	};
	/**
	 * Account cannot be used any longer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusCode
	 * AccountStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account cannot be used any longer."</li>
	 * </ul>
	 */
	public static final AccountStatusCode Deleted = new AccountStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deleted";
			definition = "Account cannot be used any longer.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountStatusCode.mmObject();
			codeName = "DELE";
		}
	};
	/**
	 * Account is temporary and can be partially used for its intended purpose.
	 * The account will be fully available for use when the account servicer has
	 * received all relevant documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusCode
	 * AccountStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProForma"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is temporary and can be partially used for its intended purpose. The account will be fully available for use when the account servicer has received all relevant documents."
	 * </li>
	 * </ul>
	 */
	public static final AccountStatusCode ProForma = new AccountStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProForma";
			definition = "Account is temporary and can be partially used for its intended purpose. The account will be fully available for use when the account servicer has received all relevant documents.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountStatusCode.mmObject();
			codeName = "FORM";
		}
	};
	/**
	 * Account change is pending approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusCode
	 * AccountStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account change is pending approval."</li>
	 * </ul>
	 */
	public static final AccountStatusCode Pending = new AccountStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Account change is pending approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	final static private LinkedHashMap<String, AccountStatusCode> codesByName = new LinkedHashMap<>();

	protected AccountStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ENAB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountStatusCode";
				definition = "Specifies the current state of an account.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountStatusCode.Enabled, com.tools20022.repository.codeset.AccountStatusCode.Disabled, com.tools20022.repository.codeset.AccountStatusCode.Deleted,
						com.tools20022.repository.codeset.AccountStatusCode.ProForma, com.tools20022.repository.codeset.AccountStatusCode.Pending);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Enabled.getCodeName().get(), Enabled);
		codesByName.put(Disabled.getCodeName().get(), Disabled);
		codesByName.put(Deleted.getCodeName().get(), Deleted);
		codesByName.put(ProForma.getCodeName().get(), ProForma);
		codesByName.put(Pending.getCodeName().get(), Pending);
	}

	public static AccountStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountStatusCode[] values() {
		AccountStatusCode[] values = new AccountStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountStatusCode> {
		@Override
		public AccountStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}