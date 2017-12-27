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
import com.tools20022.repository.codeset.ChequeTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of cheque.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode#CrossedCheque
 * ChequeTypeCode.CrossedCheque}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChequeTypeCode#OpenCheque
 * ChequeTypeCode.OpenCheque}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChequeTypeCode#OrderCheque
 * ChequeTypeCode.OrderCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode#CircularCheque
 * ChequeTypeCode.CircularCheque}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChequeTypeCode#BankDraft
 * ChequeTypeCode.BankDraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode#CustomerCheque
 * ChequeTypeCode.CustomerCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode#CertifiedCustomerCheque
 * ChequeTypeCode.CertifiedCustomerCheque}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChequeTypeCode#BankCheque
 * ChequeTypeCode.BankCheque}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChequeTypeCode#Draft
 * ChequeTypeCode.Draft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode#ElectronicDraft
 * ChequeTypeCode.ElectronicDraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode#OnlineCheque
 * ChequeTypeCode.OnlineCheque}</li>
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
 * <li>"CRCQ"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChequeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of cheque."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChequeTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cheque that must be paid into an account and not cashed over the counter.
	 * There are two parallel lines across the face of a crossed cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRCQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossedCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque that must be paid into an account and not cashed over the counter. There are two parallel lines across the face of a crossed cheque."
	 * </li>
	 * </ul>
	 */
	public static final ChequeTypeCode CrossedCheque = new ChequeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossedCheque";
			definition = "Cheque that must be paid into an account and not cashed over the counter. There are two parallel lines across the face of a crossed cheque.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeTypeCode.mmObject();
			codeName = "CRCQ";
		}
	};
	/**
	 * Cheque that may only be cashed at the bank of origin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPCQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cheque that may only be cashed at the bank of origin."</li>
	 * </ul>
	 */
	public static final ChequeTypeCode OpenCheque = new ChequeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpenCheque";
			definition = "Cheque that may only be cashed at the bank of origin.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeTypeCode.mmObject();
			codeName = "OPCQ";
		}
	};
	/**
	 * Cheque made payable to a named recipient 'or order'. The payee can either
	 * deposit the cheque in an account or endorse it to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORCQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque made payable to a named recipient 'or order'.  The payee can either deposit the cheque in an account or endorse it to a third party."
	 * </li>
	 * </ul>
	 */
	public static final ChequeTypeCode OrderCheque = new ChequeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderCheque";
			definition = "Cheque made payable to a named recipient 'or order'.  The payee can either deposit the cheque in an account or endorse it to a third party.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeTypeCode.mmObject();
			codeName = "ORCQ";
		}
	};
	/**
	 * An instruction from a bank to its correspondent bank to pay the creditor
	 * a stated sum upon the presentation of a means of identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLCQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CircularCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An instruction from a bank to its correspondent bank to pay the creditor a stated sum upon the presentation of a means of identification."
	 * </li>
	 * </ul>
	 */
	public static final ChequeTypeCode CircularCheque = new ChequeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CircularCheque";
			definition = "An instruction from a bank to its correspondent bank to pay the creditor a stated sum upon the presentation of a means of identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeTypeCode.mmObject();
			codeName = "CLCQ";
		}
	};
	/**
	 * Cheque drawn by a bank on itself or its agent. A person who owes money to
	 * another buys the draft from a bank for cash and hands it to the creditor
	 * who need have no fear that it might be dishonoured. A bank draft is also
	 * called a banker's cheque, banker's draft, bank check, or treasurer's
	 * check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKDF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankDraft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque drawn by a bank on itself or its agent. A person who owes money to another buys the draft from a bank for cash and hands it to the creditor who need have no fear that it might be dishonoured. A bank draft is also called a banker's cheque, banker's draft, bank check, or treasurer's check."
	 * </li>
	 * </ul>
	 */
	public static final ChequeTypeCode BankDraft = new ChequeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankDraft";
			definition = "Cheque drawn by a bank on itself or its agent. A person who owes money to another buys the draft from a bank for cash and hands it to the creditor who need have no fear that it might be dishonoured. A bank draft is also called a banker's cheque, banker's draft, bank check, or treasurer's check.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeTypeCode.mmObject();
			codeName = "BKDF";
		}
	};
	/**
	 * Cheque drawn on the account of the debtor, and debited on the debtor's
	 * account when the cheque is cashed. Synonym is 'corporate cheque'.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCHQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque drawn on the account of the debtor, and debited on the debtor's account when the cheque is cashed. Synonym is 'corporate cheque'."
	 * </li>
	 * </ul>
	 */
	public static final ChequeTypeCode CustomerCheque = new ChequeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomerCheque";
			definition = "Cheque drawn on the account of the debtor, and debited on the debtor's account when the cheque is cashed. Synonym is 'corporate cheque'.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeTypeCode.mmObject();
			codeName = "CCHQ";
		}
	};
	/**
	 * Cheque drawn on the account of the debtor, and debited on the debtor's
	 * account when the cheque is cashed. The financial institution prints and
	 * certifies the cheque, guaranteeing the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertifiedCustomerCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque drawn on the account of the debtor, and debited on the debtor's account when the cheque is cashed. The financial institution prints and certifies the cheque, guaranteeing the payment."
	 * </li>
	 * </ul>
	 */
	public static final ChequeTypeCode CertifiedCustomerCheque = new ChequeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertifiedCustomerCheque";
			definition = "Cheque drawn on the account of the debtor, and debited on the debtor's account when the cheque is cashed. The financial institution prints and certifies the cheque, guaranteeing the payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeTypeCode.mmObject();
			codeName = "CCCH";
		}
	};
	/**
	 * Cheque drawn on the account of the debtor's financial institution, which
	 * is debited on the debtor's account when the cheque is issued.These
	 * cheques are printed by the debtor's financial institution and payment is
	 * guaranteed by the financial institution. Synonym is 'cashier's cheque'.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCHQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque drawn on the account of the debtor's financial institution, which is debited on the debtor's account when the cheque is issued.These cheques are printed by the debtor's financial institution and payment is guaranteed by the financial institution. Synonym is 'cashier's cheque'."
	 * </li>
	 * </ul>
	 */
	public static final ChequeTypeCode BankCheque = new ChequeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankCheque";
			definition = "Cheque drawn on the account of the debtor's financial institution, which is debited on the debtor's account when the cheque is issued.These cheques are printed by the debtor's financial institution and payment is guaranteed by the financial institution. Synonym is 'cashier's cheque'.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeTypeCode.mmObject();
			codeName = "BCHQ";
		}
	};
	/**
	 * A guaranteed bank cheque with a future value date (do not pay before],
	 * which in commercial terms is a 'negotiatable instrument': the beneficiary
	 * can receive early payment from any bank under subtraction of a discount.
	 * The ordering customer's account is debited on value date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Draft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A guaranteed bank cheque with a future value date (do not pay before], which in commercial terms is a 'negotiatable instrument': the beneficiary can receive early payment from any bank under subtraction of a discount. The ordering customer's account is debited on value date."
	 * </li>
	 * </ul>
	 */
	public static final ChequeTypeCode Draft = new ChequeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Draft";
			definition = "A guaranteed bank cheque with a future value date (do not pay before], which in commercial terms is a 'negotiatable instrument': the beneficiary can receive early payment from any bank under subtraction of a discount. The ordering customer's account is debited on value date.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeTypeCode.mmObject();
			codeName = "DRFT";
		}
	};
	/**
	 * An instrument with a future value date (do not pay before], which in
	 * commercial terms is a 'negotiatable instrument': the beneficiary can
	 * receive early payment from any bank under subtraction of a discount. The
	 * ordering customer's account is debited on value date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicDraft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An instrument with a future value date (do not pay before], which in commercial terms is a 'negotiatable instrument': the beneficiary can receive early payment from any bank under subtraction of a discount. The ordering customer's account is debited on value date."
	 * </li>
	 * </ul>
	 */
	public static final ChequeTypeCode ElectronicDraft = new ChequeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicDraft";
			definition = "An instrument with a future value date (do not pay before], which in commercial terms is a 'negotiatable instrument': the beneficiary can receive early payment from any bank under subtraction of a discount. The ordering customer's account is debited on value date.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeTypeCode.mmObject();
			codeName = "ELDR";
		}
	};
	/**
	 * Cheque intiated or completed through an online service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OCHQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlineCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cheque intiated or completed through an online service."</li>
	 * </ul>
	 */
	public static final ChequeTypeCode OnlineCheque = new ChequeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlineCheque";
			definition = "Cheque intiated or completed through an online service.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeTypeCode.mmObject();
			codeName = "OCHQ";
		}
	};
	final static private LinkedHashMap<String, ChequeTypeCode> codesByName = new LinkedHashMap<>();

	protected ChequeTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRCQ");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChequeTypeCode";
				definition = "Specifies the type of cheque.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChequeTypeCode.CrossedCheque, com.tools20022.repository.codeset.ChequeTypeCode.OpenCheque, com.tools20022.repository.codeset.ChequeTypeCode.OrderCheque,
						com.tools20022.repository.codeset.ChequeTypeCode.CircularCheque, com.tools20022.repository.codeset.ChequeTypeCode.BankDraft, com.tools20022.repository.codeset.ChequeTypeCode.CustomerCheque,
						com.tools20022.repository.codeset.ChequeTypeCode.CertifiedCustomerCheque, com.tools20022.repository.codeset.ChequeTypeCode.BankCheque, com.tools20022.repository.codeset.ChequeTypeCode.Draft,
						com.tools20022.repository.codeset.ChequeTypeCode.ElectronicDraft, com.tools20022.repository.codeset.ChequeTypeCode.OnlineCheque);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CrossedCheque.getCodeName().get(), CrossedCheque);
		codesByName.put(OpenCheque.getCodeName().get(), OpenCheque);
		codesByName.put(OrderCheque.getCodeName().get(), OrderCheque);
		codesByName.put(CircularCheque.getCodeName().get(), CircularCheque);
		codesByName.put(BankDraft.getCodeName().get(), BankDraft);
		codesByName.put(CustomerCheque.getCodeName().get(), CustomerCheque);
		codesByName.put(CertifiedCustomerCheque.getCodeName().get(), CertifiedCustomerCheque);
		codesByName.put(BankCheque.getCodeName().get(), BankCheque);
		codesByName.put(Draft.getCodeName().get(), Draft);
		codesByName.put(ElectronicDraft.getCodeName().get(), ElectronicDraft);
		codesByName.put(OnlineCheque.getCodeName().get(), OnlineCheque);
	}

	public static ChequeTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChequeTypeCode[] values() {
		ChequeTypeCode[] values = new ChequeTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChequeTypeCode> {
		@Override
		public ChequeTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChequeTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}