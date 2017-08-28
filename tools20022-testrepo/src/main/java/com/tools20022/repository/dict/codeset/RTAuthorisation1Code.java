package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTAuthorisation1Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the level of approval depending on a number of factors, including payment type, threshold amount or local country or operations practice.
 */
public class RTAuthorisation1Code extends MMCodeSet {

	private final static AtomicReference<RTAuthorisation1Code> repoTypeRef = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public final MMCode codePreAuthorisedFile = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthorisation1Code.repoType();
			super.name = "PreAuthorisedFile";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeFileLevelAuthorisationDetails = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthorisation1Code.repoType();
			super.name = "FileLevelAuthorisationDetails";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeFileLevelAuthorisationSummary = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthorisation1Code.repoType();
			super.name = "FileLevelAuthorisationSummary";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeInstructionLevelAuthorisation = new MMCode() {
		{
			super.owner_lazy = () -> RTAuthorisation1Code.repoType();
			super.name = "InstructionLevelAuthorisation";
		}
	};

	public static RTAuthorisation1Code repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthorisation1Code());
		return repoTypeRef.get();
	}

	private RTAuthorisation1Code() {
		super.code = Arrays.asList(codePreAuthorisedFile,
				codeFileLevelAuthorisationDetails,
				codeFileLevelAuthorisationSummary,
				codeInstructionLevelAuthorisation);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Authorisation1Code";
		super.definition = "Specifies the level of approval depending on a number of factors, including payment type, threshold amount or local country or operations practice.";
		super.example = Arrays.asList("AUTH");
	} }