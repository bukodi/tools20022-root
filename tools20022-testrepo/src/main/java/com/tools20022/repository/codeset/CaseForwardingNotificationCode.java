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
import com.tools20022.repository.codeset.CaseForwardingNotificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CaseForwardingNotificationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	public static final CaseForwardingNotificationCode FurtherInvestigation = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FurtherInvestigation";
			definition = "Case has been forwarded to the next party for further investigation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
			codeName = "FTHI";
		}
	};
	public static final CaseForwardingNotificationCode RequestToCancel = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestToCancel";
			definition = "Case has been forwarded to the next party for cancellation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
			codeName = "CANC";
		}
	};
	public static final CaseForwardingNotificationCode RequestToModify = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestToModify";
			definition = "Case has been forwarded to the next party for modification.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
			codeName = "MODI";
		}
	};
	public static final CaseForwardingNotificationCode RequestDebitAuthorisation = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestDebitAuthorisation";
			definition = "Case has been forwarded to obtain authorisation to debit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
			codeName = "DTAU";
		}
	};
	public static final CaseForwardingNotificationCode SentAdditionalInformation = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SentAdditionalInformation";
			definition = "Additional information has been forwarded to the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
			codeName = "SAIN";
		}
	};
	public static final CaseForwardingNotificationCode FoundInvestigatingAgent = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FoundInvestigatingAgent";
			definition = "Case is taken up by an assigned agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
			codeName = "FIAG";
		}
	};
	public static final CaseForwardingNotificationCode MineInvestigationCase = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MineInvestigationCase";
			definition = "Case is been handled by the assigned party.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
			codeName = "MINE";
		}
	};
	final static private LinkedHashMap<String, CaseForwardingNotificationCode> codesByName = new LinkedHashMap<>();

	protected CaseForwardingNotificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FTHI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseForwardingNotificationCode";
				definition = "Specifies the action requested when forwarding a case. Assignees taking the decision to cancel or modify to further case assignees must communicate this decision to their case assigners.";
				derivation_lazy = () -> Arrays.asList(CaseForwardingNotification3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseForwardingNotificationCode.FurtherInvestigation, com.tools20022.repository.codeset.CaseForwardingNotificationCode.RequestToCancel,
						com.tools20022.repository.codeset.CaseForwardingNotificationCode.RequestToModify, com.tools20022.repository.codeset.CaseForwardingNotificationCode.RequestDebitAuthorisation,
						com.tools20022.repository.codeset.CaseForwardingNotificationCode.SentAdditionalInformation, com.tools20022.repository.codeset.CaseForwardingNotificationCode.FoundInvestigatingAgent,
						com.tools20022.repository.codeset.CaseForwardingNotificationCode.MineInvestigationCase);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FurtherInvestigation.getCodeName().get(), FurtherInvestigation);
		codesByName.put(RequestToCancel.getCodeName().get(), RequestToCancel);
		codesByName.put(RequestToModify.getCodeName().get(), RequestToModify);
		codesByName.put(RequestDebitAuthorisation.getCodeName().get(), RequestDebitAuthorisation);
		codesByName.put(SentAdditionalInformation.getCodeName().get(), SentAdditionalInformation);
		codesByName.put(FoundInvestigatingAgent.getCodeName().get(), FoundInvestigatingAgent);
		codesByName.put(MineInvestigationCase.getCodeName().get(), MineInvestigationCase);
	}

	public static CaseForwardingNotificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CaseForwardingNotificationCode[] values() {
		CaseForwardingNotificationCode[] values = new CaseForwardingNotificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CaseForwardingNotificationCode> {
		@Override
		public CaseForwardingNotificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CaseForwardingNotificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}