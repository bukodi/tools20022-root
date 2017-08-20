package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;

public class PhoneAddress extends MMBusinessComponent {

	private final static AtomicReference<PhoneAddress> repoTypeRef = new AtomicReference<>();

	public static PhoneAddress repoType() {
		repoTypeRef.compareAndSet(null, new PhoneAddress());
		return repoTypeRef.get();
	}

	private PhoneAddress() {
		super.name = "PhoneAddress";
		super.definition = "Collection of information that identifies a phone address.";
	}
}