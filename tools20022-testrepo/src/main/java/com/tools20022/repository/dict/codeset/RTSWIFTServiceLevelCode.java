package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTSWIFTServiceLevelCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the SWIFT service level that applies to the payment instruction.
 */
public class RTSWIFTServiceLevelCode extends MMCodeSet {

	private final static AtomicReference<RTSWIFTServiceLevelCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Credit transfer is to be processed according to the SWIFTPay Service Level.
	 */
	public final MMCode codeSWIFTPay = new MMCode() {
		{
			super.owner_lazy = () -> RTSWIFTServiceLevelCode.repoType();
			super.codeName = "SPAY";
			super.name = "SWIFTPay";
			super.definition = "Credit transfer is to be processed according to the SWIFTPay Service Level.";
		}
	};
	/**
	 * Credit transfer is to be processed according to the Priority Service Level.
	 */
	public final MMCode codePriority = new MMCode() {
		{
			super.owner_lazy = () -> RTSWIFTServiceLevelCode.repoType();
			super.codeName = "SPRI";
			super.name = "Priority";
			super.definition = "Credit transfer is to be processed according to the Priority Service Level.";
		}
	};
	/**
	 * Credit transfer is to be processed according to the Standard Service Level.
	 */
	public final MMCode codeStandard = new MMCode() {
		{
			super.owner_lazy = () -> RTSWIFTServiceLevelCode.repoType();
			super.codeName = "SSTD";
			super.name = "Standard";
			super.definition = "Credit transfer is to be processed according to the Standard Service Level.";
		}
	};

	public static RTSWIFTServiceLevelCode repoType() {
		repoTypeRef.compareAndSet(null, new RTSWIFTServiceLevelCode());
		return repoTypeRef.get();
	}

	private RTSWIFTServiceLevelCode() {
		super.code = Arrays.asList(codeSWIFTPay, codePriority, codeStandard);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "SWIFTServiceLevelCode";
		super.definition = "Specifies the SWIFT service level that applies to the payment instruction.";
		super.example = Arrays.asList("SPAY");
	} }