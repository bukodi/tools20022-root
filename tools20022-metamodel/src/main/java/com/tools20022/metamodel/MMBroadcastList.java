package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMAddress;
import java.util.List;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;

/**
 * set of references to MessagingEndpoints (identified by their Address), that
 * is used for message broadcasting
 */
public class MMBroadcastList implements MMModelEntity {

	private GeneratedMetamodelBean container;
	protected List<MMAddress> address;
	protected List<MMModelEntity> nextVersions;
	protected MMModelEntity previousVersion;
	protected String objectIdentifier;

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
		return address == null ? Collections.emptyList() : address;
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