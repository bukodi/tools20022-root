package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PaymentPartyRole;

/**
 * Party initiating the payment to an agent. In the payment context, this can
 * either be the debtor (in a credit transfer), the creditor (in a direct
 * debit), or a party that initiates the payment on behalf of the debtor or
 * creditor. In the context of treasury, the party that instructs the trading
 * party to execute a treasury deal on its behalf.
 */
public class InitiatingPartyRole extends PaymentPartyRole {
}