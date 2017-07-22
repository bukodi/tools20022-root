package test.gen.mm;
/**
 * characteristic from the MessageTransport, indicating the level of validation
 * that is required by the MessageTransportSystem
 */
public enum MMMessageValidationLevel {
	/**
	 * the MessageInstance is not validated
	 */
	NO_VALIDATION, /**
	 * the MessageInstance has its syntax validated.
	 */
	SYNTAX_VALID, /**
	 * the MessageInstance is Syntax Valid plus validated against
	 * the Syntax Message Scheme.
	 */
	SCHEMA_VALID, /**
	 * the MessageInstance is Schema Valid plus validated against
	 * the MessageRules
	 */
	MESSAGE_VALID, /**
	 * the MessageInstance is Message Valid plus validated
	 * against the BusinessRules
	 */
	RULE_VALID, /**
	 * the MessageInstance is Message Valid plus validated against
	 * the Market Practices
	 */
	MARKET_PRACTICE_VALID, /**
	 * the MessageInstance is Message Valid plus
	 * validated against the MessageChoreography
	 */
	BUSINESS_PROCESS_VALID, /**
	 * the MessageInstance is Message Valid plus
	 * validated against all Rules and MarketPractices
	 */
	COMPLETELY_VALID
}