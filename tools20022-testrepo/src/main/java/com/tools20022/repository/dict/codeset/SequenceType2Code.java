package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.SequenceType2Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class SequenceType2Code extends MMCodeSet {

	private final static AtomicReference<SequenceType2Code> repoTypeRef = new AtomicReference<>();
	public final MMCode codeRecurring = new MMCode() {
		{
			super.owner_lazy = () -> SequenceType2Code.repoType();
			super.name = "Recurring";
		}
	};
	public final MMCode codeOneOff = new MMCode() {
		{
			super.owner_lazy = () -> SequenceType2Code.repoType();
			super.name = "OneOff";
		}
	};

	public static SequenceType2Code repoType() {
		repoTypeRef.compareAndSet(null, new SequenceType2Code());
		return repoTypeRef.get();
	}

	private SequenceType2Code() {
		super.code = Arrays.asList(codeRecurring, codeOneOff);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "SequenceType2Code";
		super.definition = "Specifies whether a once off transaction is covered or whether recurring transactions are covered.";
		super.example = Arrays.asList("RCUR");
	}
}