package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.Frequency6Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class Frequency6Code extends MMCodeSet {

	private final static AtomicReference<Frequency6Code> repoTypeRef = new AtomicReference<>();
	public final MMCode codeAnnual = new MMCode() {
		{
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Annual";
		}
	};
	public final MMCode codeMonthly = new MMCode() {
		{
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Monthly";
		}
	};
	public final MMCode codeQuarterly = new MMCode() {
		{
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Quarterly";
		}
	};
	public final MMCode codeSemiAnnual = new MMCode() {
		{
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "SemiAnnual";
		}
	};
	public final MMCode codeWeekly = new MMCode() {
		{
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Weekly";
		}
	};
	public final MMCode codeDaily = new MMCode() {
		{
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Daily";
		}
	};
	public final MMCode codeAdhoc = new MMCode() {
		{
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Adhoc";
		}
	};
	public final MMCode codeIntraDay = new MMCode() {
		{
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "IntraDay";
		}
	};
	public final MMCode codeFortnightly = new MMCode() {
		{
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Fortnightly";
		}
	};

	public static Frequency6Code repoType() {
		repoTypeRef.compareAndSet(null, new Frequency6Code());
		return repoTypeRef.get();
	}

	private Frequency6Code() {
		super.code = Arrays.asList(codeAnnual, codeMonthly, codeQuarterly,
				codeSemiAnnual, codeWeekly, codeDaily, codeAdhoc, codeIntraDay,
				codeFortnightly);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Frequency6Code";
		super.definition = "Specifies the regularity of an event.";
		super.example = Arrays.asList("YEAR");
	}
}