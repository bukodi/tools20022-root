package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTISODate;
import com.tools20022.repository.dict.msg.RTDatePeriodDetails1;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Range of time defined by a start date and an end date.
 */
public class RTDatePeriodDetails1 extends MMMessageComponent {

	private final static AtomicReference<RTDatePeriodDetails1> repoTypeRef = new AtomicReference<>();
	/**
	 * Start date of the range.
	 */
	public final MMMessageAttribute attrFromDate = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTDatePeriodDetails1.repoType();
			super.xmlTag = "FrDt";
			super.name = "FromDate";
			super.definition = "Start date of the range.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * End date of the range.
	 */
	public final MMMessageAttribute attrToDate = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTDatePeriodDetails1.repoType();
			super.xmlTag = "ToDt";
			super.name = "ToDate";
			super.definition = "End date of the range.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTDatePeriodDetails1 repoType() {
		repoTypeRef.compareAndSet(null, new RTDatePeriodDetails1());
		return repoTypeRef.get();
	}

	private RTDatePeriodDetails1() {
		super.messageElement = Arrays.asList(attrFromDate, attrToDate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DatePeriodDetails1";
		super.definition = "Range of time defined by a start date and an end date.";
	} }