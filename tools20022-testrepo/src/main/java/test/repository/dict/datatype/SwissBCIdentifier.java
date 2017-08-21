package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class SwissBCIdentifier extends MMIdentifierSet {

	private final static AtomicReference<SwissBCIdentifier> repoTypeRef = new AtomicReference<>();

	public static SwissBCIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new SwissBCIdentifier());
		return repoTypeRef.get();
	}

	private SwissBCIdentifier() {
		super.identificationScheme = "Swiss Interbank Clearing Ltd; BC Identifier";
		super.pattern = "SW[0-9]{3,5}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("SW123");
		super.name = "SwissBCIdentifier";
		super.definition = "Swiss Bank Code. Identifies Swiss institutions on the Swiss national clearing system.";
	}
}