package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTExact2NumericText extends MMText {

	private final static AtomicReference<RTExact2NumericText> repoTypeRef = new AtomicReference<>();

	public static RTExact2NumericText repoType() {
		repoTypeRef.compareAndSet(null, new RTExact2NumericText());
		return repoTypeRef.get();
	}

	private RTExact2NumericText() {
		super.pattern = "[0-9]{2}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Exact2NumericText";
		super.definition = "Specifies a numeric string with an exact length of 2 digits.";
	}
}