package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMParticipant;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageTransmission;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import java.util.List;
import java.util.Optional;

/**
 * the passing of a stimulus from a sender instance to a receiver instance
 */
public class MMSend implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private MMParticipant sender;
	private MMMessageTransmission messageTransmission;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	public static interface Members extends MMModelEntity.Members {
		/**
		 * The object passing a stimulus to a receiver object
		 */
		MetamodelAttribute<MMSend, MMParticipant> sender = newAttribute();
		/**
		 * the stimulus handled as part of the Send
		 */
		MetamodelAttribute<MMSend, MMMessageTransmission> messageTransmission = newAttribute();
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMSend> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMSend> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMSend.class);
	}

	/**
	 * The object passing a stimulus to a receiver object
	 * 
	 * @see MMParticipant#getSends()
	 */
	@Opposite(bean = MMParticipant.class, attribute = "sends")
	public MMParticipant getSender() {
		return sender;
	}

	/**
	 * the stimulus handled as part of the Send
	 * 
	 * @see MMMessageTransmission#getSend()
	 */
	@Opposite(bean = MMMessageTransmission.class, attribute = "send")
	@Container
	public MMMessageTransmission getMessageTransmission() {
		return messageTransmission;
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