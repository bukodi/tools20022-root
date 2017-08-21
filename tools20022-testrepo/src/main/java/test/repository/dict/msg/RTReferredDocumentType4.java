package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTReferredDocumentType4 extends MMMessageComponent {

	private final static AtomicReference<RTReferredDocumentType4> repoTypeRef = new AtomicReference<>();

	public static RTReferredDocumentType4 repoType() {
		repoTypeRef.compareAndSet(null, new RTReferredDocumentType4());
		return repoTypeRef.get();
	}

	private RTReferredDocumentType4() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ReferredDocumentType4";
		super.definition = "Specifies the type of the document referred in the remittance information.";
	}
}