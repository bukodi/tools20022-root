package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTFedwireRoutingNumberIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTFedwireRoutingNumberIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTFedwireRoutingNumberIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTFedwireRoutingNumberIdentifier());
		return repoTypeRef.get();
	}

	private RTFedwireRoutingNumberIdentifier() {
		super.identificationScheme = "US Federal Reserve Bank ; FedwireRoutingNumberIdentifier";
		super.pattern = "FW[0-9]{9,9}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("FW123456789");
		super.name = "FedwireRoutingNumberIdentifier";
		super.definition = "Fedwire Routing Number. Identifies financial institutions, in the US, on the FedWire system. The routing number is assigned by the American Bankers Association (ABA).";
	}
}