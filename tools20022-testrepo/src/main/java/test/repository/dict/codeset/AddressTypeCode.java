package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class AddressTypeCode extends MMCodeSet {

	private final static AtomicReference<AddressTypeCode> repoTypeRef = new AtomicReference<>();

	public static AddressTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new AddressTypeCode());
		return repoTypeRef.get();
	}

	private AddressTypeCode() {
		super.name = "AddressTypeCode";
		super.definition = "Specifies the type of address.";
		super.example = Arrays.asList("HOME");
	}
}