package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMTopLevelDictionaryEntry;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMRepository;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.Container;
import java.util.Optional;

/**
 * Part of the ISO 20022 Repository that contains all items that can be re-used
 * during business process modelling and message definition activities.
 */
public class MMDataDictionary implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private List<MMTopLevelDictionaryEntry> topLevelDictionaryEntry;
	private MMRepository repository;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	public static interface Members extends MMModelEntity.Members {
		/**
		 * a TopLevelDictionaryEntry in the DataDictionary
		 */
		MetamodelAttribute<MMDataDictionary, List<MMTopLevelDictionaryEntry>> topLevelDictionaryEntry = newAttribute();
		/**
		 * The Repository that owns the DataDictionary.
		 */
		MetamodelAttribute<MMDataDictionary, MMRepository> repository = newAttribute();
		/**
		 * All TopLevelDictionaryEntries of a DataDictionary must have different
		 * names topLevelDictionaryEntry-&gt;forAll(entry1,entry2 | entry1
		 * &lt;&gt; entry2 implies entry1.name &lt;&gt; entry2.name)
		 */
		MetamodelConstraint<MMDataDictionary> checkEntriesHaveUniqueName = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMDataDictionary> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMDataDictionary> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMDataDictionary.class);
	}

	/**
	 * a TopLevelDictionaryEntry in the DataDictionary
	 * 
	 * @see MMTopLevelDictionaryEntry#getDataDictionary()
	 */
	@Opposite(bean = MMTopLevelDictionaryEntry.class, attribute = "dataDictionary")
	@Containment
	public List<MMTopLevelDictionaryEntry> getTopLevelDictionaryEntry() {
		return topLevelDictionaryEntry;
	}

	/**
	 * The Repository that owns the DataDictionary.
	 * 
	 * @see MMRepository#getDataDictionary()
	 */
	@Opposite(bean = MMRepository.class, attribute = "dataDictionary")
	@Container
	public MMRepository getRepository() {
		return repository;
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