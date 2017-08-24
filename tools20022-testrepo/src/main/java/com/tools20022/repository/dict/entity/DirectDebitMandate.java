package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.DirectDebitMandate;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.PaymentProcessing;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.MandateClassificationCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class DirectDebitMandate extends MMBusinessComponent {

	private final static AtomicReference<DirectDebitMandate> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrFinalCollectionDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ISODate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DirectDebitMandate.repoType();
			super.name = "FinalCollectionDate";
			super.definition = "Date of the final collection of a direct debit as per the mandate.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrFrequency = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> FrequencyCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DirectDebitMandate.repoType();
			super.name = "Frequency";
			super.definition = "Regularity with which direct debit instructions are to be created and processed.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrFirstCollectionDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ISODate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DirectDebitMandate.repoType();
			super.name = "FirstCollectionDate";
			super.definition = "Date of the first collection of a direct debit as per the mandate.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refMandatePaymentType = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> PaymentProcessing.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DirectDebitMandate.repoType();
			super.name = "MandatePaymentType";
			super.definition = "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrCollectionAmount = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CurrencyAndAmount.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DirectDebitMandate.repoType();
			super.name = "CollectionAmount";
			super.definition = "Fixed amount that the debtor has agreed will be collected from their account.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrMaximumAmount = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CurrencyAndAmount.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DirectDebitMandate.repoType();
			super.name = "MaximumAmount";
			super.definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPreNotification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> TrueFalseIndicator.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DirectDebitMandate.repoType();
			super.name = "PreNotification";
			super.definition = "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPreNotificationThreshold = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Number.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DirectDebitMandate.repoType();
			super.name = "PreNotificationThreshold";
			super.definition = "Specifies the number of days before the direct debit for notifying the debtor.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrClassification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> MandateClassificationCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DirectDebitMandate.repoType();
			super.name = "Classification";
			super.definition = "Type of direct debit instruction.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPointInTime = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> FrequencyCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DirectDebitMandate.repoType();
			super.name = "PointInTime";
			super.definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static DirectDebitMandate repoType() {
		repoTypeRef.compareAndSet(null, new DirectDebitMandate());
		return repoTypeRef.get();
	}

	private DirectDebitMandate() {
		super.element = Arrays.asList(attrFinalCollectionDate, attrFrequency,
				attrFirstCollectionDate, refMandatePaymentType,
				attrCollectionAmount, attrMaximumAmount, attrPreNotification,
				attrPreNotificationThreshold, attrClassification,
				attrPointInTime);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DirectDebitMandate";
		super.definition = "Authorisation in favour of the creditor given by the debtor to debit its own account.";
	}
}