package com.tools20022.repository;

import com.tools20022.metamodel.MMRepository;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.dict.entity.IdentificationIssuerRole;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.Country;
import com.tools20022.repository.dict.entity.Party;
import com.tools20022.repository.dict.entity.Organisation;
import com.tools20022.repository.dict.entity.PartyName;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.PostalAddress;
import com.tools20022.repository.dict.entity.PhoneAddress;
import com.tools20022.repository.dict.entity.ElectronicAddress;
import com.tools20022.repository.dict.entity.PartyIdentificationInformation;
import com.tools20022.repository.dict.entity.OrganisationIdentification;
import com.tools20022.repository.dict.entity.PersonName;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.AccountIdentification;
import com.tools20022.repository.dict.entity.Scheme;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.Agreement;
import com.tools20022.repository.dict.entity.Person;
import com.tools20022.repository.dict.entity.PersonIdentification;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.entity.ObligationFulfilment;
import com.tools20022.repository.dict.entity.CashClearingSystemMember;
import com.tools20022.repository.dict.entity.PaymentExecution;
import com.tools20022.repository.dict.entity.CashClearingSystem;
import com.tools20022.repository.dict.entity.PaymentIdentification;
import com.tools20022.repository.dict.entity.PaymentPartyRole;
import com.tools20022.repository.dict.entity.PaymentProcessing;
import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.repository.dict.entity.DocumentIssuer;
import com.tools20022.repository.dict.entity.ServiceLevel;
import com.tools20022.repository.dict.entity.DirectDebitMandate;
import com.tools20022.repository.dict.entity.Authentication;
import com.tools20022.repository.dict.choice.ClearingSystemIdentification2Choice;
import com.tools20022.repository.dict.msg.ClearingSystemMemberIdentification2;
import com.tools20022.repository.dict.choice.FinancialIdentificationSchemeName1Choice;
import com.tools20022.repository.dict.msg.GenericFinancialIdentification1;
import com.tools20022.repository.dict.msg.PostalAddress6;
import com.tools20022.repository.dict.msg.FinancialInstitutionIdentification8;
import com.tools20022.repository.dict.msg.BranchData2;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.choice.AccountSchemeName1Choice;
import com.tools20022.repository.dict.msg.GenericAccountIdentification1;
import com.tools20022.repository.dict.choice.AccountIdentification4Choice;
import com.tools20022.repository.dict.choice.CashAccountType2Choice;
import com.tools20022.repository.dict.msg.DateAndPlaceOfBirth;
import com.tools20022.repository.dict.choice.OrganisationIdentificationSchemeName1Choice;
import com.tools20022.repository.dict.msg.GenericOrganisationIdentification1;
import com.tools20022.repository.dict.choice.PersonIdentificationSchemeName1Choice;
import com.tools20022.repository.dict.msg.GenericPersonIdentification1;
import com.tools20022.repository.dict.msg.PersonIdentification5;
import com.tools20022.repository.dict.msg.ContactDetails2;
import com.tools20022.repository.dict.msg.OrganisationIdentification8;
import com.tools20022.repository.dict.choice.Party11Choice;
import com.tools20022.repository.dict.msg.PartyIdentification43;
import com.tools20022.repository.dict.msg.CashAccount24;
import com.tools20022.repository.dict.msg.DatePeriodDetails1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import com.tools20022.repository.dict.choice.Authorisation1Choice;
import com.tools20022.repository.dict.choice.ServiceLevel8Choice;
import com.tools20022.repository.dict.choice.LocalInstrument2Choice;
import com.tools20022.repository.dict.choice.CategoryPurpose1Choice;
import com.tools20022.repository.dict.msg.GroupHeader47;
import com.tools20022.repository.dict.msg.FrequencyPeriod1;
import com.tools20022.repository.dict.choice.ReferredDocumentType3Choice;
import com.tools20022.repository.dict.msg.ReferredDocumentType4;
import com.tools20022.repository.dict.choice.MandateSetupReason1Choice;
import com.tools20022.repository.dict.msg.Mandate10;
import com.tools20022.repository.dict.msg.MandateTypeInformation2;
import com.tools20022.repository.dict.choice.MandateClassification1Choice;
import com.tools20022.repository.dict.choice.Frequency37Choice;
import com.tools20022.repository.dict.msg.MandateAdjustment1;
import com.tools20022.repository.dict.msg.MandateAuthentication1;
import com.tools20022.repository.dict.msg.MandateOccurrences4;
import com.tools20022.repository.dict.msg.ReferredMandateDocument1;
import com.tools20022.repository.dict.msg.FrequencyAndMoment1;
import com.tools20022.repository.dict.choice.Frequency36Choice;
import com.tools20022.repository.dict.choice.AuthenticationChannel1Choice;
import com.tools20022.repository.dict.other.SupplementaryDataEnvelope1;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.codeset.CountryCode;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.codeset.AddressTypeCode;
import com.tools20022.repository.dict.codeset.AddressType2Code;
import com.tools20022.repository.dict.datatype.Max16Text;
import com.tools20022.repository.dict.datatype.PhoneNumber;
import com.tools20022.repository.dict.datatype.Max256Text;
import com.tools20022.repository.dict.datatype.BICFIIdentifier;
import com.tools20022.repository.dict.datatype.IBAN2007Identifier;
import com.tools20022.repository.dict.datatype.BBANIdentifier;
import com.tools20022.repository.dict.datatype.UPICIdentifier;
import com.tools20022.repository.dict.datatype.Max2048Text;
import com.tools20022.repository.dict.datatype.AnyBICIdentifier;
import com.tools20022.repository.dict.codeset.CashAccountTypeCode;
import com.tools20022.repository.dict.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.dict.codeset.LanguageCode;
import com.tools20022.repository.dict.codeset.NamePrefix1Code;
import com.tools20022.repository.dict.codeset.GenderCode;
import com.tools20022.repository.dict.codeset.ResidentialStatusCode;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.CHIPSUniversalIdentifier;
import com.tools20022.repository.dict.datatype.NewZealandNCCIdentifier;
import com.tools20022.repository.dict.datatype.IrishNSCIdentifier;
import com.tools20022.repository.dict.datatype.UKDomesticSortCodeIdentifier;
import com.tools20022.repository.dict.datatype.CHIPSParticipantIdentifier;
import com.tools20022.repository.dict.datatype.SwissBCIdentifier;
import com.tools20022.repository.dict.datatype.FedwireRoutingNumberIdentifier;
import com.tools20022.repository.dict.datatype.PortugueseNCCIdentifier;
import com.tools20022.repository.dict.datatype.RussianCentralBankIdentificationCodeIdentifier;
import com.tools20022.repository.dict.datatype.ItalianDomesticIdentifier;
import com.tools20022.repository.dict.datatype.AustrianBankleitzahlIdentifier;
import com.tools20022.repository.dict.datatype.CanadianPaymentsARNIdentifier;
import com.tools20022.repository.dict.datatype.SwissSICIdentifier;
import com.tools20022.repository.dict.datatype.GermanBankleitzahlIdentifier;
import com.tools20022.repository.dict.datatype.SpanishDomesticInterbankingIdentifier;
import com.tools20022.repository.dict.datatype.SouthAfricanNCCIdentifier;
import com.tools20022.repository.dict.datatype.HongKongBankIdentifier;
import com.tools20022.repository.dict.codeset.CashClearingSystemCode;
import com.tools20022.repository.dict.codeset.ExternalClearingSystemIdentification1Code;
import com.tools20022.repository.dict.codeset.ExternalFinancialInstitutionIdentification1Code;
import com.tools20022.repository.dict.datatype.Max34Text;
import com.tools20022.repository.dict.codeset.ExternalAccountIdentification1Code;
import com.tools20022.repository.dict.codeset.ExternalCashAccountType1Code;
import com.tools20022.repository.dict.datatype.BICNonFIIdentifier;
import com.tools20022.repository.dict.datatype.EANGLNIdentifier;
import com.tools20022.repository.dict.datatype.DunsIdentifier;
import com.tools20022.repository.dict.codeset.ExternalOrganisationIdentification1Code;
import com.tools20022.repository.dict.codeset.ExternalPersonIdentification1Code;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.codeset.PriorityCode;
import com.tools20022.repository.dict.datatype.MICIdentifier;
import com.tools20022.repository.dict.codeset.TypeOfIdentificationCode;
import com.tools20022.repository.dict.codeset.CopyDuplicateCode;
import com.tools20022.repository.dict.codeset.PartyTypeCode;
import com.tools20022.repository.dict.datatype.Max128Text;
import com.tools20022.repository.dict.codeset.DocumentTypeCode;
import com.tools20022.repository.dict.codeset.ServiceLevelCode;
import com.tools20022.repository.dict.codeset.ClearingChannelCode;
import com.tools20022.repository.dict.codeset.ExternalCode;
import com.tools20022.repository.dict.codeset.PaymentCategoryPurposeCode;
import com.tools20022.repository.dict.codeset.Authorisation1Code;
import com.tools20022.repository.dict.codeset.ExternalServiceLevel1Code;
import com.tools20022.repository.dict.codeset.ExternalLocalInstrument1Code;
import com.tools20022.repository.dict.codeset.ExternalCategoryPurpose1Code;
import com.tools20022.repository.dict.codeset.SequenceTypeCode;
import com.tools20022.repository.dict.codeset.Frequency6Code;
import com.tools20022.repository.dict.codeset.SequenceType2Code;
import com.tools20022.repository.dict.datatype.LEIIdentifier;
import com.tools20022.repository.dict.codeset.AuthenticationMethodCode;
import com.tools20022.repository.dict.codeset.AuthenticationEntityCode;
import com.tools20022.repository.dict.datatype.Max140Binary;
import com.tools20022.repository.dict.datatype.Max35NumericText;
import com.tools20022.repository.dict.codeset.PINFormatCode;
import com.tools20022.repository.dict.codeset.SWIFTServiceLevelCode;
import com.tools20022.repository.dict.datatype.IndianFinancialSystemCodeIdentifier;
import com.tools20022.repository.dict.datatype.HellenicBankIdentificationCodeIdentifier;
import com.tools20022.repository.dict.datatype.PolishNationalClearingCodeIdentifier;
import com.tools20022.repository.dict.codeset.DataSetTypeCode;
import com.tools20022.repository.dict.codeset.AccountLevelCode;
import com.tools20022.repository.dict.codeset.DocumentType6Code;
import com.tools20022.repository.dict.codeset.ExternalMandateSetupReason1Code;
import com.tools20022.repository.dict.codeset.CivilStatusCode;
import com.tools20022.repository.dict.datatype.Exact2NumericText;
import com.tools20022.repository.dict.codeset.Frequency10Code;
import com.tools20022.repository.dict.codeset.MandateClassification1Code;
import com.tools20022.repository.dict.codeset.MandateClassificationCode;
import com.tools20022.repository.dict.codeset.ExternalAuthenticationChannel1Code;
import com.tools20022.repository.dict.codeset.AuthenticationResultCode;
import java.util.Arrays;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.repository.catalogue.area.PaymentsInitiationLatestVersion;

