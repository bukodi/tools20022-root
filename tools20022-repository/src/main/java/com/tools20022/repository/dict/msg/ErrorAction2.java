package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ErrorAction1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ErrorAction3;
import com.tools20022.core.repo.NextVersion;

/**
 * Action to perform in case of error on the related action in progress.
 */
@PreviousVersion(ErrorAction1.class)
@NextVersion(ErrorAction3.class)
public class ErrorAction2 implements GeneratedRepoBean<MMMessageComponent> {
}