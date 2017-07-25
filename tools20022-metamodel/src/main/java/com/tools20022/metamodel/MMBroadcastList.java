package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMAddress;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;

/**
 * set of references to MessagingEndpoints (identified by their Address), that
 * is used for message broadcasting
 */
public class MMBroadcastList implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private List<MMAddress> address;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMBroadcastList> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBroadcastList> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBroadcastList.class);
	}

	/**
	 * a BroadCastList entry using an Address
	 * 
	 * @see MMAddress#getBroadCastList()
	 */
	@Opposite(bean = MMAddress.class, attribute = "broadCastList")
	public List<MMAddress> getAddress() {
		return address;
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