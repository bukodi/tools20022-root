package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.SwitchOrderV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference8;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.SwitchOrder7;
import com.tools20022.repository.dict.msg.CopyInformation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The SwitchOrder message is sent by an instructing party, for example,
 * an investment manager or its authorised representative, to the executing
 * party, for example, a transfer agent, to instruct a switch transaction from a
 * financial instrument or multiple financial instruments to a different
 * specified financial instrument or instruments for a specified
 * amount/quantity. Usage The SwitchOrder message is used to either: - instruct
 * one switch transaction comprising one or more redemption legs and one or more
 * subscription legs, that is, a single switch transaction that can be a one to
 * one, many to one, many to many or one to many switch transaction, or, -
 * instruct one or many switch transactions each comprising one redemption leg
 * and one subscription leg, that is, multiple simple switch transactions. The
 * SwitchOrder message may be used to either: - instruct a switch transaction
 * for one investment account, or, - instruct a switch transaction for separate
 * accounts at the redemption and subscription leg levels. The message caters
 * for a switch from one financial instrument to another financial instrument
 * (within the same fund family), many to one, many to many and one to many. The
 * message caters for switch transactions that result in an additional cash
 * payment from the investor or a transaction that results in a net payment to
 * the investor. Not all institutions or funds permit this type of switch and
 * acceptance is therefore not automatic. There is no limitation on the number
 * of switch legs in a switch message. The number allowed is defined by the fund
 * prospectus or by the service level agreement (SLA) in place between the two
 * parties. However, if the SwitchOrderDetails sequence is present more than
 * once, then the RedemptionLegDetails and SubscriptionLegDetails sequences may
 * only be present once. If SwitchOrderDetails\InvestmentAccount is used, then
 * the InvestmentAccountDetails sequences in SubscriptionLegDetails and
 * RedemptionLegDetails are not allowed. This functionality is to be used by
 * institutions that set up two accounts per investor, rather than one
 * investment account. There is no switch driver type in the message to indicate
 * whether the switch is buy or sell driven. A driver is not needed since it is
 * possible to indicate the total subscription amount or the total redemption
 * amount. Only one of these two amounts should be used. The subscription
 * quantity can be expressed in one of the following ways: - Amount: the
 * monetary value (either GROSS or NET) of the financial instrument to be
 * subscribed to, for example, the subscription of EUR 1,000 of financial
 * instrument ISIN LU1234567890 or - Unit: the number of units of the financial
 * instrument to be subscribed to, for example, the subscription of 10 units of
 * financial instrument ISIN LU1234567890 or - Percentage of the total
 * redemption amount: when the switch transaction is redemption driven, it is
 * the part of the redemption amount that must be switched to a specific
 * financial instrument, for example, the subscription quantity of financial
 * instrument ISIN LU1234567890 represents 50% of the redemption amount of the
 * financial instrument ISIN LU4444444444. The redemption quantity can be
 * expressed in one of the following ways: - Amount: the monetary value (either
 * GROSS or NET) of the financial instrument to be redeemed, for example, the
 * redemption of EUR 1,000 of financial instrument ISIN LU1234567890, or - Unit:
 * the number of units of financial instrument to be redeemed, for example, the
 * redemption of 10 units of financial instrument ISIN LU1234567890, or - Rate:
 * the part of the portfolio to be redeemed, for example, the redemption of 10%
 * of the holdings in financial instrument ISIN LU1234567890, or - Percentage of
 * the total subscription amount: when the switch transaction is subscription
 * driven, it is the part of the subscription amount that must be the result of
 * the redemption of a specific financial instrument, for example, the
 * redemption quantity in financial instrument ABC represents 50% of the
 * subscription amount of the financial instrument ISIN LU4444444444
 */
@PreviousVersion(SwitchOrderV03.class)
public class SwitchOrderV04 implements GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference9> PoolReference;
	private Optional<AdditionalReference8> PreviousReference;
	private Optional<Pagination> MessagePagination;
	private SwitchOrder7 SwitchOrderDetails;
	private Optional<CopyInformation4> CopyDetails;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference9> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference9> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference8> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference8> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<Pagination> getMessagePagination() {
		return MessagePagination;
	}

	public void setMessagePagination(Optional<Pagination> MessagePagination) {
		this.MessagePagination = MessagePagination;
	}

	public SwitchOrder7 getSwitchOrderDetails() {
		return SwitchOrderDetails;
	}

	public void setSwitchOrderDetails(SwitchOrder7 SwitchOrderDetails) {
		this.SwitchOrderDetails = SwitchOrderDetails;
	}

	public Optional<CopyInformation4> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation4> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}