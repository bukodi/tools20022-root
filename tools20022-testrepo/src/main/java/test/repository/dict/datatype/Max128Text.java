package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class Max128Text extends MMText {

	private final static AtomicReference<Max128Text> repoTypeRef = new AtomicReference<>();

	public static Max128Text repoType() {
		repoTypeRef.compareAndSet(null, new Max128Text());
		return repoTypeRef.get();
	}

	private Max128Text() {
		super.minLength = 1;
		super.maxLength = 128;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Max128Text";
		super.definition = "Specifies a character string with a maximum length of 128 characters.";
	}
}