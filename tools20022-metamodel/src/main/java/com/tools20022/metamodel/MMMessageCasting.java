package com.tools20022.metamodel;
/**
 * characteristic from the MessageTransport, indicating how receiving
 * MessagingEndpoints may be addressed in a TransportMessage
 */
public enum MMMessageCasting {
	/**
	 * TransportMessages are addressed to a single receiving MessagingEndpoint
	 */
	UNICAST, /**
	 * TransportMessages are addressed to nought to many receiving
	 * MessagingEndpoints
	 */
	MULTICAST, /**
	 * TransportMessages are addressed to a single Broadcast List
	 */
	BROADCAST, /**
	 * TransportMessages may be Multicast or Broadcast
	 */
	ANYCAST
}