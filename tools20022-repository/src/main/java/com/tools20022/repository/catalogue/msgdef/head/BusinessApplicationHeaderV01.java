package com.tools20022.repository.catalogue.msgdef.head;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.codeset.UnicodeChartsCode;
import java.util.Optional;
import com.tools20022.repository.dict.choice.Party9Choice;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISONormalisedDateTime;
import com.tools20022.repository.dict.codeset.CopyDuplicate1Code;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.BusinessMessagePriorityCode;
import com.tools20022.repository.dict.other.SignatureEnvelope;
import com.tools20022.repository.dict.msg.BusinessApplicationHeader1;

/**
 * The Business Layer deals with Business Messages. The behaviour of the
 * Business Messages is fully described by the Business Transaction and the
 * structure of the Business Messages is fully described by the Message
 * Definitions and related Message Rules, Rules and Market Practices. All of
 * which are registered in the ISO 20022 Repository. A single new Business
 * Message (with its accompagnying business application header) is created - by
 * the sending MessagingEndpoint - for each business event; that is each
 * interaction in a Business Transaction. A Business Message adheres to the
 * following principles: " A Business Message (and its business application
 * header) must not contain information about the Message Transport System or
 * the mechanics or mechanism of message sending, transportation, or receipt. "
 * A Business Message must be comprehensible outside of the context of the
 * Transport Message. That is the Business Message must not require knowledge of
 * the Transport Message to be understood. " A Business Message may contain
 * headers, footers, and envelopes that are meaningful for the business. When
 * present, they are treated as any other message content, which means that they
 * are considered part of the Message Definition of the Business Message and as
 * such will be part of the ISO 20022 Repository. " A Business Message refers to
 * Business Actors by their Name. Each instance of a Business Actor has one
 * Name. The Business Actor must not be referred to in the Transport Layer.
 * Specific usage of this BusinessMessageHeader may be defined by the relevant
 * SEG.
 */
public class BusinessApplicationHeaderV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<UnicodeChartsCode> CharacterSet;
	private Party9Choice From;
	private Party9Choice To;
	private Max35Text BusinessMessageIdentifier;
	private Max35Text MessageDefinitionIdentifier;
	private Optional<Max35Text> BusinessService;
	private ISONormalisedDateTime CreationDate;
	private Optional<CopyDuplicate1Code> CopyDuplicate;
	private Optional<YesNoIndicator> PossibleDuplicate;
	private Optional<BusinessMessagePriorityCode> Priority;
	private Optional<SignatureEnvelope> Signature;
	private Optional<BusinessApplicationHeader1> Related;

	public Optional<UnicodeChartsCode> getCharacterSet() {
		return CharacterSet;
	}

	public void setCharacterSet(Optional<UnicodeChartsCode> CharacterSet) {
		this.CharacterSet = CharacterSet;
	}

	public Party9Choice getFrom() {
		return From;
	}

	public void setFrom(Party9Choice From) {
		this.From = From;
	}

	public Party9Choice getTo() {
		return To;
	}

	public void setTo(Party9Choice To) {
		this.To = To;
	}

	public Max35Text getBusinessMessageIdentifier() {
		return BusinessMessageIdentifier;
	}

	public void setBusinessMessageIdentifier(Max35Text BusinessMessageIdentifier) {
		this.BusinessMessageIdentifier = BusinessMessageIdentifier;
	}

	public Max35Text getMessageDefinitionIdentifier() {
		return MessageDefinitionIdentifier;
	}

	public void setMessageDefinitionIdentifier(
			Max35Text MessageDefinitionIdentifier) {
		this.MessageDefinitionIdentifier = MessageDefinitionIdentifier;
	}

	public Optional<Max35Text> getBusinessService() {
		return BusinessService;
	}

	public void setBusinessService(Optional<Max35Text> BusinessService) {
		this.BusinessService = BusinessService;
	}

	public ISONormalisedDateTime getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(ISONormalisedDateTime CreationDate) {
		this.CreationDate = CreationDate;
	}

	public Optional<CopyDuplicate1Code> getCopyDuplicate() {
		return CopyDuplicate;
	}

	public void setCopyDuplicate(Optional<CopyDuplicate1Code> CopyDuplicate) {
		this.CopyDuplicate = CopyDuplicate;
	}

	public Optional<YesNoIndicator> getPossibleDuplicate() {
		return PossibleDuplicate;
	}

	public void setPossibleDuplicate(Optional<YesNoIndicator> PossibleDuplicate) {
		this.PossibleDuplicate = PossibleDuplicate;
	}

	public Optional<BusinessMessagePriorityCode> getPriority() {
		return Priority;
	}

	public void setPriority(Optional<BusinessMessagePriorityCode> Priority) {
		this.Priority = Priority;
	}

	public Optional<SignatureEnvelope> getSignature() {
		return Signature;
	}

	public void setSignature(Optional<SignatureEnvelope> Signature) {
		this.Signature = Signature;
	}

	public Optional<BusinessApplicationHeader1> getRelated() {
		return Related;
	}

	public void setRelated(Optional<BusinessApplicationHeader1> Related) {
		this.Related = Related;
	}
}