package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMax350Text extends MMText {

	private final static AtomicReference<RTMax350Text> repoTypeRef = new AtomicReference<>();

	public static RTMax350Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax350Text());
		return repoTypeRef.get();
	}

	private RTMax350Text() {
		super.minLength = 1;
		super.maxLength = 350;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Max350Text";
		super.definition = "Specifies a character string with a maximum length of 350 characters.";
	}
}