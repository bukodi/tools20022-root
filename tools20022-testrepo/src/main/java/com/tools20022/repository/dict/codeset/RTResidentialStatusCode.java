package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTResidentialStatusCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the residential status of an individual.
 */
public class RTResidentialStatusCode extends MMCodeSet {

	private final static AtomicReference<RTResidentialStatusCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Resident.
	 */
	public final MMCode codeResident = new MMCode() {
		{
			super.owner_lazy = () -> RTResidentialStatusCode.repoType();
			super.codeName = "RESI";
			super.name = "Resident";
			super.definition = "Resident.";
		}
	};
	/**
	 * Permanent resident.
	 */
	public final MMCode codePermanentResident = new MMCode() {
		{
			super.owner_lazy = () -> RTResidentialStatusCode.repoType();
			super.codeName = "PRES";
			super.name = "PermanentResident";
			super.definition = "Permanent resident.";
		}
	};
	/**
	 * Non-resident.
	 */
	public final MMCode codeNonResident = new MMCode() {
		{
			super.owner_lazy = () -> RTResidentialStatusCode.repoType();
			super.codeName = "NRES";
			super.name = "NonResident";
			super.definition = "Non-resident.";
		}
	};

	public static RTResidentialStatusCode repoType() {
		repoTypeRef.compareAndSet(null, new RTResidentialStatusCode());
		return repoTypeRef.get();
	}

	private RTResidentialStatusCode() {
		super.code = Arrays.asList(codeResident, codePermanentResident,
				codeNonResident);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ResidentialStatusCode";
		super.definition = "Specifies the residential status of an individual.";
		super.example = Arrays.asList("RESI");
	} }