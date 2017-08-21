package test.repository;

import com.tools20022.metamodel.MMRepository;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import test.repository.GeneratedRepository;
import test.repository.catalogue.area.PaymentsInitiationLatestVersion;
import java.util.Arrays;
import com.tools20022.metamodel.MMDataDictionary;
import test.repository.dict.entity.IdentificationIssuerRole;
import test.repository.dict.entity.GenericIdentification;
import test.repository.dict.entity.Country;
import test.repository.dict.entity.Party;
import test.repository.dict.entity.Organisation;
import test.repository.dict.entity.PartyName;
import test.repository.dict.entity.ContactPoint;
import test.repository.dict.entity.PostalAddress;
import test.repository.dict.entity.PhoneAddress;
import test.repository.dict.entity.ElectronicAddress;
import test.repository.dict.entity.PartyIdentificationInformation;
import test.repository.dict.entity.OrganisationIdentification;
import test.repository.dict.entity.PersonName;
import test.repository.dict.entity.Account;
import test.repository.dict.entity.CashAccount;
import test.repository.dict.entity.AccountIdentification;
import test.repository.dict.entity.Scheme;
import test.repository.dict.entity.DateTimePeriod;
import test.repository.dict.entity.Agreement;
import test.repository.dict.entity.Person;
import test.repository.dict.entity.PersonIdentification;
import test.repository.dict.entity.Document;
import test.repository.dict.entity.ObligationFulfilment;
import test.repository.dict.entity.CashClearingSystemMember;
import test.repository.dict.entity.PaymentExecution;
import test.repository.dict.entity.CashClearingSystem;
import test.repository.dict.entity.PaymentIdentification;
import test.repository.dict.entity.PaymentPartyRole;
import test.repository.dict.entity.PaymentProcessing;
import test.repository.dict.entity.Mandate;
import test.repository.dict.entity.DocumentIssuer;
import test.repository.dict.entity.ServiceLevel;
import test.repository.dict.entity.DirectDebitMandate;
import test.repository.dict.entity.Authentication;
import test.repository.dict.choice.ClearingSystemIdentification2Choice;
import test.repository.dict.msg.ClearingSystemMemberIdentification2;
import test.repository.dict.choice.FinancialIdentificationSchemeName1Choice;
import test.repository.dict.msg.GenericFinancialIdentification1;
import test.repository.dict.msg.PostalAddress6;
import test.repository.dict.msg.FinancialInstitutionIdentification8;
import test.repository.dict.msg.BranchData2;
import test.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import test.repository.dict.choice.AccountSchemeName1Choice;
import test.repository.dict.msg.GenericAccountIdentification1;
import test.repository.dict.choice.AccountIdentification4Choice;
import test.repository.dict.choice.CashAccountType2Choice;
import test.repository.dict.msg.DateAndPlaceOfBirth;
import test.repository.dict.choice.OrganisationIdentificationSchemeName1Choice;
import test.repository.dict.msg.GenericOrganisationIdentification1;
import test.repository.dict.choice.PersonIdentificationSchemeName1Choice;
import test.repository.dict.msg.GenericPersonIdentification1;
import test.repository.dict.msg.PersonIdentification5;
import test.repository.dict.msg.ContactDetails2;
import test.repository.dict.msg.OrganisationIdentification8;
import test.repository.dict.choice.Party11Choice;
import test.repository.dict.msg.PartyIdentification43;
import test.repository.dict.msg.CashAccount24;
import test.repository.dict.msg.DatePeriodDetails1;
import test.repository.dict.msg.SupplementaryData1;
import test.repository.dict.choice.Authorisation1Choice;
import test.repository.dict.choice.ServiceLevel8Choice;
import test.repository.dict.choice.LocalInstrument2Choice;
import test.repository.dict.choice.CategoryPurpose1Choice;
import test.repository.dict.msg.GroupHeader47;
import test.repository.dict.msg.FrequencyPeriod1;
import test.repository.dict.choice.ReferredDocumentType3Choice;
import test.repository.dict.msg.ReferredDocumentType4;
import test.repository.dict.choice.MandateSetupReason1Choice;
import test.repository.dict.msg.Mandate10;
import test.repository.dict.msg.MandateTypeInformation2;
import test.repository.dict.choice.MandateClassification1Choice;
import test.repository.dict.choice.Frequency37Choice;
import test.repository.dict.msg.MandateAdjustment1;
import test.repository.dict.msg.MandateAuthentication1;
import test.repository.dict.msg.MandateOccurrences4;
import test.repository.dict.msg.ReferredMandateDocument1;
import test.repository.dict.msg.FrequencyAndMoment1;
import test.repository.dict.choice.Frequency36Choice;
import test.repository.dict.choice.AuthenticationChannel1Choice;
import test.repository.dict.other.SupplementaryDataEnvelope1;
import test.repository.dict.datatype.Max35Text;
import test.repository.dict.datatype.ISODateTime;
import test.repository.dict.datatype.ISODate;
import test.repository.dict.codeset.CountryCode;
import test.repository.dict.datatype.Max70Text;
import test.repository.dict.datatype.Max140Text;
import test.repository.dict.datatype.Max350Text;
import test.repository.dict.codeset.CurrencyCode;
import test.repository.dict.datatype.YesNoIndicator;
import test.repository.dict.codeset.FrequencyCode;
import test.repository.dict.datatype.Number;
import test.repository.dict.datatype.CurrencyAndAmount;
import test.repository.dict.datatype.ActiveCurrencyAndAmount;
import test.repository.dict.datatype.DecimalNumber;
import test.repository.dict.codeset.AddressTypeCode;
import test.repository.dict.codeset.AddressType2Code;
import test.repository.dict.datatype.Max16Text;
import test.repository.dict.datatype.PhoneNumber;
import test.repository.dict.datatype.Max256Text;
import test.repository.dict.datatype.BICFIIdentifier;
import test.repository.dict.datatype.IBAN2007Identifier;
import test.repository.dict.datatype.BBANIdentifier;
import test.repository.dict.datatype.UPICIdentifier;
import test.repository.dict.datatype.Max2048Text;
import test.repository.dict.datatype.AnyBICIdentifier;
import test.repository.dict.codeset.CashAccountTypeCode;
import test.repository.dict.codeset.ActiveOrHistoricCurrencyCode;
import test.repository.dict.codeset.LanguageCode;
import test.repository.dict.codeset.NamePrefix1Code;
import test.repository.dict.codeset.GenderCode;
import test.repository.dict.codeset.ResidentialStatusCode;
import test.repository.dict.datatype.PercentageRate;
import test.repository.dict.datatype.CHIPSUniversalIdentifier;
import test.repository.dict.datatype.NewZealandNCCIdentifier;
import test.repository.dict.datatype.IrishNSCIdentifier;
import test.repository.dict.datatype.UKDomesticSortCodeIdentifier;
import test.repository.dict.datatype.CHIPSParticipantIdentifier;
import test.repository.dict.datatype.SwissBCIdentifier;
import test.repository.dict.datatype.FedwireRoutingNumberIdentifier;
import test.repository.dict.datatype.PortugueseNCCIdentifier;
import test.repository.dict.datatype.RussianCentralBankIdentificationCodeIdentifier;
import test.repository.dict.datatype.ItalianDomesticIdentifier;
import test.repository.dict.datatype.AustrianBankleitzahlIdentifier;
import test.repository.dict.datatype.CanadianPaymentsARNIdentifier;
import test.repository.dict.datatype.SwissSICIdentifier;
import test.repository.dict.datatype.GermanBankleitzahlIdentifier;
import test.repository.dict.datatype.SpanishDomesticInterbankingIdentifier;
import test.repository.dict.datatype.SouthAfricanNCCIdentifier;
import test.repository.dict.datatype.HongKongBankIdentifier;
import test.repository.dict.codeset.CashClearingSystemCode;
import test.repository.dict.codeset.ExternalClearingSystemIdentification1Code;
import test.repository.dict.codeset.ExternalFinancialInstitutionIdentification1Code;
import test.repository.dict.datatype.Max34Text;
import test.repository.dict.codeset.ExternalAccountIdentification1Code;
import test.repository.dict.codeset.ExternalCashAccountType1Code;
import test.repository.dict.datatype.BICNonFIIdentifier;
import test.repository.dict.datatype.EANGLNIdentifier;
import test.repository.dict.datatype.DunsIdentifier;
import test.repository.dict.codeset.ExternalOrganisationIdentification1Code;
import test.repository.dict.codeset.ExternalPersonIdentification1Code;
import test.repository.dict.datatype.TrueFalseIndicator;
import test.repository.dict.codeset.PriorityCode;
import test.repository.dict.datatype.MICIdentifier;
import test.repository.dict.codeset.TypeOfIdentificationCode;
import test.repository.dict.codeset.CopyDuplicateCode;
import test.repository.dict.codeset.PartyTypeCode;
import test.repository.dict.datatype.Max128Text;
import test.repository.dict.codeset.DocumentTypeCode;
import test.repository.dict.codeset.ServiceLevelCode;
import test.repository.dict.codeset.ClearingChannelCode;
import test.repository.dict.codeset.ExternalCode;
import test.repository.dict.codeset.PaymentCategoryPurposeCode;
import test.repository.dict.codeset.Authorisation1Code;
import test.repository.dict.codeset.ExternalServiceLevel1Code;
import test.repository.dict.codeset.ExternalLocalInstrument1Code;
import test.repository.dict.codeset.ExternalCategoryPurpose1Code;
import test.repository.dict.codeset.SequenceTypeCode;
import test.repository.dict.codeset.Frequency6Code;
import test.repository.dict.codeset.SequenceType2Code;
import test.repository.dict.datatype.LEIIdentifier;
import test.repository.dict.codeset.AuthenticationMethodCode;
import test.repository.dict.codeset.AuthenticationEntityCode;
import test.repository.dict.datatype.Max140Binary;
import test.repository.dict.datatype.Max35NumericText;
import test.repository.dict.codeset.PINFormatCode;
import test.repository.dict.codeset.SWIFTServiceLevelCode;
import test.repository.dict.datatype.IndianFinancialSystemCodeIdentifier;
import test.repository.dict.datatype.HellenicBankIdentificationCodeIdentifier;
import test.repository.dict.datatype.PolishNationalClearingCodeIdentifier;
import test.repository.dict.codeset.DataSetTypeCode;
import test.repository.dict.codeset.AccountLevelCode;
import test.repository.dict.codeset.DocumentType6Code;
import test.repository.dict.codeset.ExternalMandateSetupReason1Code;
import test.repository.dict.codeset.CivilStatusCode;
import test.repository.dict.datatype.Exact2NumericText;
import test.repository.dict.codeset.Frequency10Code;
import test.repository.dict.codeset.MandateClassification1Code;
import test.repository.dict.codeset.MandateClassificationCode;
import test.repository.dict.codeset.ExternalAuthenticationChannel1Code;
import test.repository.dict.codeset.AuthenticationResultCode;

