package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTNamePrefix1Code;
import com.tools20022.repository.dict.msg.RTContactDetails2;
import com.tools20022.repository.dict.datatype.RTMax140Text;
import com.tools20022.repository.dict.datatype.RTPhoneNumber;
import com.tools20022.repository.dict.datatype.RTMax2048Text;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Communication device number or electronic address used for communication.
 */
public class RTContactDetails2 extends MMMessageComponent {

	private final static AtomicReference<RTContactDetails2> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies the terms used to formally address a person.
	 */
	public final MMMessageAttribute attrNamePrefix = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTNamePrefix1Code.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTContactDetails2.repoType();
			super.xmlTag = "NmPrfx";
			super.name = "NamePrefix";
			super.definition = "Specifies the terms used to formally address a person.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Name by which a party is known and which is usually used to identify that party.
	 */
	public final MMMessageAttribute attrName = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax140Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTContactDetails2.repoType();
			super.xmlTag = "Nm";
			super.name = "Name";
			super.definition = "Name by which a party is known and which is usually used to identify that party.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Collection of information that identifies a phone number, as defined by telecom services.
	 */
	public final MMMessageAttribute attrPhoneNumber = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTPhoneNumber.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTContactDetails2.repoType();
			super.xmlTag = "PhneNb";
			super.name = "PhoneNumber";
			super.definition = "Collection of information that identifies a phone number, as defined by telecom services.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Collection of information that identifies a mobile phone number, as defined by telecom services.
	 */
	public final MMMessageAttribute attrMobileNumber = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTPhoneNumber.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTContactDetails2.repoType();
			super.xmlTag = "MobNb";
			super.name = "MobileNumber";
			super.definition = "Collection of information that identifies a mobile phone number, as defined by telecom services.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Collection of information that identifies a FAX number, as defined by telecom services.
	 */
	public final MMMessageAttribute attrFaxNumber = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTPhoneNumber.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTContactDetails2.repoType();
			super.xmlTag = "FaxNb";
			super.name = "FaxNumber";
			super.definition = "Collection of information that identifies a FAX number, as defined by telecom services.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Address for electronic mail (e-mail).
	 */
	public final MMMessageAttribute attrEmailAddress = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax2048Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTContactDetails2.repoType();
			super.xmlTag = "EmailAdr";
			super.name = "EmailAddress";
			super.definition = "Address for electronic mail (e-mail).";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Contact details in an other form.
	 */
	public final MMMessageAttribute attrOther = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTContactDetails2.repoType();
			super.xmlTag = "Othr";
			super.name = "Other";
			super.definition = "Contact details in an other form.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTContactDetails2 repoType() {
		repoTypeRef.compareAndSet(null, new RTContactDetails2());
		return repoTypeRef.get();
	}

	private RTContactDetails2() {
		super.messageElement = Arrays.asList(attrNamePrefix, attrName,
				attrPhoneNumber, attrMobileNumber, attrFaxNumber,
				attrEmailAddress, attrOther);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ContactDetails2";
		super.definition = "Communication device number or electronic address used for communication.";
	} }