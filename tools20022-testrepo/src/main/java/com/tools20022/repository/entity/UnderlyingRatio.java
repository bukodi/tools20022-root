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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Related financial instrument into which the security can be converted.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UnderlyingRatio" src="doc-files/UnderlyingRatio.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmSecuritiesConversion
 * UnderlyingRatio.mmSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityDenominator
 * UnderlyingRatio.mmUnderlyingQuantityDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityNumerator
 * UnderlyingRatio.mmUnderlyingQuantityNumerator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDenominatorRatio
 * SecuritiesQuantity.mmDenominatorRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNumeratorRatio
 * SecuritiesQuantity.mmNumeratorRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRatio
 * SecuritiesConversion.mmRatio}</li>
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
 * "UnderlyingRatio"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Related financial instrument into which the security can be converted."</li>
 * </ul>
 */
public class UnderlyingRatio {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesConversion> securitiesConversion;
	/**
	 * Other parameters used to convert securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRatio
	 * SecuritiesConversion.mmRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio
	 * UnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other parameters used to convert securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesConversion";
			definition = "Other parameters used to convert securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmRatio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected SecuritiesQuantity underlyingQuantityDenominator;
	/**
	 * Number of held securities for the exercise.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDenominatorRatio
	 * SecuritiesQuantity.mmDenominatorRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio
	 * UnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingQuantityDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of held securities for the exercise."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUnderlyingQuantityDenominator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingQuantityDenominator";
			definition = "Number of held securities for the exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmDenominatorRatio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity underlyingQuantityNumerator;
	/**
	 * Number of related securities for the exercise.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNumeratorRatio
	 * SecuritiesQuantity.mmNumeratorRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio
	 * UnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingQuantityNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of related securities for the exercise."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUnderlyingQuantityNumerator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingQuantityNumerator";
			definition = "Number of related securities for the exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmNumeratorRatio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingRatio";
				definition = "Related financial instrument into which the security can be converted.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.mmDenominatorRatio, com.tools20022.repository.entity.SecuritiesQuantity.mmNumeratorRatio,
						com.tools20022.repository.entity.SecuritiesConversion.mmRatio);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UnderlyingRatio.mmSecuritiesConversion, com.tools20022.repository.entity.UnderlyingRatio.mmUnderlyingQuantityDenominator,
						com.tools20022.repository.entity.UnderlyingRatio.mmUnderlyingQuantityNumerator);
			}

			@Override
			public Class<?> getInstanceClass() {
				return UnderlyingRatio.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesConversion> getSecuritiesConversion() {
		return securitiesConversion;
	}

	public void setSecuritiesConversion(List<com.tools20022.repository.entity.SecuritiesConversion> securitiesConversion) {
		this.securitiesConversion = securitiesConversion;
	}

	public SecuritiesQuantity getUnderlyingQuantityDenominator() {
		return underlyingQuantityDenominator;
	}

	public void setUnderlyingQuantityDenominator(com.tools20022.repository.entity.SecuritiesQuantity underlyingQuantityDenominator) {
		this.underlyingQuantityDenominator = underlyingQuantityDenominator;
	}

	public SecuritiesQuantity getUnderlyingQuantityNumerator() {
		return underlyingQuantityNumerator;
	}

	public void setUnderlyingQuantityNumerator(com.tools20022.repository.entity.SecuritiesQuantity underlyingQuantityNumerator) {
		this.underlyingQuantityNumerator = underlyingQuantityNumerator;
	}
}