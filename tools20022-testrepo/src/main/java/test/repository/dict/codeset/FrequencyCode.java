package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class FrequencyCode extends MMCodeSet {

	private final static AtomicReference<FrequencyCode> repoTypeRef = new AtomicReference<>();

	public static FrequencyCode repoType() {
		repoTypeRef.compareAndSet(null, new FrequencyCode());
		return repoTypeRef.get();
	}

	private FrequencyCode() {
		super.name = "FrequencyCode";
		super.definition = "Specifies the regularity of an event.";
		super.example = Arrays.asList("YEAR");
	}
}