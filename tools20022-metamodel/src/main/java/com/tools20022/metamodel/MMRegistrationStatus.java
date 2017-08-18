package com.tools20022.metamodel;
/**
 * the enumeration of the standing of a RepositoryConcept in the Repository
 */
public enum MMRegistrationStatus {
	/**
	 * status of a RepositoryConcept, showing it is pending final approval
	 */
	PROVISIONALLY_REGISTERED, /**
	 * status of a RepositoryConcept, showing it is
	 * ISO 20022 compliant, approved by the Registration Authority and can be
	 * used
	 */
	REGISTERED, /**
	 * status of a RepositoryConcept, showing it is still compliant
	 * but cannot be used in new ISO 20022 compliant developments.
	 */
	OBSOLETE
}