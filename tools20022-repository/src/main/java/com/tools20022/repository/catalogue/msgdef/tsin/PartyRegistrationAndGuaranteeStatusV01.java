package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.repository.dict.msg.BusinessLetter1;
import com.tools20022.repository.dict.msg.FinancingAgreementList1;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.msg.EncapsulatedBusinessMessage1;

/**
 * The message PartyRegistrationAndGuaranteeStatus is either sent by a factoring
 * service to a financing client to indicate the status of a factoring service
 * agreement or from a guarantee issuer to a factoring client or a factoring
 * service to indicate the guarantee covering a requested factoring service
 * agreement. The message can also be sent to an interested party. The factoring
 * service or guarantee issuer may include references to a corresponding
 * PartyRegistrationAndGuaranteeRequest message or other related messages and
 * may include referenced data. The message contains information about other
 * parties to be notified about the financial service agreement or the guarantee
 * and whether these parties are required to acknowledge the agreement. The
 * message contains information returned by the financial institution indicating
 * acceptance or rejection of the trade partner; a positive response is
 * necessary before being able to assign financial items concerning the trade
 * party. This message contains identifications of cash accounts to enable payer
 * and payee to treat the transferred payment obligations. The message can carry
 * digital signatures if required by context.
 */
public class PartyRegistrationAndGuaranteeStatusV01 {

	private BusinessLetter1 Header;
	private FinancingAgreementList1 AgreementList;
	private Optional<Max15NumericText> AgreementCount;
	private Optional<Max15NumericText> ItemCount;
	private Optional<DecimalNumber> ControlSum;
	private Optional<EncapsulatedBusinessMessage1> AttachedMessage;

	public BusinessLetter1 getHeader() {
		return Header;
	}

	public void setHeader(BusinessLetter1 Header) {
		this.Header = Header;
	}

	public FinancingAgreementList1 getAgreementList() {
		return AgreementList;
	}

	public void setAgreementList(FinancingAgreementList1 AgreementList) {
		this.AgreementList = AgreementList;
	}

	public Optional<Max15NumericText> getAgreementCount() {
		return AgreementCount;
	}

	public void setAgreementCount(Optional<Max15NumericText> AgreementCount) {
		this.AgreementCount = AgreementCount;
	}

	public Optional<Max15NumericText> getItemCount() {
		return ItemCount;
	}

	public void setItemCount(Optional<Max15NumericText> ItemCount) {
		this.ItemCount = ItemCount;
	}

	public Optional<DecimalNumber> getControlSum() {
		return ControlSum;
	}

	public void setControlSum(Optional<DecimalNumber> ControlSum) {
		this.ControlSum = ControlSum;
	}

	public Optional<EncapsulatedBusinessMessage1> getAttachedMessage() {
		return AttachedMessage;
	}

	public void setAttachedMessage(
			Optional<EncapsulatedBusinessMessage1> AttachedMessage) {
		this.AttachedMessage = AttachedMessage;
	}
}