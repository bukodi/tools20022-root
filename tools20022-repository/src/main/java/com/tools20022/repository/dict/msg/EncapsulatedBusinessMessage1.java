package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;

/**
 * Defines an encapsulated form of an ISO 20022 message and, if present, its
 * associated Business Application Header. The encapsulation guarantees
 * uniqueness of ID/IDREFs though the use of the Prefix element. This element
 * can be added during message preparation to ID/IDREFs. In order to verify the
 * signature in the Hdr element or inside the encapsulated message, for each
 * occurrence of an ID orIDREF that possesses the same value as a prefix, the
 * prefix part is removed before signature verification. This is not done for
 * surrounding signatures.
 */
public class EncapsulatedBusinessMessage1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}