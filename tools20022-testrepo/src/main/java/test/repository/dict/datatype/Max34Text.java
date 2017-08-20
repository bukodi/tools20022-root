package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

public class Max34Text extends MMText {

	private final static AtomicReference<Max34Text> repoTypeRef = new AtomicReference<>();

	public static Max34Text repoType() {
		repoTypeRef.compareAndSet(null, new Max34Text());
		return repoTypeRef.get();
	}

	private Max34Text() {
		super.maxLength = 34;
		super.minLength = 1;
		super.name = "Max34Text";
		super.definition = "Specifies a character string with a maximum length of 34 characters.";
	}
}