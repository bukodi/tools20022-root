package com.tools20022.repository.dict.choice;

import com.tools20022.repository.dict.choice.ExposureType3Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.ExposureType12Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.ExposureType16Choice;

/**
 * Choice of format for the exposure information.
 */
@PreviousVersion(ExposureType3Choice.class)
@NextVersion(ExposureType12Choice.class)
@NextVersion(ExposureType16Choice.class)
public class ExposureType10Choice {
}