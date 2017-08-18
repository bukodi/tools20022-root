package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMBroadcastList;
import java.util.List;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMMessagingEndpoint;
import java.util.Optional;

/**
 * identification and efficient resolution to the location of a
 * MessagingEndpoint
 */
public class MMAddress implements MMModelEntity {

	private GeneratedMetamodelBean container;
	protected List<MMBroadcastList> broadCastList;
	protected MMMessagingEndpoint endpoint;
	protected List<MMModelEntity> nextVersions;
	protected MMModelEntity previousVersion;
	protected String objectIdentifier;

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
		return broadCastList == null ? Collections.emptyList() : broadCastList;
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