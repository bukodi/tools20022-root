package test.repository;

import com.tools20022.metamodel.MMRepository;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMDataDictionary;
import test.repository.GeneratedRepository;
import test.repository.dict.entity.RTIdentificationIssuerRole;
import test.repository.dict.entity.RTGenericIdentification;
import test.repository.dict.entity.RTCountry;
import test.repository.dict.entity.RTParty;
import test.repository.dict.entity.RTOrganisation;
import test.repository.dict.entity.RTPartyName;
import test.repository.dict.entity.RTContactPoint;
import test.repository.dict.entity.RTPostalAddress;
import test.repository.dict.entity.RTPhoneAddress;
import test.repository.dict.entity.RTElectronicAddress;
import test.repository.dict.entity.RTPartyIdentificationInformation;
import test.repository.dict.entity.RTOrganisationIdentification;
import test.repository.dict.entity.RTPersonName;
import test.repository.dict.entity.RTAccount;
import test.repository.dict.entity.RTCashAccount;
import test.repository.dict.entity.RTAccountIdentification;
import test.repository.dict.entity.RTScheme;
import test.repository.dict.entity.RTDateTimePeriod;
import test.repository.dict.entity.RTAgreement;
import test.repository.dict.entity.RTPerson;
import test.repository.dict.entity.RTPersonIdentification;
import test.repository.dict.entity.RTDocument;
import test.repository.dict.entity.RTObligationFulfilment;
import test.repository.dict.entity.RTCashClearingSystemMember;
import test.repository.dict.entity.RTPaymentExecution;
import test.repository.dict.entity.RTCashClearingSystem;
import test.repository.dict.entity.RTPaymentIdentification;
import test.repository.dict.entity.RTPaymentPartyRole;
import test.repository.dict.entity.RTPaymentProcessing;
import test.repository.dict.entity.RTMandate;
import test.repository.dict.entity.RTDocumentIssuer;
import test.repository.dict.entity.RTServiceLevel;
import test.repository.dict.entity.RTDirectDebitMandate;
import test.repository.dict.entity.RTAuthentication;
import test.repository.dict.choice.RTClearingSystemIdentification2Choice;
import test.repository.dict.msg.RTClearingSystemMemberIdentification2;
import test.repository.dict.choice.RTFinancialIdentificationSchemeName1Choice;
import test.repository.dict.msg.RTGenericFinancialIdentification1;
import test.repository.dict.msg.RTPostalAddress6;
import test.repository.dict.msg.RTFinancialInstitutionIdentification8;
import test.repository.dict.msg.RTBranchData2;
import test.repository.dict.msg.RTBranchAndFinancialInstitutionIdentification5;
import test.repository.dict.choice.RTAccountSchemeName1Choice;
import test.repository.dict.msg.RTGenericAccountIdentification1;
import test.repository.dict.choice.RTAccountIdentification4Choice;
import test.repository.dict.choice.RTCashAccountType2Choice;
import test.repository.dict.msg.RTDateAndPlaceOfBirth;
import test.repository.dict.choice.RTOrganisationIdentificationSchemeName1Choice;
import test.repository.dict.msg.RTGenericOrganisationIdentification1;
import test.repository.dict.choice.RTPersonIdentificationSchemeName1Choice;
import test.repository.dict.msg.RTGenericPersonIdentification1;
import test.repository.dict.msg.RTPersonIdentification5;
import test.repository.dict.msg.RTContactDetails2;
import test.repository.dict.msg.RTOrganisationIdentification8;
import test.repository.dict.choice.RTParty11Choice;
import test.repository.dict.msg.RTPartyIdentification43;
import test.repository.dict.msg.RTCashAccount24;
import test.repository.dict.msg.RTDatePeriodDetails1;
import test.repository.dict.msg.RTSupplementaryData1;
import test.repository.dict.choice.RTAuthorisation1Choice;
import test.repository.dict.choice.RTServiceLevel8Choice;
import test.repository.dict.choice.RTLocalInstrument2Choice;
import test.repository.dict.choice.RTCategoryPurpose1Choice;
import test.repository.dict.msg.RTGroupHeader47;
import test.repository.dict.msg.RTFrequencyPeriod1;
import test.repository.dict.choice.RTReferredDocumentType3Choice;
import test.repository.dict.msg.RTReferredDocumentType4;
import test.repository.dict.choice.RTMandateSetupReason1Choice;
import test.repository.dict.msg.RTMandate10;
import test.repository.dict.msg.RTMandateTypeInformation2;
import test.repository.dict.choice.RTMandateClassification1Choice;
import test.repository.dict.choice.RTFrequency37Choice;
import test.repository.dict.msg.RTMandateAdjustment1;
import test.repository.dict.msg.RTMandateAuthentication1;
import test.repository.dict.msg.RTMandateOccurrences4;
import test.repository.dict.msg.RTReferredMandateDocument1;
import test.repository.dict.msg.RTFrequencyAndMoment1;
import test.repository.dict.choice.RTFrequency36Choice;
import test.repository.dict.choice.RTAuthenticationChannel1Choice;
import test.repository.dict.other.RTSupplementaryDataEnvelope1;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.datatype.RTISODateTime;
import test.repository.dict.datatype.RTISODate;
import test.repository.dict.codeset.RTCountryCode;
import test.repository.dict.datatype.RTMax70Text;
import test.repository.dict.datatype.RTMax140Text;
import test.repository.dict.datatype.RTMax350Text;
import test.repository.dict.codeset.RTCurrencyCode;
import test.repository.dict.datatype.RTYesNoIndicator;
import test.repository.dict.codeset.RTFrequencyCode;
import test.repository.dict.datatype.RTNumber;
import test.repository.dict.datatype.RTCurrencyAndAmount;
import test.repository.dict.datatype.RTActiveCurrencyAndAmount;
import test.repository.dict.datatype.RTDecimalNumber;
import test.repository.dict.codeset.RTAddressTypeCode;
import test.repository.dict.codeset.RTAddressType2Code;
import test.repository.dict.datatype.RTMax16Text;
import test.repository.dict.datatype.RTPhoneNumber;
import test.repository.dict.datatype.RTMax256Text;
import test.repository.dict.datatype.RTBICFIIdentifier;
import test.repository.dict.datatype.RTIBAN2007Identifier;
import test.repository.dict.datatype.RTBBANIdentifier;
import test.repository.dict.datatype.RTUPICIdentifier;
import test.repository.dict.datatype.RTMax2048Text;
import test.repository.dict.datatype.RTAnyBICIdentifier;
import test.repository.dict.codeset.RTCashAccountTypeCode;
import test.repository.dict.codeset.RTActiveOrHistoricCurrencyCode;
import test.repository.dict.codeset.RTLanguageCode;
import test.repository.dict.codeset.RTNamePrefix1Code;
import test.repository.dict.codeset.RTGenderCode;
import test.repository.dict.codeset.RTResidentialStatusCode;
import test.repository.dict.datatype.RTPercentageRate;
import test.repository.dict.datatype.RTCHIPSUniversalIdentifier;
import test.repository.dict.datatype.RTNewZealandNCCIdentifier;
import test.repository.dict.datatype.RTIrishNSCIdentifier;
import test.repository.dict.datatype.RTUKDomesticSortCodeIdentifier;
import test.repository.dict.datatype.RTCHIPSParticipantIdentifier;
import test.repository.dict.datatype.RTSwissBCIdentifier;
import test.repository.dict.datatype.RTFedwireRoutingNumberIdentifier;
import test.repository.dict.datatype.RTPortugueseNCCIdentifier;
import test.repository.dict.datatype.RTRussianCentralBankIdentificationCodeIdentifier;
import test.repository.dict.datatype.RTItalianDomesticIdentifier;
import test.repository.dict.datatype.RTAustrianBankleitzahlIdentifier;
import test.repository.dict.datatype.RTCanadianPaymentsARNIdentifier;
import test.repository.dict.datatype.RTSwissSICIdentifier;
import test.repository.dict.datatype.RTGermanBankleitzahlIdentifier;
import test.repository.dict.datatype.RTSpanishDomesticInterbankingIdentifier;
import test.repository.dict.datatype.RTSouthAfricanNCCIdentifier;
import test.repository.dict.datatype.RTHongKongBankIdentifier;
import test.repository.dict.codeset.RTCashClearingSystemCode;
import test.repository.dict.codeset.RTExternalClearingSystemIdentification1Code;
import test.repository.dict.codeset.RTExternalFinancialInstitutionIdentification1Code;
import test.repository.dict.datatype.RTMax34Text;
import test.repository.dict.codeset.RTExternalAccountIdentification1Code;
import test.repository.dict.codeset.RTExternalCashAccountType1Code;
import test.repository.dict.datatype.RTBICNonFIIdentifier;
import test.repository.dict.datatype.RTEANGLNIdentifier;
import test.repository.dict.datatype.RTDunsIdentifier;
import test.repository.dict.codeset.RTExternalOrganisationIdentification1Code;
import test.repository.dict.codeset.RTExternalPersonIdentification1Code;
import test.repository.dict.datatype.RTTrueFalseIndicator;
import test.repository.dict.codeset.RTPriorityCode;
import test.repository.dict.datatype.RTMICIdentifier;
import test.repository.dict.codeset.RTTypeOfIdentificationCode;
import test.repository.dict.codeset.RTCopyDuplicateCode;
import test.repository.dict.codeset.RTPartyTypeCode;
import test.repository.dict.datatype.RTMax128Text;
import test.repository.dict.codeset.RTDocumentTypeCode;
import test.repository.dict.codeset.RTServiceLevelCode;
import test.repository.dict.codeset.RTClearingChannelCode;
import test.repository.dict.codeset.RTExternalCode;
import test.repository.dict.codeset.RTPaymentCategoryPurposeCode;
import test.repository.dict.codeset.RTAuthorisation1Code;
import test.repository.dict.codeset.RTExternalServiceLevel1Code;
import test.repository.dict.codeset.RTExternalLocalInstrument1Code;
import test.repository.dict.codeset.RTExternalCategoryPurpose1Code;
import test.repository.dict.codeset.RTSequenceTypeCode;
import test.repository.dict.codeset.RTFrequency6Code;
import test.repository.dict.codeset.RTSequenceType2Code;
import test.repository.dict.datatype.RTLEIIdentifier;
import test.repository.dict.codeset.RTAuthenticationMethodCode;
import test.repository.dict.codeset.RTAuthenticationEntityCode;
import test.repository.dict.datatype.RTMax140Binary;
import test.repository.dict.datatype.RTMax35NumericText;
import test.repository.dict.codeset.RTPINFormatCode;
import test.repository.dict.codeset.RTSWIFTServiceLevelCode;
import test.repository.dict.datatype.RTIndianFinancialSystemCodeIdentifier;
import test.repository.dict.datatype.RTHellenicBankIdentificationCodeIdentifier;
import test.repository.dict.datatype.RTPolishNationalClearingCodeIdentifier;
import test.repository.dict.codeset.RTDataSetTypeCode;
import test.repository.dict.codeset.RTAccountLevelCode;
import test.repository.dict.codeset.RTDocumentType6Code;
import test.repository.dict.codeset.RTExternalMandateSetupReason1Code;
import test.repository.dict.codeset.RTCivilStatusCode;
import test.repository.dict.datatype.RTExact2NumericText;
import test.repository.dict.codeset.RTFrequency10Code;
import test.repository.dict.codeset.RTMandateClassification1Code;
import test.repository.dict.codeset.RTMandateClassificationCode;
import test.repository.dict.codeset.RTExternalAuthenticationChannel1Code;
import test.repository.dict.codeset.RTAuthenticationResultCode;
import java.util.Arrays;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import test.repository.catalogue.area.RTPaymentsInitiationLatestVersion;

