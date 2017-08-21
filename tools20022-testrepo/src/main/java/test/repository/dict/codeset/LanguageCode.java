package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class LanguageCode extends MMCodeSet {

	private final static AtomicReference<LanguageCode> repoTypeRef = new AtomicReference<>();

	public static LanguageCode repoType() {
		repoTypeRef.compareAndSet(null, new LanguageCode());
		return repoTypeRef.get();
	}

	private LanguageCode() {
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("ENG");
		super.constraint = Arrays.asList();
		super.name = "LanguageCode";
		super.definition = "Specifies a language.";
	}
}