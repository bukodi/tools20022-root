package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.AccountLevelCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class AccountLevelCode extends MMCodeSet {

	private final static AtomicReference<AccountLevelCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeIntermediate = new MMCode() {
		{
			super.owner_lazy = () -> AccountLevelCode.repoType();
			super.codeName = "INTM";
			super.name = "Intermediate";
			super.definition = "Intermediate level within an account hierarchy.";
		}
	};
	public final MMCode codeSummary = new MMCode() {
		{
			super.owner_lazy = () -> AccountLevelCode.repoType();
			super.codeName = "SMRY";
			super.name = "Summary";
			super.definition = "Highest level within an account hierarchy.";
		}
	};
	public final MMCode codeDetail = new MMCode() {
		{
			super.owner_lazy = () -> AccountLevelCode.repoType();
			super.codeName = "DETL";
			super.name = "Detail";
			super.definition = "Account is a real deposit/current account.";
		}
	};

	public static AccountLevelCode repoType() {
		repoTypeRef.compareAndSet(null, new AccountLevelCode());
		return repoTypeRef.get();
	}

	private AccountLevelCode() {
		super.code = Arrays.asList(codeIntermediate, codeSummary, codeDetail);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AccountLevelCode";
		super.definition = "Defines the level of an account within the account hierarchy.";
		super.example = Arrays.asList("INTM");
	}
}