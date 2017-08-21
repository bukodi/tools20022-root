package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMax2048Text extends MMText {

	private final static AtomicReference<RTMax2048Text> repoTypeRef = new AtomicReference<>();

	public static RTMax2048Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax2048Text());
		return repoTypeRef.get();
	}

	private RTMax2048Text() {
		super.minLength = 1;
		super.maxLength = 2048;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Max2048Text";
		super.definition = "Specifies a character string with a maximum length of 2048 characters.";
	}
}