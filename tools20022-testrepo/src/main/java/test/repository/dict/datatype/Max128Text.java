package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

public class Max128Text extends MMText {

	private final static AtomicReference<Max128Text> repoTypeRef = new AtomicReference<>();

	public static Max128Text repoType() {
		repoTypeRef.compareAndSet(null, new Max128Text());
		return repoTypeRef.get();
	}

	private Max128Text() {
		super.maxLength = 128;
		super.minLength = 1;
		super.name = "Max128Text";
		super.definition = "Specifies a character string with a maximum length of 128 characters.";
	}
}