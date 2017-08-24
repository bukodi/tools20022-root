package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.CopyDuplicateCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class CopyDuplicateCode extends MMCodeSet {

	private final static AtomicReference<CopyDuplicateCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeCopyDuplicate = new MMCode() {
		{
			super.owner_lazy = () -> CopyDuplicateCode.repoType();
			super.codeName = "CODU";
			super.name = "CopyDuplicate";
			super.definition = "Message is being sent as a copy to a party other than the account owner, for information purposes and the message is a duplicate of a message previously sent.";
		}
	};
	public final MMCode codeCopy = new MMCode() {
		{
			super.owner_lazy = () -> CopyDuplicateCode.repoType();
			super.codeName = "COPY";
			super.name = "Copy";
			super.definition = "Message is being sent as a copy to a party other than the account owner, for information purposes.";
		}
	};
	public final MMCode codeDuplicate = new MMCode() {
		{
			super.owner_lazy = () -> CopyDuplicateCode.repoType();
			super.codeName = "DUPL";
			super.name = "Duplicate";
			super.definition = "Message is for information/confirmation purposes. It is a duplicate of a message previously sent.";
		}
	};

	public static CopyDuplicateCode repoType() {
		repoTypeRef.compareAndSet(null, new CopyDuplicateCode());
		return repoTypeRef.get();
	}

	private CopyDuplicateCode() {
		super.code = Arrays.asList(codeCopyDuplicate, codeCopy, codeDuplicate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CopyDuplicateCode";
		super.definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
		super.example = Arrays.asList("CODU");
	}
}