package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTISODateTime;
import com.tools20022.repository.dict.entity.RTDateTimePeriod;
import com.tools20022.repository.dict.datatype.RTNumber;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.RTAgreement;
import com.tools20022.repository.GeneratedRepository;/**
 * Time span defined by a start date and time, and an end date and time.
 */
public class RTDateTimePeriod extends MMBusinessComponent {

	private final static AtomicReference<RTDateTimePeriod> repoTypeRef = new AtomicReference<>();
	/**
	 * Date and time at which the range starts.
	 */
	public final MMBusinessAttribute attrFromDateTime = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDateTimePeriod.repoType();
			super.name = "FromDateTime";
			super.definition = "Date and time at which the range starts.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Date and time at which the range ends.
	 */
	public final MMBusinessAttribute attrToDateTime = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDateTimePeriod.repoType();
			super.name = "ToDateTime";
			super.definition = "Date and time at which the range ends.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Period specified as a number of days.
	 */
	public final MMBusinessAttribute attrNumberOfDays = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTNumber.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDateTimePeriod.repoType();
			super.name = "NumberOfDays";
			super.definition = "Period specified as a number of days.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTDateTimePeriod repoType() {
		repoTypeRef.compareAndSet(null, new RTDateTimePeriod());
		return repoTypeRef.get();
	}

	private RTDateTimePeriod() {
		super.element = Arrays.asList(attrFromDateTime, attrToDateTime,
				attrNumberOfDays);
		super.associationDomain_lazy = () -> Arrays.asList(RTAgreement
				.repoType().refValidityPeriod);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DateTimePeriod";
		super.definition = "Time span defined by a start date and time, and an end date and time.";
	} }