package com.tools20022.repository.catalogue.msgdef.secl;

import com.tools20022.repository.dict.msg.ReportParameters2;
import com.tools20022.repository.dict.choice.PartyIdentification35Choice;
import com.tools20022.repository.dict.msg.DefaultFundReport1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The DefaultFundContributionReport message is sent by the central
 * counterparty (CCP) to a Clearing member to report on the calculation of the
 * default fund contribution and the potential net excess or deficit.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage CCPs require participants to post assets in a clearing fund that can be
 * used in the event of a default by a participant, to compensate non-defaulting
 * participants for losses they suffer due to this default. The CCP evaluates
 * each participant risk level based on their positions (monthly or daily) and
 * calculate the excess of deficit of the default fund contribution. The
 * DefaultFundContributionReport is usually sent on a monthly basis.
 */
public class DefaultFundContributionReportV02 {

	private ReportParameters2 ReportParameters;
	private PartyIdentification35Choice ClearingMember;
	private DefaultFundReport1 ReportDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public ReportParameters2 getReportParameters() {
		return ReportParameters;
	}

	public void setReportParameters(ReportParameters2 ReportParameters) {
		this.ReportParameters = ReportParameters;
	}

	public PartyIdentification35Choice getClearingMember() {
		return ClearingMember;
	}

	public void setClearingMember(PartyIdentification35Choice ClearingMember) {
		this.ClearingMember = ClearingMember;
	}

	public DefaultFundReport1 getReportDetails() {
		return ReportDetails;
	}

	public void setReportDetails(DefaultFundReport1 ReportDetails) {
		this.ReportDetails = ReportDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}