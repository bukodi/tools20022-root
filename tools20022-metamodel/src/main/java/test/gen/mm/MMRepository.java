package test.gen.mm;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMModelEntity;
import test.gen.mm.MMDataDictionary;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Containment;
import test.gen.mm.MMBusinessProcessCatalogue;
import java.util.List;
import java.util.Optional;

/**
 * place where all RepositoryConcepts are stored
 */
public class MMRepository implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private MMDataDictionary dataDictionary;
	private MMBusinessProcessCatalogue businessProcessCatalogue;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMRepository> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMRepository> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMRepository.class);
	}

	/**
	 * the DataDictionary owned by the ISO 20022 Repository
	 * 
	 * @see MMDataDictionary#getRepository()
	 */
	@Opposite(bean = MMDataDictionary.class, attribute = "repository")
	@Containment
	public MMDataDictionary getDataDictionary() {
		return dataDictionary;
	}

	/**
	 * the BusinessProcessCatalogue owned by the ISO 20022 Repository
	 * 
	 * @see MMBusinessProcessCatalogue#getRepository()
	 */
	@Opposite(bean = MMBusinessProcessCatalogue.class, attribute = "repository")
	@Containment
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue;
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