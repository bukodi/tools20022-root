package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTReferredDocumentType3Choice extends MMChoiceComponent {

	private final static AtomicReference<RTReferredDocumentType3Choice> repoTypeRef = new AtomicReference<>();

	public static RTReferredDocumentType3Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTReferredDocumentType3Choice());
		return repoTypeRef.get();
	}

	private RTReferredDocumentType3Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ReferredDocumentType3Choice";
		super.definition = "Specifies the type of the document referred in the remittance information.";
	}
}