package com.tools20022.metamodel;
/**
 * Enumeration of the possible Namespace values that can be used by a User
 * Defined.
 */
public enum MMNamespace {
	/**
	 * Maps to the W3C Schema value "##any".
	 */
	any, /**
	 * Maps to the W3C Schema value "##other".
	 */
	other, /**
	 * Indicates that the value of the property "namespace" must be
	 * retrieved from the property "namespaceList".
	 */
	list
}