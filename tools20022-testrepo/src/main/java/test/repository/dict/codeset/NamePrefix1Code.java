package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class NamePrefix1Code extends MMCodeSet {

	private final static AtomicReference<NamePrefix1Code> repoTypeRef = new AtomicReference<>();

	public static NamePrefix1Code repoType() {
		repoTypeRef.compareAndSet(null, new NamePrefix1Code());
		return repoTypeRef.get();
	}

	private NamePrefix1Code() {
		super.name = "NamePrefix1Code";
		super.definition = "Specifies the terms used to formally address a person.";
		super.example = Arrays.asList("DOCT");
	}
}