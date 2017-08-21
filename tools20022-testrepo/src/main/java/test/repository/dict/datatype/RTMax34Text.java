package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMax34Text extends MMText {

	private final static AtomicReference<RTMax34Text> repoTypeRef = new AtomicReference<>();

	public static RTMax34Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax34Text());
		return repoTypeRef.get();
	}

	private RTMax34Text() {
		super.minLength = 1;
		super.maxLength = 34;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Max34Text";
		super.definition = "Specifies a character string with a maximum length of 34 characters.";
	}
}