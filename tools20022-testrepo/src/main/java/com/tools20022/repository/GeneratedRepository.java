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

package com.tools20022.repository;

import com.tools20022.core.repo.ReflectionBasedRepository;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.other.SupplementaryDataEnvelope1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 
 <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMRepository#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepository#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * </ul>
 */
public class GeneratedRepository extends ReflectionBasedRepository {

	final static private AtomicReference<MMRepository> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of BusinessProcessCatalogue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessProcessCatalogue#getTopLevelCatalogueEntry
	 * topLevelCatalogueEntry} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
	 * CashManagementLatestVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessProcessCatalogue#getRepository
	 * repository} = {@linkplain com.tools20022.repository.GeneratedRepository
	 * GeneratedRepository}</li>
	 * </ul>
	 */
	public static final MMBusinessProcessCatalogue mmcatalogue = new MMBusinessProcessCatalogue() {
		{
			topLevelCatalogueEntry_lazy = () -> Arrays.asList(CashManagementLatestVersion.mmObject());
			repository_lazy = () -> GeneratedRepository.mmObject();
		}
	};
	/**
	 * An instance of DataDictionary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMDataDictionary#getTopLevelDictionaryEntry
	 * topLevelDictionaryEntry} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification2Choice
	 * ClearingSystemIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2
	 * ClearingSystemMemberIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice
	 * FinancialIdentificationSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1
	 * GenericFinancialIdentification1}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8
	 * FinancialInstitutionIdentification8}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BranchData2 BranchData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth
	 * DateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice
	 * OrganisationIdentificationSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1
	 * GenericOrganisationIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice
	 * PersonIdentificationSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1
	 * GenericPersonIdentification1}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification5
	 * PersonIdentification5}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Party11Choice
	 * Party11Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CaseForwardingNotification3
	 * CaseForwardingNotification3}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportHeader4
	 * ReportHeader4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.other.SupplementaryDataEnvelope1
	 * SupplementaryDataEnvelope1}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max35Text Max35Text}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.ISODate ISODate}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max70Text Max70Text}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max140Text Max140Text}
	 * </li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max350Text Max350Text}
	 * </li>
	 * <li>{@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.AddressType2Code
	 * AddressType2Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max16Text Max16Text}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max2048Text
	 * Max2048Text}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalClearingSystemIdentification1Code
	 * ExternalClearingSystemIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalFinancialInstitutionIdentification1Code
	 * ExternalFinancialInstitutionIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalOrganisationIdentification1Code
	 * ExternalOrganisationIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalPersonIdentification1Code
	 * ExternalPersonIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code
	 * CaseForwardingNotification3Code}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMDataDictionary#getRepository
	 * repository} = {@linkplain com.tools20022.repository.GeneratedRepository
	 * GeneratedRepository}</li>
	 * </ul>
	 */
	public static final MMDataDictionary mmdataDict = new MMDataDictionary() {
		{
			repository_lazy = () -> GeneratedRepository.mmObject();
			topLevelDictionaryEntry_lazy = () -> Arrays.asList(ClearingSystemIdentification2Choice.mmObject(), ClearingSystemMemberIdentification2.mmObject(), FinancialIdentificationSchemeName1Choice.mmObject(),
					GenericFinancialIdentification1.mmObject(), PostalAddress6.mmObject(), FinancialInstitutionIdentification8.mmObject(), BranchData2.mmObject(), BranchAndFinancialInstitutionIdentification5.mmObject(),
					DateAndPlaceOfBirth.mmObject(), OrganisationIdentificationSchemeName1Choice.mmObject(), GenericOrganisationIdentification1.mmObject(), PersonIdentificationSchemeName1Choice.mmObject(),
					GenericPersonIdentification1.mmObject(), PersonIdentification5.mmObject(), ContactDetails2.mmObject(), OrganisationIdentification8.mmObject(), Party11Choice.mmObject(), PartyIdentification43.mmObject(),
					SupplementaryData1.mmObject(), Party12Choice.mmObject(), CaseAssignment3.mmObject(), Case3.mmObject(), CaseForwardingNotification3.mmObject(), ReportHeader4.mmObject(), SupplementaryDataEnvelope1.mmObject(),
					Max35Text.mmObject(), ISODateTime.mmObject(), ISODate.mmObject(), CountryCode.mmObject(), Max70Text.mmObject(), Max140Text.mmObject(), Max350Text.mmObject(), YesNoIndicator.mmObject(), AddressType2Code.mmObject(),
					Max16Text.mmObject(), PhoneNumber.mmObject(), BICFIIdentifier.mmObject(), Max2048Text.mmObject(), AnyBICIdentifier.mmObject(), NamePrefix1Code.mmObject(), ExternalClearingSystemIdentification1Code.mmObject(),
					ExternalFinancialInstitutionIdentification1Code.mmObject(), ExternalOrganisationIdentification1Code.mmObject(), ExternalPersonIdentification1Code.mmObject(), CaseForwardingNotification3Code.mmObject());
		}
	};

	private GeneratedRepository() {
		super(StandardMetamodel2013.metamodel());
	}

	final static public MMRepository mmObject() {
		mmObject_lazy.compareAndSet(null, new MMRepository() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
			}
		});
		return mmObject_lazy.get();
	}
}