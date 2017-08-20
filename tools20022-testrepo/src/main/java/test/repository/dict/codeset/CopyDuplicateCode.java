package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class CopyDuplicateCode extends MMCodeSet {

	private final static AtomicReference<CopyDuplicateCode> repoTypeRef = new AtomicReference<>();

	public static CopyDuplicateCode repoType() {
		repoTypeRef.compareAndSet(null, new CopyDuplicateCode());
		return repoTypeRef.get();
	}

	private CopyDuplicateCode() {
		super.name = "CopyDuplicateCode";
		super.definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
		super.example = Arrays.asList("CODU");
	}
}