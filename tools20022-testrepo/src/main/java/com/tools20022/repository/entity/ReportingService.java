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
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.AccountService;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the reporting parameters that are included in the account contract
 * which specifies the services linked to the account..
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ReportingService" src="doc-files/ReportingService.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountService
 * AccountService}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
 * ReportingService.mmStatementFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmFloorNotificationAmount
 * ReportingService.mmFloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmCeilingNotificationAmount
 * ReportingService.mmCeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmReportingChannel
 * ReportingService.mmReportingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmRelatedInvestmentAccountService
 * ReportingService.mmRelatedInvestmentAccountService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedReportingService
 * ContactPoint.mmRelatedReportingService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReportingService
 * InvestmentAccountService.mmReportingService}</li>
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
 * "ReportingService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reporting parameters that are included in the account contract which specifies the services linked to the account.."
 * </li>
 * </ul>
 */
public class ReportingService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected FrequencyCode statementFrequency;
	/**
	 * Specifies the frequency at which a statement must be created by the
	 * account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency at which a statement must be created by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatementFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatementFrequency";
			definition = "Specifies the frequency at which a statement must be created by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReportingService.class.getMethod("getStatementFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount floorNotificationAmount;
	/**
	 * Specifies the balance amount of an account under which a notification
	 * should be sent from the account servicer to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the balance amount of an account under which a notification should be sent from the account servicer to the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFloorNotificationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FloorNotificationAmount";
			definition = "Specifies the balance amount of an account under which a notification should be sent from the account servicer to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReportingService.class.getMethod("getFloorNotificationAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount ceilingNotificationAmount;
	/**
	 * Specifies the balance amount of an account above which a notification
	 * should be sent from the account servicer to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CeilingNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the balance amount of an account above which a notification should be sent from the account servicer to the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCeilingNotificationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CeilingNotificationAmount";
			definition = "Specifies the balance amount of an account above which a notification should be sent from the account servicer to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReportingService.class.getMethod("getCeilingNotificationAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> reportingChannel;
	/**
	 * Specifies the channel through which the statement must be made available
	 * to the account owner or to the information recipient.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedReportingService
	 * ContactPoint.mmRelatedReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the channel through which the statement must be made available to the account owner or to the information recipient."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReportingChannel = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingChannel";
			definition = "Specifies the channel through which the statement must be made available to the account owner or to the information recipient.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedReportingService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected InvestmentAccountService relatedInvestmentAccountService;
	/**
	 * Investment account services which include reporting services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReportingService
	 * InvestmentAccountService.mmReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account services which include reporting services."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestmentAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccountService";
			definition = "Investment account services which include reporting services.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmReportingService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingService";
				definition = "Specifies the reporting parameters that are included in the account contract which specifies the services linked to the account..";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.mmRelatedReportingService, com.tools20022.repository.entity.InvestmentAccountService.mmReportingService);
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingService.mmStatementFrequency, com.tools20022.repository.entity.ReportingService.mmFloorNotificationAmount,
						com.tools20022.repository.entity.ReportingService.mmCeilingNotificationAmount, com.tools20022.repository.entity.ReportingService.mmReportingChannel,
						com.tools20022.repository.entity.ReportingService.mmRelatedInvestmentAccountService);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReportingService.class;
			}
		});
		return mmObject_lazy.get();
	}

	public FrequencyCode getStatementFrequency() {
		return statementFrequency;
	}

	public void setStatementFrequency(FrequencyCode statementFrequency) {
		this.statementFrequency = statementFrequency;
	}

	public CurrencyAndAmount getFloorNotificationAmount() {
		return floorNotificationAmount;
	}

	public void setFloorNotificationAmount(CurrencyAndAmount floorNotificationAmount) {
		this.floorNotificationAmount = floorNotificationAmount;
	}

	public CurrencyAndAmount getCeilingNotificationAmount() {
		return ceilingNotificationAmount;
	}

	public void setCeilingNotificationAmount(CurrencyAndAmount ceilingNotificationAmount) {
		this.ceilingNotificationAmount = ceilingNotificationAmount;
	}

	public List<ContactPoint> getReportingChannel() {
		return reportingChannel;
	}

	public void setReportingChannel(List<com.tools20022.repository.entity.ContactPoint> reportingChannel) {
		this.reportingChannel = reportingChannel;
	}

	public InvestmentAccountService getRelatedInvestmentAccountService() {
		return relatedInvestmentAccountService;
	}

	public void setRelatedInvestmentAccountService(com.tools20022.repository.entity.InvestmentAccountService relatedInvestmentAccountService) {
		this.relatedInvestmentAccountService = relatedInvestmentAccountService;
	}
}