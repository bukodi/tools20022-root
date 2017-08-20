package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class CountryCode extends MMCodeSet {

	private final static AtomicReference<CountryCode> repoTypeRef = new AtomicReference<>();

	public static CountryCode repoType() {
		repoTypeRef.compareAndSet(null, new CountryCode());
		return repoTypeRef.get();
	}

	private CountryCode() {
		super.pattern = "[A-Z]{2,2}";
		super.name = "CountryCode";
		super.definition = "Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).";
		super.example = Arrays.asList("BE");
	}
}