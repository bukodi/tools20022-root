package test.gen.mm;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMRepositoryConcept;
import java.util.Optional;
import test.gen.mm.MMCodeSet;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import test.gen.mm.MMSemanticMarkup;
import java.util.List;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * A character string (letters, figures or symbols) that for brevity and/or
 * language independence may be used to represent or replace a definitive value
 * or text of an attribute.
 */
public class MMCode implements MMRepositoryConcept {

	private GeneratedMetamodelBean container;
	private Optional<String> codeName;
	private MMCodeSet owner;
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
	public MetamodelType<? extends MMCode> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMCode> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMCode.class);
	}

	/**
	 * Provides the full, non-abbreviated name of the Code
	 */
	public Optional<String> getCodeName() {
		return codeName;
	}

	/**
	 * Direct reference to the CodeSet owning this Code.
	 * 
	 * @see MMCodeSet#getCode()
	 */
	@Opposite(bean = MMCodeSet.class, attribute = "code")
	@Container
	public MMCodeSet getOwner() {
		return owner;
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