package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class NewZealandNCCIdentifier extends MMIdentifierSet {

	private final static AtomicReference<NewZealandNCCIdentifier> repoTypeRef = new AtomicReference<>();

	public static NewZealandNCCIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new NewZealandNCCIdentifier());
		return repoTypeRef.get();
	}

	private NewZealandNCCIdentifier() {
		super.identificationScheme = "New Zealand Bankers Association; NewZealandNCC";
		super.pattern = "NZ[0-9]{6,6}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("NZ123456");
		super.name = "NewZealandNCCIdentifier";
		super.definition = "New Zealand Bank/Branch Code. Identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
	}
}