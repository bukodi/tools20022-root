package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class GenderCode extends MMCodeSet {

	private final static AtomicReference<GenderCode> repoTypeRef = new AtomicReference<>();

	public static GenderCode repoType() {
		repoTypeRef.compareAndSet(null, new GenderCode());
		return repoTypeRef.get();
	}

	private GenderCode() {
		super.name = "GenderCode";
		super.definition = "Specifies the gender of a person.";
		super.example = Arrays.asList("MALE");
	}
}