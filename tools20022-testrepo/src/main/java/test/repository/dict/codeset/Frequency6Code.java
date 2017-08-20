package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class Frequency6Code extends MMCodeSet {

	private final static AtomicReference<Frequency6Code> repoTypeRef = new AtomicReference<>();

	public static Frequency6Code repoType() {
		repoTypeRef.compareAndSet(null, new Frequency6Code());
		return repoTypeRef.get();
	}

	private Frequency6Code() {
		super.name = "Frequency6Code";
		super.definition = "Specifies the regularity of an event.";
		super.example = Arrays.asList("YEAR");
	}
}