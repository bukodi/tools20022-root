package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.ResidentialStatusCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class ResidentialStatusCode extends MMCodeSet {

	private final static AtomicReference<ResidentialStatusCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeResident = new MMCode() {
		{
			super.owner_lazy = () -> ResidentialStatusCode.repoType();
			super.codeName = "RESI";
			super.name = "Resident";
			super.definition = "Resident.";
		}
	};
	public final MMCode codePermanentResident = new MMCode() {
		{
			super.owner_lazy = () -> ResidentialStatusCode.repoType();
			super.codeName = "PRES";
			super.name = "PermanentResident";
			super.definition = "Permanent resident.";
		}
	};
	public final MMCode codeNonResident = new MMCode() {
		{
			super.owner_lazy = () -> ResidentialStatusCode.repoType();
			super.codeName = "NRES";
			super.name = "NonResident";
			super.definition = "Non-resident.";
		}
	};

	public static ResidentialStatusCode repoType() {
		repoTypeRef.compareAndSet(null, new ResidentialStatusCode());
		return repoTypeRef.get();
	}

	private ResidentialStatusCode() {
		super.code = Arrays.asList(codeResident, codePermanentResident,
				codeNonResident);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ResidentialStatusCode";
		super.definition = "Specifies the residential status of an individual.";
		super.example = Arrays.asList("RESI");
	}
}