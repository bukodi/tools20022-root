package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;

public class CivilStatusCode extends MMCodeSet {

	private final static AtomicReference<CivilStatusCode> repoTypeRef = new AtomicReference<>();

	public static CivilStatusCode repoType() {
		repoTypeRef.compareAndSet(null, new CivilStatusCode());
		return repoTypeRef.get();
	}

	private CivilStatusCode() {
		super.name = "CivilStatusCode";
		super.definition = "Specifies the civil status of a person.";
	}
}