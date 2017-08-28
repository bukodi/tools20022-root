package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMDate;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in "XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004" which is aligned with ISO 8601.
 */
public class RTISODate extends MMDate {

	private final static AtomicReference<RTISODate> repoTypeRef = new AtomicReference<>();

	public static RTISODate repoType() {
		repoTypeRef.compareAndSet(null, new RTISODate());
		return repoTypeRef.get();
	}

	private RTISODate() {
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ISODate";
		super.definition = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.";
	} }