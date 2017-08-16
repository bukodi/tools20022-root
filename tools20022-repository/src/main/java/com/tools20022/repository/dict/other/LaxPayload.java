package com.tools20022.repository.dict.other;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMExternalSchema;

/**
 * Specifies a data structure that allows to include any valid XML Structure
 * (e.g. through an XML Schema). The property namespace is set to 'any'. The
 * processContents value is 'lax' which according to the above specification and
 * to Iso20022:2013 means: If the item has a uniquely determined declaration
 * available, it must be ·valid· with respect to that definition, that is,
 * ·validate· if you can, don't worry if you can't, i.e. it MAY be validated or
 * not.
 */
public class LaxPayload implements GeneratedRepoBean<MMExternalSchema> {
}