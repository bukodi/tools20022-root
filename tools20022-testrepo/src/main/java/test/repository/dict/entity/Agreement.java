package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;

public class Agreement extends MMBusinessComponent {

	private final static AtomicReference<Agreement> repoTypeRef = new AtomicReference<>();

	public static Agreement repoType() {
		repoTypeRef.compareAndSet(null, new Agreement());
		return repoTypeRef.get();
	}

	private Agreement() {
		super.name = "Agreement";
		super.definition = "Contractual details related to an agreement between parties.";
	}
}