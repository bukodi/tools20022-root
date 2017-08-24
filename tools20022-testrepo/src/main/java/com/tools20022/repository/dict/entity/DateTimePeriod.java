package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.Number;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.Agreement;
import com.tools20022.repository.GeneratedRepository;

public class DateTimePeriod extends MMBusinessComponent {

	private final static AtomicReference<DateTimePeriod> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrFromDateTime = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DateTimePeriod.repoType();
			super.name = "FromDateTime";
			super.definition = "Date and time at which the range starts.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrToDateTime = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DateTimePeriod.repoType();
			super.name = "ToDateTime";
			super.definition = "Date and time at which the range ends.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrNumberOfDays = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Number.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> DateTimePeriod.repoType();
			super.name = "NumberOfDays";
			super.definition = "Period specified as a number of days.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static DateTimePeriod repoType() {
		repoTypeRef.compareAndSet(null, new DateTimePeriod());
		return repoTypeRef.get();
	}

	private DateTimePeriod() {
		super.element = Arrays.asList(attrFromDateTime, attrToDateTime,
				attrNumberOfDays);
		super.associationDomain_lazy = () -> Arrays
				.asList(Agreement.repoType().refValidityPeriod);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DateTimePeriod";
		super.definition = "Time span defined by a start date and time, and an end date and time.";
	}
}