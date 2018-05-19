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

import com.tools20022.core.repo.LazyReference;
import com.tools20022.core.repo.ReflectionBasedRepository;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repository.area.PaymentsClearingandSettlementArchive;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msgpart.*;
import com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 
 <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepository#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepository#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessProcessCatalogue#getRepository
	 * repository} = {@linkplain com.tools20022.repository.GeneratedRepository
	 * GeneratedRepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessProcessCatalogue#getTopLevelCatalogueEntry
	 * topLevelCatalogueEntry} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
	 * PaymentsClearingandSettlementArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessProcessCatalogue catalogue = new MMBusinessProcessCatalogue() {
		{
			repository_lazy = LazyReference.create(() -> GeneratedRepository.mmObject());
			topLevelCatalogueEntry_lazy = LazyReference.create(() -> Arrays.asList(PaymentsClearingandSettlementArchive.mmObject(), BUSINESSPROCESS_FOR_ROLES.mmObject()));
		}
	};
	/**
	 * An instance of DataDictionary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMDataDictionary#getRepository
	 * repository} = {@linkplain com.tools20022.repository.GeneratedRepository
	 * GeneratedRepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMDataDictionary#getTopLevelDictionaryEntry
	 * topLevelDictionaryEntry} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification3Choice
	 * ClearingSystemIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification2Choice
	 * ClearingSystemIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.ClearingSystemMemberIdentification2
	 * ClearingSystemMemberIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice
	 * FinancialIdentificationSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.GenericFinancialIdentification1
	 * GenericFinancialIdentification1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.BranchData2
	 * BranchData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSchemeName1Choice
	 * AccountSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.GenericAccountIdentification1
	 * GenericAccountIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CashAccountType2
	 * CashAccountType2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.DateAndPlaceOfBirth
	 * DateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice
	 * OrganisationIdentificationSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.GenericOrganisationIdentification1
	 * GenericOrganisationIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.OrganisationIdentification4
	 * OrganisationIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice
	 * PersonIdentificationSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.GenericPersonIdentification1
	 * GenericPersonIdentification1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PersonIdentification5
	 * PersonIdentification5}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Party6Choice
	 * Party6Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification7
	 * FinancialInstitutionIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Purpose2Choice
	 * Purpose2Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.NameAndAddress10
	 * NameAndAddress10}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType1Choice
	 * ReferredDocumentType1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ReferredDocumentType2
	 * ReferredDocumentType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation3
	 * ReferredDocumentInformation3}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.DocumentAdjustment1
	 * DocumentAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.RemittanceAmount1
	 * RemittanceAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice
	 * CreditorReferenceType1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CreditorReferenceType2
	 * CreditorReferenceType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.CreditorReferenceInformation2
	 * CreditorReferenceInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7
	 * StructuredRemittanceInformation7}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.RemittanceInformation5
	 * RemittanceInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.InstructionForCreditorAgent1
	 * InstructionForCreditorAgent1}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel8Choice
	 * ServiceLevel8Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.LocalInstrument2Choice
	 * LocalInstrument2Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice
	 * CategoryPurpose1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.RegulatoryAuthority2
	 * RegulatoryAuthority2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRegulatoryReporting3
	 * StructuredRegulatoryReporting3}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.RegulatoryReporting3
	 * RegulatoryReporting3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ChargesInformation5
	 * ChargesInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.SettlementDateTimeIndication1
	 * SettlementDateTimeIndication1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.InstructionForNextAgent1
	 * InstructionForNextAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.PaymentTypeInformation21
	 * PaymentTypeInformation21}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PaymentIdentification3
	 * PaymentIdentification3}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.SettlementTimeRequest2
	 * SettlementTimeRequest2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.CreditTransferTransactionInformation11
	 * CreditTransferTransactionInformation11}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max35Text Max35Text}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.ISODate ISODate}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max70Text Max70Text}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max140Text Max140Text}
	 * </li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.AddressType2Code
	 * AddressType2Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max16Text Max16Text}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.ISOTime ISOTime}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.IBAN2007Identifier
	 * IBAN2007Identifier}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max2048Text
	 * Max2048Text}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalCashClearingSystem1Code
	 * ExternalCashClearingSystem1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalClearingSystemIdentification1Code
	 * ExternalClearingSystemIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalFinancialInstitutionIdentification1Code
	 * ExternalFinancialInstitutionIdentification1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max10Text Max10Text}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max34Text Max34Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalAccountIdentification1Code
	 * ExternalAccountIdentification1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalOrganisationIdentification1Code
	 * ExternalOrganisationIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalPersonIdentification1Code
	 * ExternalPersonIdentification1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max4Text Max4Text}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ExternalPurpose1Code
	 * ExternalPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.DocumentType5Code
	 * DocumentType5Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.BatchBookingIndicator
	 * BatchBookingIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ClearingChannelCode
	 * ClearingChannelCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ClearingChannel2Code
	 * ClearingChannel2Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.Priority2Code
	 * Priority2Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.Instruction3Code
	 * Instruction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingTypeCode
	 * RegulatoryReportingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingType1Code
	 * RegulatoryReportingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalServiceLevel1Code
	 * ExternalServiceLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalLocalInstrument1Code
	 * ExternalLocalInstrument1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalCategoryPurpose1Code
	 * ExternalCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.SettlementMethod1Code
	 * SettlementMethod1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.Instruction4Code
	 * Instruction4Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.Priority3Code
	 * Priority3Code}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMDataDictionary dataDict = new MMDataDictionary() {
		{
			repository_lazy = LazyReference.create(() -> GeneratedRepository.mmObject());
			topLevelDictionaryEntry_lazy = LazyReference.create(() -> Arrays.asList(ClearingSystemIdentification3Choice.mmObject(), ClearingSystemIdentification2Choice.mmObject(), ClearingSystemMemberIdentification2.mmObject(),
					FinancialIdentificationSchemeName1Choice.mmObject(), GenericFinancialIdentification1.mmObject(), PostalAddress6.mmObject(), BranchData2.mmObject(), AccountSchemeName1Choice.mmObject(),
					GenericAccountIdentification1.mmObject(), AccountIdentification4Choice.mmObject(), CashAccountType2.mmObject(), DateAndPlaceOfBirth.mmObject(), OrganisationIdentificationSchemeName1Choice.mmObject(),
					GenericOrganisationIdentification1.mmObject(), OrganisationIdentification4.mmObject(), PersonIdentificationSchemeName1Choice.mmObject(), GenericPersonIdentification1.mmObject(), PersonIdentification5.mmObject(),
					Party6Choice.mmObject(), ContactDetails2.mmObject(), PartyIdentification32.mmObject(), CashAccount16.mmObject(), FinancialInstitutionIdentification7.mmObject(), BranchAndFinancialInstitutionIdentification4.mmObject(),
					Purpose2Choice.mmObject(), NameAndAddress10.mmObject(), RemittanceLocation2.mmObject(), ReferredDocumentType1Choice.mmObject(), ReferredDocumentType2.mmObject(), ReferredDocumentInformation3.mmObject(),
					DocumentAdjustment1.mmObject(), RemittanceAmount1.mmObject(), CreditorReferenceType1Choice.mmObject(), CreditorReferenceType2.mmObject(), CreditorReferenceInformation2.mmObject(),
					StructuredRemittanceInformation7.mmObject(), RemittanceInformation5.mmObject(), InstructionForCreditorAgent1.mmObject(), ServiceLevel8Choice.mmObject(), LocalInstrument2Choice.mmObject(),
					CategoryPurpose1Choice.mmObject(), RegulatoryAuthority2.mmObject(), StructuredRegulatoryReporting3.mmObject(), RegulatoryReporting3.mmObject(), SettlementInformation13.mmObject(), ChargesInformation5.mmObject(),
					SettlementDateTimeIndication1.mmObject(), InstructionForNextAgent1.mmObject(), PaymentTypeInformation21.mmObject(), GroupHeader33.mmObject(), PaymentIdentification3.mmObject(), SettlementTimeRequest2.mmObject(),
					CreditTransferTransactionInformation11.mmObject(), Max35Text.mmObject(), ISODateTime.mmObject(), ISODate.mmObject(), CountryCode.mmObject(), Max70Text.mmObject(), Max140Text.mmObject(), ActiveCurrencyCode.mmObject(),
					ActiveCurrencyAndAmount.mmObject(), DecimalNumber.mmObject(), AddressTypeCode.mmObject(), AddressType2Code.mmObject(), Max16Text.mmObject(), PhoneNumber.mmObject(), BICIdentifier.mmObject(), ISOTime.mmObject(),
					IBAN2007Identifier.mmObject(), Max2048Text.mmObject(), AnyBICIdentifier.mmObject(), CashAccountTypeCode.mmObject(), ActiveOrHistoricCurrencyCode.mmObject(), NamePrefix1Code.mmObject(),
					ActiveOrHistoricCurrencyAndAmount.mmObject(), ExternalCashClearingSystem1Code.mmObject(), ExternalClearingSystemIdentification1Code.mmObject(), ExternalFinancialInstitutionIdentification1Code.mmObject(),
					AmountDirectionCode.mmObject(), CreditDebitCode.mmObject(), Max10Text.mmObject(), Max34Text.mmObject(), ExternalAccountIdentification1Code.mmObject(), CashAccountType4Code.mmObject(),
					ExternalOrganisationIdentification1Code.mmObject(), ExternalPersonIdentification1Code.mmObject(), PriorityCode.mmObject(), InstructionCode.mmObject(), Max15NumericText.mmObject(), ChargeBearerTypeCode.mmObject(),
					BaseOneRate.mmObject(), Max4Text.mmObject(), ChargeBearerType1Code.mmObject(), RemittanceLocationMethodCode.mmObject(), DocumentTypeCode.mmObject(), DocumentType3Code.mmObject(), ExternalPurpose1Code.mmObject(),
					RemittanceLocationMethod2Code.mmObject(), DocumentType5Code.mmObject(), BatchBookingIndicator.mmObject(), ClearingChannelCode.mmObject(), ClearingChannel2Code.mmObject(), Priority2Code.mmObject(),
					Instruction3Code.mmObject(), RegulatoryReportingTypeCode.mmObject(), RegulatoryReportingType1Code.mmObject(), ExternalServiceLevel1Code.mmObject(), ExternalLocalInstrument1Code.mmObject(),
					ExternalCategoryPurpose1Code.mmObject(), SettlementMethodCode.mmObject(), SettlementMethod1Code.mmObject(), Instruction4Code.mmObject(), Priority3Code.mmObject()));
		}
	};

	private GeneratedRepository() {
		super(StandardMetamodel2013.metamodel());
	}

	final static public MMRepository mmObject() {
		mmObject_lazy.compareAndSet(null, new MMRepository() {
			{
				businessProcessCatalogue_lazy = LazyReference.create(() -> GeneratedRepository.catalogue);
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
			}
		});
		return mmObject_lazy.get();
	}
}