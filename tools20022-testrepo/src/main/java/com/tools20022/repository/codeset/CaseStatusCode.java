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
import com.tools20022.repository.codeset.CaseStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of an investigation case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CaseStatusCode#Closed
 * CaseStatusCode.Closed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CaseStatusCode#Assigned
 * CaseStatusCode.Assigned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseStatusCode#UnderInvestigation
 * CaseStatusCode.UnderInvestigation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CaseStatusCode#Unknown
 * CaseStatusCode.Unknown}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CaseStatusCode#Overdue
 * CaseStatusCode.Overdue}</li>
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
 * <li>"CLSD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an investigation case."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CaseStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Case has been closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseStatusCode
	 * CaseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case has been closed."</li>
	 * </ul>
	 */
	public static final CaseStatusCode Closed = new CaseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Closed";
			definition = "Case has been closed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseStatusCode.mmObject();
			codeName = "CLSD";
		}
	};
	/**
	 * Case has been assigned to another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseStatusCode
	 * CaseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assigned"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case has been assigned to another party."</li>
	 * </ul>
	 */
	public static final CaseStatusCode Assigned = new CaseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Assigned";
			definition = "Case has been assigned to another party.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseStatusCode.mmObject();
			codeName = "ASGN";
		}
	};
	/**
	 * Case is currently under investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseStatusCode
	 * CaseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderInvestigation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case is currently under investigation."</li>
	 * </ul>
	 */
	public static final CaseStatusCode UnderInvestigation = new CaseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderInvestigation";
			definition = "Case is currently under investigation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseStatusCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Case has never been assigned before.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseStatusCode
	 * CaseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKNW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case has never been assigned before."</li>
	 * </ul>
	 */
	public static final CaseStatusCode Unknown = new CaseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Case has never been assigned before.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseStatusCode.mmObject();
			codeName = "UKNW";
		}
	};
	/**
	 * Investigation is taking too long.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseStatusCode
	 * CaseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODUE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overdue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigation is taking too long."</li>
	 * </ul>
	 */
	public static final CaseStatusCode Overdue = new CaseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Overdue";
			definition = "Investigation is taking too long.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseStatusCode.mmObject();
			codeName = "ODUE";
		}
	};
	final static private LinkedHashMap<String, CaseStatusCode> codesByName = new LinkedHashMap<>();

	protected CaseStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CLSD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseStatusCode";
				definition = "Specifies the status of an investigation case.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseStatusCode.Closed, com.tools20022.repository.codeset.CaseStatusCode.Assigned, com.tools20022.repository.codeset.CaseStatusCode.UnderInvestigation,
						com.tools20022.repository.codeset.CaseStatusCode.Unknown, com.tools20022.repository.codeset.CaseStatusCode.Overdue);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Closed.getCodeName().get(), Closed);
		codesByName.put(Assigned.getCodeName().get(), Assigned);
		codesByName.put(UnderInvestigation.getCodeName().get(), UnderInvestigation);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(Overdue.getCodeName().get(), Overdue);
	}

	public static CaseStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CaseStatusCode[] values() {
		CaseStatusCode[] values = new CaseStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CaseStatusCode> {
		@Override
		public CaseStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CaseStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}