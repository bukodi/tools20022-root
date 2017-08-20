package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;

public class Frequency10Code extends MMCodeSet {

	private final static AtomicReference<Frequency10Code> repoTypeRef = new AtomicReference<>();

	public static Frequency10Code repoType() {
		repoTypeRef.compareAndSet(null, new Frequency10Code());
		return repoTypeRef.get();
	}

	private Frequency10Code() {
		super.name = "Frequency10Code";
		super.definition = "Specifies the regularity of an event.";
	}
}