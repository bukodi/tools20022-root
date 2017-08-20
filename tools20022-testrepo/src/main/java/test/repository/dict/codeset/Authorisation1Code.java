package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class Authorisation1Code extends MMCodeSet {

	private final static AtomicReference<Authorisation1Code> repoTypeRef = new AtomicReference<>();

	public static Authorisation1Code repoType() {
		repoTypeRef.compareAndSet(null, new Authorisation1Code());
		return repoTypeRef.get();
	}

	private Authorisation1Code() {
		super.name = "Authorisation1Code";
		super.definition = "Specifies the level of approval depending on a number of factors, including payment type, threshold amount or local country or operations practice.";
		super.example = Arrays.asList("AUTH");
	}
}