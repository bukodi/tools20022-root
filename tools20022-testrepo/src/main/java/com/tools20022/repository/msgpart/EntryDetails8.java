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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.BatchInformation2;
import com.tools20022.repository.msgpart.EntryTransaction9;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the underlying transaction(s) and/or batched entries.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.EntryDetails8#mmBatch
 * EntryDetails8.mmBatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryDetails8#mmTransactionDetails
 * EntryDetails8.mmTransactionDetails}</li>
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
 * "EntryDetails8"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EntryDetails8", propOrder = {"batch", "transactionDetails"})
public class EntryDetails8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Btch")
	protected BatchInformation2 batch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.BatchInformation2
	 * BatchInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryDetails8
	 * EntryDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Btch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Batch"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryDetails8, Optional<BatchInformation2>> mmBatch = new MMMessageAssociationEnd<EntryDetails8, Optional<BatchInformation2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryDetails8.mmObject());
			isDerived = false;
			xmlTag = "Btch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Batch";
			definition = "Provides details on batched transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BatchInformation2.mmObject());
		}

		@Override
		public Optional<BatchInformation2> getValue(EntryDetails8 obj) {
			return obj.getBatch();
		}

		@Override
		public void setValue(EntryDetails8 obj, Optional<BatchInformation2> value) {
			obj.setBatch(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtls")
	protected List<EntryTransaction9> transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryDetails8
	 * EntryDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryDetails8, List<EntryTransaction9>> mmTransactionDetails = new MMMessageAssociationEnd<EntryDetails8, List<EntryTransaction9>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryDetails8.mmObject());
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Provides information on the underlying transaction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> EntryTransaction9.mmObject());
		}

		@Override
		public List<EntryTransaction9> getValue(EntryDetails8 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(EntryDetails8 obj, List<EntryTransaction9> value) {
			obj.setTransactionDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.EntryDetails8.mmBatch, com.tools20022.repository.msgpart.EntryDetails8.mmTransactionDetails));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EntryDetails8";
				definition = "Identifies the underlying transaction(s) and/or batched entries.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BatchInformation2> getBatch() {
		return Optional.ofNullable(batch);
	}

	public EntryDetails8 setBatch(BatchInformation2 batch) {
		this.batch = batch;
		return this;
	}

	public List<EntryTransaction9> getTransactionDetails() {
		return transactionDetails == null ? transactionDetails = new ArrayList<>() : transactionDetails;
	}

	public EntryDetails8 setTransactionDetails(List<EntryTransaction9> transactionDetails) {
		this.transactionDetails = Objects.requireNonNull(transactionDetails);
		return this;
	}
}