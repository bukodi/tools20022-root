package test.gen.mm;
/**
 * characteristic from the MessageTransport, specifying the behaviour of the
 * MessageTransportSystem as a result of MessageValidation
 */
public enum MMMessageValidationResults {
	/**
	 * invalid messages cause a rejection TransportMessage to be sent to the
	 * sending MessagingEndpoint, and the invalid MessageInstance is not
	 * delivered to any other MessagingEndpoint. Valid messages are delivered to
	 * their destinations and marked as valid in the TransportMessage
	 */
	REJECT, /**
	 * invalid messages must cause a rejection TransportMessage to be
	 * sent to the sending MessagingEndpoint, and the invalid MessageInstance is
	 * marked as invalid in the TransportMessage and delivered to its
	 * destination MessagingEndpoints. Valid messages are delivered to their
	 * destinations and marked as valid in the TransportMessage
	 */
	REJECT_AND_DELIVER, /**
	 * invalid messages do not cause a rejection
	 * TransportMessage to be sent to the sending MessagingEndpoint. The invalid
	 * MessageInstance is delivered to its destination MessagingEndpoints. Valid
	 * messages are delivered to their destinations and marked as valid in the
	 * TransportMessage
	 */
	DELIVER
}