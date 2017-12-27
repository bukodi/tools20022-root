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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Point of interaction (POI) is the entry point to a card payment system. It
 * could be a physical or logical card payment terminal containing software and
 * hardware components, it could be a payment system including a set of card
 * payment terminals linked to a local or remote server, or it could be just an
 * interface to make payments as telephone or Internet browser.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PointOfInteraction" src="doc-files/PointOfInteraction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.System System}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardPaymentAcquiring
 * PointOfInteraction.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardReadingCapabilities
 * PointOfInteraction.mmCardReadingCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardholderVerificationCapabilities
 * PointOfInteraction.mmCardholderVerificationCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmOnLineCapabilities
 * PointOfInteraction.mmOnLineCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmDisplayCapabilities
 * PointOfInteraction.mmDisplayCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmPrintLineWidth
 * PointOfInteraction.mmPrintLineWidth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponent
 * PointOfInteraction.mmComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponentIdentification
 * PointOfInteraction.mmComponentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmGroupIdentifier
 * PointOfInteraction.mmGroupIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmLineWidth
 * PointOfInteraction.mmLineWidth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmNumberOfLines
 * PointOfInteraction.mmNumberOfLines}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmErrorLog
 * PointOfInteraction.mmErrorLog}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponentVersionNumber
 * PointOfInteraction.mmComponentVersionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmControllingTerminalManagementSystem
 * PointOfInteraction.mmControllingTerminalManagementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
 * CardPaymentAcquiring.mmPointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmControlledPointOfInteraction
 * TerminalManagementSystem.mmControlledPointOfInteraction}</li>
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
 * "PointOfInteraction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Point of interaction (POI) is the entry point to a card payment system. It could be a physical or logical card payment terminal containing software and hardware components, it could be a payment system including a set of card payment terminals linked to a local or remote server, or it could be just an interface to make payments as telephone or Internet browser."
 * </li>
 * </ul>
 */
