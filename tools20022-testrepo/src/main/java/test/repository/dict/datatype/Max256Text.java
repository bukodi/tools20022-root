package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class Max256Text extends MMText {

	private final static AtomicReference<Max256Text> repoTypeRef = new AtomicReference<>();

	public static Max256Text repoType() {
		repoTypeRef.compareAndSet(null, new Max256Text());
		return repoTypeRef.get();
	}

	private Max256Text() {
		super.minLength = 1;
		super.maxLength = 256;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Max256Text";
		super.definition = "Specifies a character string with a maximum length of 256 characters.";
	}
}