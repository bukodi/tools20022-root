package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class SequenceType2Code extends MMCodeSet {

	private final static AtomicReference<SequenceType2Code> repoTypeRef = new AtomicReference<>();

	public static SequenceType2Code repoType() {
		repoTypeRef.compareAndSet(null, new SequenceType2Code());
		return repoTypeRef.get();
	}

	private SequenceType2Code() {
		super.name = "SequenceType2Code";
		super.definition = "Specifies whether a once off transaction is covered or whether recurring transactions are covered.";
		super.example = Arrays.asList("RCUR");
	}
}