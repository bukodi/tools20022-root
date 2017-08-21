package com.tools20022.metamodel;

import com.tools20022.core.metamodel.OrphanMetamodelType;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMSyntaxMessageScheme;
import java.util.function.Supplier;
import com.tools20022.metamodel.MMTransportMessage;
import java.util.List;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;

/**
 * instance of MessageDefinition, containing a set of structured information
 * exchanged between BusinessRoles, in the scope of a BusinessTransaction
 */
public class MMMessageInstance implements OrphanMetamodelType, MMModelEntity {

	protected Supplier<MMSyntaxMessageScheme> specification_lazy;
	protected Supplier<List<MMTransportMessage>> transportMessage_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return null;
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
		return specification_lazy.get();
	}

	/**
	 * the TransportMessage that contains the MessageInstance
	 * 
	 * @see MMTransportMessage#getMessageInstance()
	 */
	@Opposite(bean = MMTransportMessage.class, attribute = "messageInstance")
	public List<MMTransportMessage> getTransportMessage() {
		return transportMessage_lazy == null
				? Collections.emptyList()
				: transportMessage_lazy.get();
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