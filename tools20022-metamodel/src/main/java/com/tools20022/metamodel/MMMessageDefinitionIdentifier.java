package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import java.util.List;
import java.util.Optional;

/**
 * Unique identification of a MessageDefinition within the ISO 20022 namespace,
 * identifying the BusinessArea to which the MessageDefinition belongs, the
 * Message Functionality it covers, its flavour and its version
 */
public class MMMessageDefinitionIdentifier implements MMModelEntity {

	private GeneratedMetamodelBean container;
	protected String businessArea;
	protected String messageFunctionality;
	protected String flavour;
	protected String version;
	protected List<MMModelEntity> nextVersions;
	protected Optional<MMModelEntity> previousVersion;
	protected Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageDefinitionIdentifier> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageDefinitionIdentifier> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageDefinitionIdentifier.class);
	}

	/**
	 * part of a MessageDefinitionIdentifier describing the BusinessArea to
	 * which the MessageDefinition using this MessageDefinitionIdentifier
	 * belongs
	 */
	public String getBusinessArea() {
		return businessArea;
	}

	/**
	 * function and purpose for which a MessageInstance described by a
	 * MessageDefinition can be used
	 */
	public String getMessageFunctionality() {
		return messageFunctionality;
	}

	/**
	 * a variation of a messageFunctionality, whereby MessageDefinitions that
	 * are based on this MessageDefinition are compliant to the
	 * MessageDefinition from which this MessageDefinition is derived.
	 */
	public String getFlavour() {
		return flavour;
	}

	/**
	 * identifies the version of the MessageDefinition
	 */
	public String getVersion() {
		return version;
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