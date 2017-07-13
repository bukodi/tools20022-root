package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMSyntaxMessageScheme;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMTransportMessage;
import java.util.List;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;

/**
 * instance of MessageDefinition, containing a set of structured information
 * exchanged between BusinessRoles, in the scope of a BusinessTransaction
 */
public class MMMessageInstance implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private MMSyntaxMessageScheme specification;
	private List<MMTransportMessage> transportMessage;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	public static interface Members extends MMModelEntity.Members {
		/**
		 * the SyntaxScheme instantiated by this MessageInstance
		 */
		MetamodelAttribute<MMMessageInstance, MMSyntaxMessageScheme> specification = newAttribute();
		/**
		 * the TransportMessage that contains the MessageInstance
		 */
		MetamodelAttribute<MMMessageInstance, List<MMTransportMessage>> transportMessage = newAttribute();
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageInstance> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageInstance> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageInstance.class);
	}

	/**
	 * the SyntaxScheme instantiated by this MessageInstance
	 */
	public MMSyntaxMessageScheme getSpecification() {
		return specification;
	}

	/**
	 * the TransportMessage that contains the MessageInstance
	 * 
	 * @see MMTransportMessage#getMessageInstance()
	 */
	@Opposite(bean = MMTransportMessage.class, attribute = "messageInstance")
	public List<MMTransportMessage> getTransportMessage() {
		return transportMessage;
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