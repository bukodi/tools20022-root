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

package com.tools20022.repository.msgpart;

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.StructuredRemittanceInformation7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.RemittanceInformation5#mmUnstructured
 * RemittanceInformation5.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.RemittanceInformation5#mmStructured
 * RemittanceInformation5.mmStructured}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RemittanceInformation5"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RemittanceInformation5", propOrder = {"unstructured", "structured"})
public class RemittanceInformation5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ustrd")
	protected List<Max140Text> unstructured;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceInformation5
	 * RemittanceInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ustrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unstructured"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RemittanceInformation5, List<Max140Text>> mmUnstructured = new MMMessageAttribute<RemittanceInformation5, List<Max140Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.RemittanceInformation5.mmObject());
			isDerived = false;
			xmlTag = "Ustrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unstructured";
			definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.";
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max140Text.mmObject());
		}

		@Override
		public List<Max140Text> getValue(RemittanceInformation5 obj) {
			return obj.getUnstructured();
		}

		@Override
		public void setValue(RemittanceInformation5 obj, List<Max140Text> value) {
			obj.setUnstructured(value);
		}
	};
	@XmlElement(name = "Strd")
	protected List<StructuredRemittanceInformation7> structured;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7
	 * StructuredRemittanceInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceInformation5
	 * RemittanceInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Strd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Structured"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RemittanceInformation5, List<StructuredRemittanceInformation7>> mmStructured = new MMMessageAssociationEnd<RemittanceInformation5, List<StructuredRemittanceInformation7>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.RemittanceInformation5.mmObject());
			isDerived = false;
			xmlTag = "Strd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Structured";
			definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> StructuredRemittanceInformation7.mmObject());
		}

		@Override
		public List<StructuredRemittanceInformation7> getValue(RemittanceInformation5 obj) {
			return obj.getStructured();
		}

		@Override
		public void setValue(RemittanceInformation5 obj, List<StructuredRemittanceInformation7> value) {
			obj.setStructured(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.RemittanceInformation5.mmUnstructured, com.tools20022.repository.msgpart.RemittanceInformation5.mmStructured));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceInformation5";
				definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max140Text> getUnstructured() {
		return unstructured == null ? unstructured = new ArrayList<>() : unstructured;
	}

	public RemittanceInformation5 setUnstructured(List<Max140Text> unstructured) {
		this.unstructured = Objects.requireNonNull(unstructured);
		return this;
	}

	public List<StructuredRemittanceInformation7> getStructured() {
		return structured == null ? structured = new ArrayList<>() : structured;
	}

	public RemittanceInformation5 setStructured(List<StructuredRemittanceInformation7> structured) {
		this.structured = Objects.requireNonNull(structured);
		return this;
	}
}