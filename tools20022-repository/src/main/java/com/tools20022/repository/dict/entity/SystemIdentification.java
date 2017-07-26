package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.entity.SystemName;
import com.tools20022.repository.dict.entity.GenericIdentification;

/**
 * Parameters that identify a system.
 */
public class SystemIdentification {

	private System IdentificationForSystem;
	private Max35Text Model;
	private Max35Text SerialNumber;
	private Max70Text ApprovalNumber;
	private Max35Text SystemVersion;
	private SystemName SystemName;
	private GenericIdentification Identification;

	public System getIdentificationForSystem() {
		return IdentificationForSystem;
	}

	public void setIdentificationForSystem(System IdentificationForSystem) {
		this.IdentificationForSystem = IdentificationForSystem;
	}

	public Max35Text getModel() {
		return Model;
	}

	public void setModel(Max35Text Model) {
		this.Model = Model;
	}

	public Max35Text getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(Max35Text SerialNumber) {
		this.SerialNumber = SerialNumber;
	}

	public Max70Text getApprovalNumber() {
		return ApprovalNumber;
	}

	public void setApprovalNumber(Max70Text ApprovalNumber) {
		this.ApprovalNumber = ApprovalNumber;
	}

	public Max35Text getSystemVersion() {
		return SystemVersion;
	}

	public void setSystemVersion(Max35Text SystemVersion) {
		this.SystemVersion = SystemVersion;
	}

	public SystemName getSystemName() {
		return SystemName;
	}

	public void setSystemName(SystemName SystemName) {
		this.SystemName = SystemName;
	}

	public GenericIdentification getIdentification() {
		return Identification;
	}

	public void setIdentification(GenericIdentification Identification) {
		this.Identification = Identification;
	}
}