package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.msg.RTMandate10;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTMandateAuthentication1;
import com.tools20022.repository.dict.msg.RTMandateTypeInformation2;
import com.tools20022.repository.dict.msg.RTMandateOccurrences4;
import com.tools20022.repository.dict.datatype.RTTrueFalseIndicator;
import com.tools20022.repository.dict.datatype.RTActiveCurrencyAndAmount;
import com.tools20022.repository.dict.msg.RTMandateAdjustment1;
import com.tools20022.repository.dict.choice.RTMandateSetupReason1Choice;
import com.tools20022.repository.dict.msg.RTPartyIdentification43;
import com.tools20022.repository.dict.msg.RTCashAccount24;
import com.tools20022.repository.dict.msg.RTBranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.RTReferredMandateDocument1;
import com.tools20022.repository.dict.msg.RTSupplementaryData1;
import java.util.Arrays;
import com.tools20022.repository.catalogue.msgdef.pain.RTMandateInitiationRequestV05;
import com.tools20022.repository.GeneratedRepository;/**
 * Information that serves as a basis to debit an account.
 */
public class RTMandate10 extends MMMessageComponent {

	private final static AtomicReference<RTMandate10> repoTypeRef = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by the responsible party (such as the creditor) or agent (such as the debtor agent), to unambiguously identify the mandate.
	 */
	public final MMMessageAttribute attrMandateIdentification = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "MndtId";
			super.name = "MandateIdentification";
			super.definition = "Unique identification, as assigned by the responsible party (such as the creditor) or agent (such as the debtor agent), to unambiguously identify the mandate.";
			super.minOccurs = 0;
		}
	};
	/**
	 * Identification for the mandate request, as assigned by the initiating party.
	 */
	public final MMMessageAttribute attrMandateRequestIdentification = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "MndtReqId";
			super.name = "MandateRequestIdentification";
			super.definition = "Identification for the mandate request, as assigned by the initiating party.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the transport authentication details related to the mandate.
	 */
	public final MMMessageAssociationEnd refAuthentication = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTMandateAuthentication1.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "Authntcn";
			super.name = "Authentication";
			super.definition = "Specifies the transport authentication details related to the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Specifies the type of mandate, such as paper, electronic or scheme.
	 */
	public final MMMessageAssociationEnd refType = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTMandateTypeInformation2.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "Tp";
			super.name = "Type";
			super.definition = "Specifies the type of mandate, such as paper, electronic or scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Provides details of the duration of the mandate and occurrence of the underlying transactions.
	 */
	public final MMMessageAssociationEnd refOccurrences = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTMandateOccurrences4.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "Ocrncs";
			super.name = "Occurrences";
			super.definition = "Provides details of the duration of the mandate and occurrence of the underlying transactions.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.
	 */
	public final MMMessageAttribute attrTrackingIndicator = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTTrueFalseIndicator.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "TrckgInd";
			super.name = "TrackingIndicator";
			super.definition = "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Amount different from the collection amount, as it includes the costs associated with the first debited amount.
	 */
	public final MMMessageAttribute attrFirstCollectionAmount = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTActiveCurrencyAndAmount.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "FrstColltnAmt";
			super.name = "FirstCollectionAmount";
			super.definition = "Amount different from the collection amount, as it includes the costs associated with the first debited amount.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Fixed amount to be collected from the debtor's account.
	 */
	public final MMMessageAttribute attrCollectionAmount = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTActiveCurrencyAndAmount.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "ColltnAmt";
			super.name = "CollectionAmount";
			super.definition = "Fixed amount to be collected from the debtor's account.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Maximum amount that may be collected from the debtor's account, per instruction.
	 */
	public final MMMessageAttribute attrMaximumAmount = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTActiveCurrencyAndAmount.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "MaxAmt";
			super.name = "MaximumAmount";
			super.definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Specifies the characteristics of the adjustment applied to the collection amount of a direct debit instruction.
	 */
	public final MMMessageAssociationEnd refAdjustment = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTMandateAdjustment1.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "Adjstmnt";
			super.name = "Adjustment";
			super.definition = "Specifies the characteristics of the adjustment applied to the collection amount of a direct debit instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Provides the reason for the setup of the mandate.
	 */
	public final MMMessageAssociationEnd refReason = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTMandateSetupReason1Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "Rsn";
			super.name = "Reason";
			super.definition = "Provides the reason for the setup of the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Credit party that signs the mandate.
	 */
	public final MMMessageAssociationEnd refCreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTPartyIdentification43.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "CdtrSchmeId";
			super.name = "CreditorSchemeIdentification";
			super.definition = "Credit party that signs the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Party that signs the mandate and to whom an amount of money is due.
	 */
	public final MMMessageAssociationEnd refCreditor = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTPartyIdentification43.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "Cdtr";
			super.name = "Creditor";
			super.definition = "Party that signs the mandate and to whom an amount of money is due.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.
	 */
	public final MMMessageAssociationEnd refCreditorAccount = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTCashAccount24.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "CdtrAcct";
			super.name = "CreditorAccount";
			super.definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Financial institution servicing an account for the creditor.
	 */
	public final MMMessageAssociationEnd refCreditorAgent = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTBranchAndFinancialInstitutionIdentification5
					.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "CdtrAgt";
			super.name = "CreditorAgent";
			super.definition = "Financial institution servicing an account for the creditor.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Ultimate party to which an amount of money is due.
	 */
	public final MMMessageAssociationEnd refUltimateCreditor = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTPartyIdentification43.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "UltmtCdtr";
			super.name = "UltimateCreditor";
			super.definition = "Ultimate party to which an amount of money is due.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Party that signs the mandate and owes an amount of money to the (ultimate) creditor.
	 */
	public final MMMessageAssociationEnd refDebtor = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTPartyIdentification43.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "Dbtr";
			super.name = "Debtor";
			super.definition = "Party that signs the mandate and owes an amount of money to the (ultimate) creditor.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Unambiguous identification of the account of the debtor, to which a debit entry will be made as a result of the transaction.
	 */
	public final MMMessageAssociationEnd refDebtorAccount = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTCashAccount24.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "DbtrAcct";
			super.name = "DebtorAccount";
			super.definition = "Unambiguous identification of the account of the debtor, to which a debit entry will be made as a result of the transaction.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Financial institution servicing an account for the debtor.
	 */
	public final MMMessageAssociationEnd refDebtorAgent = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTBranchAndFinancialInstitutionIdentification5
					.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "DbtrAgt";
			super.name = "DebtorAgent";
			super.definition = "Financial institution servicing an account for the debtor.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Ultimate party that owes an amount of money to the (ultimate) creditor.
	 */
	public final MMMessageAssociationEnd refUltimateDebtor = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTPartyIdentification43.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "UltmtDbtr";
			super.name = "UltimateDebtor";
			super.definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Reference assigned by a creditor or ultimate creditor for internal usage for the mandate.
	 */
	public final MMMessageAttribute attrMandateReference = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "MndtRef";
			super.name = "MandateReference";
			super.definition = "Reference assigned by a creditor or ultimate creditor for internal usage for the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Provides information to identify the underlying documents associated with the mandate.
	 */
	public final MMMessageAssociationEnd refReferredDocument = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTReferredMandateDocument1.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "RfrdDoc";
			super.name = "ReferredDocument";
			super.definition = "Provides information to identify the underlying documents associated with the mandate.";
			super.minOccurs = 0;
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements within the message component.
	 */
	public final MMMessageAttribute attrSupplementaryData = new MMMessageAttribute() {
		{
			super.complexType_lazy = () -> RTSupplementaryData1.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "SplmtryData";
			super.name = "SupplementaryData";
			super.definition = "Additional information that cannot be captured in the structured elements within the message component.";
			super.minOccurs = 0;
		}
	};

	public static RTMandate10 repoType() {
		repoTypeRef.compareAndSet(null, new RTMandate10());
		return repoTypeRef.get();
	}

	private RTMandate10() {
		super.messageElement = Arrays.asList(attrMandateIdentification,
				attrMandateRequestIdentification, refAuthentication, refType,
				refOccurrences, attrTrackingIndicator,
				attrFirstCollectionAmount, attrCollectionAmount,
				attrMaximumAmount, refAdjustment, refReason,
				refCreditorSchemeIdentification, refCreditor,
				refCreditorAccount, refCreditorAgent, refUltimateCreditor,
				refDebtor, refDebtorAccount, refDebtorAgent, refUltimateDebtor,
				attrMandateReference, refReferredDocument,
				attrSupplementaryData);
		super.messageBuildingBlock_lazy = () -> Arrays
				.asList(RTMandateInitiationRequestV05.repoType().blockMandate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Mandate10";
		super.definition = "Information that serves as a basis to debit an account.";
		super.constraint = Arrays.asList();
	} }