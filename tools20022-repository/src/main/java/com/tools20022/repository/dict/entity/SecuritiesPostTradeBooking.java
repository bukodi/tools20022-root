package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.DayBookingInstructionCode;
import com.tools20022.repository.dict.codeset.BookingUnitCode;
import com.tools20022.repository.dict.codeset.PreAllocationMethodCode;
import com.tools20022.repository.dict.codeset.BookingTypeCode;
import com.tools20022.repository.dict.entity.SecuritiesOrder;

/**
 * Information used to book the executions of a trade.
 */
public class SecuritiesPostTradeBooking extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private DayBookingInstructionCode DayBooking;
	private BookingUnitCode BookingUnit;
	private PreAllocationMethodCode PreAllocationMethod;
	private BookingTypeCode BookingType;
	private SecuritiesOrder RelatedOrder;

	public DayBookingInstructionCode getDayBooking() {
		return DayBooking;
	}

	public void setDayBooking(DayBookingInstructionCode DayBooking) {
		this.DayBooking = DayBooking;
	}

	public BookingUnitCode getBookingUnit() {
		return BookingUnit;
	}

	public void setBookingUnit(BookingUnitCode BookingUnit) {
		this.BookingUnit = BookingUnit;
	}

	public PreAllocationMethodCode getPreAllocationMethod() {
		return PreAllocationMethod;
	}

	public void setPreAllocationMethod(
			PreAllocationMethodCode PreAllocationMethod) {
		this.PreAllocationMethod = PreAllocationMethod;
	}

	public BookingTypeCode getBookingType() {
		return BookingType;
	}

	public void setBookingType(BookingTypeCode BookingType) {
		this.BookingType = BookingType;
	}

	public SecuritiesOrder getRelatedOrder() {
		return RelatedOrder;
	}

	public void setRelatedOrder(SecuritiesOrder RelatedOrder) {
		this.RelatedOrder = RelatedOrder;
	}
}