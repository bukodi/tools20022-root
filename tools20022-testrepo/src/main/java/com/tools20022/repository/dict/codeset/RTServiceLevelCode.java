package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTServiceLevelCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the pre-agreed level of service between the parties.
 */
public class RTServiceLevelCode extends MMCodeSet {

	private final static AtomicReference<RTServiceLevelCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Payment must be executed with same day value to the creditor.
	 */
	public final MMCode codeSameDayValue = new MMCode() {
		{
			super.owner_lazy = () -> RTServiceLevelCode.repoType();
			super.codeName = "SDVA";
			super.name = "SameDayValue";
			super.definition = "Payment must be executed with same day value to the creditor.";
		}
	};
	/**
	 * Payment must be executed following the Single Euro Payments Area scheme.
	 */
	public final MMCode codeSingleEuroPaymentsArea = new MMCode() {
		{
			super.owner_lazy = () -> RTServiceLevelCode.repoType();
			super.codeName = "SEPA";
			super.name = "SingleEuroPaymentsArea";
			super.definition = "Payment must be executed following the Single Euro Payments Area scheme.";
		}
	};
	/**
	 * Transaction must be processed according to the EBA
	Priority Service.
	 */
	public final MMCode codeEBAPriorityService = new MMCode() {
		{
			super.owner_lazy = () -> RTServiceLevelCode.repoType();
			super.codeName = "PRPT";
			super.name = "EBAPriorityService";
			super.definition = "Transaction must be processed according to the EBA\nPriority Service.";
		}
	};

	public static RTServiceLevelCode repoType() {
		repoTypeRef.compareAndSet(null, new RTServiceLevelCode());
		return repoTypeRef.get();
	}

	private RTServiceLevelCode() {
		super.code = Arrays.asList(codeSameDayValue,
				codeSingleEuroPaymentsArea, codeEBAPriorityService);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ServiceLevelCode";
		super.definition = "Specifies the pre-agreed level of service between the parties.";
		super.example = Arrays.asList("SDVA");
	} }