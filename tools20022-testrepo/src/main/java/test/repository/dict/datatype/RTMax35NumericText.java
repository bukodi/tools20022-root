package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMax35NumericText extends MMText {

	private final static AtomicReference<RTMax35NumericText> repoTypeRef = new AtomicReference<>();

	public static RTMax35NumericText repoType() {
		repoTypeRef.compareAndSet(null, new RTMax35NumericText());
		return repoTypeRef.get();
	}

	private RTMax35NumericText() {
		super.pattern = "[0-9]{1,35}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Max35NumericText";
		super.definition = "Specifies a numeric string with a maximum length of 35 digits.";
	}
}