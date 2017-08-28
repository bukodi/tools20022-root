package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTCopyDuplicateCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies if this document is a copy, a duplicate, or a duplicate of a copy.
 */
public class RTCopyDuplicateCode extends MMCodeSet {

	private final static AtomicReference<RTCopyDuplicateCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Message is being sent as a copy to a party other than the account owner, for information purposes and the message is a duplicate of a message previously sent.
	 */
	public final MMCode codeCopyDuplicate = new MMCode() {
		{
			super.owner_lazy = () -> RTCopyDuplicateCode.repoType();
			super.codeName = "CODU";
			super.name = "CopyDuplicate";
			super.definition = "Message is being sent as a copy to a party other than the account owner, for information purposes and the message is a duplicate of a message previously sent.";
		}
	};
	/**
	 * Message is being sent as a copy to a party other than the account owner, for information purposes.
	 */
	public final MMCode codeCopy = new MMCode() {
		{
			super.owner_lazy = () -> RTCopyDuplicateCode.repoType();
			super.codeName = "COPY";
			super.name = "Copy";
			super.definition = "Message is being sent as a copy to a party other than the account owner, for information purposes.";
		}
	};
	/**
	 * Message is for information/confirmation purposes. It is a duplicate of a message previously sent.
	 */
	public final MMCode codeDuplicate = new MMCode() {
		{
			super.owner_lazy = () -> RTCopyDuplicateCode.repoType();
			super.codeName = "DUPL";
			super.name = "Duplicate";
			super.definition = "Message is for information/confirmation purposes. It is a duplicate of a message previously sent.";
		}
	};

	public static RTCopyDuplicateCode repoType() {
		repoTypeRef.compareAndSet(null, new RTCopyDuplicateCode());
		return repoTypeRef.get();
	}

	private RTCopyDuplicateCode() {
		super.code = Arrays.asList(codeCopyDuplicate, codeCopy, codeDuplicate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CopyDuplicateCode";
		super.definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
		super.example = Arrays.asList("CODU");
	} }