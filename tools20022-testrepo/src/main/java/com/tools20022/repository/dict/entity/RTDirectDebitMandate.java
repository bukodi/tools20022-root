package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTISODate;
import com.tools20022.repository.dict.entity.RTDirectDebitMandate;
import com.tools20022.repository.dict.codeset.RTFrequencyCode;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTPaymentProcessing;
import com.tools20022.repository.dict.datatype.RTCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.RTTrueFalseIndicator;
import com.tools20022.repository.dict.datatype.RTNumber;
import com.tools20022.repository.dict.codeset.RTMandateClassificationCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Authorisation in favour of the creditor given by the debtor to debit its own account.
 */
public class RTDirectDebitMandate extends MMBusinessComponent {

	private final static AtomicReference<RTDirectDebitMandate> repoTypeRef = new AtomicReference<>();
	/**
	 * Date of the final collection of a direct debit as per the mandate.
	 */
	public final MMBusinessAttribute attrFinalCollectionDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.name = "FinalCollectionDate";
			super.definition = "Date of the final collection of a direct debit as per the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Regularity with which direct debit instructions are to be created and processed.
	 */
	public final MMBusinessAttribute attrFrequency = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTFrequencyCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.name = "Frequency";
			super.definition = "Regularity with which direct debit instructions are to be created and processed.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Date of the first collection of a direct debit as per the mandate.
	 */
	public final MMBusinessAttribute attrFirstCollectionDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.name = "FirstCollectionDate";
			super.definition = "Date of the first collection of a direct debit as per the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party.
	 */
	public final MMBusinessAssociationEnd refMandatePaymentType = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTPaymentProcessing.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.name = "MandatePaymentType";
			super.definition = "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Fixed amount that the debtor has agreed will be collected from their account.
	 */
	public final MMBusinessAttribute attrCollectionAmount = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCurrencyAndAmount.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.name = "CollectionAmount";
			super.definition = "Fixed amount that the debtor has agreed will be collected from their account.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Maximum amount that may be collected from the debtor's account, per instruction.
	 */
	public final MMBusinessAttribute attrMaximumAmount = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCurrencyAndAmount.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.name = "MaximumAmount";
			super.definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs
	 */
	public final MMBusinessAttribute attrPreNotification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTTrueFalseIndicator.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.name = "PreNotification";
			super.definition = "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the number of days before the direct debit for notifying the debtor.
	 */
	public final MMBusinessAttribute attrPreNotificationThreshold = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTNumber.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.name = "PreNotificationThreshold";
			super.definition = "Specifies the number of days before the direct debit for notifying the debtor.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Type of direct debit instruction.
	 */
	public final MMBusinessAttribute attrClassification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMandateClassificationCode
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.name = "Classification";
			super.definition = "Type of direct debit instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies a frequency in terms of an exact point in time or moment within a specified period type.
	 */
	public final MMBusinessAttribute attrPointInTime = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTFrequencyCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDirectDebitMandate.repoType();
			super.name = "PointInTime";
			super.definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTDirectDebitMandate repoType() {
		repoTypeRef.compareAndSet(null, new RTDirectDebitMandate());
		return repoTypeRef.get();
	}

	private RTDirectDebitMandate() {
		super.element = Arrays.asList(attrFinalCollectionDate, attrFrequency,
				attrFirstCollectionDate, refMandatePaymentType,
				attrCollectionAmount, attrMaximumAmount, attrPreNotification,
				attrPreNotificationThreshold, attrClassification,
				attrPointInTime);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DirectDebitMandate";
		super.definition = "Authorisation in favour of the creditor given by the debtor to debit its own account.";
	} }