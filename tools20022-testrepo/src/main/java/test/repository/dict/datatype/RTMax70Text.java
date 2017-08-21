package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMax70Text extends MMText {

	private final static AtomicReference<RTMax70Text> repoTypeRef = new AtomicReference<>();

	public static RTMax70Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax70Text());
		return repoTypeRef.get();
	}

	private RTMax70Text() {
		super.minLength = 1;
		super.maxLength = 70;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Max70Text";
		super.definition = "Specifies a character string with a maximum length of 70characters.";
	}
}