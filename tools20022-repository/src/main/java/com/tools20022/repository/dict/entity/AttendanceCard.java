package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max105Text;
import com.tools20022.repository.dict.entity.MeetingAttendance;
import com.tools20022.repository.dict.codeset.DeliveryPlaceCode;
import com.tools20022.repository.dict.entity.ContactPoint;

/**
 * Information about the attendance card which is issued for the requestor, for
 * its underlying client or for the appointed proxy person or meeting attendee
 * when an attendance request is included in the meeting instruction. The
 * instructing party can specify which information must be indicated on the
 * attendance card and to which location the attendance card must be delivered.
 */
public class AttendanceCard {

	private Max105Text AttendanceCardLabelling;
	private MeetingAttendance MeetingAttendance;
	private DeliveryPlaceCode DeliveryMethod;
	private ContactPoint DeliveryPlace;

	public Max105Text getAttendanceCardLabelling() {
		return AttendanceCardLabelling;
	}

	public void setAttendanceCardLabelling(Max105Text AttendanceCardLabelling) {
		this.AttendanceCardLabelling = AttendanceCardLabelling;
	}

	public MeetingAttendance getMeetingAttendance() {
		return MeetingAttendance;
	}

	public void setMeetingAttendance(MeetingAttendance MeetingAttendance) {
		this.MeetingAttendance = MeetingAttendance;
	}

	public DeliveryPlaceCode getDeliveryMethod() {
		return DeliveryMethod;
	}

	public void setDeliveryMethod(DeliveryPlaceCode DeliveryMethod) {
		this.DeliveryMethod = DeliveryMethod;
	}

	public ContactPoint getDeliveryPlace() {
		return DeliveryPlace;
	}

	public void setDeliveryPlace(ContactPoint DeliveryPlace) {
		this.DeliveryPlace = DeliveryPlace;
	}
}