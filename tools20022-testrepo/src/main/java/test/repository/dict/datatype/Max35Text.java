package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

public class Max35Text extends MMText {

	private final static AtomicReference<Max35Text> repoTypeRef = new AtomicReference<>();

	public static Max35Text repoType() {
		repoTypeRef.compareAndSet(null, new Max35Text());
		return repoTypeRef.get();
	}

	private Max35Text() {
		super.maxLength = 35;
		super.minLength = 1;
		super.name = "Max35Text";
		super.definition = "Specifies a character string with a maximum length of 35 characters.";
	}
}