package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class SequenceTypeCode extends MMCodeSet {

	private final static AtomicReference<SequenceTypeCode> repoTypeRef = new AtomicReference<>();

	public static SequenceTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new SequenceTypeCode());
		return repoTypeRef.get();
	}

	private SequenceTypeCode() {
		super.name = "SequenceTypeCode";
		super.definition = "Specifies the type of the current transaction that belongs to a sequence of transactions.";
		super.example = Arrays.asList("FRST");
	}
}