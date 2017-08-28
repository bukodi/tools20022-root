package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTPINFormatCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * PIN (Personal Identification Number) format used to encrypt the PIN block.
 */
public class RTPINFormatCode extends MMCodeSet {

	private final static AtomicReference<RTPINFormatCode> repoTypeRef = new AtomicReference<>();
	/**
	 * PIN diversified with the card account number, conforming to the standard ISO 9564-2.
	 */
	public final MMCode codeISO0 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO0";
			super.name = "ISO0";
			super.definition = "PIN diversified with the card account number, conforming to the standard ISO 9564-2.";
		}
	};
	/**
	 * PIN completed with random padding characters, conforming to the standard ISO 9564-2.
	 */
	public final MMCode codeISO1 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO1";
			super.name = "ISO1";
			super.definition = "PIN completed with random padding characters, conforming to the standard ISO 9564-2.";
		}
	};
	/**
	 * PIN without diversification characters, conforming to the standard ISO 9564-2.
	 */
	public final MMCode codeISO2 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO2";
			super.name = "ISO2";
			super.definition = "PIN without diversification characters, conforming to the standard ISO 9564-2.";
		}
	};
	/**
	 * PIN diversified with the card account number and random characters, conforming to the standard ISO 9564-2.
	 */
	public final MMCode codeISO3 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO3";
			super.name = "ISO3";
			super.definition = "PIN diversified with the card account number and random characters, conforming to the standard ISO 9564-2.";
		}
	};
	/**
	 * PIN format used with AES encryption, conforming to the new ISO SC2 format.
	 */
	public final MMCode codeISO4 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO4";
			super.name = "ISO4";
			super.definition = "PIN format used with AES encryption, conforming to the new ISO SC2 format.";
		}
	};
	/**
	 * Alternative PIN format used with AES encryption, conforming to the new ISO SC2 format.
	 */
	public final MMCode codeISO5 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO5";
			super.name = "ISO5";
			super.definition = "Alternative PIN format used with AES encryption, conforming to the new ISO SC2 format.";
		}
	};
	/**
	 * ANSI 0 PIN block format.
	 */
	public final MMCode codeANSI0 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ANSI";
			super.name = "ANSI0";
			super.definition = "ANSI 0 PIN block format.";
		}
	};
	/**
	 * Italian Bancomat PIN block format.
	 */
	public final MMCode codeBancomat = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "BNCM";
			super.name = "Bancomat";
			super.definition = "Italian Bancomat PIN block format.";
		}
	};
	/**
	 * Banksys PIN block format.
	 */
	public final MMCode codeBanksys = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "BKSY";
			super.name = "Banksys";
			super.definition = "Banksys PIN block format.";
		}
	};
	/**
	 * Diebold PIN block format.
	 */
	public final MMCode codeDiebold = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "DBLD";
			super.name = "Diebold";
			super.definition = "Diebold PIN block format.";
		}
	};
	/**
	 * Diebold CO PIN block format.
	 */
	public final MMCode codeDieboldCO = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "DBLC";
			super.name = "DieboldCO";
			super.definition = "Diebold CO PIN block format.";
		}
	};
	/**
	 * ECI2 PIN block format.
	 */
	public final MMCode codeECI2 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ECI2";
			super.name = "ECI2";
			super.definition = "ECI2 PIN block format.";
		}
	};
	/**
	 * ECI3 PIN block format.
	 */
	public final MMCode codeECI3 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ECI3";
			super.name = "ECI3";
			super.definition = "ECI3 PIN block format.";
		}
	};
	/**
	 * EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key for the PIN.
	 */
	public final MMCode codeEMVRSA = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "EMVS";
			super.name = "EMVRSA";
			super.definition = "EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key for the PIN.";
		}
	};
	/**
	 * IBM 3624 PIN block format.
	 */
	public final MMCode codeIBM3624 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "IBM3";
			super.name = "IBM3624";
			super.definition = "IBM 3624 PIN block format.";
		}
	};
	/**
	 * VISA2 PIN block format.
	 */
	public final MMCode codeVISA2 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "VIS2";
			super.name = "VISA2";
			super.definition = "VISA2 PIN block format.";
		}
	};
	/**
	 * VISA3 PIN block format.
	 */
	public final MMCode codeVISA3 = new MMCode() {
		{
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "VIS3";
			super.name = "VISA3";
			super.definition = "VISA3 PIN block format.";
		}
	};

	public static RTPINFormatCode repoType() {
		repoTypeRef.compareAndSet(null, new RTPINFormatCode());
		return repoTypeRef.get();
	}

	private RTPINFormatCode() {
		super.code = Arrays.asList(codeISO0, codeISO1, codeISO2, codeISO3,
				codeISO4, codeISO5, codeANSI0, codeBancomat, codeBanksys,
				codeDiebold, codeDieboldCO, codeECI2, codeECI3, codeEMVRSA,
				codeIBM3624, codeVISA2, codeVISA3);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PINFormatCode";
		super.definition = "PIN (Personal Identification Number) format used to encrypt the PIN block.";
		super.example = Arrays.asList("ISO0");
	} }