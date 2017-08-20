package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class TypeOfIdentificationCode extends MMCodeSet {

	private final static AtomicReference<TypeOfIdentificationCode> repoTypeRef = new AtomicReference<>();

	public static TypeOfIdentificationCode repoType() {
		repoTypeRef.compareAndSet(null, new TypeOfIdentificationCode());
		return repoTypeRef.get();
	}

	private TypeOfIdentificationCode() {
		super.name = "TypeOfIdentificationCode";
		super.definition = "Specifies the type of alternate identification which can be used to give an alternate identification of the party identified.";
		super.example = Arrays.asList("ARNU");
	}
}