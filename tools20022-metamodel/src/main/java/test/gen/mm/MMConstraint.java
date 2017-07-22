package test.gen.mm;

import test.gen.mm.MMRepositoryConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
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
 * A rule that must be universally satisfied i.e. all conditions required for
 * the Constraint to be applicable, are known.
 */
public class MMConstraint implements MMRepositoryConcept {

	private GeneratedMetamodelBean container;
	private Optional<String> expression;
	private Optional<String> expressionLanguage;
	private MMRepositoryConcept owner;
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

	public static interface Members extends MMRepositoryConcept.Members {
		/**
		 * The description of a Constraint in a specific language, defined in
		 * expressionLanguage
		 */
		MetamodelAttribute<MMConstraint, Optional<String>> expression = newAttribute();
		/**
		 * The language in which a Constraint in expressed.
		 */
		MetamodelAttribute<MMConstraint, Optional<String>> expressionLanguage = newAttribute();
		/**
		 * The owner of the Rule.
		 */
		MetamodelAttribute<MMConstraint, MMRepositoryConcept> owner = newAttribute();
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMConstraint> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMConstraint> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMConstraint.class);
	}

	/**
	 * The description of a Constraint in a specific language, defined in
	 * expressionLanguage
	 */
	public Optional<String> getExpression() {
		return expression;
	}

	/**
	 * The language in which a Constraint in expressed.
	 */
	public Optional<String> getExpressionLanguage() {
		return expressionLanguage;
	}

	/**
	 * The owner of the Rule.
	 * 
	 * @see MMRepositoryConcept#getConstraint()
	 */
	@Opposite(bean = MMRepositoryConcept.class, attribute = "constraint")
	@Container
	public MMRepositoryConcept getOwner() {
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