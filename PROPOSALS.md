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
