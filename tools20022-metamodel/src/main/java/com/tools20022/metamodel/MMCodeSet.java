package com.tools20022.metamodel;

import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMString;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Optional;
import java.util.function.Supplier;
import com.tools20022.core.metamodel.Opposite;
import java.util.List;
import java.util.Collections;
import com.tools20022.metamodel.MMCode;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * Set of Codes grouped together to characterize all the values of an attribute.
 */
public class MMCodeSet extends MMString {

	protected Supplier<MMCodeSet> trace_lazy;
	protected Supplier<List<MMCodeSet>> derivation_lazy;
	protected String identificationScheme;
	protected List<MMCode> code;
	protected Integer minLength;
	protected Integer maxLength;
	protected Integer length;
	protected String pattern;
	protected Supplier<MMDataDictionary> dataDictionary_lazy;
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
	public MMDataDictionary getContainer() {
		return getDataDictionary();
	}

	@Override
	public MetamodelType<? extends MMCodeSet> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMCodeSet> metaType() {
		return StandardMetamodel2013.metamodel()
				.getTypeByClass(MMCodeSet.class);
	}

	/**
	 * The CodeSet that this CodesSet is derived from.
	 * 
	 * @see MMCodeSet#getDerivation()
	 */
	@Opposite(bean = MMCodeSet.class, attribute = "derivation")
	public Optional<MMCodeSet> getTrace() {
		return trace_lazy == null ? Optional.empty() : Optional.of(trace_lazy
				.get());
	}

	/**
	 * The CodeSets which are derived from this CodeSet.
	 * 
	 * @see MMCodeSet#getTrace()
	 */
	@Opposite(bean = MMCodeSet.class, attribute = "trace")
	public List<MMCodeSet> getDerivation() {
		return derivation_lazy == null
				? Collections.emptyList()
				: derivation_lazy.get();
	}

	/**
	 * Uniquely identifies a set of Codes through a Uniform Resource Identifier
	 * (URI).
	 */
	public Optional<String> getIdentificationScheme() {
		return identificationScheme == null ? Optional.empty() : Optional
				.of(identificationScheme);
	}

	/**
	 * A set of Codes belonging to the same CodeSet
	 * 
	 * @see MMCode#getOwner()
	 */
	@Opposite(bean = MMCode.class, attribute = "owner")
	@Containment
	public List<MMCode> getCode() {
		return code == null ? Collections.emptyList() : code;
	}

	@Override
	public Optional<Integer> getMinLength() {
		return minLength == null ? Optional.empty() : Optional.of(minLength);
	}

	@Override
	public Optional<Integer> getMaxLength() {
		return maxLength == null ? Optional.empty() : Optional.of(maxLength);
	}

	@Override
	public Optional<Integer> getLength() {
		return length == null ? Optional.empty() : Optional.of(length);
	}

	@Override
	public Optional<String> getPattern() {
		return pattern == null ? Optional.empty() : Optional.of(pattern);
	}

	@Override
	public MMDataDictionary getDataDictionary() {
		return dataDictionary_lazy.get();
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