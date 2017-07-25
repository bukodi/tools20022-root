package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import java.util.Optional;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

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