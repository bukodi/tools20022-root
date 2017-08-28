package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTTypeOfIdentificationCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the type of alternate identification which can be used to give an alternate identification of the party identified.
 */
public class RTTypeOfIdentificationCode extends MMCodeSet {

	private final static AtomicReference<RTTypeOfIdentificationCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Number assigned by a government agency to identify foreign nationals.
	 */
	public final MMCode codeAlienRegistrationNumber = new MMCode() {
		{
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "ARNU";
			super.name = "AlienRegistrationNumber";
			super.definition = "Number assigned by a government agency to identify foreign nationals.";
		}
	};
	/**
	 * Number assigned by a passport authority.
	 */
	public final MMCode codePassportNumber = new MMCode() {
		{
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "CCPT";
			super.name = "PassportNumber";
			super.definition = "Number assigned by a passport authority.";
		}
	};
	/**
	 * Number assigned to a tax exempt entity.
	 */
	public final MMCode codeTaxExemptIdentificationNumber = new MMCode() {
		{
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "CHTY";
			super.name = "TaxExemptIdentificationNumber";
			super.definition = "Number assigned to a tax exempt entity.";
		}
	};
	/**
	 * Number assigned to a corporate entity.
	 */
	public final MMCode codeCorporateIdentification = new MMCode() {
		{
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "CORP";
			super.name = "CorporateIdentification";
			super.definition = "Number assigned to a corporate entity.";
		}
	};
	/**
	 * Number assigned to a driver's license.
	 */
	public final MMCode codeDriverLicenseNumber = new MMCode() {
		{
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "DRLC";
			super.name = "DriverLicenseNumber";
			super.definition = "Number assigned to a driver's license.";
		}
	};
	/**
	 * Number assigned to a foreign investor (other than the alien number).
	 */
	public final MMCode codeForeignInvestmentIdentityNumber = new MMCode() {
		{
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "FIIN";
			super.name = "ForeignInvestmentIdentityNumber";
			super.definition = "Number assigned to a foreign investor (other than the alien number).";
		}
	};
	/**
	 * Number assigned by a tax authority to an entity.
	 */
	public final MMCode codeTaxIdentificationNumber = new MMCode() {
		{
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "TXID";
			super.name = "TaxIdentificationNumber";
			super.definition = "Number assigned by a tax authority to an entity.";
		}
	};

	public static RTTypeOfIdentificationCode repoType() {
		repoTypeRef.compareAndSet(null, new RTTypeOfIdentificationCode());
		return repoTypeRef.get();
	}

	private RTTypeOfIdentificationCode() {
		super.code = Arrays.asList(codeAlienRegistrationNumber,
				codePassportNumber, codeTaxExemptIdentificationNumber,
				codeCorporateIdentification, codeDriverLicenseNumber,
				codeForeignInvestmentIdentityNumber,
				codeTaxIdentificationNumber);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "TypeOfIdentificationCode";
		super.definition = "Specifies the type of alternate identification which can be used to give an alternate identification of the party identified.";
		super.example = Arrays.asList("ARNU");
	} }