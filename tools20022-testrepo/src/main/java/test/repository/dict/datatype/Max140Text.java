package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

public class Max140Text extends MMText {

	private final static AtomicReference<Max140Text> repoTypeRef = new AtomicReference<>();

	public static Max140Text repoType() {
		repoTypeRef.compareAndSet(null, new Max140Text());
		return repoTypeRef.get();
	}

	private Max140Text() {
		super.maxLength = 140;
		super.minLength = 1;
		super.name = "Max140Text";
		super.definition = "Specifies a character string with a maximum length of 140 characters.";
	}
}