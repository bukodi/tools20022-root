package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class ReferredDocumentType3Choice extends MMChoiceComponent {

	private final static AtomicReference<ReferredDocumentType3Choice> repoTypeRef = new AtomicReference<>();

	public static ReferredDocumentType3Choice repoType() {
		repoTypeRef.compareAndSet(null, new ReferredDocumentType3Choice());
		return repoTypeRef.get();
	}

	private ReferredDocumentType3Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ReferredDocumentType3Choice";
		super.definition = "Specifies the type of the document referred in the remittance information.";
	}
}