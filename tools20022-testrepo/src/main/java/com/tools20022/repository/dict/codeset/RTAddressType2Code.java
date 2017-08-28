package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTAddressType2Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the type of address.
 */
public class RTAddressType2Code extends MMCodeSet {

	private final static AtomicReference<RTAddressType2Code> repoTypeRef = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public final MMCode codePostal = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "Postal";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codePOBox = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "POBox";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeResidential = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "Residential";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeBusiness = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "Business";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeMailTo = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "MailTo";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeDeliveryTo = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressType2Code.repoType();
			super.name = "DeliveryTo";
		}
	};

	public static RTAddressType2Code repoType() {
		repoTypeRef.compareAndSet(null, new RTAddressType2Code());
		return repoTypeRef.get();
	}

	private RTAddressType2Code() {
		super.code = Arrays.asList(codePostal, codePOBox, codeResidential,
				codeBusiness, codeMailTo, codeDeliveryTo);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AddressType2Code";
		super.definition = "Specifies the type of address.";
		super.example = Arrays.asList("ADDR");
	} }