package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMString;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Optional;
import com.tools20022.core.metamodel.Opposite;
import java.util.List;
import com.tools20022.metamodel.MMCode;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMDataDictionary;
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

	private GeneratedMetamodelBean container;
	protected Optional<MMCodeSet> trace;
	protected List<MMCodeSet> derivation;
	protected Optional<String> identificationScheme;
	protected List<MMCode> code;
	protected Optional<Integer> minLength;
	protected Optional<Integer> maxLength;
	protected Optional<Integer> length;
	protected Optional<String> pattern;
	protected MMDataDictionary dataDictionary;
	protected String name;
	protected Optional<String> definition;
	protected List<MMSemanticMarkup> semanticMarkup;
	protected List<MMDoclet> doclet;
	protected List<String> example;
	protected List<MMConstraint> constraint;
	protected MMRegistrationStatus registrationStatus;
	protected Optional<Date> removalDate;
	protected List<MMModelEntity> nextVersions;
	protected Optional<MMModelEntity> previousVersion;
	protected Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
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
		return trace;
	}

	/**
	 * The CodeSets which are derived from this CodeSet.
	 * 
	 * @see MMCodeSet#getTrace()
	 */
	@Opposite(bean = MMCodeSet.class, attribute = "trace")
	public List<MMCodeSet> getDerivation() {
		return derivation;
	}

	/**
	 * Uniquely identifies a set of Codes through a Uniform Resource Identifier
	 * (URI).
	 */
	public Optional<String> getIdentificationScheme() {
		return identificationScheme;
	}

	/**
	 * A set of Codes belonging to the same CodeSet
	 * 
	 * @see MMCode#getOwner()
	 */
	@Opposite(bean = MMCode.class, attribute = "owner")
	@Containment
	public List<MMCode> getCode() {
		return code;
	}

	@Override
	public Optional<Integer> getMinLength() {
		return minLength;
	}

	@Override
	public Optional<Integer> getMaxLength() {
		return maxLength;
	}

	@Override
	public Optional<Integer> getLength() {
		return length;
	}

	@Override
	public Optional<String> getPattern() {
		return pattern;
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