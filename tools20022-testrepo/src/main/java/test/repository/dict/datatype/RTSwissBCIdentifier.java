package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTSwissBCIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTSwissBCIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTSwissBCIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTSwissBCIdentifier());
		return repoTypeRef.get();
	}

	private RTSwissBCIdentifier() {
		super.identificationScheme = "Swiss Interbank Clearing Ltd; BC Identifier";
		super.pattern = "SW[0-9]{3,5}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("SW123");
		super.name = "SwissBCIdentifier";
		super.definition = "Swiss Bank Code. Identifies Swiss institutions on the Swiss national clearing system.";
	}
}