package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Transport;
import com.tools20022.repository.dict.codeset.IncotermsCode;
import com.tools20022.repository.dict.entity.Location;

/**
 * International commerce terms are a series of international sales terms,
 * published by International Chamber of Commerce (ICC) and widely used in
 * international commercial transactions. These are accepted by governments,
 * legal authorities and practitioners worldwide for the interpretation of most
 * commonly used terms in international trade. Scope of this is limited to
 * matters relating to rights and obligations of the parties to the contract of
 * sale with respect to the delivery of goods sold. They are used to divide
 * transaction costs and responsibilities between buyer and seller and reflect
 * state-of-the-art transportation practices.
 */
public class Incoterms {

	private Transport Transport;
	private IncotermsCode Code;
	private Location Location;

	public Transport getTransport() {
		return Transport;
	}

	public void setTransport(Transport Transport) {
		this.Transport = Transport;
	}

	public IncotermsCode getCode() {
		return Code;
	}

	public void setCode(IncotermsCode Code) {
		this.Code = Code;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location Location) {
		this.Location = Location;
	}
}