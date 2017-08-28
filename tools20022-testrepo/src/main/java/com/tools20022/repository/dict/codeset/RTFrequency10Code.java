package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTFrequency10Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the regularity of an event.
 */
public class RTFrequency10Code extends MMCodeSet {

	private final static AtomicReference<RTFrequency10Code> repoTypeRef = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public final MMCode codeNever = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency10Code.repoType();
			super.name = "Never";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeAnnual = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency10Code.repoType();
			super.name = "Annual";
			super.semanticMarkup = Arrays.asList();
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeRate = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency10Code.repoType();
			super.name = "Rate";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeSemiAnnual = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency10Code.repoType();
			super.name = "SemiAnnual";
			super.semanticMarkup = Arrays.asList();
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeQuarterly = new MMCode() {
		{
			super.owner_lazy = () -> RTFrequency10Code.repoType();
			super.name = "Quarterly";
			super.semanticMarkup = Arrays.asList();
		}
	};

	public static RTFrequency10Code repoType() {
		repoTypeRef.compareAndSet(null, new RTFrequency10Code());
		return repoTypeRef.get();
	}

	private RTFrequency10Code() {
		super.code = Arrays.asList(codeNever, codeAnnual, codeRate,
				codeSemiAnnual, codeQuarterly);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Frequency10Code";
		super.definition = "Specifies the regularity of an event.";
	} }