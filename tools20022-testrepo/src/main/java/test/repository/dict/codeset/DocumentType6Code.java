package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class DocumentType6Code extends MMCodeSet {

	private final static AtomicReference<DocumentType6Code> repoTypeRef = new AtomicReference<>();

	public static DocumentType6Code repoType() {
		repoTypeRef.compareAndSet(null, new DocumentType6Code());
		return repoTypeRef.get();
	}

	private DocumentType6Code() {
		super.name = "DocumentType6Code";
		super.definition = "Specifies a type of financial or commercial document.";
		super.example = Arrays.asList("MSIN");
	}
}