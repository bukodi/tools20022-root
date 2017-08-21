package com.tools20022.metamodel;
/**
 * characteristic from the MessageTransport, indicating whether a receiving
 * MessagingEndpoint blocks the sending and receipt of other TransportMessages
 * until it sends a response to this TransportMessage
 */
public enum MMReceiverAsynchronicity {
	/**
	 * ENDPOINT_SYNCHRONOUS
	 */
	ENDPOINT_SYNCHRONOUS, /**
	 * The receiving MessagingEndpoint blocks the sending
	 * and receipt of other TransportMessages within the conversation, in which
	 * the TransportMessage was sent, while waiting for a response to this sent
	 * TransportMessage
	 */
	CONVERSATION_SYNCHRONOUS, /**
	 * The receiving MessagingEndpoint must not block
	 * the receipt or processing of other TransportMessages while processing the
	 * current TransportMessage
	 */
	ASYNCHRONOUS
}