package test.gen.mm;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMMessageComponentType;
import java.util.List;
import test.gen.mm.MMProcessContent;
import test.gen.mm.MMMessageBuildingBlock;
import test.gen.mm.MMBusinessComponent;
import java.util.Optional;
import test.gen.mm.MMDataDictionary;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * Reusable Dictionary Item that allows referring to a structure defined outside
 * of the ISO 20022 MessageDefinition.
 */
public class MMExternalSchema implements MMMessageComponentType {

	private GeneratedMetamodelBean container;
	private List<String> namespaceList;
	private MMProcessContent processContent;
	private List<MMMessageBuildingBlock> messageBuildingBlock;
	private boolean isTechnical;
	private Optional<MMBusinessComponent> trace;
	private MMDataDictionary dataDictionary;
	private String name;
	private Optional<String> definition;
	private List<MMSemanticMarkup> semanticMarkup;
	private List<MMDoclet> doclet;
	private List<String> example;
	private List<MMConstraint> constraint;
	private MMRegistrationStatus registrationStatus;
	private Optional<Date> removalDate;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMExternalSchema> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMExternalSchema> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMExternalSchema.class);
	}

	/**
	 * Identifies the description of the content model of an ExternalSchema,
	 * through (a set of) URI.
	 */
	public List<String> getNamespaceList() {
		return namespaceList;
	}

	/**
	 * Specifies whether it is required for the content model of the
	 * ExternalSchema to be validated.
	 */
	public MMProcessContent getProcessContent() {
		return processContent;
	}

	@Override
	public List<MMMessageBuildingBlock> getMessageBuildingBlock() {
		return messageBuildingBlock;
	}

	@Override
	public boolean isIsTechnical() {
		return isTechnical;
	}

	@Override
	public Optional<MMBusinessComponent> getTrace() {
		return trace;
	}

	@Override
	public MMDataDictionary getDataDictionary() {
		return dataDictionary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition;
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup;
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet;
	}

	@Override
	public List<String> getExample() {
		return example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint;
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate;
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