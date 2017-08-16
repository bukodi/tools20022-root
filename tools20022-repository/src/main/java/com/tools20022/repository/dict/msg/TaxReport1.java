package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.TaxReportHeader1;
import com.tools20022.core.repo.NextVersion;

/**
 * Contains all needed party details for tax agency (sender of the TaxReport)
 * and tax authority (receiver of the TaxReport) and the details of the reported
 * sales transaction and calculated tax related that specific business
 * transaction.
 */
@NextVersion(TaxReportHeader1.class)
public class TaxReport1 implements GeneratedRepoBean<MMMessageComponent> {
}