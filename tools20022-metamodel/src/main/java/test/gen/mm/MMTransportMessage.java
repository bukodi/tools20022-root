package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessagingEndpoint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageInstance;
import java.util.List;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;

/**
 * document that is an instance of the MessageTransportSystem message schema
 */
public class MMTransportMessage implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private MMMessagingEndpoint sender;
	private MMMessageInstance messageInstance;
	private List<MMMessagingEndpoint> receiver;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	public static interface Members extends MMModelEntity.Members {
		/**
		 * the sending MessagingEndpoint of a TransportMessage
		 */
		MetamodelAttribute<MMTransportMessage, MMMessagingEndpoint> sender = newAttribute();
		/**
		 * the MessageInstance that is part of the TransportMessage
		 */
		MetamodelAttribute<MMTransportMessage, MMMessageInstance> messageInstance = newAttribute();
		/**
		 * the receiving MessagingEndpoint in a TransportMessage
		 */
		MetamodelAttribute<MMTransportMessage, List<MMMessagingEndpoint>> receiver = newAttribute();
		/**
		 * The sender and receiver of a TransportMessage must use the same
		 * MessageTransportSystem receiver->asBag().transportSystem =
		 * sender.transportSystem->asBag()
		 */
		MetamodelConstraint<MMTransportMessage> checksameMessageTransportSystem = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
	}

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
		return receiver;
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