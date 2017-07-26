package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.LegalMandate1;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.msg.DueDate1;
import java.util.Optional;
import com.tools20022.repository.dict.choice.DateOrDateTimePeriodChoice;
import com.tools20022.repository.dict.choice.SearchCriteria1Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * This message is sent by the authorities (police, customs, tax authorities,
 * enforcement authorities) to a financial institution to request account and
 * other banking and financial information. Requested information can relate to
 * accounts, their signatories and beneficiaries and co-owners as well as
 * movements plus positions on these accounts.
 * 
 * Requests are underpinned by specific legal texts.
 */
public class InformationRequestOpeningV01 {

	private Max35Text InvestigationIdentification;
	private LegalMandate1 LegalMandateBasis;
	private YesNoIndicator ConfidentialityStatus;
	private Optional<DueDate1> DueDate;
	private DateOrDateTimePeriodChoice InvestigationPeriod;
	private SearchCriteria1Choice SearchCriteria;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getInvestigationIdentification() {
		return InvestigationIdentification;
	}

	public void setInvestigationIdentification(
			Max35Text InvestigationIdentification) {
		this.InvestigationIdentification = InvestigationIdentification;
	}

	public LegalMandate1 getLegalMandateBasis() {
		return LegalMandateBasis;
	}

	public void setLegalMandateBasis(LegalMandate1 LegalMandateBasis) {
		this.LegalMandateBasis = LegalMandateBasis;
	}

	public YesNoIndicator getConfidentialityStatus() {
		return ConfidentialityStatus;
	}

	public void setConfidentialityStatus(YesNoIndicator ConfidentialityStatus) {
		this.ConfidentialityStatus = ConfidentialityStatus;
	}

	public Optional<DueDate1> getDueDate() {
		return DueDate;
	}

	public void setDueDate(Optional<DueDate1> DueDate) {
		this.DueDate = DueDate;
	}

	public DateOrDateTimePeriodChoice getInvestigationPeriod() {
		return InvestigationPeriod;
	}

	public void setInvestigationPeriod(
			DateOrDateTimePeriodChoice InvestigationPeriod) {
		this.InvestigationPeriod = InvestigationPeriod;
	}

	public SearchCriteria1Choice getSearchCriteria() {
		return SearchCriteria;
	}

	public void setSearchCriteria(SearchCriteria1Choice SearchCriteria) {
		this.SearchCriteria = SearchCriteria;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}