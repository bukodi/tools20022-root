package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class AddressType2Code extends MMCodeSet {

	private final static AtomicReference<AddressType2Code> repoTypeRef = new AtomicReference<>();

	public static AddressType2Code repoType() {
		repoTypeRef.compareAndSet(null, new AddressType2Code());
		return repoTypeRef.get();
	}

	private AddressType2Code() {
		super.name = "AddressType2Code";
		super.definition = "Specifies the type of address.";
		super.example = Arrays.asList("ADDR");
	}
}