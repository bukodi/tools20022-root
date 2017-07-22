package test.gen.mm;

import test.gen.mm.MMTopLevelCatalogueEntry;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMSyntax;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMEncoding;
import test.gen.mm.MMMessageDefinition;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import test.gen.mm.MMBusinessProcessCatalogue;
import java.util.Optional;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * A set of MessageDefinitions
 */
public class MMMessageSet implements MMTopLevelCatalogueEntry {

	private GeneratedMetamodelBean container;
	private List<MMSyntax> generatedSyntax;
	private List<MMEncoding> validEncoding;
	private List<MMMessageDefinition> messageDefinition;
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

	public static interface Members extends MMTopLevelCatalogueEntry.Members {
		/**
		 * identification of the syntax for a specific EncodingScheme
		 */
		MetamodelAttribute<MMMessageSet, List<MMSyntax>> generatedSyntax = newAttribute();
		/**
		 * the set of encodings considered ISO 20022 valid for this MessageSet
		 */
		MetamodelAttribute<MMMessageSet, List<MMEncoding>> validEncoding = newAttribute();
		/**
		 * the MessageDefinition that belongs to the MessageSet
		 */
		MetamodelAttribute<MMMessageSet, List<MMMessageDefinition>> messageDefinition = newAttribute();
		/**
		 * the generated syntax is derived from the syntax for a validEncoding
		 * generatedSyntax->asBag() = validEncoding.syntax
		 */
		MetamodelConstraint<MMMessageSet> checkGeneratedSyntaxDerivation = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageSet> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageSet> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageSet.class);
	}

	/**
	 * identification of the syntax for a specific EncodingScheme
	 * 
	 * @see MMSyntax#getGeneratedFor()
	 */
	@Opposite(bean = MMSyntax.class, attribute = "generatedFor")
	public List<MMSyntax> getGeneratedSyntax() {
		return generatedSyntax;
	}

	/**
	 * the set of encodings considered ISO 20022 valid for this MessageSet
	 * 
	 * @see MMEncoding#getMessageSet()
	 */
	@Opposite(bean = MMEncoding.class, attribute = "messageSet")
	public List<MMEncoding> getValidEncoding() {
		return validEncoding;
	}

	/**
	 * the MessageDefinition that belongs to the MessageSet
	 * 
	 * @see MMMessageDefinition#getMessageSet()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "messageSet")
	public List<MMMessageDefinition> getMessageDefinition() {
		return messageDefinition;
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