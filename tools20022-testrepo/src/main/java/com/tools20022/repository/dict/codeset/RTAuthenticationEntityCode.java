package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTAuthenticationEntityCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Entity or object in charge of verifying the cardholder authenticity.
 */
public class RTAuthenticationEntityCode extends MMCodeSet {

	private final static AtomicReference<RTAuthenticationEntityCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Application in the chip card (Integrated Circuit Card), for instance an offline PIN verification.
	 */
	public final MMCode codeICC = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationEntityCode.repoType();
			super.codeName = "ICCD";
			super.name = "ICC";
			super.definition = "Application in the chip card (Integrated Circuit Card), for instance an offline PIN verification.";
		}
	};
	/**
	 * Authorisation agent of the issuer.
	 */
	public final MMCode codeAuthorisedAgent = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationEntityCode.repoType();
			super.codeName = "AGNT";
			super.name = "AuthorisedAgent";
			super.definition = "Authorisation agent of the issuer.";
		}
	};
	/**
	 * Merchant (for example signature verification by the attendant).
	 */
	public final MMCode codeMerchant = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationEntityCode.repoType();
			super.codeName = "MERC";
			super.name = "Merchant";
			super.definition = "Merchant (for example signature verification by the attendant).";
		}
	};
	/**
	 * Acquirer of the transaction.
	 */
	public final MMCode codeAcquirer = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationEntityCode.repoType();
			super.codeName = "ACQR";
			super.name = "Acquirer";
			super.definition = "Acquirer of the transaction.";
		}
	};
	/**
	 * Card issuer.
	 */
	public final MMCode codeIssuer = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationEntityCode.repoType();
			super.codeName = "ISSR";
			super.name = "Issuer";
			super.definition = "Card issuer.";
		}
	};
	/**
	 * Secure application in the terminal.
	 */
	public final MMCode codeTerminal = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationEntityCode.repoType();
			super.codeName = "TRML";
			super.name = "Terminal";
			super.definition = "Secure application in the terminal.";
		}
	};

	public static RTAuthenticationEntityCode repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthenticationEntityCode());
		return repoTypeRef.get();
	}

	private RTAuthenticationEntityCode() {
		super.code = Arrays.asList(codeICC, codeAuthorisedAgent, codeMerchant,
				codeAcquirer, codeIssuer, codeTerminal);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AuthenticationEntityCode";
		super.definition = "Entity or object in charge of verifying the cardholder authenticity.";
		super.example = Arrays.asList("ICCD");
	} }