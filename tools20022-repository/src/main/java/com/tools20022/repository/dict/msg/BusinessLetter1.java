package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;

/**
 * Defines a business letter containing identifications of involved entities and
 * their roles, references to documents, free form text and signatures. The
 * semantics of this information are defined by usual business practices for the
 * exchange and tracing of business letters. The described references and party
 * identifiers permit to establish a linked informal trace of sequences of
 * letters. This message component contains three types of elements that can be
 * referenced using IDREF: (1) - all elements defining qualified parties, (2) -
 * all elements defining qualified documents or references to them, (3) - the
 * LegalContext element.
 */
public class BusinessLetter1 implements GeneratedRepoBean<MMMessageComponent> {
}