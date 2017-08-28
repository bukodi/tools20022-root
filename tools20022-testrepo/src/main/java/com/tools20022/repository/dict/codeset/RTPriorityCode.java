package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTPriorityCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the priority level of an event.
 */
public class RTPriorityCode extends MMCodeSet {

	private final static AtomicReference<RTPriorityCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Priority level is urgent (highest priority possible)
	 */
	public final MMCode codeUrgent = new MMCode() {
		{
			super.owner_lazy = () -> RTPriorityCode.repoType();
			super.codeName = "URGT";
			super.name = "Urgent";
			super.definition = "Priority level is urgent (highest priority possible)";
		}
	};
	/**
	 * Priority level is high.
	 */
	public final MMCode codeHigh = new MMCode() {
		{
			super.owner_lazy = () -> RTPriorityCode.repoType();
			super.codeName = "HIGH";
			super.name = "High";
			super.definition = "Priority level is high.";
		}
	};
	/**
	 * Priority level is normal.
	 */
	public final MMCode codeNormal = new MMCode() {
		{
			super.owner_lazy = () -> RTPriorityCode.repoType();
			super.codeName = "NORM";
			super.name = "Normal";
			super.definition = "Priority level is normal.";
		}
	};
	/**
	 * Priority level is low.
	 */
	public final MMCode codeLow = new MMCode() {
		{
			super.owner_lazy = () -> RTPriorityCode.repoType();
			super.codeName = "LOWW";
			super.name = "Low";
			super.definition = "Priority level is low.";
		}
	};

	public static RTPriorityCode repoType() {
		repoTypeRef.compareAndSet(null, new RTPriorityCode());
		return repoTypeRef.get();
	}

	private RTPriorityCode() {
		super.code = Arrays.asList(codeUrgent, codeHigh, codeNormal, codeLow);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PriorityCode";
		super.definition = "Specifies the priority level of an event.";
		super.example = Arrays.asList("URGT");
	} }