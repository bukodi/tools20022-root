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
import com.tools20022.repository.area.camt.BankToCustomerStatementV07;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.OriginalBusinessQuery1;
import com.tools20022.repository.msgpart.Pagination1;
import com.tools20022.repository.msgpart.PartyIdentification125;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73#mmMessageIdentification
 * GroupHeader73.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73#mmCreationDateTime
 * GroupHeader73.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73#mmMessageRecipient
 * GroupHeader73.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73#mmMessagePagination
 * GroupHeader73.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73#mmOriginalBusinessQuery
 * GroupHeader73.mmOriginalBusinessQuery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73#mmAdditionalInformation
 * GroupHeader73.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlocks
 * messageBuildingBlocks} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07#mmGroupHeader
 * BankToCustomerStatementV07.mmGroupHeader}</li>
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
 * "GroupHeader73"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GroupHeader73", propOrder = {"messageIdentification", "creationDateTime", "messageRecipient", "messagePagination", "originalBusinessQuery", "additionalInformation"})
public class GroupHeader73 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73
	 * GroupHeader73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader73, Max35Text> mmMessageIdentification = new MMMessageAttribute<GroupHeader73, Max35Text>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader73.mmObject());
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the account servicing institution, and sent to the account owner or the party authorised to receive the message, to unambiguously identify the message.\nUsage: The account servicing institution has to make sure that MessageIdentification is unique per account owner for a pre-agreed period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Max35Text getValue(GroupHeader73 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(GroupHeader73 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73
	 * GroupHeader73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader73, ISODateTime> mmCreationDateTime = new MMMessageAttribute<GroupHeader73, ISODateTime>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader73.mmObject());
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ISODateTime.mmObject());
		}

		@Override
		public ISODateTime getValue(GroupHeader73 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(GroupHeader73 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "MsgRcpt")
	protected PartyIdentification125 messageRecipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73
	 * GroupHeader73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageRecipient"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GroupHeader73, Optional<PartyIdentification125>> mmMessageRecipient = new MMMessageAssociationEnd<GroupHeader73, Optional<PartyIdentification125>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader73.mmObject());
			isDerived = false;
			xmlTag = "MsgRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRecipient";
			definition = "Party authorised by the account owner to receive information about movements on the account.\nUsage: MessageRecipient should only be identified when different from the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PartyIdentification125.mmObject());
		}

		@Override
		public Optional<PartyIdentification125> getValue(GroupHeader73 obj) {
			return obj.getMessageRecipient();
		}

		@Override
		public void setValue(GroupHeader73 obj, Optional<PartyIdentification125> value) {
			obj.setMessageRecipient(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgPgntn")
	protected Pagination1 messagePagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.Pagination1
	 * Pagination1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73
	 * GroupHeader73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GroupHeader73, Optional<Pagination1>> mmMessagePagination = new MMMessageAssociationEnd<GroupHeader73, Optional<Pagination1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader73.mmObject());
			isDerived = false;
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Provides details on the page number of the message.\n\nUsage: The pagination of the message is only allowed when agreed between the parties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Pagination1.mmObject());
		}

		@Override
		public Optional<Pagination1> getValue(GroupHeader73 obj) {
			return obj.getMessagePagination();
		}

		@Override
		public void setValue(GroupHeader73 obj, Optional<Pagination1> value) {
			obj.setMessagePagination(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlBizQry")
	protected OriginalBusinessQuery1 originalBusinessQuery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.OriginalBusinessQuery1
	 * OriginalBusinessQuery1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73
	 * GroupHeader73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlBizQry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalBusinessQuery"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader73, Optional<OriginalBusinessQuery1>> mmOriginalBusinessQuery = new MMMessageAttribute<GroupHeader73, Optional<OriginalBusinessQuery1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader73.mmObject());
			isDerived = false;
			xmlTag = "OrgnlBizQry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalBusinessQuery";
			definition = "Unique identification, as assigned by the original requestor, to unambiguously identify the business query message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = LazyReference.create(() -> OriginalBusinessQuery1.mmObject());
		}

		@Override
		public Optional<OriginalBusinessQuery1> getValue(GroupHeader73 obj) {
			return obj.getOriginalBusinessQuery();
		}

		@Override
		public void setValue(GroupHeader73 obj, Optional<OriginalBusinessQuery1> value) {
			obj.setOriginalBusinessQuery(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max500Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73
	 * GroupHeader73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader73, Optional<Max500Text>> mmAdditionalInformation = new MMMessageAttribute<GroupHeader73, Optional<Max500Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader73.mmObject());
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max500Text.mmObject());
		}

		@Override
		public Optional<Max500Text> getValue(GroupHeader73 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(GroupHeader73 obj, Optional<Max500Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.GroupHeader73.mmMessageIdentification, com.tools20022.repository.msgpart.GroupHeader73.mmCreationDateTime,
						com.tools20022.repository.msgpart.GroupHeader73.mmMessageRecipient, com.tools20022.repository.msgpart.GroupHeader73.mmMessagePagination, com.tools20022.repository.msgpart.GroupHeader73.mmOriginalBusinessQuery,
						com.tools20022.repository.msgpart.GroupHeader73.mmAdditionalInformation));
				messageBuildingBlocks_lazy = LazyReference.create(() -> Arrays.asList(BankToCustomerStatementV07.mmGroupHeader));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GroupHeader73";
				definition = "Provides further details on the message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public GroupHeader73 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public GroupHeader73 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<PartyIdentification125> getMessageRecipient() {
		return Optional.ofNullable(messageRecipient);
	}

	public GroupHeader73 setMessageRecipient(PartyIdentification125 messageRecipient) {
		this.messageRecipient = messageRecipient;
		return this;
	}

	public Optional<Pagination1> getMessagePagination() {
		return Optional.ofNullable(messagePagination);
	}

	public GroupHeader73 setMessagePagination(Pagination1 messagePagination) {
		this.messagePagination = messagePagination;
		return this;
	}

	public Optional<OriginalBusinessQuery1> getOriginalBusinessQuery() {
		return Optional.ofNullable(originalBusinessQuery);
	}

	public GroupHeader73 setOriginalBusinessQuery(OriginalBusinessQuery1 originalBusinessQuery) {
		this.originalBusinessQuery = originalBusinessQuery;
		return this;
	}

	public Optional<Max500Text> getAdditionalInformation() {
		return Optional.ofNullable(additionalInformation);
	}

	public GroupHeader73 setAdditionalInformation(Max500Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}