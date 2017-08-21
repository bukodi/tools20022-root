package com.tools20022.metamodel;

import com.tools20022.metamodel.MMMessageTransportSystem;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import java.util.function.Supplier;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import com.tools20022.metamodel.MMTransportMessage;
import java.util.List;
import java.util.Collections;
import com.tools20022.metamodel.MMAddress;
import java.util.Optional;

/**
 * addressable node on the MessageTransportSystem which is capable of sending
 * and receiving TransportMessages
 */
public class MMMessagingEndpoint implements MMModelEntity {

	protected Supplier<MMMessageTransportSystem> transportSystem_lazy;
	protected Supplier<List<MMTransportMessage>> receivedMessage_lazy;
	protected Supplier<List<MMTransportMessage>> sentMessage_lazy;
	protected Supplier<List<MMAddress>> location_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMMessageTransportSystem getContainer() {
		return getTransportSystem();
	}

	@Override
	public MetamodelType<? extends MMMessagingEndpoint> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessagingEndpoint> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessagingEndpoint.class);
	}

	/**
	 * the MessageTransportSystem that owns and uses this MessagingEndpoint
	 * 
	 * @see MMMessageTransportSystem#getEndpoint()
	 */
	@Opposite(bean = MMMessageTransportSystem.class, attribute = "endpoint")
	@Container
	public MMMessageTransportSystem getTransportSystem() {
		return transportSystem_lazy.get();
	}

	/**
	 * the TransportMessage that is received by the receiving MessagingEndpoint
	 * 
	 * @see MMTransportMessage#getReceiver()
	 */
	@Opposite(bean = MMTransportMessage.class, attribute = "receiver")
	public List<MMTransportMessage> getReceivedMessage() {
		return receivedMessage_lazy == null
				? Collections.emptyList()
				: receivedMessage_lazy.get();
	}

	/**
	 * the TransportMessage that is sent by the sending MessagingEndpoint
	 * 
	 * @see MMTransportMessage#getSender()
	 */
	@Opposite(bean = MMTransportMessage.class, attribute = "sender")
	public List<MMTransportMessage> getSentMessage() {
		return sentMessage_lazy == null
				? Collections.emptyList()
				: sentMessage_lazy.get();
	}

	/**
	 * an Address used to identify the MessagingEndpoint
	 * 
	 * @see MMAddress#getEndpoint()
	 */
	@Opposite(bean = MMAddress.class, attribute = "endpoint")
	public List<MMAddress> getLocation() {
		return location_lazy == null ? Collections.emptyList() : location_lazy
				.get();
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null
				? Collections.emptyList()
				: nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional
				.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional
				.of(objectIdentifier);
	}
}