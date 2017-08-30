package com.tools20022.metamodel;
/**
 * characteristic from the MessageTransport, specifying whether the MessageTransportSystem validates the MessageInstance with respect to SyntaxMessageScheme, Rules, the MarketPractices, and the MessageChoreography
 */
public enum MMMessageValidationOnOff {
	/**
 * all MessageInstances are validated by the MessageTransportSystem
 */VALIDATION_ON, /**
 * MessageInstances are not validated by the MessageTransportSystem
 */VALIDATION_OFF }