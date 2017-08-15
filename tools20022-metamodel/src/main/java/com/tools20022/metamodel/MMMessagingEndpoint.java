package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMMessageTransportSystem;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import com.tools20022.metamodel.MMTransportMessage;
import java.util.List;
import com.tools20022.metamodel.MMAddress;
import java.util.Optional;

/**
 * addressable node on the MessageTransportSystem which is capable of sending
 * and receiving TransportMessages
 */
public class MMMessagingEndpoint implements MMModelEntity {

	private GeneratedMetamodelBean container;
	protected MMMessageTransportSystem transportSystem;
	protected List<MMTransportMessage> receivedMessage;
	protected List<MMTransportMessage> sentMessage;
	protected List<MMAddress> location;
	protected List<MMModelEntity> nextVersions;
	protected Optional<MMModelEntity> previousVersion;
	protected Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
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
		return transportSystem;
	}

	/**
	 * the TransportMessage that is received by the receiving MessagingEndpoint
	 * 
	 * @see MMTransportMessage#getReceiver()
	 */
	@Opposite(bean = MMTransportMessage.class, attribute = "receiver")
	public List<MMTransportMessage> getReceivedMessage() {
		return receivedMessage;
	}

	/**
	 * the TransportMessage that is sent by the sending MessagingEndpoint
	 * 
	 * @see MMTransportMessage#getSender()
	 */
	@Opposite(bean = MMTransportMessage.class, attribute = "sender")
	public List<MMTransportMessage> getSentMessage() {
		return sentMessage;
	}

	/**
	 * an Address used to identify the MessagingEndpoint
	 * 
	 * @see MMAddress#getEndpoint()
	 */
	@Opposite(bean = MMAddress.class, attribute = "endpoint")
	public List<MMAddress> getLocation() {
		return location;
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion;
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier;
	}
}