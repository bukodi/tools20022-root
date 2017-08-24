package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.AddressType2Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class AddressType2Code extends MMCodeSet {

	private final static AtomicReference<AddressType2Code> repoTypeRef = new AtomicReference<>();
	public final MMCode codePostal = new MMCode() {
		{
			super.owner_lazy = () -> AddressType2Code.repoType();
			super.name = "Postal";
		}
	};
	public final MMCode codePOBox = new MMCode() {
		{
			super.owner_lazy = () -> AddressType2Code.repoType();
			super.name = "POBox";
		}
	};
	public final MMCode codeResidential = new MMCode() {
		{
			super.owner_lazy = () -> AddressType2Code.repoType();
			super.name = "Residential";
		}
	};
	public final MMCode codeBusiness = new MMCode() {
		{
			super.owner_lazy = () -> AddressType2Code.repoType();
			super.name = "Business";
		}
	};
	public final MMCode codeMailTo = new MMCode() {
		{
			super.owner_lazy = () -> AddressType2Code.repoType();
			super.name = "MailTo";
		}
	};
	public final MMCode codeDeliveryTo = new MMCode() {
		{
			super.owner_lazy = () -> AddressType2Code.repoType();
			super.name = "DeliveryTo";
		}
	};

	public static AddressType2Code repoType() {
		repoTypeRef.compareAndSet(null, new AddressType2Code());
		return repoTypeRef.get();
	}

	private AddressType2Code() {
		super.code = Arrays.asList(codePostal, codePOBox, codeResidential,
				codeBusiness, codeMailTo, codeDeliveryTo);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AddressType2Code";
		super.definition = "Specifies the type of address.";
		super.example = Arrays.asList("ADDR");
	}
}