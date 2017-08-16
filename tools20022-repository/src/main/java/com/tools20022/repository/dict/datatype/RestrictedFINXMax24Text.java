package com.tools20022.repository.dict.datatype;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMText;

/**
 * Specifies a character string with a maximum length of 24 characters. It has a
 * pattern that disables the use of characters that is not part of the character
 * set X, that is, that is not a-z A-Z / - ? : ( ) . , ‘ + , and disable the use
 * of slash "/" at the beginning and end of line and double slash "//" within
 * the line.
 */
public class RestrictedFINXMax24Text implements GeneratedRepoBean<MMText> {
}