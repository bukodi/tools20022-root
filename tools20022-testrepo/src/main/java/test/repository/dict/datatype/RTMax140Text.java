package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMax140Text extends MMText {

	private final static AtomicReference<RTMax140Text> repoTypeRef = new AtomicReference<>();

	public static RTMax140Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax140Text());
		return repoTypeRef.get();
	}

	private RTMax140Text() {
		super.minLength = 1;
		super.maxLength = 140;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Max140Text";
		super.definition = "Specifies a character string with a maximum length of 140 characters.";
	}
}