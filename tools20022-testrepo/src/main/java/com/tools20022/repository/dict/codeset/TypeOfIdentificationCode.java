package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.TypeOfIdentificationCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class TypeOfIdentificationCode extends MMCodeSet {

	private final static AtomicReference<TypeOfIdentificationCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeAlienRegistrationNumber = new MMCode() {
		{
			super.owner_lazy = () -> TypeOfIdentificationCode.repoType();
			super.codeName = "ARNU";
			super.name = "AlienRegistrationNumber";
			super.definition = "Number assigned by a government agency to identify foreign nationals.";
		}
	};
	public final MMCode codePassportNumber = new MMCode() {
		{
			super.owner_lazy = () -> TypeOfIdentificationCode.repoType();
			super.codeName = "CCPT";
			super.name = "PassportNumber";
			super.definition = "Number assigned by a passport authority.";
		}
	};
	public final MMCode codeTaxExemptIdentificationNumber = new MMCode() {
		{
			super.owner_lazy = () -> TypeOfIdentificationCode.repoType();
			super.codeName = "CHTY";
			super.name = "TaxExemptIdentificationNumber";
			super.definition = "Number assigned to a tax exempt entity.";
		}
	};
	public final MMCode codeCorporateIdentification = new MMCode() {
		{
			super.owner_lazy = () -> TypeOfIdentificationCode.repoType();
			super.codeName = "CORP";
			super.name = "CorporateIdentification";
			super.definition = "Number assigned to a corporate entity.";
		}
	};
	public final MMCode codeDriverLicenseNumber = new MMCode() {
		{
			super.owner_lazy = () -> TypeOfIdentificationCode.repoType();
			super.codeName = "DRLC";
			super.name = "DriverLicenseNumber";
			super.definition = "Number assigned to a driver's license.";
		}
	};
	public final MMCode codeForeignInvestmentIdentityNumber = new MMCode() {
		{
			super.owner_lazy = () -> TypeOfIdentificationCode.repoType();
			super.codeName = "FIIN";
			super.name = "ForeignInvestmentIdentityNumber";
			super.definition = "Number assigned to a foreign investor (other than the alien number).";
		}
	};
	public final MMCode codeTaxIdentificationNumber = new MMCode() {
		{
			super.owner_lazy = () -> TypeOfIdentificationCode.repoType();
			super.codeName = "TXID";
			super.name = "TaxIdentificationNumber";
			super.definition = "Number assigned by a tax authority to an entity.";
		}
	};

	public static TypeOfIdentificationCode repoType() {
		repoTypeRef.compareAndSet(null, new TypeOfIdentificationCode());
		return repoTypeRef.get();
	}

	private TypeOfIdentificationCode() {
		super.code = Arrays.asList(codeAlienRegistrationNumber,
				codePassportNumber, codeTaxExemptIdentificationNumber,
				codeCorporateIdentification, codeDriverLicenseNumber,
				codeForeignInvestmentIdentityNumber,
				codeTaxIdentificationNumber);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "TypeOfIdentificationCode";
		super.definition = "Specifies the type of alternate identification which can be used to give an alternate identification of the party identified.";
		super.example = Arrays.asList("ARNU");
	}
}