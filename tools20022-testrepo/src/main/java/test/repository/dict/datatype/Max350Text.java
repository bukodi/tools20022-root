package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class Max350Text extends MMText {

	private final static AtomicReference<Max350Text> repoTypeRef = new AtomicReference<>();

	public static Max350Text repoType() {
		repoTypeRef.compareAndSet(null, new Max350Text());
		return repoTypeRef.get();
	}

	private Max350Text() {
		super.minLength = 1;
		super.maxLength = 350;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Max350Text";
		super.definition = "Specifies a character string with a maximum length of 350 characters.";
	}
}