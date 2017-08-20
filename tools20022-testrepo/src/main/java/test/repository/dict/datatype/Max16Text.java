package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

public class Max16Text extends MMText {

	private final static AtomicReference<Max16Text> repoTypeRef = new AtomicReference<>();

	public static Max16Text repoType() {
		repoTypeRef.compareAndSet(null, new Max16Text());
		return repoTypeRef.get();
	}

	private Max16Text() {
		super.maxLength = 16;
		super.minLength = 1;
		super.name = "Max16Text";
		super.definition = "Specifies a character string with a maximum length of 16 characters.";
	}
}