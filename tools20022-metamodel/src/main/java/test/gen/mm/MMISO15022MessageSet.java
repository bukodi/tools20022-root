package test.gen.mm;

import test.gen.mm.MMIndustryMessageSet;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMBusinessProcessCatalogue;
import java.util.Optional;
import test.gen.mm.MMSemanticMarkup;
import java.util.List;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * industryMessageSet constructed according to the rules defined in ISO 15022-1
 * and ISO 15022-2 and that is stored in the ISO 15022 Catalogue of Messages
 */
public class MMISO15022MessageSet extends MMIndustryMessageSet {

	private GeneratedMetamodelBean container;
	private MMBusinessProcessCatalogue businessProcessCatalogue;
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

	public static interface Members extends MMIndustryMessageSet.Members {
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMISO15022MessageSet> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMISO15022MessageSet> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMISO15022MessageSet.class);
	}

	@Override
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue;
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