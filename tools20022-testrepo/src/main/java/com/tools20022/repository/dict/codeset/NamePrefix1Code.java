package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.NamePrefix1Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class NamePrefix1Code extends MMCodeSet {

	private final static AtomicReference<NamePrefix1Code> repoTypeRef = new AtomicReference<>();
	public final MMCode codeDoctor = new MMCode() {
		{
			super.owner_lazy = () -> NamePrefix1Code.repoType();
			super.codeName = "DOCT";
			super.name = "Doctor";
			super.definition = "Title of the person is Doctor or Dr.";
		}
	};
	public final MMCode codeMister = new MMCode() {
		{
			super.owner_lazy = () -> NamePrefix1Code.repoType();
			super.codeName = "MIST";
			super.name = "Mister";
			super.definition = "Title of the person is Mister or Mr.";
		}
	};
	public final MMCode codeMiss = new MMCode() {
		{
			super.owner_lazy = () -> NamePrefix1Code.repoType();
			super.codeName = "MISS";
			super.name = "Miss";
			super.definition = "Title of the person is Miss.";
		}
	};
	public final MMCode codeMadam = new MMCode() {
		{
			super.owner_lazy = () -> NamePrefix1Code.repoType();
			super.codeName = "MADM";
			super.name = "Madam";
			super.definition = "Title of the person is Madam.";
		}
	};

	public static NamePrefix1Code repoType() {
		repoTypeRef.compareAndSet(null, new NamePrefix1Code());
		return repoTypeRef.get();
	}

	private NamePrefix1Code() {
		super.code = Arrays.asList(codeDoctor, codeMister, codeMiss, codeMadam);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "NamePrefix1Code";
		super.definition = "Specifies the terms used to formally address a person.";
		super.example = Arrays.asList("DOCT");
	}
}