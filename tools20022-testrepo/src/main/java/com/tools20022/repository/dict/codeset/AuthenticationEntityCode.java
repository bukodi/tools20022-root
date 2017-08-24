package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.AuthenticationEntityCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class AuthenticationEntityCode extends MMCodeSet {

	private final static AtomicReference<AuthenticationEntityCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeICC = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "ICCD";
			super.name = "ICC";
			super.definition = "Application in the chip card (Integrated Circuit Card), for instance an offline PIN verification.";
		}
	};
	public final MMCode codeAuthorisedAgent = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "AGNT";
			super.name = "AuthorisedAgent";
			super.definition = "Authorisation agent of the issuer.";
		}
	};
	public final MMCode codeMerchant = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "MERC";
			super.name = "Merchant";
			super.definition = "Merchant (for example signature verification by the attendant).";
		}
	};
	public final MMCode codeAcquirer = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "ACQR";
			super.name = "Acquirer";
			super.definition = "Acquirer of the transaction.";
		}
	};
	public final MMCode codeIssuer = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "ISSR";
			super.name = "Issuer";
			super.definition = "Card issuer.";
		}
	};
	public final MMCode codeTerminal = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "TRML";
			super.name = "Terminal";
			super.definition = "Secure application in the terminal.";
		}
	};

	public static AuthenticationEntityCode repoType() {
		repoTypeRef.compareAndSet(null, new AuthenticationEntityCode());
		return repoTypeRef.get();
	}

	private AuthenticationEntityCode() {
		super.code = Arrays.asList(codeICC, codeAuthorisedAgent, codeMerchant,
				codeAcquirer, codeIssuer, codeTerminal);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AuthenticationEntityCode";
		super.definition = "Entity or object in charge of verifying the cardholder authenticity.";
		super.example = Arrays.asList("ICCD");
	}
}