package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class Document extends MMBusinessComponent {

	private final static AtomicReference<Document> repoTypeRef = new AtomicReference<>();

	public static Document repoType() {
		repoTypeRef.compareAndSet(null, new Document());
		return repoTypeRef.get();
	}

	private Document() {
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.name = "Document";
		super.definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
	}
}