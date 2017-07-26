package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.Product1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Product4;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Product5;

/**
 * Purchased item.
 */
@PreviousVersion(Product1.class)
@NextVersion(Product4.class)
@NextVersion(Product5.class)
public class Product3 {
}