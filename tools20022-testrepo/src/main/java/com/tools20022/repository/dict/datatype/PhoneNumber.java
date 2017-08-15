package com.tools20022.repository.dict.datatype;

import com.tools20022.core.repo.InstanceOf;
import com.tools20022.metamodel.MMText;

/**
 * The collection of information which identifies a specific phone or FAX number
 * as defined by telecom services. It consists of a "+" followed by the country
 * code (from 1 to 3 characters) then a "-" and finally, any combination of
 * numbers, "(", ")", "+" and "-" (up to 30 characters).
 */
public class PhoneNumber implements InstanceOf<MMText> {
}