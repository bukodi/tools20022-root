package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageTransportSystem;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMTransportMessage;
import java.util.List;
import test.gen.mm.MMAddress;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import java.util.Optional;

/**
 * addressable node on the MessageTransportSystem which is capable of sending
 * and receiving TransportMessages
 */
public class MMMessagingEndpoint implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private MMMessageTransportSystem transportSystem;
	private List<MMTransportMessage> receivedMessage;
	private List<MMTransportMessage> sentMessage;
	private List<MMAddress> location;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	public static interface Members extends MMModelEntity.Members {
		/**
		 * the MessageTransportSystem that owns and uses this MessagingEndpoint
		 */
		MetamodelAttribute<MMMessagingEndpoint, MMMessageTransportSystem> transportSystem = newAttribute();
		/**
		 * the TransportMessage that is received by the receiving
		 * MessagingEndpoint
		 */
		MetamodelAttribute<MMMessagingEndpoint, List<MMTransportMessage>> receivedMessage = newAttribute();
		/**
		 * the TransportMessage that is sent by the sending MessagingEndpoint
		 */
		MetamodelAttribute<MMMessagingEndpoint, List<MMTransportMessage>> sentMessage = newAttribute();
		/**
		 * an Address used to identify the MessagingEndpoint
		 */
		MetamodelAttribute<MMMessagingEndpoint, List<MMAddress>> location = newAttribute();
	}

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