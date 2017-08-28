package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTAddressTypeCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the type of address.
 */
public class RTAddressTypeCode extends MMCodeSet {

	private final static AtomicReference<RTAddressTypeCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Address is the home address.
	 */
	public final MMCode codeResidential = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "HOME";
			super.name = "Residential";
			super.definition = "Address is the home address.";
		}
	};
	/**
	 * Address is the business address.
	 */
	public final MMCode codeBusiness = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "BIZZ";
			super.name = "Business";
			super.definition = "Address is the business address.";
		}
	};
	/**
	 * Address is the complete postal address.
	 */
	public final MMCode codePostal = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "ADDR";
			super.name = "Postal";
			super.definition = "Address is the complete postal address.";
		}
	};
	/**
	 * Address is a postal office (PO) box.
	 */
	public final MMCode codePOBox = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "PBOX";
			super.name = "POBox";
			super.definition = "Address is a postal office (PO) box.";
		}
	};
	/**
	 * Address is the address to which mail is sent.
	 */
	public final MMCode codeMailTo = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "MLTO";
			super.name = "MailTo";
			super.definition = "Address is the address to which mail is sent.";
		}
	};
	/**
	 * Address is the address to which delivery is to take place.
	 */
	public final MMCode codeDeliveryTo = new MMCode() {
		{
			super.owner_lazy = () -> RTAddressTypeCode.repoType();
			super.codeName = "DLVY";
			super.name = "DeliveryTo";
			super.definition = "Address is the address to which delivery is to take place.";
		}
	};

	public static RTAddressTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new RTAddressTypeCode());
		return repoTypeRef.get();
	}

	private RTAddressTypeCode() {
		super.code = Arrays.asList(codeResidential, codeBusiness, codePostal,
				codePOBox, codeMailTo, codeDeliveryTo);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AddressTypeCode";
		super.definition = "Specifies the type of address.";
		super.example = Arrays.asList("HOME");
	} }