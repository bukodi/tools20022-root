package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTMax16Text;
import com.tools20022.repository.dict.msg.RTMandateAuthentication1;
import com.tools20022.repository.dict.datatype.RTISODate;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.choice.RTAuthenticationChannel1Choice;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the transport authentication details related to the mandate.
 */
public class RTMandateAuthentication1 extends MMMessageComponent {

	private final static AtomicReference<RTMandateAuthentication1> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies a piece of information used to authenticate a message, that is  to confirm that the message came from the stated sender (its authenticity) and has not been changed in transit (its integrity).
	 */
	public final MMMessageAttribute attrMessageAuthenticationCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax16Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateAuthentication1
					.repoType();
			super.xmlTag = "MsgAuthntcnCd";
			super.name = "MessageAuthenticationCode";
			super.definition = "Specifies a piece of information used to authenticate a message, that is  to confirm that the message came from the stated sender (its authenticity) and has not been changed in transit (its integrity).";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Date when the authentication was conducted.
	 */
	public final MMMessageAttribute attrDate = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateAuthentication1
					.repoType();
			super.xmlTag = "Dt";
			super.name = "Date";
			super.definition = "Date when the authentication was conducted.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Channel used to transmit the authentication information.
	 */
	public final MMMessageAssociationEnd refChannel = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTAuthenticationChannel1Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateAuthentication1
					.repoType();
			super.xmlTag = "Chanl";
			super.name = "Channel";
			super.definition = "Channel used to transmit the authentication information.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTMandateAuthentication1 repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateAuthentication1());
		return repoTypeRef.get();
	}

	private RTMandateAuthentication1() {
		super.messageElement = Arrays.asList(attrMessageAuthenticationCode,
				attrDate, refChannel);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "MandateAuthentication1";
		super.definition = "Specifies the transport authentication details related to the mandate.";
	} }