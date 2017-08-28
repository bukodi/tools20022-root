package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTAccountLevelCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Defines the level of an account within the account hierarchy.
 */
public class RTAccountLevelCode extends MMCodeSet {

	private final static AtomicReference<RTAccountLevelCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Intermediate level within an account hierarchy.
	 */
	public final MMCode codeIntermediate = new MMCode() {
		{
			super.owner_lazy = () -> RTAccountLevelCode.repoType();
			super.codeName = "INTM";
			super.name = "Intermediate";
			super.definition = "Intermediate level within an account hierarchy.";
		}
	};
	/**
	 * Highest level within an account hierarchy.
	 */
	public final MMCode codeSummary = new MMCode() {
		{
			super.owner_lazy = () -> RTAccountLevelCode.repoType();
			super.codeName = "SMRY";
			super.name = "Summary";
			super.definition = "Highest level within an account hierarchy.";
		}
	};
	/**
	 * Account is a real deposit/current account.
	 */
	public final MMCode codeDetail = new MMCode() {
		{
			super.owner_lazy = () -> RTAccountLevelCode.repoType();
			super.codeName = "DETL";
			super.name = "Detail";
			super.definition = "Account is a real deposit/current account.";
		}
	};

	public static RTAccountLevelCode repoType() {
		repoTypeRef.compareAndSet(null, new RTAccountLevelCode());
		return repoTypeRef.get();
	}

	private RTAccountLevelCode() {
		super.code = Arrays.asList(codeIntermediate, codeSummary, codeDetail);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AccountLevelCode";
		super.definition = "Defines the level of an account within the account hierarchy.";
		super.example = Arrays.asList("INTM");
	} }