package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import java.util.List;

/**
 * A semantic mark-up element defines a name + value pair for content. E.g. for
 * synonyms, the name will be either "name" or "context" and the value will be
 * the corresponding synonym name or context.
 */
public class MMSemanticMarkupElement implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private Optional<String> name;
	private Optional<String> value;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	public static interface Members extends MMModelEntity.Members {
		/**
		 * Name of the semantic mark-up element.
		 */
		MetamodelAttribute<MMSemanticMarkupElement, Optional<String>> name = newAttribute();
		/**
		 * Value of the semantic mark-up element.
		 */
		MetamodelAttribute<MMSemanticMarkupElement, Optional<String>> value = newAttribute();
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMSemanticMarkupElement> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMSemanticMarkupElement> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMSemanticMarkupElement.class);
	}

	/**
	 * Name of the semantic mark-up element.
	 */
	public Optional<String> getName() {
		return name;
	}

	/**
	 * Value of the semantic mark-up element.
	 */
	public Optional<String> getValue() {
		return value;
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