public class GeneratedRepository extends MMRepository {

	private final static AtomicReference<GeneratedRepository> repoTypeRef = new AtomicReference<>();

	public static GeneratedRepository repoType() {
		repoTypeRef.compareAndSet(null, new GeneratedRepository());
		return repoTypeRef.get();
	}

	private GeneratedRepository() {
		super.businessProcessCatalogue = BusinessProcessCatalogue.repoType();
		super.dataDictionary = DataDictionary.repoType();
	}

	static public class BusinessProcessCatalogue
			extends
				MMBusinessProcessCatalogue {
		private final static AtomicReference<BusinessProcessCatalogue> repoTypeRef = new AtomicReference<>();

		public static BusinessProcessCatalogue repoType() {
			repoTypeRef.compareAndSet(null, new BusinessProcessCatalogue());
			return repoTypeRef.get();
		}

		private BusinessProcessCatalogue() {
			super.repository_lazy = () -> GeneratedRepository.repoType();
			super.topLevelCatalogueEntry = Arrays
					.asList(PaymentsInitiationLatestVersion.repoType());
		}
	}

	static public class DataDictionary extends MMDataDictionary {
		private final static AtomicReference<DataDictionary> repoTypeRef = new AtomicReference<>();

		public static DataDictionary repoType() {
			repoTypeRef.compareAndSet(null, new DataDictionary());
			return repoTypeRef.get();
		}

		private DataDictionary() {
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
	}
}