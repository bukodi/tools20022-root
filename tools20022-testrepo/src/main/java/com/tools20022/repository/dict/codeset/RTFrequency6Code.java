package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTFrequency6Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the regularity of an event.
 */
public class RTFrequency6Code extends MMCodeSet {

	private final static AtomicReference<RTFrequency6Code> repoTypeRef = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public final MMCode codeAnnual = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency6Code.repoType();
			super.name = "Annual";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeMonthly = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency6Code.repoType();
			super.name = "Monthly";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeQuarterly = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency6Code.repoType();
			super.name = "Quarterly";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeSemiAnnual = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency6Code.repoType();
			super.name = "SemiAnnual";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeWeekly = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency6Code.repoType();
			super.name = "Weekly";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeDaily = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency6Code.repoType();
			super.name = "Daily";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeAdhoc = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency6Code.repoType();
			super.name = "Adhoc";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeIntraDay = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency6Code.repoType();
			super.name = "IntraDay";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeFortnightly = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency6Code.repoType();
			super.name = "Fortnightly";
		}
	};

	public static RTFrequency6Code repoType() {
		repoTypeRef.compareAndSet(null, new RTFrequency6Code());
		return repoTypeRef.get();
	}

	private RTFrequency6Code() {
		super.code = Arrays.asList(codeAnnual, codeMonthly, codeQuarterly,
				codeSemiAnnual, codeWeekly, codeDaily, codeAdhoc, codeIntraDay,
				codeFortnightly);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Frequency6Code";
		super.definition = "Specifies the regularity of an event.";
		super.example = Arrays.asList("YEAR");
	} }