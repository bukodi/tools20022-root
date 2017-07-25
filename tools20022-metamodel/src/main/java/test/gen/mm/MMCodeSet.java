package test.gen.mm;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMString;
import test.gen.mm.MMCodeSet;
import java.util.Optional;
import com.tools20022.core.metamodel.Opposite;
import java.util.List;
import test.gen.mm.MMCode;
import com.tools20022.core.metamodel.Containment;
import test.gen.mm.MMDataDictionary;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * Set of Codes grouped together to characterize all the values of an attribute.
 */
public class MMCodeSet extends MMString {

	private GeneratedMetamodelBean container;
	private Optional<MMCodeSet> trace;
	private List<MMCodeSet> derivation;
	private Optional<String> identificationScheme;
	private List<MMCode> code;
	private Optional<Integer> minLength;
	private Optional<Integer> maxLength;
	private Optional<Integer> length;
	private Optional<String> pattern;
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