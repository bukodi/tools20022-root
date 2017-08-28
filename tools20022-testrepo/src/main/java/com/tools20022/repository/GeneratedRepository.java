package com.tools20022.repository;

import com.tools20022.metamodel.MMRepository;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.dict.entity.RTIdentificationIssuerRole;
import com.tools20022.repository.dict.entity.RTGenericIdentification;
import com.tools20022.repository.dict.entity.RTCountry;
import com.tools20022.repository.dict.entity.RTParty;
import com.tools20022.repository.dict.entity.RTOrganisation;
import com.tools20022.repository.dict.entity.RTPartyName;
import com.tools20022.repository.dict.entity.RTContactPoint;
import com.tools20022.repository.dict.entity.RTPostalAddress;
import com.tools20022.repository.dict.entity.RTPhoneAddress;
import com.tools20022.repository.dict.entity.RTElectronicAddress;
import com.tools20022.repository.dict.entity.RTPartyIdentificationInformation;
import com.tools20022.repository.dict.entity.RTOrganisationIdentification;
import com.tools20022.repository.dict.entity.RTPersonName;
import com.tools20022.repository.dict.entity.RTAccount;
import com.tools20022.repository.dict.entity.RTCashAccount;
import com.tools20022.repository.dict.entity.RTAccountIdentification;
import com.tools20022.repository.dict.entity.RTScheme;
import com.tools20022.repository.dict.entity.RTDateTimePeriod;
import com.tools20022.repository.dict.entity.RTAgreement;
import com.tools20022.repository.dict.entity.RTPerson;
import com.tools20022.repository.dict.entity.RTPersonIdentification;
import com.tools20022.repository.dict.entity.RTDocument;
import com.tools20022.repository.dict.entity.RTObligationFulfilment;
import com.tools20022.repository.dict.entity.RTCashClearingSystemMember;
import com.tools20022.repository.dict.entity.RTPaymentExecution;
import com.tools20022.repository.dict.entity.RTCashClearingSystem;
import com.tools20022.repository.dict.entity.RTPaymentIdentification;
import com.tools20022.repository.dict.entity.RTPaymentPartyRole;
import com.tools20022.repository.dict.entity.RTPaymentProcessing;
import com.tools20022.repository.dict.entity.RTMandate;
import com.tools20022.repository.dict.entity.RTDocumentIssuer;
import com.tools20022.repository.dict.entity.RTServiceLevel;
import com.tools20022.repository.dict.entity.RTDirectDebitMandate;
import com.tools20022.repository.dict.entity.RTAuthentication;
import com.tools20022.repository.dict.choice.RTClearingSystemIdentification2Choice;
import com.tools20022.repository.dict.msg.RTClearingSystemMemberIdentification2;
import com.tools20022.repository.dict.choice.RTFinancialIdentificationSchemeName1Choice;
import com.tools20022.repository.dict.msg.RTGenericFinancialIdentification1;
import com.tools20022.repository.dict.msg.RTPostalAddress6;
import com.tools20022.repository.dict.msg.RTFinancialInstitutionIdentification8;
import com.tools20022.repository.dict.msg.RTBranchData2;
import com.tools20022.repository.dict.msg.RTBranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.choice.RTAccountSchemeName1Choice;
import com.tools20022.repository.dict.msg.RTGenericAccountIdentification1;
import com.tools20022.repository.dict.choice.RTAccountIdentification4Choice;
import com.tools20022.repository.dict.choice.RTCashAccountType2Choice;
import com.tools20022.repository.dict.msg.RTDateAndPlaceOfBirth;
import com.tools20022.repository.dict.choice.RTOrganisationIdentificationSchemeName1Choice;
import com.tools20022.repository.dict.msg.RTGenericOrganisationIdentification1;
import com.tools20022.repository.dict.choice.RTPersonIdentificationSchemeName1Choice;
import com.tools20022.repository.dict.msg.RTGenericPersonIdentification1;
import com.tools20022.repository.dict.msg.RTPersonIdentification5;
import com.tools20022.repository.dict.msg.RTContactDetails2;
import com.tools20022.repository.dict.msg.RTOrganisationIdentification8;
import com.tools20022.repository.dict.choice.RTParty11Choice;
import com.tools20022.repository.dict.msg.RTPartyIdentification43;
import com.tools20022.repository.dict.msg.RTCashAccount24;
import com.tools20022.repository.dict.msg.RTDatePeriodDetails1;
import com.tools20022.repository.dict.msg.RTSupplementaryData1;
import com.tools20022.repository.dict.choice.RTAuthorisation1Choice;
import com.tools20022.repository.dict.choice.RTServiceLevel8Choice;
import com.tools20022.repository.dict.choice.RTLocalInstrument2Choice;
import com.tools20022.repository.dict.choice.RTCategoryPurpose1Choice;
import com.tools20022.repository.dict.msg.RTGroupHeader47;
import com.tools20022.repository.dict.msg.RTFrequencyPeriod1;
import com.tools20022.repository.dict.choice.RTReferredDocumentType3Choice;
import com.tools20022.repository.dict.msg.RTReferredDocumentType4;
import com.tools20022.repository.dict.choice.RTMandateSetupReason1Choice;
import com.tools20022.repository.dict.msg.RTMandate10;
import com.tools20022.repository.dict.msg.RTMandateTypeInformation2;
import com.tools20022.repository.dict.choice.RTMandateClassification1Choice;
import com.tools20022.repository.dict.choice.RTFrequency37Choice;
import com.tools20022.repository.dict.msg.RTMandateAdjustment1;
import com.tools20022.repository.dict.msg.RTMandateAuthentication1;
import com.tools20022.repository.dict.msg.RTMandateOccurrences4;
import com.tools20022.repository.dict.msg.RTReferredMandateDocument1;
import com.tools20022.repository.dict.msg.RTFrequencyAndMoment1;
import com.tools20022.repository.dict.choice.RTFrequency36Choice;
import com.tools20022.repository.dict.choice.RTAuthenticationChannel1Choice;
import com.tools20022.repository.dict.other.RTSupplementaryDataEnvelope1;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.datatype.RTISODateTime;
import com.tools20022.repository.dict.datatype.RTISODate;
import com.tools20022.repository.dict.codeset.RTCountryCode;
import com.tools20022.repository.dict.datatype.RTMax70Text;
import com.tools20022.repository.dict.datatype.RTMax140Text;
import com.tools20022.repository.dict.datatype.RTMax350Text;
import com.tools20022.repository.dict.codeset.RTCurrencyCode;
import com.tools20022.repository.dict.datatype.RTYesNoIndicator;
import com.tools20022.repository.dict.codeset.RTFrequencyCode;
import com.tools20022.repository.dict.datatype.RTNumber;
import com.tools20022.repository.dict.datatype.RTCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.RTActiveCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.RTDecimalNumber;
import com.tools20022.repository.dict.codeset.RTAddressTypeCode;
import com.tools20022.repository.dict.codeset.RTAddressType2Code;
import com.tools20022.repository.dict.datatype.RTMax16Text;
import com.tools20022.repository.dict.datatype.RTPhoneNumber;
import com.tools20022.repository.dict.datatype.RTMax256Text;
import com.tools20022.repository.dict.datatype.RTBICFIIdentifier;
import com.tools20022.repository.dict.datatype.RTIBAN2007Identifier;
import com.tools20022.repository.dict.datatype.RTBBANIdentifier;
import com.tools20022.repository.dict.datatype.RTUPICIdentifier;
import com.tools20022.repository.dict.datatype.RTMax2048Text;
import com.tools20022.repository.dict.datatype.RTAnyBICIdentifier;
import com.tools20022.repository.dict.codeset.RTCashAccountTypeCode;
import com.tools20022.repository.dict.codeset.RTActiveOrHistoricCurrencyCode;
import com.tools20022.repository.dict.codeset.RTLanguageCode;
import com.tools20022.repository.dict.codeset.RTNamePrefix1Code;
import com.tools20022.repository.dict.codeset.RTGenderCode;
import com.tools20022.repository.dict.codeset.RTResidentialStatusCode;
import com.tools20022.repository.dict.datatype.RTPercentageRate;
import com.tools20022.repository.dict.datatype.RTCHIPSUniversalIdentifier;
import com.tools20022.repository.dict.datatype.RTNewZealandNCCIdentifier;
import com.tools20022.repository.dict.datatype.RTIrishNSCIdentifier;
import com.tools20022.repository.dict.datatype.RTUKDomesticSortCodeIdentifier;
import com.tools20022.repository.dict.datatype.RTCHIPSParticipantIdentifier;
import com.tools20022.repository.dict.datatype.RTSwissBCIdentifier;
import com.tools20022.repository.dict.datatype.RTFedwireRoutingNumberIdentifier;
import com.tools20022.repository.dict.datatype.RTPortugueseNCCIdentifier;
import com.tools20022.repository.dict.datatype.RTRussianCentralBankIdentificationCodeIdentifier;
import com.tools20022.repository.dict.datatype.RTItalianDomesticIdentifier;
import com.tools20022.repository.dict.datatype.RTAustrianBankleitzahlIdentifier;
import com.tools20022.repository.dict.datatype.RTCanadianPaymentsARNIdentifier;
import com.tools20022.repository.dict.datatype.RTSwissSICIdentifier;
import com.tools20022.repository.dict.datatype.RTGermanBankleitzahlIdentifier;
import com.tools20022.repository.dict.datatype.RTSpanishDomesticInterbankingIdentifier;
import com.tools20022.repository.dict.datatype.RTSouthAfricanNCCIdentifier;
import com.tools20022.repository.dict.datatype.RTHongKongBankIdentifier;
import com.tools20022.repository.dict.codeset.RTCashClearingSystemCode;
import com.tools20022.repository.dict.codeset.RTExternalClearingSystemIdentification1Code;
import com.tools20022.repository.dict.codeset.RTExternalFinancialInstitutionIdentification1Code;
import com.tools20022.repository.dict.datatype.RTMax34Text;
import com.tools20022.repository.dict.codeset.RTExternalAccountIdentification1Code;
import com.tools20022.repository.dict.codeset.RTExternalCashAccountType1Code;
import com.tools20022.repository.dict.datatype.RTBICNonFIIdentifier;
import com.tools20022.repository.dict.datatype.RTEANGLNIdentifier;
import com.tools20022.repository.dict.datatype.RTDunsIdentifier;
import com.tools20022.repository.dict.codeset.RTExternalOrganisationIdentification1Code;
import com.tools20022.repository.dict.codeset.RTExternalPersonIdentification1Code;
import com.tools20022.repository.dict.datatype.RTTrueFalseIndicator;
import com.tools20022.repository.dict.codeset.RTPriorityCode;
import com.tools20022.repository.dict.datatype.RTMICIdentifier;
import com.tools20022.repository.dict.codeset.RTTypeOfIdentificationCode;
import com.tools20022.repository.dict.codeset.RTCopyDuplicateCode;
import com.tools20022.repository.dict.codeset.RTPartyTypeCode;
import com.tools20022.repository.dict.datatype.RTMax128Text;
import com.tools20022.repository.dict.codeset.RTDocumentTypeCode;
import com.tools20022.repository.dict.codeset.RTServiceLevelCode;
import com.tools20022.repository.dict.codeset.RTClearingChannelCode;
import com.tools20022.repository.dict.codeset.RTExternalCode;
import com.tools20022.repository.dict.codeset.RTPaymentCategoryPurposeCode;
import com.tools20022.repository.dict.codeset.RTAuthorisation1Code;
import com.tools20022.repository.dict.codeset.RTExternalServiceLevel1Code;
import com.tools20022.repository.dict.codeset.RTExternalLocalInstrument1Code;
import com.tools20022.repository.dict.codeset.RTExternalCategoryPurpose1Code;
import com.tools20022.repository.dict.codeset.RTSequenceTypeCode;
import com.tools20022.repository.dict.codeset.RTFrequency6Code;
import com.tools20022.repository.dict.codeset.RTSequenceType2Code;
import com.tools20022.repository.dict.datatype.RTLEIIdentifier;
import com.tools20022.repository.dict.codeset.RTAuthenticationMethodCode;
import com.tools20022.repository.dict.codeset.RTAuthenticationEntityCode;
import com.tools20022.repository.dict.datatype.RTMax140Binary;
import com.tools20022.repository.dict.datatype.RTMax35NumericText;
import com.tools20022.repository.dict.codeset.RTPINFormatCode;
import com.tools20022.repository.dict.codeset.RTSWIFTServiceLevelCode;
import com.tools20022.repository.dict.datatype.RTIndianFinancialSystemCodeIdentifier;
import com.tools20022.repository.dict.datatype.RTHellenicBankIdentificationCodeIdentifier;
import com.tools20022.repository.dict.datatype.RTPolishNationalClearingCodeIdentifier;
import com.tools20022.repository.dict.codeset.RTDataSetTypeCode;
import com.tools20022.repository.dict.codeset.RTAccountLevelCode;
import com.tools20022.repository.dict.codeset.RTDocumentType6Code;
import com.tools20022.repository.dict.codeset.RTExternalMandateSetupReason1Code;
import com.tools20022.repository.dict.codeset.RTCivilStatusCode;
import com.tools20022.repository.dict.datatype.RTExact2NumericText;
import com.tools20022.repository.dict.codeset.RTFrequency10Code;
import com.tools20022.repository.dict.codeset.RTMandateClassification1Code;
import com.tools20022.repository.dict.codeset.RTMandateClassificationCode;
import com.tools20022.repository.dict.codeset.RTExternalAuthenticationChannel1Code;
import com.tools20022.repository.dict.codeset.RTAuthenticationResultCode;
import java.util.Arrays;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.repository.catalogue.area.RTPaymentsInitiationLatestVersion;

