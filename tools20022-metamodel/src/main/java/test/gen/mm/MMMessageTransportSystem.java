package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessagingEndpoint;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Containment;
import java.util.Optional;

/**
 * mechanism that receives Transport Messages from the sending
 * MessagingEndpoint, transports them, and delivers them to the receiving
 * MessagingEndpoint
 */
public class MMMessageTransportSystem implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private List<MMMessagingEndpoint> endpoint;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	public static interface Members extends MMModelEntity.Members {
		/**
		 * a MessagingEndpoint owned by a single MessageTransportSystem
		 */
		MetamodelAttribute<MMMessageTransportSystem, List<MMMessagingEndpoint>> endpoint = newAttribute();
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageTransportSystem> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageTransportSystem> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageTransportSystem.class);
	}

	/**
	 * a MessagingEndpoint owned by a single MessageTransportSystem
	 * 
	 * @see MMMessagingEndpoint#getTransportSystem()
	 */
	@Opposite(bean = MMMessagingEndpoint.class, attribute = "transportSystem")
	@Containment
	public List<MMMessagingEndpoint> getEndpoint() {
		return endpoint;
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