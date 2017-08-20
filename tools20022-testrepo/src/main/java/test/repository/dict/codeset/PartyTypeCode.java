package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class PartyTypeCode extends MMCodeSet {

	private final static AtomicReference<PartyTypeCode> repoTypeRef = new AtomicReference<>();

	public static PartyTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new PartyTypeCode());
		return repoTypeRef.get();
	}

	private PartyTypeCode() {
		super.name = "PartyTypeCode";
		super.definition = "Specifies the entitled party.";
		super.example = Arrays.asList("ISUR");
	}
}