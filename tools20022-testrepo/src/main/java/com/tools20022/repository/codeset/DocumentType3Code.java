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

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DocumentType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a type of financial or commercial document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
 * DocumentTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#RADM_RemittanceAdviceMessage
 * DocumentType3Code.RADM_RemittanceAdviceMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#RPIN_RelatedPaymentInstruction
 * DocumentType3Code.RPIN_RelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#FXDR_ForeignExchangeDealReference
 * DocumentType3Code.FXDR_ForeignExchangeDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#DISP_DispatchAdvice
 * DocumentType3Code.DISP_DispatchAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#PUOR_PurchaseOrder
 * DocumentType3Code.PUOR_PurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#SCOR_StructuredCommunicationReference
 * DocumentType3Code.SCOR_StructuredCommunicationReference}</li>
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
 * <li>"RADM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of financial or commercial document."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DocumentType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceAdviceMessage"</li>
	 * </ul>
	 */
	public static final DocumentType3Code RADM_RemittanceAdviceMessage = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceAdviceMessage";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType3Code.mmObject());
			codeName = DocumentTypeCode.RADM_RemittanceAdviceMessage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentInstruction"</li>
	 * </ul>
	 */
	public static final DocumentType3Code RPIN_RelatedPaymentInstruction = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPaymentInstruction";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType3Code.mmObject());
			codeName = DocumentTypeCode.RPIN_RelatedPaymentInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDealReference"</li>
	 * </ul>
	 */
	public static final DocumentType3Code FXDR_ForeignExchangeDealReference = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDealReference";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType3Code.mmObject());
			codeName = DocumentTypeCode.FXDR_ForeignExchangeDealReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DispatchAdvice"</li>
	 * </ul>
	 */
	public static final DocumentType3Code DISP_DispatchAdvice = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DispatchAdvice";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType3Code.mmObject());
			codeName = DocumentTypeCode.DISP_DispatchAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * </ul>
	 */
	public static final DocumentType3Code PUOR_PurchaseOrder = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrder";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType3Code.mmObject());
			codeName = DocumentTypeCode.PUOR_PurchaseOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredCommunicationReference"</li>
	 * </ul>
	 */
	public static final DocumentType3Code SCOR_StructuredCommunicationReference = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredCommunicationReference";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType3Code.mmObject());
			codeName = DocumentTypeCode.SCOR_StructuredCommunicationReference.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DocumentType3Code> codesByName = new LinkedHashMap<>();

	protected DocumentType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				example = Arrays.asList("RADM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentType3Code";
				definition = "Specifies a type of financial or commercial document.";
				trace_lazy = LazyReference.create(() -> DocumentTypeCode.mmObject());
				code_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.DocumentType3Code.RADM_RemittanceAdviceMessage, com.tools20022.repository.codeset.DocumentType3Code.RPIN_RelatedPaymentInstruction,
						com.tools20022.repository.codeset.DocumentType3Code.FXDR_ForeignExchangeDealReference, com.tools20022.repository.codeset.DocumentType3Code.DISP_DispatchAdvice,
						com.tools20022.repository.codeset.DocumentType3Code.PUOR_PurchaseOrder, com.tools20022.repository.codeset.DocumentType3Code.SCOR_StructuredCommunicationReference));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RADM_RemittanceAdviceMessage.getCodeName().get(), RADM_RemittanceAdviceMessage);
		codesByName.put(RPIN_RelatedPaymentInstruction.getCodeName().get(), RPIN_RelatedPaymentInstruction);
		codesByName.put(FXDR_ForeignExchangeDealReference.getCodeName().get(), FXDR_ForeignExchangeDealReference);
		codesByName.put(DISP_DispatchAdvice.getCodeName().get(), DISP_DispatchAdvice);
		codesByName.put(PUOR_PurchaseOrder.getCodeName().get(), PUOR_PurchaseOrder);
		codesByName.put(SCOR_StructuredCommunicationReference.getCodeName().get(), SCOR_StructuredCommunicationReference);
	}

	public static DocumentType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DocumentType3Code[] values() {
		DocumentType3Code[] values = new DocumentType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DocumentType3Code> {
		@Override
		public DocumentType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DocumentType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}