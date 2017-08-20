package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class ContactPoint extends MMBusinessComponent {

	private final static AtomicReference<ContactPoint> repoTypeRef = new AtomicReference<>();

	public static ContactPoint repoType() {
		repoTypeRef.compareAndSet(null, new ContactPoint());
		return repoTypeRef.get();
	}

	private ContactPoint() {
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.name = "ContactPoint";
		super.definition = "Number, physical or virtual address, used for communication.";
	}
}