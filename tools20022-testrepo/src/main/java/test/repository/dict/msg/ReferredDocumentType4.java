package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class ReferredDocumentType4 extends MMMessageComponent {

	private final static AtomicReference<ReferredDocumentType4> repoTypeRef = new AtomicReference<>();

	public static ReferredDocumentType4 repoType() {
		repoTypeRef.compareAndSet(null, new ReferredDocumentType4());
		return repoTypeRef.get();
	}

	private ReferredDocumentType4() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ReferredDocumentType4";
		super.definition = "Specifies the type of the document referred in the remittance information.";
	}
}