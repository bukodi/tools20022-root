package com.tools20022.metamodel;
/**
 * characteristic from the MessageTransport, specifying the degree to which the
 * sending MessagingEndpoint is assured that a TransportMessage will be
 * delivered
 */
public enum MMDeliveryAssurance {
	/**
	 * the receiving Messaging Endpoint receives the TransportMessage at least
	 * once
	 */
	AT_LEAST_ONCE, /**
	 * the receiving Messaging Endpoint receives the
	 * TransportMessage exactly once
	 */
	EXACTLY_ONCE, /**
	 * the receiving MessagingEndpoint receives the
	 * TransportMessage at most once. There is no assurance a TransportMessage
	 * will be delivered
	 */
	AT_MOST_ONCE
}