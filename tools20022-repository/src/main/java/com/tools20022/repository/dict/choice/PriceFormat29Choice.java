package com.tools20022.repository.dict.choice;

import com.tools20022.repository.dict.choice.PriceFormat19Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.PriceFormat31Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.PriceFormat46Choice;

/**
 * Choice between a percentage price or an amount price or an unspecified price.
 */
@PreviousVersion(PriceFormat19Choice.class)
@NextVersion(PriceFormat31Choice.class)
@NextVersion(PriceFormat46Choice.class)
public class PriceFormat29Choice {
}