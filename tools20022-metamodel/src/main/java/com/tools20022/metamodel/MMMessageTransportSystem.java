package com.tools20022.metamodel;

import com.tools20022.core.metamodel.OrphanMetamodelType;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMMessagingEndpoint;
import java.util.List;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Containment;
import java.util.function.Supplier;
import java.util.Optional;

/**
 * mechanism that receives Transport Messages from the sending
 * MessagingEndpoint, transports them, and delivers them to the receiving
 * MessagingEndpoint
 */
public class MMMessageTransportSystem
		implements
			OrphanMetamodelType,
			MMModelEntity {

	protected List<MMMessagingEndpoint> endpoint;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return null;
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
		return endpoint == null ? Collections.emptyList() : endpoint;
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