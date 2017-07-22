package test.gen.mm;

import test.gen.mm.MMDataType;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMDataDictionary;
import test.gen.mm.MMSemanticMarkup;
import java.util.List;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * Any set of values drawn from the value space of 'base64Binary', as specified
 * by W3C Recommendation XML Schema Part 2: Datatypes.
 */
public class MMBinary implements MMDataType {

	private GeneratedMetamodelBean container;
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

	public static interface Members extends MMDataType.Members {
		/**
		 * the minimum number of units of characters
		 */
		MetamodelAttribute<MMBinary, Optional<Integer>> minLength = newAttribute();
		/**
		 * the maximum number of units of characters
		 */
		MetamodelAttribute<MMBinary, Optional<Integer>> maxLength = newAttribute();
		/**
		 * the number of units of characters
		 */
		MetamodelAttribute<MMBinary, Optional<Integer>> length = newAttribute();
		/**
		 * A constraint on the value space of a datatype which is achieved by
		 * constraining the lexical space to literals which match a specific
		 * pattern.
		 */
		MetamodelAttribute<MMBinary, Optional<String>> pattern = newAttribute();
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMBinary> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBinary> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMBinary.class);
	}

	/**
	 * the minimum number of units of characters
	 */
	public Optional<Integer> getMinLength() {
		return minLength;
	}

	/**
	 * the maximum number of units of characters
	 */
	public Optional<Integer> getMaxLength() {
		return maxLength;
	}

	/**
	 * the number of units of characters
	 */
	public Optional<Integer> getLength() {
		return length;
	}

	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
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