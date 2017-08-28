package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTAuthenticationResultCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the result of authentication done
 */
public class RTAuthenticationResultCode extends MMCodeSet {

	private final static AtomicReference<RTAuthenticationResultCode> repoTypeRef = new AtomicReference<>();
	/**
	 * The authentication didn’t succeed
	 */
	public final MMCode codeDenial = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "DENY";
			super.name = "Denial";
			super.definition = "The authentication didn’t succeed";
		}
	};
	/**
	 * The card does not participate in the authentication programme
	 */
	public final MMCode codeNonParticipation = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "CARD";
			super.name = "NonParticipation";
			super.definition = "The card does not participate in the authentication programme";
		}
	};
	/**
	 * The authentication couldn’t be carried out
	 */
	public final MMCode codeUnableToAuthenticate = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "AUTH";
			super.name = "UnableToAuthenticate";
			super.definition = "The authentication couldn’t be carried out";
		}
	};
	/**
	 * Merchant not enrolled in the authentication programme
	 */
	public final MMCode codeMerchantNotEnroled = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "MRCH";
			super.name = "MerchantNotEnroled";
			super.definition = "Merchant not enrolled in the authentication programme";
		}
	};
	/**
	 * Authentication succeeded with a cryptogram
	 */
	public final MMCode codeWithCryptogram = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "CRPT";
			super.name = "WithCryptogram";
			super.definition = "Authentication succeeded with a cryptogram";
		}
	};
	/**
	 * Authentication succeeded without a cryptogram
	 */
	public final MMCode codeWithoutCryptogram = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "UCRP";
			super.name = "WithoutCryptogram";
			super.definition = "Authentication succeeded without a cryptogram";
		}
	};

	public static RTAuthenticationResultCode repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthenticationResultCode());
		return repoTypeRef.get();
	}

	private RTAuthenticationResultCode() {
		super.code = Arrays.asList(codeDenial, codeNonParticipation,
				codeUnableToAuthenticate, codeMerchantNotEnroled,
				codeWithCryptogram, codeWithoutCryptogram);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AuthenticationResultCode";
		super.definition = "Specifies the result of authentication done";
	} }