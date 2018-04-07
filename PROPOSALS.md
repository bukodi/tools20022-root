# eCore metamodel proposals:
- SemanticMarkup.name is optional in ECore, but always has a value
- Only the Xor EClass has more than one container. It should split
- The order of SemanticMarkupElements not consistent. Sometimes [context,value] and sometimes [name,context]
- The context names in  SemanticMarkup with type=Synonym are inconsistent: "ISO 15022", "ISO15022", "ISO", "15022", "ISO15002"  
- There are many SemanticMarkup with type=Synonym, but hasn't any element

Ambiguous names:
area.pain.PaymentCancellationRequestV01 area.pacs.PaymentCancellationRequestV01
area.pain.PaymentStatusReportV02 area.pacs.PaymentStatusReportV02

Not exists in eRepository: 
MessageDefinition with id=fxtr.031.001.01
MessageDefinition with id=fxtr.032.001.01
MessageDefinition with id=fxtr.033.001.01
MessageDefinition with id=fxtr.034.001.01
MessageDefinition with id=fxtr.035.001.01
MessageDefinition with id=fxtr.036.001.01
MessageDefinition with id=fxtr.037.001.01
MessageDefinition with id=fxtr.038.001.01

*** Hasn't codeName ***
--- Find MMCode in primary CodeSet without codeName, or derived codeset with codeName --- 
Codename exists in a derived codeset: ProrationType1Code.NotDecided [PRND] overrides [PRND]
Codename exists in a derived codeset: ProrationType1Code.NotUsed [PRNU] overrides [PRNU]
Codename exists in a derived codeset: SecuritiesQuantity1Code.No [SQNO] overrides [SQNO]
Codename exists in a derived codeset: SecuritiesQuantity1Code.Unknown [UKWN] overrides [UKWN]
Codename exists in a derived codeset: SecuritiesQuantity1Code.Yes [SQYS] overrides [SQYS]
Codename exists in a derived codeset: SecuritiesQuantity2Code.Unknown [UKWN] overrides [UKWN]
No codeName in a base codeset:CategoryPurpose1Code.IntraCompanyPayment
No codeName in a base codeset:CategoryPurpose1Code.TradeSettlementPayment
Codename exists in a derived codeset: AgreementItemAction1Code.Deactivate [DEAC] overrides [DEAC]
Codename exists in a derived codeset: AgreementItemAction1Code.Hold [HOLD] overrides [HOLD]
Codename exists in a derived codeset: AgreementItemAction1Code.Modify [MDFY] overrides [MDFY]
Codename exists in a derived codeset: AgreementItemAction1Code.Reactivate [REAC] overrides [REAC]
Codename exists in a derived codeset: AgreementItemAction1Code.Register [OPEN] overrides [OPEN]
Codename exists in a derived codeset: AgreementItemAction1Code.Synchronize [SYNC] overrides [SYNC]
Codename exists in a derived codeset: AgreementItemAction1Code.Verify [VRFY] overrides [VRFY]

*** Should use external codeset ***
R8 constraint on EarlyPaymentsVAT1.DiscountTaxType(Max4Text)
  ( def:Value according to external codelist.)
R7 constraint on SettlementSubTotalCalculatedTax2.ExemptionReasonCode(Max4Text)
  ( def:Value according to external codelist.)
R6 constraint on TradeSettlement2.ExemptionReasonCode(Max4Text)
  ( def:Value according to external codelist.)

*** Constraint hasn't sense ***
R3 constraint on GroupHeader69.ReportCategory(ExternalDocumentType1Code)
  ( def:Value according to external codelist.)
R4 constraint on GroupHeader69.TaxReportPurpose(ExternalDocumentType1Code)
  ( def:Value according to external codelist.)
R5 constraint on GroupHeader69.LanguageCode(LanguageCode)
  ( def:according to ISO 639-1.)
MultiplierRule constraint on DerivativeInstrument5.PriceMultiplier(NonNegativeDecimalNumber)
  ( def:Price Multiplier must not be zero.)
MultiplierRule constraint on DerivativeInstrument6.PriceMultiplier(NonNegativeDecimalNumber)
  ( def:Price Multiplier must not be zero.)
  
*** Test MsgDef names ***
Error at ForeignExchangeTradeBulkStatusNotificationV02 (fxtr.030.001.02) : java.lang.NullPointerException
Error at ForeignExchangeTradeInstructionAmendmentV02 (fxtr.015.001.02) : java.lang.NullPointerException
Error at ForeignExchangeTradeInstructionCancellationV02 (fxtr.016.001.02) : java.lang.NullPointerException
Error at ForeignExchangeTradeInstructionV02 (fxtr.014.001.02) : java.lang.NullPointerException
Error at ForeignExchangeTradeStatusAndDetailsNotificationV02 (fxtr.017.001.02) : java.lang.NullPointerException
Error at ForeignExchangeTradeStatusNotificationV04 (fxtr.008.001.04) : java.lang.NullPointerException
Error at FinancialInstrumentReportingStatusAdviceV01 (auth.031.001.01) : java.lang.NullPointerException
Error at DerivativesTradeReportV01 (auth.030.001.01) : java.lang.NullPointerException
Error at DerivativesTradeReportQueryV01 (auth.029.001.01) : java.lang.NullPointerException
---- Test MsgDef names: wrong area code ----
seev-SecuritiesTransactionPendingReport002V08: semt.018.002.08  REGISTERED
seev-IntraPositionMovementConfirmation002V06: semt.015.002.06  REGISTERED
seev-IntraPositionMovementPostingReport002V06: semt.016.002.06  REGISTERED
seev-SecuritiesSettlementTransactionAllegementReport002V06: semt.019.002.06  REGISTERED
seev-SecuritiesTransactionPostingReport002V07: semt.017.002.07  REGISTERED
---- Test MsgDef names: duplicated name ----
PaymentStatusReportV02
pain: pain.002.001.02  REGISTERED
pacs: pacs.002.001.02  REGISTERED

FinancialInstrumentReportingStatusAdviceV01
auth: auth.031.001.01  REGISTERED
null: auth.031.001.01  PROVISIONALLY_REGISTERED

PaymentCancellationRequestV01
pain: pain.006.001.01  REGISTERED
pacs: pacs.006.001.01  REGISTERED

StatusReportV03
tsmt: tsmt.037.001.03  REGISTERED
catm: catm.001.001.03  REGISTERED

RequestToModifyPaymentV03
camt: camt.007.002.03  REGISTERED
camt: camt.087.001.03  REGISTERED

---- Test MsgDef names: duplicated id ----
auth.031.001.01
auth: FinancialInstrumentReportingStatusAdviceV01  REGISTERED
null: FinancialInstrumentReportingStatusAdviceV01  PROVISIONALLY_REGISTERED  