/**
 * An instance of Repository.
 */
public class GeneratedRepository extends MMRepository {

	private final static AtomicReference<GeneratedRepository> repoTypeRef = new AtomicReference<>();
	/**
	 * An instance of DataDictionary.
	 */
	public final MMDataDictionary dataDict = new MMDataDictionary() {
		{
			super.repository_lazy = () -> GeneratedRepository.repoType();
			super.topLevelDictionaryEntry = Arrays.asList(RTIdentificationIssuerRole.repoType(),
					RTGenericIdentification.repoType(), RTCountry.repoType(), RTParty.repoType(),
					RTOrganisation.repoType(), RTPartyName.repoType(), RTContactPoint.repoType(),
					RTPostalAddress.repoType(), RTPhoneAddress.repoType(), RTElectronicAddress.repoType(),
					RTPartyIdentificationInformation.repoType(), RTOrganisationIdentification.repoType(),
					RTPersonName.repoType(), RTAccount.repoType(), RTCashAccount.repoType(),
					RTAccountIdentification.repoType(), RTScheme.repoType(), RTDateTimePeriod.repoType(),
					RTAgreement.repoType(), RTPerson.repoType(), RTPersonIdentification.repoType(),
					RTDocument.repoType(), RTObligationFulfilment.repoType(), RTCashClearingSystemMember.repoType(),
					RTPaymentExecution.repoType(), RTCashClearingSystem.repoType(), RTPaymentIdentification.repoType(),
					RTPaymentPartyRole.repoType(), RTPaymentProcessing.repoType(), RTMandate.repoType(),
					RTDocumentIssuer.repoType(), RTServiceLevel.repoType(), RTDirectDebitMandate.repoType(),
					RTAuthentication.repoType(), RTClearingSystemIdentification2Choice.repoType(),
					RTClearingSystemMemberIdentification2.repoType(),
					RTFinancialIdentificationSchemeName1Choice.repoType(), RTGenericFinancialIdentification1.repoType(),
					RTPostalAddress6.repoType(), RTFinancialInstitutionIdentification8.repoType(),
					RTBranchData2.repoType(), RTBranchAndFinancialInstitutionIdentification5.repoType(),
					RTAccountSchemeName1Choice.repoType(), RTGenericAccountIdentification1.repoType(),
					RTAccountIdentification4Choice.repoType(), RTCashAccountType2Choice.repoType(),
					RTDateAndPlaceOfBirth.repoType(), RTOrganisationIdentificationSchemeName1Choice.repoType(),
					RTGenericOrganisationIdentification1.repoType(), RTPersonIdentificationSchemeName1Choice.repoType(),
					RTGenericPersonIdentification1.repoType(), RTPersonIdentification5.repoType(),
					RTContactDetails2.repoType(), RTOrganisationIdentification8.repoType(), RTParty11Choice.repoType(),
					RTPartyIdentification43.repoType(), RTCashAccount24.repoType(), RTDatePeriodDetails1.repoType(),
					RTSupplementaryData1.repoType(), RTAuthorisation1Choice.repoType(),
					RTServiceLevel8Choice.repoType(), RTLocalInstrument2Choice.repoType(),
					RTCategoryPurpose1Choice.repoType(), RTGroupHeader47.repoType(), RTFrequencyPeriod1.repoType(),
					RTReferredDocumentType3Choice.repoType(), RTReferredDocumentType4.repoType(),
					RTMandateSetupReason1Choice.repoType(), RTMandate10.repoType(),
					RTMandateTypeInformation2.repoType(), RTMandateClassification1Choice.repoType(),
					RTFrequency37Choice.repoType(), RTMandateAdjustment1.repoType(),
					RTMandateAuthentication1.repoType(), RTMandateOccurrences4.repoType(),
					RTReferredMandateDocument1.repoType(), RTFrequencyAndMoment1.repoType(),
					RTFrequency36Choice.repoType(), RTAuthenticationChannel1Choice.repoType(),
					RTSupplementaryDataEnvelope1.repoType(), RTMax35Text.repoType(), RTISODateTime.repoType(),
					RTISODate.repoType(), RTCountryCode.repoType(), RTMax70Text.repoType(), RTMax140Text.repoType(),
					RTMax350Text.repoType(), RTCurrencyCode.repoType(), RTYesNoIndicator.repoType(),
					RTFrequencyCode.repoType(), RTNumber.repoType(), RTCurrencyAndAmount.repoType(),
					RTActiveCurrencyAndAmount.repoType(), RTDecimalNumber.repoType(), RTAddressTypeCode.repoType(),
					RTAddressType2Code.repoType(), RTMax16Text.repoType(), RTPhoneNumber.repoType(),
					RTMax256Text.repoType(), RTBICFIIdentifier.repoType(), RTIBAN2007Identifier.repoType(),
					RTBBANIdentifier.repoType(), RTUPICIdentifier.repoType(), RTMax2048Text.repoType(),
					RTAnyBICIdentifier.repoType(), RTCashAccountTypeCode.repoType(),
					RTActiveOrHistoricCurrencyCode.repoType(), RTLanguageCode.repoType(), RTNamePrefix1Code.repoType(),
					RTGenderCode.repoType(), RTResidentialStatusCode.repoType(), RTPercentageRate.repoType(),
					RTCHIPSUniversalIdentifier.repoType(), RTNewZealandNCCIdentifier.repoType(),
					RTIrishNSCIdentifier.repoType(), RTUKDomesticSortCodeIdentifier.repoType(),
					RTCHIPSParticipantIdentifier.repoType(), RTSwissBCIdentifier.repoType(),
					RTFedwireRoutingNumberIdentifier.repoType(), RTPortugueseNCCIdentifier.repoType(),
					RTRussianCentralBankIdentificationCodeIdentifier.repoType(), RTItalianDomesticIdentifier.repoType(),
					RTAustrianBankleitzahlIdentifier.repoType(), RTCanadianPaymentsARNIdentifier.repoType(),
					RTSwissSICIdentifier.repoType(), RTGermanBankleitzahlIdentifier.repoType(),
					RTSpanishDomesticInterbankingIdentifier.repoType(), RTSouthAfricanNCCIdentifier.repoType(),
					RTHongKongBankIdentifier.repoType(), RTCashClearingSystemCode.repoType(),
					RTExternalClearingSystemIdentification1Code.repoType(),
					RTExternalFinancialInstitutionIdentification1Code.repoType(), RTMax34Text.repoType(),
					RTExternalAccountIdentification1Code.repoType(), RTExternalCashAccountType1Code.repoType(),
					RTBICNonFIIdentifier.repoType(), RTEANGLNIdentifier.repoType(), RTDunsIdentifier.repoType(),
					RTExternalOrganisationIdentification1Code.repoType(),
					RTExternalPersonIdentification1Code.repoType(), RTTrueFalseIndicator.repoType(),
					RTPriorityCode.repoType(), RTMICIdentifier.repoType(), RTTypeOfIdentificationCode.repoType(),
					RTCopyDuplicateCode.repoType(), RTPartyTypeCode.repoType(), RTMax128Text.repoType(),
					RTDocumentTypeCode.repoType(), RTServiceLevelCode.repoType(), RTClearingChannelCode.repoType(),
					RTExternalCode.repoType(), RTPaymentCategoryPurposeCode.repoType(), RTAuthorisation1Code.repoType(),
					RTExternalServiceLevel1Code.repoType(), RTExternalLocalInstrument1Code.repoType(),
					RTExternalCategoryPurpose1Code.repoType(), RTSequenceTypeCode.repoType(),
					RTFrequency6Code.repoType(), RTSequenceType2Code.repoType(), RTLEIIdentifier.repoType(),
					RTAuthenticationMethodCode.repoType(), RTAuthenticationEntityCode.repoType(),
					RTMax140Binary.repoType(), RTMax35NumericText.repoType(), RTPINFormatCode.repoType(),
					RTSWIFTServiceLevelCode.repoType(), RTIndianFinancialSystemCodeIdentifier.repoType(),
					RTHellenicBankIdentificationCodeIdentifier.repoType(),
					RTPolishNationalClearingCodeIdentifier.repoType(), RTDataSetTypeCode.repoType(),
					RTAccountLevelCode.repoType(), RTDocumentType6Code.repoType(),
					RTExternalMandateSetupReason1Code.repoType(), RTCivilStatusCode.repoType(),
					RTExact2NumericText.repoType(), RTFrequency10Code.repoType(),
					RTMandateClassification1Code.repoType(), RTMandateClassificationCode.repoType(),
					RTExternalAuthenticationChannel1Code.repoType(), RTAuthenticationResultCode.repoType());
		}
	};
	/**
	 * An instance of BusinessProcessCatalogue.
	 */
	public final MMBusinessProcessCatalogue catalogue = new MMBusinessProcessCatalogue() {
		{
			super.repository_lazy = () -> GeneratedRepository.repoType();
			super.topLevelCatalogueEntry = Arrays.asList(RTPaymentsInitiationLatestVersion.repoType());
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