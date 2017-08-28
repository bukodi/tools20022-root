package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTCivilStatusCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the civil status of a person.
 */
public class RTCivilStatusCode extends MMCodeSet {

	private final static AtomicReference<RTCivilStatusCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Person is single.
	 */
	public final MMCode codeSingle = new MMCode() {
		{
			super.owner_lazy = () -> RTCivilStatusCode.repoType();
			super.codeName = "SING";
			super.name = "Single";
			super.definition = "Person is single.";
		}
	};
	/**
	 * Person is married.
	 */
	public final MMCode codeMarried = new MMCode() {
		{
			super.owner_lazy = () -> RTCivilStatusCode.repoType();
			super.codeName = "MARR";
			super.name = "Married";
			super.definition = "Person is married.";
		}
	};
	/**
	 * Person is legally divorced.
	 */
	public final MMCode codeLegallyDivorced = new MMCode() {
		{
			super.owner_lazy = () -> RTCivilStatusCode.repoType();
			super.codeName = "LDIV";
			super.name = "LegallyDivorced";
			super.definition = "Person is legally divorced.";
		}
	};
	/**
	 * Person is divorced.
	 */
	public final MMCode codeDivorced = new MMCode() {
		{
			super.owner_lazy = () -> RTCivilStatusCode.repoType();
			super.codeName = "DIVO";
			super.name = "Divorced";
			super.definition = "Person is divorced.";
		}
	};
	/**
	 * Person is a widower.
	 */
	public final MMCode codeWidow = new MMCode() {
		{
			super.owner_lazy = () -> RTCivilStatusCode.repoType();
			super.codeName = "WIDO";
			super.name = "Widow";
			super.definition = "Person is a widower.";
		}
	};
	/**
	 * Person is in a stable union.
	 */
	public final MMCode codeStableUnion = new MMCode() {
		{
			super.owner_lazy = () -> RTCivilStatusCode.repoType();
			super.codeName = "UNIO";
			super.name = "StableUnion";
			super.definition = "Person is in a stable union.";
		}
	};
	/**
	 * Person is separated.
	 */
	public final MMCode codeSeparated = new MMCode() {
		{
			super.owner_lazy = () -> RTCivilStatusCode.repoType();
			super.codeName = "SEPA";
			super.name = "Separated";
			super.definition = "Person is separated.";
		}
	};

	public static RTCivilStatusCode repoType() {
		repoTypeRef.compareAndSet(null, new RTCivilStatusCode());
		return repoTypeRef.get();
	}

	private RTCivilStatusCode() {
		super.code = Arrays.asList(codeSingle, codeMarried,
				codeLegallyDivorced, codeDivorced, codeWidow, codeStableUnion,
				codeSeparated);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CivilStatusCode";
		super.definition = "Specifies the civil status of a person.";
	} }