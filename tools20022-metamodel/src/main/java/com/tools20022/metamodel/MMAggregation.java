package com.tools20022.metamodel;
/**
 * enumeration of the different kinds of "has a" relationship supported by the metamodel
 */
public enum MMAggregation {
	/**
 * the relationship between two RepositoryConcepts is expressed through a simple association.
 */NONE, /**
 * a kind of relationship between 2 RepositoryConcepts expressing that one of the concepts cannot exist without the other.
 */COMPOSITE, /**
 * a kind of relationship between 2 RepositoryConcepts whereby one component may belong to multiple aggregates
 */SHARED }