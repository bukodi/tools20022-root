package com.tools20022.metamodel;
/**
 * characteristic from the MessageTransport, indicating whether a sending
 * Messaging Endpoint blocks after sending a TransportMessage to the
 * MessageTransportSystem while waiting for a response from a MessagingEndpoint
 */
public enum MMSenderAsynchronicity {
	/**
	 * The sending MessagingEndpoint blocks the sending and receipt of other
	 * TransportMessages while waiting for a response to the sent
	 * TransportMessage.
	 */
	ENDPOINT_SYNCHRONOUS, /**
	 * The sending MessagingEndpoint blocks the sending
	 * and receipt of other TransportMessages within the conversation, in which
	 * the TransportMessage was sent, while waiting for a response to this sent
	 * TransportMessage.
	 */
	CONVERSATION_SYNCHRONOUS, /**
	 * The sending MessagingEndpoint shall not block
	 * the sending or receipt of other TransportMessages while waiting for a
	 * response to the sent TransportMessage.
	 */
	ASYNCHRONOUS
}