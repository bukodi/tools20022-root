package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class SWIFTServiceLevelCode extends MMCodeSet {

	private final static AtomicReference<SWIFTServiceLevelCode> repoTypeRef = new AtomicReference<>();

	public static SWIFTServiceLevelCode repoType() {
		repoTypeRef.compareAndSet(null, new SWIFTServiceLevelCode());
		return repoTypeRef.get();
	}

	private SWIFTServiceLevelCode() {
		super.name = "SWIFTServiceLevelCode";
		super.definition = "Specifies the SWIFT service level that applies to the payment instruction.";
		super.example = Arrays.asList("SPAY");
	}
}