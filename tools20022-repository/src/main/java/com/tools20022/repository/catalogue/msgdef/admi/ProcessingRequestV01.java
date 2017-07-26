package com.tools20022.repository.catalogue.msgdef.admi;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Exact4AlphaNumericText;
import java.util.Optional;
import com.tools20022.repository.dict.msg.RequestDetails19;

/**
 * The Processing Request message is sent by a participant to a central system
 * to request the initiation of a system process suported by a central system.
 */
public class ProcessingRequestV01 {

	private Max35Text MessageIdentification;
	private Optional<Exact4AlphaNumericText> SettlementSessionIdentifier;
	private RequestDetails19 Request;

	public Max35Text getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(Max35Text MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<Exact4AlphaNumericText> getSettlementSessionIdentifier() {
		return SettlementSessionIdentifier;
	}

	public void setSettlementSessionIdentifier(
			Optional<Exact4AlphaNumericText> SettlementSessionIdentifier) {
		this.SettlementSessionIdentifier = SettlementSessionIdentifier;
	}

	public RequestDetails19 getRequest() {
		return Request;
	}

	public void setRequest(RequestDetails19 Request) {
		this.Request = Request;
	}
}