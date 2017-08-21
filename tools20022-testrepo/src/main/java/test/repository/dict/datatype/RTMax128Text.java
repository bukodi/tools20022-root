package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMax128Text extends MMText {

	private final static AtomicReference<RTMax128Text> repoTypeRef = new AtomicReference<>();

	public static RTMax128Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax128Text());
		return repoTypeRef.get();
	}

	private RTMax128Text() {
		super.minLength = 1;
		super.maxLength = 128;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Max128Text";
		super.definition = "Specifies a character string with a maximum length of 128 characters.";
	}
}