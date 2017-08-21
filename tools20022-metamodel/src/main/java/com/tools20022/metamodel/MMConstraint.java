package com.tools20022.metamodel;

import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import java.util.Optional;
import java.util.function.Supplier;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import java.util.Collections;
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

	protected String expression;
	protected String expressionLanguage;
	protected Supplier<MMRepositoryConcept> owner_lazy;
	protected String name;
	protected String definition;
	protected List<MMSemanticMarkup> semanticMarkup;
	protected List<MMDoclet> doclet;
	protected List<String> example;
	protected List<MMConstraint> constraint;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMRepositoryConcept getContainer() {
		return getOwner();
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
		return expression == null ? Optional.empty() : Optional.of(expression);
	}

	/**
	 * The language in which a Constraint in expressed.
	 */
	public Optional<String> getExpressionLanguage() {
		return expressionLanguage == null ? Optional.empty() : Optional
				.of(expressionLanguage);
	}

	/**
	 * The owner of the Rule.
	 * 
	 * @see MMRepositoryConcept#getConstraint()
	 */
	@Opposite(bean = MMRepositoryConcept.class, attribute = "constraint")
	@Container
	public MMRepositoryConcept getOwner() {
		return owner_lazy.get();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition == null ? Optional.empty() : Optional.of(definition);
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup == null
				? Collections.emptyList()
				: semanticMarkup;
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet == null ? Collections.emptyList() : doclet;
	}

	@Override
	public List<String> getExample() {
		return example == null ? Collections.emptyList() : example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint == null ? Collections.emptyList() : constraint;
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate == null ? Optional.empty() : Optional
				.of(removalDate);
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