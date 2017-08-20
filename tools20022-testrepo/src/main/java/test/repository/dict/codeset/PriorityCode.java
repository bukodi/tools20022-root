package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class PriorityCode extends MMCodeSet {

	private final static AtomicReference<PriorityCode> repoTypeRef = new AtomicReference<>();

	public static PriorityCode repoType() {
		repoTypeRef.compareAndSet(null, new PriorityCode());
		return repoTypeRef.get();
	}

	private PriorityCode() {
		super.name = "PriorityCode";
		super.definition = "Specifies the priority level of an event.";
		super.example = Arrays.asList("URGT");
	}
}