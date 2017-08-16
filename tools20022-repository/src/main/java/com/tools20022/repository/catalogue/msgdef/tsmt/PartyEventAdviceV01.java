package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.BusinessLetter1;
import com.tools20022.repository.dict.msg.EventDescription1;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import java.util.Optional;
import com.tools20022.repository.dict.msg.EncapsulatedBusinessMessage1;

/**
 * The PartyEventAdvice message can be sent by any party to any other party. It
 * is used for business letters containing information for which treatment is
 * not formally defined in order to keep partners informed and to maintain
 * business traces, for example confirmations of information exchanged out-of
 * band such as announcing a postal letter, confirming a telephone call or the
 * exchange of contractual information. It can also be sent to verify the
 * technical interoperability of the communicating IT-systems. The message can
 * reference other message and include data from referenced messages. The
 * message can report several events. The message can carry digital signatures
 * if required by context.
 */
public class PartyEventAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private BusinessLetter1 Header;
	private EventDescription1 EventNotice;
	private Optional<Max15NumericText> EventCount;
	private Optional<EncapsulatedBusinessMessage1> AttachedMessage;

	public BusinessLetter1 getHeader() {
		return Header;
	}

	public void setHeader(BusinessLetter1 Header) {
		this.Header = Header;
	}

	public EventDescription1 getEventNotice() {
		return EventNotice;
	}

	public void setEventNotice(EventDescription1 EventNotice) {
		this.EventNotice = EventNotice;
	}

	public Optional<Max15NumericText> getEventCount() {
		return EventCount;
	}

	public void setEventCount(Optional<Max15NumericText> EventCount) {
		this.EventCount = EventCount;
	}

	public Optional<EncapsulatedBusinessMessage1> getAttachedMessage() {
		return AttachedMessage;
	}

	public void setAttachedMessage(
			Optional<EncapsulatedBusinessMessage1> AttachedMessage) {
		this.AttachedMessage = AttachedMessage;
	}
}