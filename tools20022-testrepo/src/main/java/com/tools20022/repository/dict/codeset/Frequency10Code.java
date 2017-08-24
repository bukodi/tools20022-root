package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.Frequency10Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class Frequency10Code extends MMCodeSet {

	private final static AtomicReference<Frequency10Code> repoTypeRef = new AtomicReference<>();
	public final MMCode codeNever = new MMCode() {
		{
			super.owner_lazy = () -> Frequency10Code.repoType();
			super.name = "Never";
		}
	};
	public final MMCode codeAnnual = new MMCode() {
		{
			super.owner_lazy = () -> Frequency10Code.repoType();
			super.name = "Annual";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeRate = new MMCode() {
		{
			super.owner_lazy = () -> Frequency10Code.repoType();
			super.name = "Rate";
		}
	};
	public final MMCode codeSemiAnnual = new MMCode() {
		{
			super.owner_lazy = () -> Frequency10Code.repoType();
			super.name = "SemiAnnual";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeQuarterly = new MMCode() {
		{
			super.owner_lazy = () -> Frequency10Code.repoType();
			super.name = "Quarterly";
			super.semanticMarkup = Arrays.asList();
		}
	};

	public static Frequency10Code repoType() {
		repoTypeRef.compareAndSet(null, new Frequency10Code());
		return repoTypeRef.get();
	}

	private Frequency10Code() {
		super.code = Arrays.asList(codeNever, codeAnnual, codeRate,
				codeSemiAnnual, codeQuarterly);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Frequency10Code";
		super.definition = "Specifies the regularity of an event.";
	}
}