public class GeneratedRepository extends MMRepository {

	private final static AtomicReference<GeneratedRepository> repoTypeRef = new AtomicReference<>();
	public final MMDataDictionary dataDict = new MMDataDictionary() {
		{
			super.repository_lazy = () -> GeneratedRepository.repoType();
			super.topLevelDictionaryEntry = Arrays.asList(
					IdentificationIssuerRole.repoType(),
					GenericIdentification.repoType(), Country.repoType(),
					Party.repoType(), Organisation.repoType(),
					PartyName.repoType(), ContactPoint.repoType(),
					PostalAddress.repoType(), PhoneAddress.repoType(),
					ElectronicAddress.repoType(),
					PartyIdentificationInformation.repoType(),
					OrganisationIdentification.repoType(),
					PersonName.repoType(), Account.repoType(),
					CashAccount.repoType(), AccountIdentification.repoType(),
					Scheme.repoType(), DateTimePeriod.repoType(),
					Agreement.repoType(), Person.repoType(),
					PersonIdentification.repoType(), Document.repoType(),
					ObligationFulfilment.repoType(),
					CashClearingSystemMember.repoType(),
					PaymentExecution.repoType(), CashClearingSystem.repoType(),
					PaymentIdentification.repoType(),
					PaymentPartyRole.repoType(), PaymentProcessing.repoType(),
					Mandate.repoType(), DocumentIssuer.repoType(),
					ServiceLevel.repoType(), DirectDebitMandate.repoType(),
					Authentication.repoType(),
					ClearingSystemIdentification2Choice.repoType(),
					ClearingSystemMemberIdentification2.repoType(),
					FinancialIdentificationSchemeName1Choice.repoType(),
					GenericFinancialIdentification1.repoType(),
					PostalAddress6.repoType(),
					FinancialInstitutionIdentification8.repoType(),
					BranchData2.repoType(),
					BranchAndFinancialInstitutionIdentification5.repoType(),
					AccountSchemeName1Choice.repoType(),
					GenericAccountIdentification1.repoType(),
					AccountIdentification4Choice.repoType(),
					CashAccountType2Choice.repoType(),
					DateAndPlaceOfBirth.repoType(),
					OrganisationIdentificationSchemeName1Choice.repoType(),
					GenericOrganisationIdentification1.repoType(),
					PersonIdentificationSchemeName1Choice.repoType(),
					GenericPersonIdentification1.repoType(),
					PersonIdentification5.repoType(),
					ContactDetails2.repoType(),
					OrganisationIdentification8.repoType(),
					Party11Choice.repoType(), PartyIdentification43.repoType(),
					CashAccount24.repoType(), DatePeriodDetails1.repoType(),
					SupplementaryData1.repoType(),
					Authorisation1Choice.repoType(),
					ServiceLevel8Choice.repoType(),
					LocalInstrument2Choice.repoType(),
					CategoryPurpose1Choice.repoType(),
					GroupHeader47.repoType(), FrequencyPeriod1.repoType(),
					ReferredDocumentType3Choice.repoType(),
					ReferredDocumentType4.repoType(),
					MandateSetupReason1Choice.repoType(), Mandate10.repoType(),
					MandateTypeInformation2.repoType(),
					MandateClassification1Choice.repoType(),
					Frequency37Choice.repoType(),
					MandateAdjustment1.repoType(),
					MandateAuthentication1.repoType(),
					MandateOccurrences4.repoType(),
					ReferredMandateDocument1.repoType(),
					FrequencyAndMoment1.repoType(),
					Frequency36Choice.repoType(),
					AuthenticationChannel1Choice.repoType(),
					SupplementaryDataEnvelope1.repoType(),
					Max35Text.repoType(), ISODateTime.repoType(),
					ISODate.repoType(), CountryCode.repoType(),
					Max70Text.repoType(), Max140Text.repoType(),
					Max350Text.repoType(), CurrencyCode.repoType(),
					YesNoIndicator.repoType(), FrequencyCode.repoType(),
					Number.repoType(), CurrencyAndAmount.repoType(),
					ActiveCurrencyAndAmount.repoType(),
					DecimalNumber.repoType(), AddressTypeCode.repoType(),
					AddressType2Code.repoType(), Max16Text.repoType(),
					PhoneNumber.repoType(), Max256Text.repoType(),
					BICFIIdentifier.repoType(), IBAN2007Identifier.repoType(),
					BBANIdentifier.repoType(), UPICIdentifier.repoType(),
					Max2048Text.repoType(), AnyBICIdentifier.repoType(),
					CashAccountTypeCode.repoType(),
					ActiveOrHistoricCurrencyCode.repoType(),
					LanguageCode.repoType(), NamePrefix1Code.repoType(),
					GenderCode.repoType(), ResidentialStatusCode.repoType(),
					PercentageRate.repoType(),
					CHIPSUniversalIdentifier.repoType(),
					NewZealandNCCIdentifier.repoType(),
					IrishNSCIdentifier.repoType(),
					UKDomesticSortCodeIdentifier.repoType(),
					CHIPSParticipantIdentifier.repoType(),
					SwissBCIdentifier.repoType(),
					FedwireRoutingNumberIdentifier.repoType(),
					PortugueseNCCIdentifier.repoType(),
					RussianCentralBankIdentificationCodeIdentifier.repoType(),
					ItalianDomesticIdentifier.repoType(),
					AustrianBankleitzahlIdentifier.repoType(),
					CanadianPaymentsARNIdentifier.repoType(),
					SwissSICIdentifier.repoType(),
					GermanBankleitzahlIdentifier.repoType(),
					SpanishDomesticInterbankingIdentifier.repoType(),
					SouthAfricanNCCIdentifier.repoType(),
					HongKongBankIdentifier.repoType(),
					CashClearingSystemCode.repoType(),
					ExternalClearingSystemIdentification1Code.repoType(),
					ExternalFinancialInstitutionIdentification1Code.repoType(),
					Max34Text.repoType(),
					ExternalAccountIdentification1Code.repoType(),
					ExternalCashAccountType1Code.repoType(),
					BICNonFIIdentifier.repoType(), EANGLNIdentifier.repoType(),
					DunsIdentifier.repoType(),
					ExternalOrganisationIdentification1Code.repoType(),
					ExternalPersonIdentification1Code.repoType(),
					TrueFalseIndicator.repoType(), PriorityCode.repoType(),
					MICIdentifier.repoType(),
					TypeOfIdentificationCode.repoType(),
					CopyDuplicateCode.repoType(), PartyTypeCode.repoType(),
					Max128Text.repoType(), DocumentTypeCode.repoType(),
					ServiceLevelCode.repoType(),
					ClearingChannelCode.repoType(), ExternalCode.repoType(),
					PaymentCategoryPurposeCode.repoType(),
					Authorisation1Code.repoType(),
					ExternalServiceLevel1Code.repoType(),
					ExternalLocalInstrument1Code.repoType(),
					ExternalCategoryPurpose1Code.repoType(),
					SequenceTypeCode.repoType(), Frequency6Code.repoType(),
					SequenceType2Code.repoType(), LEIIdentifier.repoType(),
					AuthenticationMethodCode.repoType(),
					AuthenticationEntityCode.repoType(),
					Max140Binary.repoType(), Max35NumericText.repoType(),
					PINFormatCode.repoType(), SWIFTServiceLevelCode.repoType(),
					IndianFinancialSystemCodeIdentifier.repoType(),
					HellenicBankIdentificationCodeIdentifier.repoType(),
					PolishNationalClearingCodeIdentifier.repoType(),
					DataSetTypeCode.repoType(), AccountLevelCode.repoType(),
					DocumentType6Code.repoType(),
					ExternalMandateSetupReason1Code.repoType(),
					CivilStatusCode.repoType(), Exact2NumericText.repoType(),
					Frequency10Code.repoType(),
					MandateClassification1Code.repoType(),
					MandateClassificationCode.repoType(),
					ExternalAuthenticationChannel1Code.repoType(),
					AuthenticationResultCode.repoType());
		}
	};
	public final MMBusinessProcessCatalogue catalogue = new MMBusinessProcessCatalogue() {
		{
			super.repository_lazy = () -> GeneratedRepository.repoType();
			super.topLevelCatalogueEntry = Arrays
					.asList(PaymentsInitiationLatestVersion.repoType());
		}
	};

	public static GeneratedRepository repoType() {
		repoTypeRef.compareAndSet(null, new GeneratedRepository());
		return repoTypeRef.get();
	}

	private GeneratedRepository() {
		super.dataDictionary = dataDict;
		super.businessProcessCatalogue = catalogue;
	}
}