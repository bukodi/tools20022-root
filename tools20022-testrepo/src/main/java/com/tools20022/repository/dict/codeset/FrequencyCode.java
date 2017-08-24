package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class FrequencyCode extends MMCodeSet {

	private final static AtomicReference<FrequencyCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeAnnual = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "YEAR";
			super.name = "Annual";
			super.definition = "Event takes place every year or once a year.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeMonthly = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "MNTH";
			super.name = "Monthly";
			super.definition = "Event takes place every month or once a month.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeQuarterly = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "QURT";
			super.name = "Quarterly";
			super.definition = "Event takes place every three months or four times a year.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeSemiAnnual = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "MIAN";
			super.name = "SemiAnnual";
			super.definition = "Event takes place every six months or two times a year.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeWeekly = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "WEEK";
			super.name = "Weekly";
			super.definition = "Event takes place once a week.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeDaily = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "DAIL";
			super.name = "Daily";
			super.definition = "Event takes place every day.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeAdhoc = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "ADHO";
			super.name = "Adhoc";
			super.definition = "Event takes place on request or as necessary.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeIntraDay = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "INDA";
			super.name = "IntraDay";
			super.definition = "Event takes place several times a day.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeOvernight = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "OVNG";
			super.name = "Overnight";
			super.definition = "Event takes place overnight.";
		}
	};
	public final MMCode codeTenDays = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "TEND";
			super.name = "TenDays";
			super.definition = "Event takes place every ten business days.";
		}
	};
	public final MMCode codeFortnightly = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "FRTN";
			super.name = "Fortnightly";
			super.definition = "Event takes place every two weeks.";
		}
	};
	public final MMCode codeTriggeredByMovement = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "MOVE";
			super.name = "TriggeredByMovement";
			super.definition = "Event takes place at the end of the day if there was a movement on the account, otherwise nothing is sent that day. ";
		}
	};
	public final MMCode codeNever = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "NEVR";
			super.name = "Never";
			super.definition = "Event does never take place.";
		}
	};
	public final MMCode codeRate = new MMCode() {
		{
			super.owner_lazy = () -> FrequencyCode.repoType();
			super.codeName = "RATE";
			super.name = "Rate";
			super.definition = "Event takes place based on a change of a rate.";
		}
	};

	public static FrequencyCode repoType() {
		repoTypeRef.compareAndSet(null, new FrequencyCode());
		return repoTypeRef.get();
	}

	private FrequencyCode() {
		super.code = Arrays.asList(codeAnnual, codeMonthly, codeQuarterly,
				codeSemiAnnual, codeWeekly, codeDaily, codeAdhoc, codeIntraDay,
				codeOvernight, codeTenDays, codeFortnightly,
				codeTriggeredByMovement, codeNever, codeRate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "FrequencyCode";
		super.definition = "Specifies the regularity of an event.";
		super.example = Arrays.asList("YEAR");
	}
}