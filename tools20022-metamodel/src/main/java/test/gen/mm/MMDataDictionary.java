package test.gen.mm;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMModelEntity;
import test.gen.mm.MMTopLevelDictionaryEntry;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Containment;
import test.gen.mm.MMRepository;
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