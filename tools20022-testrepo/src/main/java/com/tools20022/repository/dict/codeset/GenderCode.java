package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.GenderCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class GenderCode extends MMCodeSet {

	private final static AtomicReference<GenderCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeMale = new MMCode() {
		{
			super.owner_lazy = () -> GenderCode.repoType();
			super.codeName = "MALE";
			super.name = "Male";
			super.definition = "Individual is a male.";
		}
	};
	public final MMCode codeFemale = new MMCode() {
		{
			super.owner_lazy = () -> GenderCode.repoType();
			super.codeName = "FEMA";
			super.name = "Female";
			super.definition = "Individual is a female.";
		}
	};

	public static GenderCode repoType() {
		repoTypeRef.compareAndSet(null, new GenderCode());
		return repoTypeRef.get();
	}

	private GenderCode() {
		super.code = Arrays.asList(codeMale, codeFemale);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "GenderCode";
		super.definition = "Specifies the gender of a person.";
		super.example = Arrays.asList("MALE");
	}
}