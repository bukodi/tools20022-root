package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * The collection of information which identifies a specific phone or FAX number as defined by telecom services.
It consists of a "+" followed by the country code (from 1 to 3 characters) then a "-" and finally, any combination of numbers, "(", ")", "+" and "-" (up to 30 characters).
 */
public class RTPhoneNumber extends MMText {

	private final static AtomicReference<RTPhoneNumber> repoTypeRef = new AtomicReference<>();

	public static RTPhoneNumber repoType() {
		repoTypeRef.compareAndSet(null, new RTPhoneNumber());
		return repoTypeRef.get();
	}

	private RTPhoneNumber() {
		super.pattern = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PhoneNumber";
		super.definition = "The collection of information which identifies a specific phone or FAX number as defined by telecom services.\nIt consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).";
	} }