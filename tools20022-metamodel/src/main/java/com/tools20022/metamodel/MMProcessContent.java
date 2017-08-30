package com.tools20022.metamodel;
/**
 * specifies how a contentmodel must be validated
 */
public enum MMProcessContent {
	/**
 * the contentmodel must be validated on a can-do basis
 */LAX, /**
 * the contentmodel must not be validated
 */SKIP, /**
 * the contentmodel must be validated against its specification
 */STRICT }