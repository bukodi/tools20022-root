package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTSequenceType2Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies whether a once off transaction is covered or whether recurring transactions are covered.
 */
public class RTSequenceType2Code extends MMCodeSet {

	private final static AtomicReference<RTSequenceType2Code> repoTypeRef = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public final MMCode codeRecurring = new MMCode() {
		{
			super.owner_lazy = () -> RTSequenceType2Code.repoType();
			super.name = "Recurring";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeOneOff = new MMCode() {
		{
			super.owner_lazy = () -> RTSequenceType2Code.repoType();
			super.name = "OneOff";
		}
	};

	public static RTSequenceType2Code repoType() {
		repoTypeRef.compareAndSet(null, new RTSequenceType2Code());
		return repoTypeRef.get();
	}

	private RTSequenceType2Code() {
		super.code = Arrays.asList(codeRecurring, codeOneOff);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "SequenceType2Code";
		super.definition = "Specifies whether a once off transaction is covered or whether recurring transactions are covered.";
		super.example = Arrays.asList("RCUR");
	} }