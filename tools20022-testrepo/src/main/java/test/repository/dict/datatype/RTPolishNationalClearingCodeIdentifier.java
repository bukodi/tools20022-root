package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTPolishNationalClearingCodeIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTPolishNationalClearingCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTPolishNationalClearingCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null,
				new RTPolishNationalClearingCodeIdentifier());
		return repoTypeRef.get();
	}

	private RTPolishNationalClearingCodeIdentifier() {
		super.identificationScheme = "Polish Central Bank; Payment Routing Number";
		super.pattern = "PL[0-9]{8,8}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("PL12345678");
		super.name = "PolishNationalClearingCodeIdentifier";
		super.definition = "Polish National Clearing Code Identifier. Identifies Polish financial institutions on the Polish national clearing system.";
	}
}