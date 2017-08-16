package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;

/**
 * The ReturnTransaction message is sent by the transaction administrator to a
 * member of the system. It is used to provide information on transactions and
 * booked entries held at the transaction administrator. The Return Transaction
 * message can be sent as a response to a related GetTransaction message (pull
 * mode) or initiated by the transaction administrator (push mode). The push of
 * information can take place either at prearranged times or as a warning or
 * alarm when a problem has occurred.
 */
public class ReturnTransactionCopy1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}