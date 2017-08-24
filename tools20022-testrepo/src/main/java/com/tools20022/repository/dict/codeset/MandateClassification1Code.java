package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.MandateClassification1Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class MandateClassification1Code extends MMCodeSet {

	private final static AtomicReference<MandateClassification1Code> repoTypeRef = new AtomicReference<>();
	public final MMCode codeFixed = new MMCode() {
		{
			super.owner_lazy = () -> MandateClassification1Code.repoType();
			super.name = "Fixed";
		}
	};
	public final MMCode codeUsageBased = new MMCode() {
		{
			super.owner_lazy = () -> MandateClassification1Code.repoType();
			super.name = "UsageBased";
		}
	};
	public final MMCode codeVariable = new MMCode() {
		{
			super.owner_lazy = () -> MandateClassification1Code.repoType();
			super.name = "Variable";
		}
	};

	public static MandateClassification1Code repoType() {
		repoTypeRef.compareAndSet(null, new MandateClassification1Code());
		return repoTypeRef.get();
	}

	private MandateClassification1Code() {
		super.code = Arrays.asList(codeFixed, codeUsageBased, codeVariable);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "MandateClassification1Code";
		super.definition = "Specifies the type of direct debit amount, such as fixed or variable.";
	}
}