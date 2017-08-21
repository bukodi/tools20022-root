package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTDocumentIssuer extends MMBusinessComponent {

	private final static AtomicReference<RTDocumentIssuer> repoTypeRef = new AtomicReference<>();

	public static RTDocumentIssuer repoType() {
		repoTypeRef.compareAndSet(null, new RTDocumentIssuer());
		return repoTypeRef.get();
	}

	private RTDocumentIssuer() {
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "DocumentIssuer";
		super.definition = "Party that issues a document such as a bank guarantee or letter of / documentary credit. For instance the inspection company for a trade certificate or the insurance company or its agent for an insurance certificate.";
	}
}