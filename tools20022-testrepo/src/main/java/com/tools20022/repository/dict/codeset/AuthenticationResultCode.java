package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.AuthenticationResultCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class AuthenticationResultCode extends MMCodeSet {

	private final static AtomicReference<AuthenticationResultCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeDenial = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationResultCode.repoType();
			super.codeName = "DENY";
			super.name = "Denial";
			super.definition = "The authentication didn’t succeed";
		}
	};
	public final MMCode codeNonParticipation = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationResultCode.repoType();
			super.codeName = "CARD";
			super.name = "NonParticipation";
			super.definition = "The card does not participate in the authentication programme";
		}
	};
	public final MMCode codeUnableToAuthenticate = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationResultCode.repoType();
			super.codeName = "AUTH";
			super.name = "UnableToAuthenticate";
			super.definition = "The authentication couldn’t be carried out";
		}
	};
	public final MMCode codeMerchantNotEnroled = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationResultCode.repoType();
			super.codeName = "MRCH";
			super.name = "MerchantNotEnroled";
			super.definition = "Merchant not enrolled in the authentication programme";
		}
	};
	public final MMCode codeWithCryptogram = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationResultCode.repoType();
			super.codeName = "CRPT";
			super.name = "WithCryptogram";
			super.definition = "Authentication succeeded with a cryptogram";
		}
	};
	public final MMCode codeWithoutCryptogram = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationResultCode.repoType();
			super.codeName = "UCRP";
			super.name = "WithoutCryptogram";
			super.definition = "Authentication succeeded without a cryptogram";
		}
	};

	public static AuthenticationResultCode repoType() {
		repoTypeRef.compareAndSet(null, new AuthenticationResultCode());
		return repoTypeRef.get();
	}

	private AuthenticationResultCode() {
		super.code = Arrays.asList(codeDenial, codeNonParticipation,
				codeUnableToAuthenticate, codeMerchantNotEnroled,
				codeWithCryptogram, codeWithoutCryptogram);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AuthenticationResultCode";
		super.definition = "Specifies the result of authentication done";
	}
}