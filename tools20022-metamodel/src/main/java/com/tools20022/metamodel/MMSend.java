package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMParticipant;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMMessageTransmission;
import com.tools20022.core.metamodel.Container;
import java.util.List;
import java.util.Collections;
import java.util.Optional;

/**
 * the passing of a stimulus from a sender instance to a receiver instance
 */
public class MMSend implements MMModelEntity {

	private GeneratedMetamodelBean container;
	protected MMParticipant sender;
	protected MMMessageTransmission messageTransmission;
	protected List<MMModelEntity> nextVersions;
	protected MMModelEntity previousVersion;
	protected String objectIdentifier;

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
		return nextVersions == null ? Collections.emptyList() : nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return Optional.ofNullable(previousVersion);
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return Optional.ofNullable(objectIdentifier);
	}
}