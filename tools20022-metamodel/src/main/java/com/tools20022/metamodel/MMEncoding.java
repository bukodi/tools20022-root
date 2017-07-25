package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMMessageSet;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMSyntax;
import java.util.Optional;

/**
 * A particular set of encoding rules for a MessageInstance.
 */
public class MMEncoding implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private List<MMMessageSet> messageSet;
	private MMSyntax syntax;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
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
		return messageSet;
	}

	/**
	 * The source syntax on which an encoding applies
	 * 
	 * @see MMSyntax#getPossibleEncodings()
	 */
	@Opposite(bean = MMSyntax.class, attribute = "possibleEncodings")
	public MMSyntax getSyntax() {
		return syntax;
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