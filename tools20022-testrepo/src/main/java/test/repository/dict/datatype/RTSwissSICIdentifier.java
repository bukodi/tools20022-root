package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTSwissSICIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTSwissSICIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTSwissSICIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTSwissSICIdentifier());
		return repoTypeRef.get();
	}

	private RTSwissSICIdentifier() {
		super.identificationScheme = "Swiss Interbank Clearing Ltd; SIC Identifier";
		super.pattern = "SW[0-9]{6,6}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("SW123456");
		super.name = "SwissSICIdentifier";
		super.definition = "Swiss Interbank Clearing (SIC) Code. Identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
	}
}