public class GeneratedRepository extends MMRepository {

	private final static AtomicReference<GeneratedRepository> repoTypeRef = new AtomicReference<>();

	public static GeneratedRepository repoType() {
		repoTypeRef.compareAndSet(null, new GeneratedRepository());
		return repoTypeRef.get();
	}

	private GeneratedRepository() {
		super.dataDictionary = DataDictionary.repoType();
		super.businessProcessCatalogue = BusinessProcessCatalogue.repoType();
	}

	static public class DataDictionary extends MMDataDictionary {
		private final static AtomicReference<DataDictionary> repoTypeRef = new AtomicReference<>();

		public static DataDictionary repoType() {
			repoTypeRef.compareAndSet(null, new DataDictionary());
			return repoTypeRef.get();
		}

		private DataDictionary() {
			super.repository_lazy = () -> GeneratedRepository.repoType();
			super.topLevelDictionaryEntry = Arrays
					.asList(RTIdentificationIssuerRole.repoType(),
							RTGenericIdentification.repoType(), RTCountry
									.repoType(), RTParty.repoType(),
							RTOrganisation.repoType(), RTPartyName.repoType(),
							RTContactPoint.repoType(), RTPostalAddress
									.repoType(), RTPhoneAddress.repoType(),
							RTElectronicAddress.repoType(),
							RTPartyIdentificationInformation.repoType(),
							RTOrganisationIdentification.repoType(),
							RTPersonName.repoType(), RTAccount.repoType(),
							RTCashAccount.repoType(), RTAccountIdentification
									.repoType(), RTScheme.repoType(),
							RTDateTimePeriod.repoType(),
							RTAgreement.repoType(), RTPerson.repoType(),
							RTPersonIdentification.repoType(), RTDocument
									.repoType(), RTObligationFulfilment
									.repoType(), RTCashClearingSystemMember
									.repoType(), RTPaymentExecution.repoType(),
							RTCashClearingSystem.repoType(),
							RTPaymentIdentification.repoType(),
							RTPaymentPartyRole.repoType(), RTPaymentProcessing
									.repoType(), RTMandate.repoType(),
							RTDocumentIssuer.repoType(), RTServiceLevel
									.repoType(), RTDirectDebitMandate
									.repoType(), RTAuthentication.repoType(),
							RTClearingSystemIdentification2Choice.repoType(),
							RTClearingSystemMemberIdentification2.repoType(),
							RTFinancialIdentificationSchemeName1Choice
									.repoType(),
							RTGenericFinancialIdentification1.repoType(),
							RTPostalAddress6.repoType(),
							RTFinancialInstitutionIdentification8.repoType(),
							RTBranchData2.repoType(),
							RTBranchAndFinancialInstitutionIdentification5
									.repoType(), RTAccountSchemeName1Choice
									.repoType(),
							RTGenericAccountIdentification1.repoType(),
							RTAccountIdentification4Choice.repoType(),
							RTCashAccountType2Choice.repoType(),
							RTDateAndPlaceOfBirth.repoType(),
							RTOrganisationIdentificationSchemeName1Choice
									.repoType(),
							RTGenericOrganisationIdentification1.repoType(),
							RTPersonIdentificationSchemeName1Choice.repoType(),
							RTGenericPersonIdentification1.repoType(),
							RTPersonIdentification5.repoType(),
							RTContactDetails2.repoType(),
							RTOrganisationIdentification8.repoType(),
							RTParty11Choice.repoType(), RTPartyIdentification43
									.repoType(), RTCashAccount24.repoType(),
							RTDatePeriodDetails1.repoType(),
							RTSupplementaryData1.repoType(),
							RTAuthorisation1Choice.repoType(),
							RTServiceLevel8Choice.repoType(),
							RTLocalInstrument2Choice.repoType(),
							RTCategoryPurpose1Choice.repoType(),
							RTGroupHeader47.repoType(), RTFrequencyPeriod1
									.repoType(), RTReferredDocumentType3Choice
									.repoType(), RTReferredDocumentType4
									.repoType(), RTMandateSetupReason1Choice
									.repoType(), RTMandate10.repoType(),
							RTMandateTypeInformation2.repoType(),
							RTMandateClassification1Choice.repoType(),
							RTFrequency37Choice.repoType(),
							RTMandateAdjustment1.repoType(),
							RTMandateAuthentication1.repoType(),
							RTMandateOccurrences4.repoType(),
							RTReferredMandateDocument1.repoType(),
							RTFrequencyAndMoment1.repoType(),
							RTFrequency36Choice.repoType(),
							RTAuthenticationChannel1Choice.repoType(),
							RTSupplementaryDataEnvelope1.repoType(),
							RTMax35Text.repoType(), RTISODateTime.repoType(),
							RTISODate.repoType(), RTCountryCode.repoType(),
							RTMax70Text.repoType(), RTMax140Text.repoType(),
							RTMax350Text.repoType(), RTCurrencyCode.repoType(),
							RTYesNoIndicator.repoType(), RTFrequencyCode
									.repoType(), RTNumber.repoType(),
							RTCurrencyAndAmount.repoType(),
							RTActiveCurrencyAndAmount.repoType(),
							RTDecimalNumber.repoType(), RTAddressTypeCode
									.repoType(), RTAddressType2Code.repoType(),
							RTMax16Text.repoType(), RTPhoneNumber.repoType(),
							RTMax256Text.repoType(), RTBICFIIdentifier
									.repoType(), RTIBAN2007Identifier
									.repoType(), RTBBANIdentifier.repoType(),
							RTUPICIdentifier.repoType(), RTMax2048Text
									.repoType(), RTAnyBICIdentifier.repoType(),
							RTCashAccountTypeCode.repoType(),
							RTActiveOrHistoricCurrencyCode.repoType(),
							RTLanguageCode.repoType(), RTNamePrefix1Code
									.repoType(), RTGenderCode.repoType(),
							RTResidentialStatusCode.repoType(),
							RTPercentageRate.repoType(),
							RTCHIPSUniversalIdentifier.repoType(),
							RTNewZealandNCCIdentifier.repoType(),
							RTIrishNSCIdentifier.repoType(),
							RTUKDomesticSortCodeIdentifier.repoType(),
							RTCHIPSParticipantIdentifier.repoType(),
							RTSwissBCIdentifier.repoType(),
							RTFedwireRoutingNumberIdentifier.repoType(),
							RTPortugueseNCCIdentifier.repoType(),
							RTRussianCentralBankIdentificationCodeIdentifier
									.repoType(), RTItalianDomesticIdentifier
									.repoType(),
							RTAustrianBankleitzahlIdentifier.repoType(),
							RTCanadianPaymentsARNIdentifier.repoType(),
							RTSwissSICIdentifier.repoType(),
							RTGermanBankleitzahlIdentifier.repoType(),
							RTSpanishDomesticInterbankingIdentifier.repoType(),
							RTSouthAfricanNCCIdentifier.repoType(),
							RTHongKongBankIdentifier.repoType(),
							RTCashClearingSystemCode.repoType(),
							RTExternalClearingSystemIdentification1Code
									.repoType(),
							RTExternalFinancialInstitutionIdentification1Code
									.repoType(), RTMax34Text.repoType(),
							RTExternalAccountIdentification1Code.repoType(),
							RTExternalCashAccountType1Code.repoType(),
							RTBICNonFIIdentifier.repoType(), RTEANGLNIdentifier
									.repoType(), RTDunsIdentifier.repoType(),
							RTExternalOrganisationIdentification1Code
									.repoType(),
							RTExternalPersonIdentification1Code.repoType(),
							RTTrueFalseIndicator.repoType(), RTPriorityCode
									.repoType(), RTMICIdentifier.repoType(),
							RTTypeOfIdentificationCode.repoType(),
							RTCopyDuplicateCode.repoType(), RTPartyTypeCode
									.repoType(), RTMax128Text.repoType(),
							RTDocumentTypeCode.repoType(), RTServiceLevelCode
									.repoType(), RTClearingChannelCode
									.repoType(), RTExternalCode.repoType(),
							RTPaymentCategoryPurposeCode.repoType(),
							RTAuthorisation1Code.repoType(),
							RTExternalServiceLevel1Code.repoType(),
							RTExternalLocalInstrument1Code.repoType(),
							RTExternalCategoryPurpose1Code.repoType(),
							RTSequenceTypeCode.repoType(), RTFrequency6Code
									.repoType(),
							RTSequenceType2Code.repoType(), RTLEIIdentifier
									.repoType(), RTAuthenticationMethodCode
									.repoType(), RTAuthenticationEntityCode
									.repoType(), RTMax140Binary.repoType(),
							RTMax35NumericText.repoType(), RTPINFormatCode
									.repoType(), RTSWIFTServiceLevelCode
									.repoType(),
							RTIndianFinancialSystemCodeIdentifier.repoType(),
							RTHellenicBankIdentificationCodeIdentifier
									.repoType(),
							RTPolishNationalClearingCodeIdentifier.repoType(),
							RTDataSetTypeCode.repoType(), RTAccountLevelCode
									.repoType(),
							RTDocumentType6Code.repoType(),
							RTExternalMandateSetupReason1Code.repoType(),
							RTCivilStatusCode.repoType(), RTExact2NumericText
									.repoType(), RTFrequency10Code.repoType(),
							RTMandateClassification1Code.repoType(),
							RTMandateClassificationCode.repoType(),
							RTExternalAuthenticationChannel1Code.repoType(),
							RTAuthenticationResultCode.repoType());
		}
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
					.asList(RTPaymentsInitiationLatestVersion.repoType());
		}
	}
}