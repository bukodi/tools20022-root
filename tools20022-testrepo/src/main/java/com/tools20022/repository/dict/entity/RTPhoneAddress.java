package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.entity.RTPhoneAddress;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Collection of information that identifies a phone address.
 */
public class RTPhoneAddress extends MMBusinessComponent {

	private final static AtomicReference<RTPhoneAddress> repoTypeRef = new AtomicReference<>();
	/**
	 * Collection of information that identifies a phone number, as defined by telecom services.
	It is recommended to use only numbers and limited punctuation +,-.(.).
	 */
	public final MMBusinessAttribute attrPhoneNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPhoneAddress.repoType();
			super.name = "PhoneNumber";
			super.definition = "Collection of information that identifies a phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Collection of information that identifies a FAX number, as defined by telecom services.
	It is recommended to use only numbers and limited punctuation +,-.(.).
	 */
	public final MMBusinessAttribute attrFaxNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPhoneAddress.repoType();
			super.name = "FaxNumber";
			super.definition = "Collection of information that identifies a FAX number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Collection of information that identifies a mobile phone number, as defined by telecom services.
	It is recommended to use only numbers and limited punctuation +,-.(.).
	 */
	public final MMBusinessAttribute attrMobileNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPhoneAddress.repoType();
			super.name = "MobileNumber";
			super.definition = "Collection of information that identifies a mobile phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTPhoneAddress repoType() {
		repoTypeRef.compareAndSet(null, new RTPhoneAddress());
		return repoTypeRef.get();
	}

	private RTPhoneAddress() {
		super.element = Arrays.asList(attrPhoneNumber, attrFaxNumber,
				attrMobileNumber);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PhoneAddress";
		super.definition = "Collection of information that identifies a phone address.";
	} }