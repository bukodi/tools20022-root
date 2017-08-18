package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMMessagingEndpoint;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMMessageInstance;
import java.util.List;
import java.util.Collections;
import java.util.Optional;

/**
 * document that is an instance of the MessageTransportSystem message schema
 */
public class MMTransportMessage implements MMModelEntity {

	private GeneratedMetamodelBean container;
	protected MMMessagingEndpoint sender;
	protected MMMessageInstance messageInstance;
	protected List<MMMessagingEndpoint> receiver;
	protected List<MMModelEntity> nextVersions;
	protected MMModelEntity previousVersion;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMTransportMessage> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMTransportMessage> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMTransportMessage.class);
	}

	/**
	 * the sending MessagingEndpoint of a TransportMessage
	 * 
	 * @see MMMessagingEndpoint#getSentMessage()
	 */
	@Opposite(bean = MMMessagingEndpoint.class, attribute = "sentMessage")
	public MMMessagingEndpoint getSender() {
		return sender;
	}

	/**
	 * the MessageInstance that is part of the TransportMessage
	 * 
	 * @see MMMessageInstance#getTransportMessage()
	 */
	@Opposite(bean = MMMessageInstance.class, attribute = "transportMessage")
	public MMMessageInstance getMessageInstance() {
		return messageInstance;
	}

	/**
	 * the receiving MessagingEndpoint in a TransportMessage
	 * 
	 * @see MMMessagingEndpoint#getReceivedMessage()
	 */
	@Opposite(bean = MMMessagingEndpoint.class, attribute = "receivedMessage")
	public List<MMMessagingEndpoint> getReceiver() {
		return receiver == null ? Collections.emptyList() : receiver;
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions == null ? Collections.emptyList() : nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return Optional.ofNullable(previousVersion);
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return Optional.ofNullable(objectIdentifier);
	}
}