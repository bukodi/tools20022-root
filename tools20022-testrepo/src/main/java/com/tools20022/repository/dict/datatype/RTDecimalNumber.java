package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMQuantity;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Number of objects represented as a decimal number, eg, 0.75 or 45.6.
 */
public class RTDecimalNumber extends MMQuantity {

	private final static AtomicReference<RTDecimalNumber> repoTypeRef = new AtomicReference<>();

	public static RTDecimalNumber repoType() {
		repoTypeRef.compareAndSet(null, new RTDecimalNumber());
		return repoTypeRef.get();
	}

	private RTDecimalNumber() {
		super.totalDigits = 18;
		super.fractionDigits = 17;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DecimalNumber";
		super.definition = "Number of objects represented as a decimal number, eg, 0.75 or 45.6.";
		super.example = Arrays.asList("123456789.123456789");
	} }