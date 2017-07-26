package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Person;

/**
 * Organisation represented by a person, or for which a person works.
 */
public class EmployingPartyRole extends Role {

	private Person Employee;

	public Person getEmployee() {
		return Employee;
	}

	public void setEmployee(Person Employee) {
		this.Employee = Employee;
	}
}