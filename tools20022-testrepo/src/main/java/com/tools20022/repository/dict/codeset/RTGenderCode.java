package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTGenderCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the gender of a person.
 */
public class RTGenderCode extends MMCodeSet {

	private final static AtomicReference<RTGenderCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Individual is a male.
	 */
	public final MMCode codeMale = new MMCode() {
		{
			super.owner_lazy = () -> RTGenderCode.repoType();
			super.codeName = "MALE";
			super.name = "Male";
			super.definition = "Individual is a male.";
		}
	};
	/**
	 * Individual is a female.
	 */
	public final MMCode codeFemale = new MMCode() {
		{
			super.owner_lazy = () -> RTGenderCode.repoType();
			super.codeName = "FEMA";
			super.name = "Female";
			super.definition = "Individual is a female.";
		}
	};

	public static RTGenderCode repoType() {
		repoTypeRef.compareAndSet(null, new RTGenderCode());
		return repoTypeRef.get();
	}

	private RTGenderCode() {
		super.code = Arrays.asList(codeMale, codeFemale);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "GenderCode";
		super.definition = "Specifies the gender of a person.";
		super.example = Arrays.asList("MALE");
	} }