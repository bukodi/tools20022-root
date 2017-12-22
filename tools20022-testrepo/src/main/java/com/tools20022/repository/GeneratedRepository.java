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

public class GeneratedRepository extends ReflectionBasedRepository {

	final static private AtomicReference<MMRepository> mmObject_lazy = new AtomicReference<>();
	public static final MMBusinessProcessCatalogue mmcatalogue = new MMBusinessProcessCatalogue() {
		{
			repository_lazy = () -> GeneratedRepository.mmObject();
			topLevelCatalogueEntry_lazy = () -> Arrays.asList(CashManagementLatestVersion.mmObject());
		}
	};
	public static final MMDataDictionary mmdataDict = new MMDataDictionary() {
		{
			repository_lazy = () -> GeneratedRepository.mmObject();
			topLevelDictionaryEntry_lazy = () -> Arrays.asList(ClearingSystemIdentification2Choice.mmObject(), ClearingSystemMemberIdentification2.mmObject(), FinancialIdentificationSchemeName1Choice.mmObject(),
					GenericFinancialIdentification1.mmObject(), PostalAddress6.mmObject(), FinancialInstitutionIdentification8.mmObject(), BranchData2.mmObject(), BranchAndFinancialInstitutionIdentification5.mmObject(),
					DateAndPlaceOfBirth.mmObject(), OrganisationIdentificationSchemeName1Choice.mmObject(), GenericOrganisationIdentification1.mmObject(), PersonIdentificationSchemeName1Choice.mmObject(),
					GenericPersonIdentification1.mmObject(), PersonIdentification5.mmObject(), ContactDetails2.mmObject(), OrganisationIdentification8.mmObject(), Party11Choice.mmObject(), PartyIdentification43.mmObject(),
					SupplementaryData1.mmObject(), Party12Choice.mmObject(), CaseAssignment3.mmObject(), Case3.mmObject(), CaseForwardingNotification3.mmObject(), ReportHeader4.mmObject(), SupplementaryDataEnvelope1.mmObject(),
					Max35Text.mmObject(), ISODateTime.mmObject(), ISODate.mmObject(), CountryCode.mmObject(), Max70Text.mmObject(), Max140Text.mmObject(), Max350Text.mmObject(), YesNoIndicator.mmObject(), AddressTypeCode.mmObject(),
					AddressType2Code.mmObject(), Max16Text.mmObject(), PhoneNumber.mmObject(), BICFIIdentifier.mmObject(), Max2048Text.mmObject(), AnyBICIdentifier.mmObject(), NamePrefix1Code.mmObject(),
					ExternalClearingSystemIdentification1Code.mmObject(), ExternalFinancialInstitutionIdentification1Code.mmObject(), ExternalOrganisationIdentification1Code.mmObject(), ExternalPersonIdentification1Code.mmObject(),
					CaseForwardingNotificationCode.mmObject(), CaseForwardingNotification3Code.mmObject());
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