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
