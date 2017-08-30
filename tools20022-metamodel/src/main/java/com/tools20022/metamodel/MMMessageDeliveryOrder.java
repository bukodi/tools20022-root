package com.tools20022.metamodel;
/**
 * characteristic from the MessageTransport, indicating to what extent TransportMessages from a sending MessagingEndpoint arrive in the order in which they were sent at the receiving MessagingEndpoints
 */
public enum MMMessageDeliveryOrder {
	/**
 * the receipt order of TransportMessages at all receivers is preserved across all sending MessagingEndpoints
 */EXPECTED_CAUSAL_ORDER, /**
 * at every receiver, the order of receipt of TransportMessages is preserved for each sending MessagingEndpoint but not across sending MessagingEndpoints
 */FIFO_ORDERED, /**
 * TransportMessages may arrive in any order at the receiving MessagingEndpoints. The only limitation is the Bounded Communication Delay
 */UNORDERED }