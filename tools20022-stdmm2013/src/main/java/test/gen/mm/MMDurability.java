package test.gen.mm;
/**
 * characteristic from the MessageTransport, indicating whether the
 * MessageTransportSystem safely retains a TransportMessage until it has been
 * received by the destination MessagingEndpoint
 */
public enum MMDurability {
	/**
	 * the TransportMessage is kept available indefinitely until the message is
	 * delivered to the destination MessagingEndpoint. The TransportMessage is
	 * only kept available if it is ready for delivery within the
	 * BoundedCommunicationDelay; otherwise it expires like every other
	 * non-durable message
	 */
	DURABLE, /**
	 * the TransportMessage is kept available until it is delivered to
	 * the receiving MessagingEndpoint or until it is expired because the
	 * BoundedCommunicationDelay is exceeded
	 */
	PERSISTENT, /**
	 * the TransportMessage is not kept available and will not be
	 * delivered if the receiving MessagingEndpoint is not available
	 */
	TRANSIENT
}