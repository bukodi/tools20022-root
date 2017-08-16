package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.OtherCollateral1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.OtherCollateral3;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.OtherCollateral4;
import com.tools20022.repository.dict.msg.OtherCollateral5;

/**
 * Provides details about the letter of credit or bank guarantee, or other
 * collateral, posted as collateral.
 */
@PreviousVersion(OtherCollateral1.class)
@NextVersion(OtherCollateral3.class)
@NextVersion(OtherCollateral4.class)
@NextVersion(OtherCollateral5.class)
public class OtherCollateral2 implements GeneratedRepoBean<MMMessageComponent> {
}