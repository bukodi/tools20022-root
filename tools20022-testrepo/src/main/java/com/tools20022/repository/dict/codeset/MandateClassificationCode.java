package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.MandateClassificationCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class MandateClassificationCode extends MMCodeSet {

	private final static AtomicReference<MandateClassificationCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeFixed = new MMCode() {
		{
			super.owner_lazy = () -> MandateClassificationCode.repoType();
			super.codeName = "FIXE";
			super.name = "Fixed";
			super.definition = "Direct debit amount is fixed.";
		}
	};
	public final MMCode codeVariable = new MMCode() {
		{
			super.owner_lazy = () -> MandateClassificationCode.repoType();
			super.codeName = "VARI";
			super.name = "Variable";
			super.definition = "Direct debit amount is variable.";
		}
	};
	public final MMCode codeUsageBased = new MMCode() {
		{
			super.owner_lazy = () -> MandateClassificationCode.repoType();
			super.codeName = "USGB";
			super.name = "UsageBased";
			super.definition = "Direct debit amount is based on usage.";
		}
	};

	public static MandateClassificationCode repoType() {
		repoTypeRef.compareAndSet(null, new MandateClassificationCode());
		return repoTypeRef.get();
	}

	private MandateClassificationCode() {
		super.code = Arrays.asList(codeFixed, codeVariable, codeUsageBased);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "MandateClassificationCode";
		super.definition = "Specifies the type of direct debit amount, such as fixed or variable.";
		super.example = Arrays.asList("FIXE");
	}
}