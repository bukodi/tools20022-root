package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTPortugueseNCCIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTPortugueseNCCIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTPortugueseNCCIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTPortugueseNCCIdentifier());
		return repoTypeRef.get();
	}

	private RTPortugueseNCCIdentifier() {
		super.identificationScheme = "Banco de Portugal; PortugueseNCC";
		super.pattern = "PT[0-9]{8,8}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("PT12345678");
		super.name = "PortugueseNCCIdentifier";
		super.definition = "Portuguese National Clearing Code. Identifies Portuguese financial institutions on the Portuguese national clearing system.";
	}
}