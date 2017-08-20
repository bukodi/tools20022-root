package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class LanguageCode extends MMCodeSet {

	private final static AtomicReference<LanguageCode> repoTypeRef = new AtomicReference<>();

	public static LanguageCode repoType() {
		repoTypeRef.compareAndSet(null, new LanguageCode());
		return repoTypeRef.get();
	}

	private LanguageCode() {
		super.name = "LanguageCode";
		super.definition = "Specifies a language.";
		super.example = Arrays.asList("ENG");
	}
}