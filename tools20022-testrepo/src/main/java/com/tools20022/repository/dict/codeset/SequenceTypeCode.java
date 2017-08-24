package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.SequenceTypeCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class SequenceTypeCode extends MMCodeSet {

	private final static AtomicReference<SequenceTypeCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeFirst = new MMCode() {
		{
			super.owner_lazy = () -> SequenceTypeCode.repoType();
			super.codeName = "FRST";
			super.name = "First";
			super.definition = "First collection of a series of direct debit instructions.";
		}
	};
	public final MMCode codeRecurring = new MMCode() {
		{
			super.owner_lazy = () -> SequenceTypeCode.repoType();
			super.codeName = "RCUR";
			super.name = "Recurring";
			super.definition = "Direct debit instruction where the debtor's authorisation is used for regular direct debit transactions initiated by the creditor.";
		}
	};
	public final MMCode codeFinal = new MMCode() {
		{
			super.owner_lazy = () -> SequenceTypeCode.repoType();
			super.codeName = "FNAL";
			super.name = "Final";
			super.definition = "Final collection of a series of direct debit instructions.";
		}
	};
	public final MMCode codeOneOff = new MMCode() {
		{
			super.owner_lazy = () -> SequenceTypeCode.repoType();
			super.codeName = "OOFF";
			super.name = "OneOff";
			super.definition = "Direct debit instruction where the debtor's authorisation is used to initiate one single direct debit transaction.";
		}
	};
	public final MMCode codeRepresented = new MMCode() {
		{
			super.owner_lazy = () -> SequenceTypeCode.repoType();
			super.codeName = "RPRE";
			super.name = "Represented";
			super.definition = "Collection used to re-present previously reversed or returned direct debit transactions.";
		}
	};

	public static SequenceTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new SequenceTypeCode());
		return repoTypeRef.get();
	}

	private SequenceTypeCode() {
		super.code = Arrays.asList(codeFirst, codeRecurring, codeFinal,
				codeOneOff, codeRepresented);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "SequenceTypeCode";
		super.definition = "Specifies the type of the current transaction that belongs to a sequence of transactions.";
		super.example = Arrays.asList("FRST");
	}
}