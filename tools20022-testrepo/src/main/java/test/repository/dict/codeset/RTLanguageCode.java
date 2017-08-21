package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTLanguageCode extends MMCodeSet {

	private final static AtomicReference<RTLanguageCode> repoTypeRef = new AtomicReference<>();

	public static RTLanguageCode repoType() {
		repoTypeRef.compareAndSet(null, new RTLanguageCode());
		return repoTypeRef.get();
	}

	private RTLanguageCode() {
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("ENG");
		super.constraint = Arrays.asList();
		super.name = "LanguageCode";
		super.definition = "Specifies a language.";
	}
}