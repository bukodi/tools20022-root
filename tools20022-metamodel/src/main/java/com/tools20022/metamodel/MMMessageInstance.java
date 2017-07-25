package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMSyntaxMessageScheme;
import com.tools20022.metamodel.MMTransportMessage;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;

/**
 * instance of MessageDefinition, containing a set of structured information
 * exchanged between BusinessRoles, in the scope of a BusinessTransaction
 */
public class MMMessageInstance implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private MMSyntaxMessageScheme specification;
	private List<MMTransportMessage> transportMessage;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageInstance> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageInstance> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageInstance.class);
	}

	/**
	 * the SyntaxScheme instantiated by this MessageInstance
	 */
	public MMSyntaxMessageScheme getSpecification() {
		return specification;
	}

	/**
	 * the TransportMessage that contains the MessageInstance
	 * 
	 * @see MMTransportMessage#getMessageInstance()
	 */
	@Opposite(bean = MMTransportMessage.class, attribute = "messageInstance")
	public List<MMTransportMessage> getTransportMessage() {
		return transportMessage;
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