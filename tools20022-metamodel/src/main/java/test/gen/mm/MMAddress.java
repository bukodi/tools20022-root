package test.gen.mm;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMModelEntity;
import test.gen.mm.MMBroadcastList;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import test.gen.mm.MMMessagingEndpoint;
import java.util.Optional;

/**
 * identification and efficient resolution to the location of a
 * MessagingEndpoint
 */
public class MMAddress implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private List<MMBroadcastList> broadCastList;
	private MMMessagingEndpoint endpoint;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMAddress> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMAddress> metaType() {
		return StandardMetamodel2013.metamodel()
				.getTypeByClass(MMAddress.class);
	}

	/**
	 * a BroadCastList to which this Address belongs
	 * 
	 * @see MMBroadcastList#getAddress()
	 */
	@Opposite(bean = MMBroadcastList.class, attribute = "address")
	public List<MMBroadcastList> getBroadCastList() {
		return broadCastList;
	}

	/**
	 * specifies the MessagingEndpoint for the Address
	 * 
	 * @see MMMessagingEndpoint#getLocation()
	 */
	@Opposite(bean = MMMessagingEndpoint.class, attribute = "location")
	public MMMessagingEndpoint getEndpoint() {
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