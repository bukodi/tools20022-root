package com.tools20022.repository.dict.datatype;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMText;

/**
 * Specifies a character string with a maximum length of 35 characters. It has a
 * pattern ([^/]+/)+([^/]+)|([^/]*) that disables the use of slash "/" at the
 * beginning and end of line and double slash "//" within the line.
 */
public class RestrictedFINMax35Text implements GeneratedRepoBean<MMText> {
}