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
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msgpart.*;
import com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES;
import com.tools20022.repository.other.SupplementaryDataEnvelope1;
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessProcessCatalogue#getTopLevelCatalogueEntries
	 * topLevelCatalogueEntries} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
	 * CashManagementLatestVersion}</li>
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
			topLevelCatalogueEntries_lazy = LazyReference.create(() -> Arrays.asList(CashManagementLatestVersion.mmObject(), BUSINESSPROCESS_FOR_ROLES.mmObject()));
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
	 * {@linkplain com.tools20022.metamodel.MMDataDictionary#getTopLevelDictionaryEntries
	 * topLevelDictionaryEntries} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msgpart.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification2Choice
	 * ClearingSystemIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.ClearingSystemMemberIdentification2
	 * ClearingSystemMemberIdentification2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.GenericIdentification3
	 * GenericIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice
	 * FinancialIdentificationSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.GenericFinancialIdentification1
	 * GenericFinancialIdentification1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification8
	 * FinancialInstitutionIdentification8}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.BranchData2
	 * BranchData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSchemeName1Choice
	 * AccountSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.GenericAccountIdentification1
	 * GenericAccountIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.CashAccountType2Choice
	 * CashAccountType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice
	 * OrganisationIdentificationSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.GenericOrganisationIdentification1
	 * GenericOrganisationIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice
	 * PersonIdentificationSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.GenericPersonIdentification1
	 * GenericPersonIdentification1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.AmountRangeBoundary1
	 * AmountRangeBoundary1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CashAccount24
	 * CashAccount24}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.OriginalBusinessQuery1
	 * OriginalBusinessQuery1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.OriginalAndCurrentQuantities1
	 * OriginalAndCurrentQuantities1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource3Choice
	 * IdentificationSource3Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.OtherIdentification1
	 * OtherIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice
	 * YieldedOrValueType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.ProprietaryBankTransactionCodeStructure1
	 * ProprietaryBankTransactionCodeStructure1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure6
	 * BankTransactionCodeStructure6}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure5
	 * BankTransactionCodeStructure5}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.InterestType1Choice
	 * InterestType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.NumberAndSumOfTransactions1
	 * NumberAndSumOfTransactions1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.MessageIdentification2
	 * MessageIdentification2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ProprietaryReference1
	 * ProprietaryReference1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ProprietaryQuantity1
	 * ProprietaryQuantity1}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ReportingSource1Choice
	 * ReportingSource1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType4Choice
	 * RateType4Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceSubType1Choice
	 * BalanceSubType1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CurrencyExchange5
	 * CurrencyExchange5}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.AmountAndCurrencyExchangeDetails3
	 * AmountAndCurrencyExchangeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.AmountAndCurrencyExchangeDetails4
	 * AmountAndCurrencyExchangeDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TaxCharges2
	 * TaxCharges2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TechnicalInputChannel1Choice
	 * TechnicalInputChannel1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.BatchInformation2
	 * BatchInformation2}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Purpose2Choice
	 * Purpose2Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.NameAndAddress10
	 * NameAndAddress10}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.DocumentAdjustment1
	 * DocumentAdjustment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice
	 * CreditorReferenceType1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CreditorReferenceType2
	 * CreditorReferenceType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.CreditorReferenceInformation2
	 * CreditorReferenceInformation2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ProprietaryPrice2
	 * ProprietaryPrice2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TaxParty1 TaxParty1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TaxAuthorisation1
	 * TaxAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TaxParty2 TaxParty2}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason5Choice
	 * ReturnReason5Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ChargeType3Choice
	 * ChargeType3Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TrackData1 TrackData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.CardSecurityInformation1
	 * CardSecurityInformation1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PlainCardData1
	 * PlainCardData1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PaymentCard4
	 * PaymentCard4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.DisplayCapabilities1
	 * DisplayCapabilities1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionCapabilities1
	 * PointOfInteractionCapabilities1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1
	 * PointOfInteractionComponent1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PointOfInteraction1
	 * PointOfInteraction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.CardSequenceNumberRange1
	 * CardSequenceNumberRange1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ProprietaryAgent3
	 * ProprietaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DiscountAmountType1Choice
	 * DiscountAmountType1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.DiscountAmountAndType1
	 * DiscountAmountAndType1}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxAmountType1Choice
	 * TaxAmountType1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TaxAmountAndType1
	 * TaxAmountAndType1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice
	 * TransactionQuantities2Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CorporateAction9
	 * CorporateAction9}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CashDeposit1
	 * CashDeposit1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.Product2 Product2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.AmountAndDirection35
	 * AmountAndDirection35}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.NumberAndSumOfTransactions4
	 * NumberAndSumOfTransactions4}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ChargesRecord2
	 * ChargesRecord2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.Charges4 Charges4}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.LocalInstrument2Choice
	 * LocalInstrument2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.CardholderAuthentication2
	 * CardholderAuthentication2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.DocumentLineType1
	 * DocumentLineType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.DocumentLineIdentification1
	 * DocumentLineIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.DocumentLineInformation1
	 * DocumentLineInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocationDetails1
	 * RemittanceLocationDetails1}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.DocumentLineType1Choice
	 * DocumentLineType1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.RemittanceAmount3
	 * RemittanceAmount3}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.GarnishmentType1Choice
	 * GarnishmentType1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.GarnishmentType1
	 * GarnishmentType1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.RemittanceLocation4
	 * RemittanceLocation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice
	 * ReferredDocumentType3Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ReferredDocumentType4
	 * ReferredDocumentType4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.DateTimePeriod1
	 * DateTimePeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAvailabilityDate1Choice
	 * CashAvailabilityDate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation7
	 * ReferredDocumentInformation7}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CashAvailability1
	 * CashAvailability1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.AccountStatement8
	 * AccountStatement8}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TotalTransactions6
	 * TotalTransactions6}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.SequenceRange1Choice
	 * SequenceRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.AccountInterest4
	 * AccountInterest4}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.DatePeriod2
	 * DatePeriod2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CardTransaction16
	 * CardTransaction16}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TransactionDates3
	 * TransactionDates3}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TransactionInterest4
	 * TransactionInterest4}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TransactionParties4
	 * TransactionParties4}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceType10Choice
	 * BalanceType10Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.EntryDetails8
	 * EntryDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice
	 * ImpliedCurrencyAmountRange1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2
	 * ActiveOrHistoricCurrencyAndAmountRange2}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.DateAndDateTime2Choice
	 * DateAndDateTime2Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.BalanceType13
	 * BalanceType13}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.SequenceRange1
	 * SequenceRange1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CashBalance8
	 * CashBalance8}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.InterestRecord2
	 * InterestRecord2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ReportEntry9
	 * ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.CardTransaction3Choice
	 * CardTransaction3Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.CreditLineType1Choice
	 * CreditLineType1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CardAggregated2
	 * CardAggregated2}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.EntryStatus1Choice
	 * EntryStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ProprietaryDate3
	 * ProprietaryDate3}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CreditLine3
	 * CreditLine3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriod1Choice
	 * DateOrDateTimePeriod1Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CardEntry3 CardEntry3}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.ProprietaryParty4
	 * ProprietaryParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.TotalsPerBankTransactionCode5
	 * TotalsPerBankTransactionCode5}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TaxRecord2 TaxRecord2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Party34Choice
	 * Party34Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TaxPeriod2 TaxPeriod2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TaxAmount2 TaxAmount2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.DateAndPlaceOfBirth1
	 * DateAndPlaceOfBirth1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TaxInformation6
	 * TaxInformation6}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PersonIdentification13
	 * PersonIdentification13}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TaxRecordDetails2
	 * TaxRecordDetails2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.CashAccount36
	 * CashAccount36}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.Pagination1
	 * Pagination1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmount3Choice
	 * PriceRateOrAmount3Choice}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.Price7 Price7}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.FromToAmountRange1
	 * FromToAmountRange1}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.GroupHeader73
	 * GroupHeader73}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Party35Choice
	 * Party35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceInformation15
	 * RemittanceInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.Garnishment2
	 * Garnishment2}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.Rate4 Rate4}</li>
	 * <li>{@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3
	 * PaymentReturnReason3}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TransactionPrice4Choice
	 * TransactionPrice4Choice}</li>
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
	 * <li>{@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Number Number}</li>
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
	 * <li>{@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.IBAN2007Identifier
	 * IBAN2007Identifier}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max2048Text
	 * Max2048Text}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.ISOYearMonth
	 * ISOYearMonth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalClearingSystemIdentification1Code
	 * ExternalClearingSystemIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalFinancialInstitutionIdentification1Code
	 * ExternalFinancialInstitutionIdentification1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max34Text Max34Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalAccountIdentification1Code
	 * ExternalAccountIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalCashAccountType1Code
	 * ExternalCashAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalOrganisationIdentification1Code
	 * ExternalOrganisationIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalPersonIdentification1Code
	 * ExternalPersonIdentification1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalFinancialInstrumentIdentificationType1Code
	 * ExternalFinancialInstrumentIdentificationType1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueType1Code
	 * PriceValueType1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
	 * CopyDuplicateCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max105Text Max105Text}
	 * </li>
	 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max4Text Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.datatype.Max15PlusSignedNumericText
	 * Max15PlusSignedNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionDomainCode
	 * ExternalBankTransactionDomainCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionFamilyCode
	 * ExternalBankTransactionFamilyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionSubFamilyCode
	 * ExternalBankTransactionSubFamilyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionDomain1Code
	 * ExternalBankTransactionDomain1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionFamily1Code
	 * ExternalBankTransactionFamily1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionSubFamily1Code
	 * ExternalBankTransactionSubFamily1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max500Text Max500Text}
	 * </li>
	 * <li>{@linkplain com.tools20022.repository.codeset.InterestCode
	 * InterestCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.InterestType1Code
	 * InterestType1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalReportingSource1Code
	 * ExternalReportingSource1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalBalanceSubType1Code
	 * ExternalBalanceSubType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalTechnicalInputChannel1Code
	 * ExternalTechnicalInputChannel1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ExternalPurpose1Code
	 * ExternalPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalReturnReason1Code
	 * ExternalReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalChargeType1Code
	 * ExternalChargeType1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Min8Max28NumericText
	 * Min8Max28NumericText}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Min2Max3NumericText
	 * Min2Max3NumericText}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Exact1NumericText
	 * Exact1NumericText}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CSCManagement1Code
	 * CSCManagement1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Min3Max4NumericText
	 * Min3Max4NumericText}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.PartyType3Code
	 * PartyType3Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.PartyType4Code
	 * PartyType4Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode
	 * OnLineCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.OnLineCapability1Code
	 * OnLineCapability1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface2Code
	 * UserInterface2Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalCardTransactionCategory1Code
	 * ExternalCardTransactionCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalDiscountAmountType1Code
	 * ExternalDiscountAmountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalTaxAmountType1Code
	 * ExternalTaxAmountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.datatype.NonNegativeDecimalNumber
	 * NonNegativeDecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.datatype.ChargeIncludedIndicator
	 * ChargeIncludedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalLocalInstrument1Code
	 * ExternalLocalInstrument1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.AttendanceContext1Code
	 * AttendanceContext1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironment1Code
	 * TransactionEnvironment1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code
	 * TransactionChannel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code
	 * AuthenticationEntity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalRePresentmentReason1Code
	 * ExternalRePresentmentReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalCardTransactionCategoryCode
	 * ExternalCardTransactionCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalDocumentLineType1Code
	 * ExternalDocumentLineType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalGarnishmentType1Code
	 * ExternalGarnishmentType1Code}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>{@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode_BusinessCode
	 * ActiveOrHistoricCurrencyCode_BusinessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalAccountIdentificationCode
	 * ExternalAccountIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalCashAccountTypeCode
	 * ExternalCashAccountTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalClearingSystemIdentificationCode
	 * ExternalClearingSystemIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalDiscountAmountTypeCode
	 * ExternalDiscountAmountTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalFinancialInstitutionIdentificationCode
	 * ExternalFinancialInstitutionIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalLocalInstrumentCode
	 * ExternalLocalInstrumentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalOrganisationIdentificationCode
	 * ExternalOrganisationIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalPersonIdentificationCode
	 * ExternalPersonIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ExternalPurposeCode
	 * ExternalPurposeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalTaxAmountTypeCode
	 * ExternalTaxAmountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefixCode
	 * NamePrefixCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode_BusinessCode
	 * ActiveCurrencyCode_BusinessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalBalanceSubTypeCode
	 * ExternalBalanceSubTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalFinancialInstrumentIdentificationTypeCode
	 * ExternalFinancialInstrumentIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.codeset.ExternalChargeTypeCode
	 * ExternalChargeTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalBalanceType1Code
	 * ExternalBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalCreditLineType1Code
	 * ExternalCreditLineType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalEntryStatus1Code
	 * ExternalEntryStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalEntryStatusCode
	 * ExternalEntryStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalCreditLineTypeCode
	 * ExternalCreditLineTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalBalanceTypeCode
	 * ExternalBalanceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalDocumentLineTypeCode
	 * ExternalDocumentLineTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalGarnishmentTypeCode
	 * ExternalGarnishmentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalReportingSourceCode
	 * ExternalReportingSourceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalRePresentmentReasonCode
	 * ExternalRePresentmentReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalReturnReasonCode
	 * ExternalReturnReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ExternalTechnicalInputChannelCode
	 * ExternalTechnicalInputChannelCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMDataDictionary dataDict = new MMDataDictionary() {
		{
			repository_lazy = LazyReference.create(() -> GeneratedRepository.mmObject());
			topLevelDictionaryEntries_lazy = LazyReference.create(() -> Arrays.asList(GenericIdentification1.mmObject(), ClearingSystemIdentification2Choice.mmObject(), ClearingSystemMemberIdentification2.mmObject(),
					GenericIdentification3.mmObject(), FinancialIdentificationSchemeName1Choice.mmObject(), GenericFinancialIdentification1.mmObject(), PostalAddress6.mmObject(), FinancialInstitutionIdentification8.mmObject(),
					BranchData2.mmObject(), BranchAndFinancialInstitutionIdentification5.mmObject(), AccountSchemeName1Choice.mmObject(), GenericAccountIdentification1.mmObject(), AccountIdentification4Choice.mmObject(),
					CashAccountType2Choice.mmObject(), OrganisationIdentificationSchemeName1Choice.mmObject(), GenericOrganisationIdentification1.mmObject(), PersonIdentificationSchemeName1Choice.mmObject(),
					GenericPersonIdentification1.mmObject(), ContactDetails2.mmObject(), OrganisationIdentification8.mmObject(), AmountRangeBoundary1.mmObject(), CashAccount24.mmObject(), OriginalBusinessQuery1.mmObject(),
					SupplementaryData1.mmObject(), OriginalAndCurrentQuantities1.mmObject(), IdentificationSource3Choice.mmObject(), OtherIdentification1.mmObject(), YieldedOrValueType1Choice.mmObject(),
					FinancialInstrumentQuantityChoice.mmObject(), ProprietaryBankTransactionCodeStructure1.mmObject(), BankTransactionCodeStructure6.mmObject(), BankTransactionCodeStructure5.mmObject(),
					BankTransactionCodeStructure4.mmObject(), InterestType1Choice.mmObject(), NumberAndSumOfTransactions1.mmObject(), MessageIdentification2.mmObject(), ProprietaryReference1.mmObject(), ProprietaryQuantity1.mmObject(),
					ReportingSource1Choice.mmObject(), RateType4Choice.mmObject(), BalanceSubType1Choice.mmObject(), CurrencyExchange5.mmObject(), AmountAndCurrencyExchangeDetails3.mmObject(), AmountAndCurrencyExchangeDetails4.mmObject(),
					AmountAndCurrencyExchange3.mmObject(), TaxCharges2.mmObject(), TechnicalInputChannel1Choice.mmObject(), BatchInformation2.mmObject(), Purpose2Choice.mmObject(), NameAndAddress10.mmObject(),
					DocumentAdjustment1.mmObject(), CreditorReferenceType1Choice.mmObject(), CreditorReferenceType2.mmObject(), CreditorReferenceInformation2.mmObject(), ProprietaryPrice2.mmObject(), TaxParty1.mmObject(),
					TaxAuthorisation1.mmObject(), TaxParty2.mmObject(), ReturnReason5Choice.mmObject(), ChargeType3Choice.mmObject(), TrackData1.mmObject(), CardSecurityInformation1.mmObject(), PlainCardData1.mmObject(),
					PaymentCard4.mmObject(), GenericIdentification32.mmObject(), DisplayCapabilities1.mmObject(), PointOfInteractionCapabilities1.mmObject(), PointOfInteractionComponent1.mmObject(), PointOfInteraction1.mmObject(),
					CardSequenceNumberRange1.mmObject(), TransactionReferences3.mmObject(), ProprietaryAgent3.mmObject(), DiscountAmountType1Choice.mmObject(), DiscountAmountAndType1.mmObject(), TaxAmountType1Choice.mmObject(),
					TaxAmountAndType1.mmObject(), RemittanceAmount2.mmObject(), TransactionQuantities2Choice.mmObject(), CorporateAction9.mmObject(), CashDeposit1.mmObject(), TransactionIdentifier1.mmObject(), Product2.mmObject(),
					AmountAndDirection35.mmObject(), NumberAndSumOfTransactions4.mmObject(), ChargesRecord2.mmObject(), Charges4.mmObject(), LocalInstrument2Choice.mmObject(), CardholderAuthentication2.mmObject(),
					PaymentContext3.mmObject(), GenericIdentification30.mmObject(), SecuritiesAccount19.mmObject(), DocumentLineType1.mmObject(), DocumentLineIdentification1.mmObject(), DocumentLineInformation1.mmObject(),
					RemittanceLocationDetails1.mmObject(), DocumentLineType1Choice.mmObject(), RemittanceAmount3.mmObject(), GarnishmentType1Choice.mmObject(), GarnishmentType1.mmObject(), RemittanceLocation4.mmObject(),
					ReferredDocumentType3Choice.mmObject(), ReferredDocumentType4.mmObject(), CardIndividualTransaction2.mmObject(), DateTimePeriod1.mmObject(), CashAvailabilityDate1Choice.mmObject(),
					ReferredDocumentInformation7.mmObject(), CashAvailability1.mmObject(), SecurityIdentification19.mmObject(), AccountStatement8.mmObject(), TotalTransactions6.mmObject(), SequenceRange1Choice.mmObject(),
					AccountInterest4.mmObject(), DatePeriod2.mmObject(), CardTransaction16.mmObject(), TransactionDates3.mmObject(), EntryTransaction9.mmObject(), TransactionAgents4.mmObject(), TransactionInterest4.mmObject(),
					TransactionParties4.mmObject(), BalanceType10Choice.mmObject(), EntryDetails8.mmObject(), ImpliedCurrencyAmountRange1Choice.mmObject(), ActiveOrHistoricCurrencyAndAmountRange2.mmObject(),
					DateAndDateTime2Choice.mmObject(), BalanceType13.mmObject(), SequenceRange1.mmObject(), CashBalance8.mmObject(), InterestRecord2.mmObject(), ReportEntry9.mmObject(), CardTransaction3Choice.mmObject(),
					CreditLineType1Choice.mmObject(), CardAggregated2.mmObject(), EntryStatus1Choice.mmObject(), ProprietaryDate3.mmObject(), CreditLine3.mmObject(), DateOrDateTimePeriod1Choice.mmObject(), CardEntry3.mmObject(),
					ProprietaryParty4.mmObject(), TotalsPerBankTransactionCode5.mmObject(), TaxRecord2.mmObject(), PartyIdentification125.mmObject(), Party34Choice.mmObject(), TaxPeriod2.mmObject(), TaxAmount2.mmObject(),
					DateAndPlaceOfBirth1.mmObject(), TaxInformation6.mmObject(), PersonIdentification13.mmObject(), TaxRecordDetails2.mmObject(), CashAccount36.mmObject(), Pagination1.mmObject(), PriceRateOrAmount3Choice.mmObject(),
					Price7.mmObject(), FromToAmountRange1.mmObject(), GroupHeader73.mmObject(), Party35Choice.mmObject(), RemittanceInformation15.mmObject(), StructuredRemittanceInformation15.mmObject(), TaxInformation7.mmObject(),
					Garnishment2.mmObject(), Rate4.mmObject(), PaymentReturnReason3.mmObject(), TransactionPrice4Choice.mmObject(), SupplementaryDataEnvelope1.mmObject(), Max35Text.mmObject(), ISODateTime.mmObject(), ISODate.mmObject(),
					CountryCode.mmObject(), Max70Text.mmObject(), Max140Text.mmObject(), Max350Text.mmObject(), ActiveCurrencyCode.mmObject(), YesNoIndicator.mmObject(), Number.mmObject(), ActiveCurrencyAndAmount.mmObject(),
					DecimalNumber.mmObject(), AddressTypeCode.mmObject(), AddressType2Code.mmObject(), Max16Text.mmObject(), PhoneNumber.mmObject(), BICFIIdentifier.mmObject(), IBAN2007Identifier.mmObject(), Max2048Text.mmObject(),
					AnyBICIdentifier.mmObject(), ActiveOrHistoricCurrencyCode.mmObject(), Exact4AlphaNumericText.mmObject(), NamePrefix1Code.mmObject(), PercentageRate.mmObject(), ISOYearMonth.mmObject(),
					ActiveOrHistoricCurrencyAndAmount.mmObject(), ImpliedCurrencyAndAmount.mmObject(), ExternalClearingSystemIdentification1Code.mmObject(), ExternalFinancialInstitutionIdentification1Code.mmObject(),
					Max3NumericText.mmObject(), AmountDirectionCode.mmObject(), CreditDebitCode.mmObject(), Max34Text.mmObject(), ExternalAccountIdentification1Code.mmObject(), ExternalCashAccountType1Code.mmObject(),
					ExternalOrganisationIdentification1Code.mmObject(), ExternalPersonIdentification1Code.mmObject(), TrueFalseIndicator.mmObject(), ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject(), Max5NumericText.mmObject(),
					Max15NumericText.mmObject(), ChargeBearerTypeCode.mmObject(), ExternalFinancialInstrumentIdentificationType1Code.mmObject(), Exact3NumericText.mmObject(), PriceValueTypeCode.mmObject(), PriceValueType1Code.mmObject(),
					BaseOneRate.mmObject(), CopyDuplicateCode.mmObject(), CopyDuplicate1Code.mmObject(), Max105Text.mmObject(), PartyTypeCode.mmObject(), UnitOfMeasureCode.mmObject(), UnitOfMeasure1Code.mmObject(), Max4Text.mmObject(),
					Max15PlusSignedNumericText.mmObject(), ExternalBankTransactionDomainCode.mmObject(), ExternalBankTransactionFamilyCode.mmObject(), ExternalBankTransactionSubFamilyCode.mmObject(),
					ExternalBankTransactionDomain1Code.mmObject(), ExternalBankTransactionFamily1Code.mmObject(), ExternalBankTransactionSubFamily1Code.mmObject(), Max500Text.mmObject(), InterestCode.mmObject(),
					InterestType1Code.mmObject(), ChargeBearerType1Code.mmObject(), RemittanceLocationMethodCode.mmObject(), DocumentTypeCode.mmObject(), DocumentType3Code.mmObject(), ExternalReportingSource1Code.mmObject(),
					ExternalBalanceSubType1Code.mmObject(), ExternalTechnicalInputChannel1Code.mmObject(), ExternalPurpose1Code.mmObject(), RemittanceLocationMethod2Code.mmObject(), TaxRecordPeriodCode.mmObject(),
					TaxRecordPeriod1Code.mmObject(), ExternalReturnReason1Code.mmObject(), ExternalChargeType1Code.mmObject(), Min8Max28NumericText.mmObject(), Min2Max3NumericText.mmObject(), Exact1NumericText.mmObject(),
					CSCManagementCode.mmObject(), CSCManagement1Code.mmObject(), Min3Max4NumericText.mmObject(), PartyType3Code.mmObject(), PartyType4Code.mmObject(), CardDataReadingCode.mmObject(), CardDataReading1Code.mmObject(),
					CardholderVerificationCapabilityCode.mmObject(), CardholderVerificationCapability1Code.mmObject(), OnLineCapabilityCode.mmObject(), OnLineCapability1Code.mmObject(), UserInterfaceCode.mmObject(),
					UserInterface2Code.mmObject(), POIComponentTypeCode.mmObject(), POIComponentType1Code.mmObject(), CardPaymentServiceTypeCode.mmObject(), CardPaymentServiceType2Code.mmObject(),
					ExternalCardTransactionCategory1Code.mmObject(), ExternalDiscountAmountType1Code.mmObject(), ExternalTaxAmountType1Code.mmObject(), NonNegativeDecimalNumber.mmObject(), ChargeIncludedIndicator.mmObject(),
					ExternalLocalInstrument1Code.mmObject(), Max1025Text.mmObject(), ISO2ALanguageCode.mmObject(), AttendanceContextCode.mmObject(), AttendanceContext1Code.mmObject(), TransactionEnvironmentCode.mmObject(),
					TransactionEnvironment1Code.mmObject(), TransactionChannelCode.mmObject(), TransactionChannel1Code.mmObject(), AuthenticationMethodCode.mmObject(), AuthenticationMethod1Code.mmObject(),
					AuthenticationEntityCode.mmObject(), AuthenticationEntity1Code.mmObject(), ExternalRePresentmentReason1Code.mmObject(), ExternalCardTransactionCategoryCode.mmObject(), ExternalDocumentLineType1Code.mmObject(),
					ExternalGarnishmentType1Code.mmObject(), DocumentType6Code.mmObject(), ISINOct2015Identifier.mmObject(), ActiveOrHistoricCurrencyCode_BusinessCode.mmObject(), ExternalAccountIdentificationCode.mmObject(),
					ExternalCashAccountTypeCode.mmObject(), ExternalClearingSystemIdentificationCode.mmObject(), ExternalDiscountAmountTypeCode.mmObject(), ExternalFinancialInstitutionIdentificationCode.mmObject(),
					ExternalLocalInstrumentCode.mmObject(), ExternalOrganisationIdentificationCode.mmObject(), ExternalPersonIdentificationCode.mmObject(), ExternalPurposeCode.mmObject(), ExternalTaxAmountTypeCode.mmObject(),
					NamePrefixCode.mmObject(), ActiveCurrencyCode_BusinessCode.mmObject(), ExternalBalanceSubTypeCode.mmObject(), ExternalFinancialInstrumentIdentificationTypeCode.mmObject(), ExternalChargeTypeCode.mmObject(),
					ExternalBalanceType1Code.mmObject(), ExternalCreditLineType1Code.mmObject(), ExternalEntryStatus1Code.mmObject(), ExternalEntryStatusCode.mmObject(), ExternalCreditLineTypeCode.mmObject(),
					ExternalBalanceTypeCode.mmObject(), ExternalDocumentLineTypeCode.mmObject(), ExternalGarnishmentTypeCode.mmObject(), ExternalReportingSourceCode.mmObject(), ExternalRePresentmentReasonCode.mmObject(),
					ExternalReturnReasonCode.mmObject(), ExternalTechnicalInputChannelCode.mmObject()));
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