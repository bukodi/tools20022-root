package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.InvestmentAccountPartyRole;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Max350Text;

/**
 * Party which makes investment decisions in relation with its investment
 * account.
 */
public class Investor extends InvestmentAccountPartyRole {

	private YesNoIndicator NewIssuePermission;
	private Max35Text DeMinimusApplicable;
	private YesNoIndicator Restricted;
	private Max350Text RestrictedPersonReason;

	public YesNoIndicator getNewIssuePermission() {
		return NewIssuePermission;
	}

	public void setNewIssuePermission(YesNoIndicator NewIssuePermission) {
		this.NewIssuePermission = NewIssuePermission;
	}

	public Max35Text getDeMinimusApplicable() {
		return DeMinimusApplicable;
	}

	public void setDeMinimusApplicable(Max35Text DeMinimusApplicable) {
		this.DeMinimusApplicable = DeMinimusApplicable;
	}

	public YesNoIndicator getRestricted() {
		return Restricted;
	}

	public void setRestricted(YesNoIndicator Restricted) {
		this.Restricted = Restricted;
	}

	public Max350Text getRestrictedPersonReason() {
		return RestrictedPersonReason;
	}

	public void setRestrictedPersonReason(Max350Text RestrictedPersonReason) {
		this.RestrictedPersonReason = RestrictedPersonReason;
	}
}