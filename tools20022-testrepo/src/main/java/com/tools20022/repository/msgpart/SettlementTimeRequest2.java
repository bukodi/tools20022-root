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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information on the requested settlement time(s) of the payment
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementTimeRequest2#mmCLSTime
 * SettlementTimeRequest2.mmCLSTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementTimeRequest2#mmTillTime
 * SettlementTimeRequest2.mmTillTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementTimeRequest2#mmFromTime
 * SettlementTimeRequest2.mmFromTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementTimeRequest2#mmRejectTime
 * SettlementTimeRequest2.mmRejectTime}</li>
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
 * "SettlementTimeRequest2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementTimeRequest2", propOrder = {"cLSTime", "tillTime", "fromTime", "rejectTime"})
public class SettlementTimeRequest2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CLSTm")
	protected ISOTime cLSTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementTimeRequest2
	 * SettlementTimeRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CLSTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CLSTime"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementTimeRequest2, Optional<ISOTime>> mmCLSTime = new MMMessageAttribute<SettlementTimeRequest2, Optional<ISOTime>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementTimeRequest2.mmObject());
			isDerived = false;
			xmlTag = "CLSTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CLSTime";
			definition = "Time by which the amount of money must be credited, with confirmation, to the CLS Bank's account at the central bank.\nUsage: Time must be expressed in Central European Time (CET).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISOTime.mmObject());
		}

		@Override
		public Optional<ISOTime> getValue(SettlementTimeRequest2 obj) {
			return obj.getCLSTime();
		}

		@Override
		public void setValue(SettlementTimeRequest2 obj, Optional<ISOTime> value) {
			obj.setCLSTime(value.orElse(null));
		}
	};
	@XmlElement(name = "TillTm")
	protected ISOTime tillTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementTimeRequest2
	 * SettlementTimeRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TillTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TillTime"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementTimeRequest2, Optional<ISOTime>> mmTillTime = new MMMessageAttribute<SettlementTimeRequest2, Optional<ISOTime>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementTimeRequest2.mmObject());
			isDerived = false;
			xmlTag = "TillTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TillTime";
			definition = "Time until when the payment may be settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISOTime.mmObject());
		}

		@Override
		public Optional<ISOTime> getValue(SettlementTimeRequest2 obj) {
			return obj.getTillTime();
		}

		@Override
		public void setValue(SettlementTimeRequest2 obj, Optional<ISOTime> value) {
			obj.setTillTime(value.orElse(null));
		}
	};
	@XmlElement(name = "FrTm")
	protected ISOTime fromTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementTimeRequest2
	 * SettlementTimeRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromTime"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementTimeRequest2, Optional<ISOTime>> mmFromTime = new MMMessageAttribute<SettlementTimeRequest2, Optional<ISOTime>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementTimeRequest2.mmObject());
			isDerived = false;
			xmlTag = "FrTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromTime";
			definition = "Time as from when the payment may be settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISOTime.mmObject());
		}

		@Override
		public Optional<ISOTime> getValue(SettlementTimeRequest2 obj) {
			return obj.getFromTime();
		}

		@Override
		public void setValue(SettlementTimeRequest2 obj, Optional<ISOTime> value) {
			obj.setFromTime(value.orElse(null));
		}
	};
	@XmlElement(name = "RjctTm")
	protected ISOTime rejectTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementTimeRequest2
	 * SettlementTimeRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectTime"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementTimeRequest2, Optional<ISOTime>> mmRejectTime = new MMMessageAttribute<SettlementTimeRequest2, Optional<ISOTime>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementTimeRequest2.mmObject());
			isDerived = false;
			xmlTag = "RjctTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectTime";
			definition = "Time by when the payment must be settled to avoid rejection.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISOTime.mmObject());
		}

		@Override
		public Optional<ISOTime> getValue(SettlementTimeRequest2 obj) {
			return obj.getRejectTime();
		}

		@Override
		public void setValue(SettlementTimeRequest2 obj, Optional<ISOTime> value) {
			obj.setRejectTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.SettlementTimeRequest2.mmCLSTime, com.tools20022.repository.msgpart.SettlementTimeRequest2.mmTillTime,
						com.tools20022.repository.msgpart.SettlementTimeRequest2.mmFromTime, com.tools20022.repository.msgpart.SettlementTimeRequest2.mmRejectTime));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementTimeRequest2";
				definition = "Provides information on the requested settlement time(s) of the payment instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISOTime> getCLSTime() {
		return Optional.ofNullable(cLSTime);
	}

	public SettlementTimeRequest2 setCLSTime(ISOTime cLSTime) {
		this.cLSTime = cLSTime;
		return this;
	}

	public Optional<ISOTime> getTillTime() {
		return Optional.ofNullable(tillTime);
	}

	public SettlementTimeRequest2 setTillTime(ISOTime tillTime) {
		this.tillTime = tillTime;
		return this;
	}

	public Optional<ISOTime> getFromTime() {
		return Optional.ofNullable(fromTime);
	}

	public SettlementTimeRequest2 setFromTime(ISOTime fromTime) {
		this.fromTime = fromTime;
		return this;
	}

	public Optional<ISOTime> getRejectTime() {
		return Optional.ofNullable(rejectTime);
	}

	public SettlementTimeRequest2 setRejectTime(ISOTime rejectTime) {
		this.rejectTime = rejectTime;
		return this;
	}
}