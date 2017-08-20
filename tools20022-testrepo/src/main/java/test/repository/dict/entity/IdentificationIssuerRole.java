package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;

public class IdentificationIssuerRole extends MMBusinessComponent {

	private final static AtomicReference<IdentificationIssuerRole> repoTypeRef = new AtomicReference<>();

	public static IdentificationIssuerRole repoType() {
		repoTypeRef.compareAndSet(null, new IdentificationIssuerRole());
		return repoTypeRef.get();
	}

	private IdentificationIssuerRole() {
		super.name = "IdentificationIssuerRole";
		super.definition = "Entity that assigns the identification.";
	}
}