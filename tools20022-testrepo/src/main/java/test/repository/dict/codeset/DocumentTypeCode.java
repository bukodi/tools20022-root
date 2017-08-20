package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class DocumentTypeCode extends MMCodeSet {

	private final static AtomicReference<DocumentTypeCode> repoTypeRef = new AtomicReference<>();

	public static DocumentTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new DocumentTypeCode());
		return repoTypeRef.get();
	}

	private DocumentTypeCode() {
		super.name = "DocumentTypeCode";
		super.definition = "Specifies a type of financial or commercial document.";
		super.example = Arrays.asList("MSIN");
	}
}