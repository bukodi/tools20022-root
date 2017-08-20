package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;

public class DocumentIssuer extends MMBusinessComponent {

	private final static AtomicReference<DocumentIssuer> repoTypeRef = new AtomicReference<>();

	public static DocumentIssuer repoType() {
		repoTypeRef.compareAndSet(null, new DocumentIssuer());
		return repoTypeRef.get();
	}

	private DocumentIssuer() {
		super.name = "DocumentIssuer";
		super.definition = "Party that issues a document such as a bank guarantee or letter of / documentary credit. For instance the inspection company for a trade certificate or the insurance company or its agent for an insurance certificate.";
	}
}