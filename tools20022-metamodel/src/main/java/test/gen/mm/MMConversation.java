package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import java.util.List;
import java.util.Optional;

/**
 * exchange of one or more MessageInstances amongst MessagingEndpoints
 */
public class MMConversation implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	public static interface Members extends MMModelEntity.Members {
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMConversation> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMConversation> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMConversation.class);
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