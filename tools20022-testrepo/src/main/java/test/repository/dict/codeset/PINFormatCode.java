package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class PINFormatCode extends MMCodeSet {

	private final static AtomicReference<PINFormatCode> repoTypeRef = new AtomicReference<>();

	public static PINFormatCode repoType() {
		repoTypeRef.compareAndSet(null, new PINFormatCode());
		return repoTypeRef.get();
	}

	private PINFormatCode() {
		super.name = "PINFormatCode";
		super.definition = "PIN (Personal Identification Number) format used to encrypt the PIN block.";
		super.example = Arrays.asList("ISO0");
	}
}