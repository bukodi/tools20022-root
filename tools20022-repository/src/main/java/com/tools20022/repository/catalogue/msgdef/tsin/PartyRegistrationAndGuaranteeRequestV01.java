package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.repository.dict.msg.BusinessLetter1;
import com.tools20022.repository.dict.msg.FinancingAgreementList1;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.msg.EncapsulatedBusinessMessage1;

/**
 * The message PartyRegistrationAndGuaranteeRequest is sent by a factoring
 * client either to a financial service or a guarantee issuer. The message can
 * also be sent from a financial service to a guarantee issuer. Furthermore, the
 * message can be sent to an interested party for example a fiscal authority.
 * When the message is sent to a guarantee issuer, the factoring client or
 * financial service provider requests a guarantee for the factoring agreement
 * concerning the indicated trade party. When the message is sent to a financial
 * service, the financial client requests an agreement to execute assignments of
 * financial items. The financial client may request the guarantee amount to be
 * obtained in case of insolvency of the trade partner for a corresponding
 * account receivable directly from the financial service. Alternatively and
 * depending on the contractual and product definition, the financial client may
 * be required to include a copy of a guarantee status received from a guarantee
 * issuer. The message can carry digital signatures if required by context.
 */
public class PartyRegistrationAndGuaranteeRequestV01 {

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