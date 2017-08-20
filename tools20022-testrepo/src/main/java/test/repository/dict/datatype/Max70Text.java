package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

public class Max70Text extends MMText {

	private final static AtomicReference<Max70Text> repoTypeRef = new AtomicReference<>();

	public static Max70Text repoType() {
		repoTypeRef.compareAndSet(null, new Max70Text());
		return repoTypeRef.get();
	}

	private Max70Text() {
		super.maxLength = 70;
		super.minLength = 1;
		super.name = "Max70Text";
		super.definition = "Specifies a character string with a maximum length of 70characters.";
	}
}