package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.entity.SecurityCertificate;
import com.tools20022.repository.dict.entity.TerminalManagementSystem;
import com.tools20022.repository.dict.datatype.Max1025Text;

/**
 * Parameters used to access a network.
 */
public class NetworkAccess extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text HostIPAddress;
	private Number HostPortNumber;
	private Max35Text UserName;
	private Max35Text AccessCode;
	private SecurityCertificate ClientCertificate;
	private TerminalManagementSystem TerminalManagementSystem;
	private Max1025Text NetworkAddress;

	public Max35Text getHostIPAddress() {
		return HostIPAddress;
	}

	public void setHostIPAddress(Max35Text HostIPAddress) {
		this.HostIPAddress = HostIPAddress;
	}

	public Number getHostPortNumber() {
		return HostPortNumber;
	}

	public void setHostPortNumber(Number HostPortNumber) {
		this.HostPortNumber = HostPortNumber;
	}

	public Max35Text getUserName() {
		return UserName;
	}

	public void setUserName(Max35Text UserName) {
		this.UserName = UserName;
	}

	public Max35Text getAccessCode() {
		return AccessCode;
	}

	public void setAccessCode(Max35Text AccessCode) {
		this.AccessCode = AccessCode;
	}

	public SecurityCertificate getClientCertificate() {
		return ClientCertificate;
	}

	public void setClientCertificate(SecurityCertificate ClientCertificate) {
		this.ClientCertificate = ClientCertificate;
	}

	public TerminalManagementSystem getTerminalManagementSystem() {
		return TerminalManagementSystem;
	}

	public void setTerminalManagementSystem(
			TerminalManagementSystem TerminalManagementSystem) {
		this.TerminalManagementSystem = TerminalManagementSystem;
	}

	public Max1025Text getNetworkAddress() {
		return NetworkAddress;
	}

	public void setNetworkAddress(Max1025Text NetworkAddress) {
		this.NetworkAddress = NetworkAddress;
	}
}