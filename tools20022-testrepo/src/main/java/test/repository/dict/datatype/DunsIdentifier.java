package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class DunsIdentifier extends MMIdentifierSet {

	private final static AtomicReference<DunsIdentifier> repoTypeRef = new AtomicReference<>();

	public static DunsIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new DunsIdentifier());
		return repoTypeRef.get();
	}

	private DunsIdentifier() {
		super.identificationScheme = "Dun & Bradstreet; DunsIdentifier";
		super.pattern = "[0-9]{9,9}";
		super.name = "DunsIdentifier";
		super.definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
		super.example = Arrays.asList("578942538");
	}
}