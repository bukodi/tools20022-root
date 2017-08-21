package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTAnyBICIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTAnyBICIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTAnyBICIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTAnyBICIdentifier());
		return repoTypeRef.get();
	}

	private RTAnyBICIdentifier() {
		super.identificationScheme = "SWIFT; AnyBICIdentifier";
		super.pattern = "[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("CHASUS33");
		super.constraint = Arrays.asList();
		super.name = "AnyBICIdentifier";
		super.definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
	}
}