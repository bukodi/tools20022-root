package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMAddress;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;

/**
 * set of references to MessagingEndpoints (identified by their Address), that
 * is used for message broadcasting
 */
public class MMBroadcastList implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private List<MMAddress> address;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	public static interface Members extends MMModelEntity.Members {
		/**
		 * a BroadCastList entry using an Address
		 */
		MetamodelAttribute<MMBroadcastList, List<MMAddress>> address = newAttribute();
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMBroadcastList> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBroadcastList> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBroadcastList.class);
	}

	/**
	 * a BroadCastList entry using an Address
	 * 
	 * @see MMAddress#getBroadCastList()
	 */
	@Opposite(bean = MMAddress.class, attribute = "broadCastList")
	public List<MMAddress> getAddress() {
		return address;
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