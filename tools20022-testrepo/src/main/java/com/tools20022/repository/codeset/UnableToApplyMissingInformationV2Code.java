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
import com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of an unable to apply due to missing information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingRemittanceInformation
 * UnableToApplyMissingInformationV2Code.MissingRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingInstructionForNextAgent
 * UnableToApplyMissingInformationV2Code.MissingInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingDebtor
 * UnableToApplyMissingInformationV2Code.MissingDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingDebtorAccount
 * UnableToApplyMissingInformationV2Code.MissingDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingDebtorAgent
 * UnableToApplyMissingInformationV2Code.MissingDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingAmount
 * UnableToApplyMissingInformationV2Code.MissingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingSettlementAccount
 * UnableToApplyMissingInformationV2Code.MissingSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingIntermediary
 * UnableToApplyMissingInformationV2Code.MissingIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingInstructingReimbursementAgent
 * UnableToApplyMissingInformationV2Code.MissingInstructingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingInstructedReimbursementAgent
 * UnableToApplyMissingInformationV2Code.MissingInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingThirdReimbursementAgent
 * UnableToApplyMissingInformationV2Code.MissingThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingCreditor
 * UnableToApplyMissingInformationV2Code.MissingCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingCreditorAccount
 * UnableToApplyMissingInformationV2Code.MissingCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingInstruction
 * UnableToApplyMissingInformationV2Code.MissingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingCreditorAgent
 * UnableToApplyMissingInformationV2Code.MissingCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingInstructionForCreditorAgent
 * UnableToApplyMissingInformationV2Code.MissingInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#MissingInstructionForDebtorAgent
 * UnableToApplyMissingInformationV2Code.MissingInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code#Narrative
 * UnableToApplyMissingInformationV2Code.Narrative}</li>
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
 * <li>"MS01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyMissingInformationV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of an unable to apply due to missing information."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnableToApplyMissingInformationV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * RemittanceInformation is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RemittanceInformation is missing."</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingRemittanceInformation = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingRemittanceInformation";
			definition = "RemittanceInformation is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS01";
		}
	};
	/**
	 * Instruction for next agent is missing (former
	 * MissingSenderToReceiverInformation split into debtor, credit and next
	 * agent information).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructionForNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for next agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingInstructionForNextAgent = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingInstructionForNextAgent";
			definition = "Instruction for next agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS02";
		}
	};
	/**
	 * Debtor is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor is missing."</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingDebtor = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingDebtor";
			definition = "Debtor is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS03";
		}
	};
	/**
	 * DebtorAccount is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DebtorAccount is missing."</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingDebtorAccount = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingDebtorAccount";
			definition = "DebtorAccount is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS04";
		}
	};
	/**
	 * DebtorAgent is missing (former MissingFirstAgent for credit transfers).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DebtorAgent is missing (former MissingFirstAgent for credit transfers)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingDebtorAgent = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingDebtorAgent";
			definition = "DebtorAgent is missing (former MissingFirstAgent for credit transfers).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS05";
		}
	};
	/**
	 * Amount is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount is missing."</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingAmount = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingAmount";
			definition = "Amount is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS06";
		}
	};
	/**
	 * SettlementAccount is missing. (former MissingNostroVostroAccount)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingSettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SettlementAccount is missing. (former MissingNostroVostroAccount)"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingSettlementAccount = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingSettlementAccount";
			definition = "SettlementAccount is missing. (former MissingNostroVostroAccount)";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS07";
		}
	};
	/**
	 * Intermediary is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS08"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intermediary is missing."</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingIntermediary = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingIntermediary";
			definition = "Intermediary is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS08";
		}
	};
	/**
	 * InstructingReimbursementAgent is missing (former
	 * MissingReimbursementAgent1).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS09"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructingReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InstructingReimbursementAgent is missing (former MissingReimbursementAgent1)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingInstructingReimbursementAgent = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingInstructingReimbursementAgent";
			definition = "InstructingReimbursementAgent is missing (former MissingReimbursementAgent1).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS09";
		}
	};
	/**
	 * InstructedReimbursementAgent is missing (former
	 * MissingReimbursementAgent2).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructedReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InstructedReimbursementAgent is missing (former MissingReimbursementAgent2)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingInstructedReimbursementAgent = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingInstructedReimbursementAgent";
			definition = "InstructedReimbursementAgent is missing (former MissingReimbursementAgent2).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS10";
		}
	};
	/**
	 * Third reimbursement agent is missing (former MissingReimbursementAgent).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS11"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingThirdReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Third reimbursement agent is missing (former MissingReimbursementAgent)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingThirdReimbursementAgent = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingThirdReimbursementAgent";
			definition = "Third reimbursement agent is missing (former MissingReimbursementAgent).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS11";
		}
	};
	/**
	 * Creditor is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS12"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor is missing."</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingCreditor = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingCreditor";
			definition = "Creditor is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS12";
		}
	};
	/**
	 * CreditorAccount is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS13"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CreditorAccount is missing."</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingCreditorAccount = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingCreditorAccount";
			definition = "CreditorAccount is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS13";
		}
	};
	/**
	 * Indicates the payment instruction is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS14"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the payment instruction is missing."</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingInstruction = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingInstruction";
			definition = "Indicates the payment instruction is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS14";
		}
	};
	/**
	 * Creditor agent is missing (former MissingFirstAgent for direct debits).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS15"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creditor agent is missing (former MissingFirstAgent for direct debits)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingCreditorAgent = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingCreditorAgent";
			definition = "Creditor agent is missing (former MissingFirstAgent for direct debits).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS15";
		}
	};
	/**
	 * Instruction for creditor agent is missing (former
	 * MissingSenderToReceiverInformation split into debtor, credit and next
	 * agent information).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS16"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for creditor agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingInstructionForCreditorAgent = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingInstructionForCreditorAgent";
			definition = "Instruction for creditor agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS16";
		}
	};
	/**
	 * Instruction for debtor agent is missing (former
	 * MissingSenderToReceiverInformation split into debtor, credit and next
	 * agent information).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS17"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructionForDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for debtor agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information)."
	 * </li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code MissingInstructionForDebtorAgent = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingInstructionForDebtorAgent";
			definition = "Instruction for debtor agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS17";
		}
	};
	/**
	 * See narrative field for additional information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Narrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "See narrative field for additional information."</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformationV2Code Narrative = new UnableToApplyMissingInformationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			definition = "See narrative field for additional information.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "NARR";
		}
	};
	final static private LinkedHashMap<String, UnableToApplyMissingInformationV2Code> codesByName = new LinkedHashMap<>();

	protected UnableToApplyMissingInformationV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MS01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyMissingInformationV2Code";
				definition = "Specifies the reason of an unable to apply due to missing information.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingRemittanceInformation,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstructionForNextAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingDebtor,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingDebtorAccount, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingDebtorAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingAmount, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingSettlementAccount,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingIntermediary, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstructingReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstructedReimbursementAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingThirdReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingCreditor, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingCreditorAccount,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstruction, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingCreditorAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstructionForCreditorAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstructionForDebtorAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.Narrative);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MissingRemittanceInformation.getCodeName().get(), MissingRemittanceInformation);
		codesByName.put(MissingInstructionForNextAgent.getCodeName().get(), MissingInstructionForNextAgent);
		codesByName.put(MissingDebtor.getCodeName().get(), MissingDebtor);
		codesByName.put(MissingDebtorAccount.getCodeName().get(), MissingDebtorAccount);
		codesByName.put(MissingDebtorAgent.getCodeName().get(), MissingDebtorAgent);
		codesByName.put(MissingAmount.getCodeName().get(), MissingAmount);
		codesByName.put(MissingSettlementAccount.getCodeName().get(), MissingSettlementAccount);
		codesByName.put(MissingIntermediary.getCodeName().get(), MissingIntermediary);
		codesByName.put(MissingInstructingReimbursementAgent.getCodeName().get(), MissingInstructingReimbursementAgent);
		codesByName.put(MissingInstructedReimbursementAgent.getCodeName().get(), MissingInstructedReimbursementAgent);
		codesByName.put(MissingThirdReimbursementAgent.getCodeName().get(), MissingThirdReimbursementAgent);
		codesByName.put(MissingCreditor.getCodeName().get(), MissingCreditor);
		codesByName.put(MissingCreditorAccount.getCodeName().get(), MissingCreditorAccount);
		codesByName.put(MissingInstruction.getCodeName().get(), MissingInstruction);
		codesByName.put(MissingCreditorAgent.getCodeName().get(), MissingCreditorAgent);
		codesByName.put(MissingInstructionForCreditorAgent.getCodeName().get(), MissingInstructionForCreditorAgent);
		codesByName.put(MissingInstructionForDebtorAgent.getCodeName().get(), MissingInstructionForDebtorAgent);
		codesByName.put(Narrative.getCodeName().get(), Narrative);
	}

	public static UnableToApplyMissingInformationV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnableToApplyMissingInformationV2Code[] values() {
		UnableToApplyMissingInformationV2Code[] values = new UnableToApplyMissingInformationV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnableToApplyMissingInformationV2Code> {
		@Override
		public UnableToApplyMissingInformationV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnableToApplyMissingInformationV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}