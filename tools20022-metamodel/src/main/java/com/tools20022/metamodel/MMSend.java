package com.tools20022.metamodel;

import com.tools20022.metamodel.MMMessageTransmission;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMParticipant;
import java.util.function.Supplier;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import java.util.List;
import java.util.Collections;
import java.util.Optional;

/**
 * the passing of a stimulus from a sender instance to a receiver instance
 */
public class MMSend implements MMModelEntity {

	protected Supplier<MMParticipant> sender_lazy;
	protected Supplier<MMMessageTransmission> messageTransmission_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMMessageTransmission getContainer() {
		return getMessageTransmission();
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
		return sender_lazy.get();
	}

	/**
	 * the stimulus handled as part of the Send
	 * 
	 * @see MMMessageTransmission#getSend()
	 */
	@Opposite(bean = MMMessageTransmission.class, attribute = "send")
	@Container
	public MMMessageTransmission getMessageTransmission() {
		return messageTransmission_lazy.get();
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null
				? Collections.emptyList()
				: nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional
				.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional
				.of(objectIdentifier);
	}
}