public class PointOfInteraction extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPaymentAcquiring cardPaymentAcquiring;
	/**
	 * Process which uses the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentAcquiring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process which uses the point of interaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCardPaymentAcquiring = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Process which uses the point of interaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmPointOfInteraction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}
	};
	protected CardDataReadingCode cardReadingCapabilities;
	/**
	 * Card reading capabilities of the POI performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardReadingCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card reading capabilities of the POI performing the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCardReadingCapabilities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardReadingCapabilities";
			definition = "Card reading capabilities of the POI performing the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardDataReadingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getCardReadingCapabilities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CardholderVerificationCapabilityCode cardholderVerificationCapabilities;
	/**
	 * Type of cardholder verification that could be performed during a
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderVerificationCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of cardholder verification that could be performed during a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCardholderVerificationCapabilities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderVerificationCapabilities";
			definition = "Type of cardholder verification that could be performed during a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getCardholderVerificationCapabilities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OnLineCapabilityCode onLineCapabilities;
	/**
	 * On-line and off-line capabilities of the POI.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode
	 * OnLineCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On-line and off-line capabilities of the POI."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOnLineCapabilities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLineCapabilities";
			definition = "On-line and off-line capabilities of the POI.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OnLineCapabilityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getOnLineCapabilities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected UserInterfaceCode displayCapabilities;
	/**
	 * Display interfaces components.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Display interfaces components."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDisplayCapabilities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisplayCapabilities";
			definition = "Display interfaces components.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UserInterfaceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getDisplayCapabilities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max3NumericText printLineWidth;
	/**
	 * Number of columns of the printer component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintLineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the printer component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPrintLineWidth = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrintLineWidth";
			definition = "Number of columns of the printer component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getPrintLineWidth", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected POIComponentTypeCode component;
	/**
	 * Type of components belonging to a POI.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Component"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of components belonging to a POI."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmComponent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Component";
			definition = "Type of components belonging to a POI.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> POIComponentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getComponent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text componentIdentification;
	/**
	 * Identification of the POI component assigned by its provider.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the POI component assigned by its provider."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmComponentIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ComponentIdentification";
			definition = "Identification of the POI component assigned by its provider.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getComponentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text groupIdentifier;
	/**
	 * Identifier assigned by the merchant identifying a set of POI terminals
	 * performing some categories of transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGroupIdentifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GroupIdentifier";
			definition = "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getGroupIdentifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max3NumericText lineWidth;
	/**
	 * Number of columns of the display component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the display component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLineWidth = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LineWidth";
			definition = "Number of columns of the display component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getLineWidth", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max2NumericText numberOfLines;
	/**
	 * Number of lines of the display component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max2NumericText
	 * Max2NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfLines"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of lines of the display component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNumberOfLines = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfLines";
			definition = "Number of lines of the display component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getNumberOfLines", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text errorLog;
	/**
	 * Error logging transferred by the point of interaction to the terminal
	 * management system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorLog"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Error logging transferred by the point of interaction to the terminal management system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmErrorLog = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ErrorLog";
			definition = "Error logging transferred by the point of interaction to the terminal management system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getErrorLog", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max16Text componentVersionNumber;
	/**
	 * Identification of a version of component belonging to a given model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentVersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a version of component belonging to a given model."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmComponentVersionNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ComponentVersionNumber";
			definition = "Identification of a version of component belonging to a given model.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PointOfInteraction.class.getMethod("getComponentVersionNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TerminalManagementSystem controllingTerminalManagementSystem;
	/**
	 * Terminal management system for which a point of interaction is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmControlledPointOfInteraction
	 * TerminalManagementSystem.mmControlledPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControllingTerminalManagementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system for which a point of interaction is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmControllingTerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ControllingTerminalManagementSystem";
			definition = "Terminal management system for which a point of interaction is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmControlledPointOfInteraction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteraction";
				definition = "Point of interaction (POI) is the entry point to a card payment system. It could be a physical or logical card payment terminal containing software and hardware components, it could be a payment system including a set of card payment terminals linked to a local or remote server, or it could be just an interface to make payments as telephone or Internet browser.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentAcquiring.mmPointOfInteraction, com.tools20022.repository.entity.TerminalManagementSystem.mmControlledPointOfInteraction);
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PointOfInteraction.mmCardPaymentAcquiring, com.tools20022.repository.entity.PointOfInteraction.mmCardReadingCapabilities,
						com.tools20022.repository.entity.PointOfInteraction.mmCardholderVerificationCapabilities, com.tools20022.repository.entity.PointOfInteraction.mmOnLineCapabilities,
						com.tools20022.repository.entity.PointOfInteraction.mmDisplayCapabilities, com.tools20022.repository.entity.PointOfInteraction.mmPrintLineWidth, com.tools20022.repository.entity.PointOfInteraction.mmComponent,
						com.tools20022.repository.entity.PointOfInteraction.mmComponentIdentification, com.tools20022.repository.entity.PointOfInteraction.mmGroupIdentifier, com.tools20022.repository.entity.PointOfInteraction.mmLineWidth,
						com.tools20022.repository.entity.PointOfInteraction.mmNumberOfLines, com.tools20022.repository.entity.PointOfInteraction.mmErrorLog, com.tools20022.repository.entity.PointOfInteraction.mmComponentVersionNumber,
						com.tools20022.repository.entity.PointOfInteraction.mmControllingTerminalManagementSystem);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PointOfInteraction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentAcquiring getCardPaymentAcquiring() {
		return cardPaymentAcquiring;
	}

	public void setCardPaymentAcquiring(com.tools20022.repository.entity.CardPaymentAcquiring cardPaymentAcquiring) {
		this.cardPaymentAcquiring = cardPaymentAcquiring;
	}

	public CardDataReadingCode getCardReadingCapabilities() {
		return cardReadingCapabilities;
	}

	public void setCardReadingCapabilities(CardDataReadingCode cardReadingCapabilities) {
		this.cardReadingCapabilities = cardReadingCapabilities;
	}

	public CardholderVerificationCapabilityCode getCardholderVerificationCapabilities() {
		return cardholderVerificationCapabilities;
	}

	public void setCardholderVerificationCapabilities(CardholderVerificationCapabilityCode cardholderVerificationCapabilities) {
		this.cardholderVerificationCapabilities = cardholderVerificationCapabilities;
	}

	public OnLineCapabilityCode getOnLineCapabilities() {
		return onLineCapabilities;
	}

	public void setOnLineCapabilities(OnLineCapabilityCode onLineCapabilities) {
		this.onLineCapabilities = onLineCapabilities;
	}

	public UserInterfaceCode getDisplayCapabilities() {
		return displayCapabilities;
	}

	public void setDisplayCapabilities(UserInterfaceCode displayCapabilities) {
		this.displayCapabilities = displayCapabilities;
	}

	public Max3NumericText getPrintLineWidth() {
		return printLineWidth;
	}

	public void setPrintLineWidth(Max3NumericText printLineWidth) {
		this.printLineWidth = printLineWidth;
	}

	public POIComponentTypeCode getComponent() {
		return component;
	}

	public void setComponent(POIComponentTypeCode component) {
		this.component = component;
	}

	public Max35Text getComponentIdentification() {
		return componentIdentification;
	}

	public void setComponentIdentification(Max35Text componentIdentification) {
		this.componentIdentification = componentIdentification;
	}

	public Max35Text getGroupIdentifier() {
		return groupIdentifier;
	}

	public void setGroupIdentifier(Max35Text groupIdentifier) {
		this.groupIdentifier = groupIdentifier;
	}

	public Max3NumericText getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(Max3NumericText lineWidth) {
		this.lineWidth = lineWidth;
	}

	public Max2NumericText getNumberOfLines() {
		return numberOfLines;
	}

	public void setNumberOfLines(Max2NumericText numberOfLines) {
		this.numberOfLines = numberOfLines;
	}

	public Max140Text getErrorLog() {
		return errorLog;
	}

	public void setErrorLog(Max140Text errorLog) {
		this.errorLog = errorLog;
	}

	public Max16Text getComponentVersionNumber() {
		return componentVersionNumber;
	}

	public void setComponentVersionNumber(Max16Text componentVersionNumber) {
		this.componentVersionNumber = componentVersionNumber;
	}

	public TerminalManagementSystem getControllingTerminalManagementSystem() {
		return controllingTerminalManagementSystem;
	}

	public void setControllingTerminalManagementSystem(com.tools20022.repository.entity.TerminalManagementSystem controllingTerminalManagementSystem) {
		this.controllingTerminalManagementSystem = controllingTerminalManagementSystem;
	}
}