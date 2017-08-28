package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.choice.RTAccountIdentification4Choice;
import com.tools20022.repository.dict.msg.RTCashAccount24;
import com.tools20022.repository.dict.choice.RTCashAccountType2Choice;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTActiveOrHistoricCurrencyCode;
import com.tools20022.repository.dict.datatype.RTMax70Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Provides the details to identify an account.
 */
public class RTCashAccount24 extends MMMessageComponent {

	private final static AtomicReference<RTCashAccount24> repoTypeRef = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification for the account between the account owner and the account servicer.
	 */
	public final MMMessageAssociationEnd refIdentification = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTAccountIdentification4Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTCashAccount24.repoType();
			super.xmlTag = "Id";
			super.name = "Identification";
			super.definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the nature, or use of the account.
	 */
	public final MMMessageAssociationEnd refType = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTCashAccountType2Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTCashAccount24.repoType();
			super.xmlTag = "Tp";
			super.name = "Type";
			super.definition = "Specifies the nature, or use of the account.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Identification of the currency in which the account is held. 

	Usage: Currency should only be used in case one and the same account number covers several currencies
	and the initiating party needs to identify which currency needs to be used for settlement on the account.
	 */
	public final MMMessageAttribute attrCurrency = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTActiveOrHistoricCurrencyCode
					.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTCashAccount24.repoType();
			super.xmlTag = "Ccy";
			super.name = "Currency";
			super.definition = "Identification of the currency in which the account is held. \n\nUsage: Currency should only be used in case one and the same account number covers several currencies\nand the initiating party needs to identify which currency needs to be used for settlement on the account.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.

	Usage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.
	 */
	public final MMMessageAttribute attrName = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTCashAccount24.repoType();
			super.xmlTag = "Nm";
			super.name = "Name";
			super.definition = "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.\n\nUsage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTCashAccount24 repoType() {
		repoTypeRef.compareAndSet(null, new RTCashAccount24());
		return repoTypeRef.get();
	}

	private RTCashAccount24() {
		super.messageElement = Arrays.asList(refIdentification, refType,
				attrCurrency, attrName);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CashAccount24";
		super.definition = "Provides the details to identify an account.";
	} }