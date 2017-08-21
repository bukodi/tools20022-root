package com.tools20022.metamodel;

import com.tools20022.core.metamodel.OrphanMetamodelType;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMMessageSet;
import java.util.List;
import java.util.function.Supplier;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMSyntax;
import java.util.Optional;

/**
 * A particular set of encoding rules for a MessageInstance.
 */
public class MMEncoding implements OrphanMetamodelType, MMModelEntity {

	protected Supplier<List<MMMessageSet>> messageSet_lazy;
	protected Supplier<MMSyntax> syntax_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return null;
	}

	@Override
	public MetamodelType<? extends MMEncoding> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMEncoding> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMEncoding.class);
	}

	/**
	 * The MessageSets for which this Encoding is a valid ISO 20022 encoding
	 * 
	 * @see MMMessageSet#getValidEncoding()
	 */
	@Opposite(bean = MMMessageSet.class, attribute = "validEncoding")
	public List<MMMessageSet> getMessageSet() {
		return messageSet_lazy == null
				? Collections.emptyList()
				: messageSet_lazy.get();
	}

	/**
	 * The source syntax on which an encoding applies
	 * 
	 * @see MMSyntax#getPossibleEncodings()
	 */
	@Opposite(bean = MMSyntax.class, attribute = "possibleEncodings")
	public MMSyntax getSyntax() {
		return syntax_lazy.get();
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