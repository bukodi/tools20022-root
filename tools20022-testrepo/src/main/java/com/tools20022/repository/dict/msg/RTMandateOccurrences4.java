package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTSequenceType2Code;
import com.tools20022.repository.dict.msg.RTMandateOccurrences4;
import com.tools20022.repository.dict.choice.RTFrequency36Choice;
import com.tools20022.repository.dict.msg.RTDatePeriodDetails1;
import com.tools20022.repository.dict.datatype.RTISODate;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Provides further details related to the duration of the mandate and the occurrence of the underlying transactions.
 */
public class RTMandateOccurrences4 extends MMMessageComponent {

	private final static AtomicReference<RTMandateOccurrences4> repoTypeRef = new AtomicReference<>();
	/**
	 * Identifies the underlying transaction sequence as either recurring or one-off.
	 */
	public final MMMessageAttribute attrSequenceType = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTSequenceType2Code.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateOccurrences4
					.repoType();
			super.xmlTag = "SeqTp";
			super.name = "SequenceType";
			super.definition = "Identifies the underlying transaction sequence as either recurring or one-off.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Regularity with which instructions are to be created and processed.
	 */
	public final MMMessageAttribute attrFrequency = new MMMessageAttribute() {
		{
			super.complexType_lazy = () -> RTFrequency36Choice.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateOccurrences4
					.repoType();
			super.xmlTag = "Frqcy";
			super.name = "Frequency";
			super.definition = "Regularity with which instructions are to be created and processed.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Length of time for which the mandate remains valid.
	 */
	public final MMMessageAttribute attrDuration = new MMMessageAttribute() {
		{
			super.complexType_lazy = () -> RTDatePeriodDetails1.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateOccurrences4
					.repoType();
			super.xmlTag = "Drtn";
			super.name = "Duration";
			super.definition = "Length of time for which the mandate remains valid.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Date of the first collection of a direct debit as per the mandate.
	 */
	public final MMMessageAttribute attrFirstCollectionDate = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateOccurrences4
					.repoType();
			super.xmlTag = "FrstColltnDt";
			super.name = "FirstCollectionDate";
			super.definition = "Date of the first collection of a direct debit as per the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Date of the final collection of a direct debit as per the mandate.
	 */
	public final MMMessageAttribute attrFinalCollectionDate = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateOccurrences4
					.repoType();
			super.xmlTag = "FnlColltnDt";
			super.name = "FinalCollectionDate";
			super.definition = "Date of the final collection of a direct debit as per the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTMandateOccurrences4 repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateOccurrences4());
		return repoTypeRef.get();
	}

	private RTMandateOccurrences4() {
		super.messageElement = Arrays.asList(attrSequenceType, attrFrequency,
				attrDuration, attrFirstCollectionDate, attrFinalCollectionDate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "MandateOccurrences4";
		super.definition = "Provides further details related to the duration of the mandate and the occurrence of the underlying transactions.";
	} }