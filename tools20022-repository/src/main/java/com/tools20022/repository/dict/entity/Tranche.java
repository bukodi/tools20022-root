package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.datatype.BaseOneRate;

/**
 * One of a number of related assets offered as part of the same transaction.
 * The detachment point less the attachment point represents the maximum loss.
 */
public class Tranche extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Asset Asset;
	private BaseOneRate DetachmentPoint;
	private BaseOneRate AttachmentPoint;

	public Asset getAsset() {
		return Asset;
	}

	public void setAsset(Asset Asset) {
		this.Asset = Asset;
	}

	public BaseOneRate getDetachmentPoint() {
		return DetachmentPoint;
	}

	public void setDetachmentPoint(BaseOneRate DetachmentPoint) {
		this.DetachmentPoint = DetachmentPoint;
	}

	public BaseOneRate getAttachmentPoint() {
		return AttachmentPoint;
	}

	public void setAttachmentPoint(BaseOneRate AttachmentPoint) {
		this.AttachmentPoint = AttachmentPoint;
	}
}