package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

public class Max35NumericText extends MMText {

	private final static AtomicReference<Max35NumericText> repoTypeRef = new AtomicReference<>();

	public static Max35NumericText repoType() {
		repoTypeRef.compareAndSet(null, new Max35NumericText());
		return repoTypeRef.get();
	}

	private Max35NumericText() {
		super.pattern = "[0-9]{1,35}";
		super.name = "Max35NumericText";
		super.definition = "Specifies a numeric string with a maximum length of 35 digits.";
	}
}