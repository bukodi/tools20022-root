package test.gen.mm;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMModelEntity;
import test.gen.mm.MMMessageTransmission;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import test.gen.mm.MMParticipant;
import java.util.List;
import java.util.Optional;

/**
 * the handling of a stimulus passed from a sender instance
 */
public class MMReceive implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private MMMessageTransmission messageTransmission;
	private MMParticipant receiver;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMReceive> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMReceive> metaType() {
		return StandardMetamodel2013.metamodel()
				.getTypeByClass(MMReceive.class);
	}

	/**
	 * the stimulus handled as part of the Receive
	 * 
	 * @see MMMessageTransmission#getReceive()
	 */
	@Opposite(bean = MMMessageTransmission.class, attribute = "receive")
	@Container
	public MMMessageTransmission getMessageTransmission() {
		return messageTransmission;
	}

	/**
	 * the object handling a stimulus passed from the sender
	 * 
	 * @see MMParticipant#getReceives()
	 */
	@Opposite(bean = MMParticipant.class, attribute = "receives")
	public MMParticipant getReceiver() {
		return receiver;
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