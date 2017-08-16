package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ATMSecurityConfiguration3;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ATMSecurityConfiguration5;
import com.tools20022.core.repo.NextVersion;

/**
 * Configuration of the digital signatures if the security module is able to
 * perform digital signatures with an asymmetric key.
 */
@PreviousVersion(ATMSecurityConfiguration3.class)
@NextVersion(ATMSecurityConfiguration5.class)
public class ATMSecurityConfiguration4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}