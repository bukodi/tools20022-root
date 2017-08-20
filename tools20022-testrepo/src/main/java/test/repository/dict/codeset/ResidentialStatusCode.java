package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class ResidentialStatusCode extends MMCodeSet {

	private final static AtomicReference<ResidentialStatusCode> repoTypeRef = new AtomicReference<>();

	public static ResidentialStatusCode repoType() {
		repoTypeRef.compareAndSet(null, new ResidentialStatusCode());
		return repoTypeRef.get();
	}

	private ResidentialStatusCode() {
		super.name = "ResidentialStatusCode";
		super.definition = "Specifies the residential status of an individual.";
		super.example = Arrays.asList("RESI");
	}
}