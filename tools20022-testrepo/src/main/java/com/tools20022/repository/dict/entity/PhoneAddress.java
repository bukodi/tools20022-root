package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.PhoneAddress;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class PhoneAddress extends MMBusinessComponent {

	private final static AtomicReference<PhoneAddress> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrPhoneNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PhoneAddress.repoType();
			super.name = "PhoneNumber";
			super.definition = "Collection of information that identifies a phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrFaxNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PhoneAddress.repoType();
			super.name = "FaxNumber";
			super.definition = "Collection of information that identifies a FAX number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrMobileNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PhoneAddress.repoType();
			super.name = "MobileNumber";
			super.definition = "Collection of information that identifies a mobile phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static PhoneAddress repoType() {
		repoTypeRef.compareAndSet(null, new PhoneAddress());
		return repoTypeRef.get();
	}

	private PhoneAddress() {
		super.element = Arrays.asList(attrPhoneNumber, attrFaxNumber,
				attrMobileNumber);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PhoneAddress";
		super.definition = "Collection of information that identifies a phone address.";
	}
}