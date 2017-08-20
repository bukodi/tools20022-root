package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMMessagingEndpoint;
import java.util.function.Supplier;
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
	protected Supplier<MMMessagingEndpoint> sender_lazy;
	protected Supplier<MMMessageInstance> messageInstance_lazy;
	protected Supplier<List<MMMessagingEndpoint>> receiver_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
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
		return sender_lazy.get();
	}

	/**
	 * the MessageInstance that is part of the TransportMessage
	 * 
	 * @see MMMessageInstance#getTransportMessage()
	 */
	@Opposite(bean = MMMessageInstance.class, attribute = "transportMessage")
	public MMMessageInstance getMessageInstance() {
		return messageInstance_lazy.get();
	}

	/**
	 * the receiving MessagingEndpoint in a TransportMessage
	 * 
	 * @see MMMessagingEndpoint#getReceivedMessage()
	 */
	@Opposite(bean = MMMessagingEndpoint.class, attribute = "receivedMessage")
	public List<MMMessagingEndpoint> getReceiver() {
		return receiver_lazy == null ? Collections.emptyList() : receiver_lazy
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