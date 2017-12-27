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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a shipment period or a shipment date.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ShipmentDateRange" src="doc-files/ShipmentDateRange.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmLatestShipmentDate
 * ShipmentDateRange.mmLatestShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmRelatedTransport
 * ShipmentDateRange.mmRelatedTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmEarliestShipmentDate
 * ShipmentDateRange.mmEarliestShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmShipmentDate
 * ShipmentDateRange.mmShipmentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
 * Transport.mmShipmentDates}</li>
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
 * "ShipmentDateRange"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a shipment period or a shipment date."</li>
 * </ul>
 */
public class ShipmentDateRange {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime latestShipmentDate;
	/**
	 * Latest date whereby the goods must be shipped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatestShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Latest date whereby the goods must be shipped."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLatestShipmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LatestShipmentDate";
			definition = "Latest date whereby the goods must be shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ShipmentDateRange.class.getMethod("getLatestShipmentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Transport relatedTransport;
	/**
	 * Specifies the transport process to which the dates apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
	 * Transport.mmShipmentDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the transport process to which the dates apply."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedTransport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransport";
			definition = "Specifies the transport process to which the dates apply.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmShipmentDates;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	protected ISODateTime earliestShipmentDate;
	/**
	 * Earliest date whereby the items must be shipped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Earliest date whereby the items must be shipped."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEarliestShipmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarliestShipmentDate";
			definition = "Earliest date whereby the items must be shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ShipmentDateRange.class.getMethod("getEarliestShipmentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime shipmentDate;
	/**
	 * Date at which the goods are shipped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the goods are shipped."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmShipmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShipmentDate";
			definition = "Date at which the goods are shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ShipmentDateRange.class.getMethod("getShipmentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ShipmentDateRange";
				definition = "Specifies a shipment period or a shipment date.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.mmShipmentDates);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ShipmentDateRange.mmLatestShipmentDate, com.tools20022.repository.entity.ShipmentDateRange.mmRelatedTransport,
						com.tools20022.repository.entity.ShipmentDateRange.mmEarliestShipmentDate, com.tools20022.repository.entity.ShipmentDateRange.mmShipmentDate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ShipmentDateRange.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getLatestShipmentDate() {
		return latestShipmentDate;
	}

	public void setLatestShipmentDate(ISODateTime latestShipmentDate) {
		this.latestShipmentDate = latestShipmentDate;
	}

	public Transport getRelatedTransport() {
		return relatedTransport;
	}

	public void setRelatedTransport(com.tools20022.repository.entity.Transport relatedTransport) {
		this.relatedTransport = relatedTransport;
	}

	public ISODateTime getEarliestShipmentDate() {
		return earliestShipmentDate;
	}

	public void setEarliestShipmentDate(ISODateTime earliestShipmentDate) {
		this.earliestShipmentDate = earliestShipmentDate;
	}

	public ISODateTime getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(ISODateTime shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
}