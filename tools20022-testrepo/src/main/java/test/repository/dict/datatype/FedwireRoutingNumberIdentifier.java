package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class FedwireRoutingNumberIdentifier extends MMIdentifierSet {

	private final static AtomicReference<FedwireRoutingNumberIdentifier> repoTypeRef = new AtomicReference<>();

	public static FedwireRoutingNumberIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new FedwireRoutingNumberIdentifier());
		return repoTypeRef.get();
	}

	private FedwireRoutingNumberIdentifier() {
		super.identificationScheme = "US Federal Reserve Bank ; FedwireRoutingNumberIdentifier";
		super.pattern = "FW[0-9]{9,9}";
		super.name = "FedwireRoutingNumberIdentifier";
		super.definition = "Fedwire Routing Number. Identifies financial institutions, in the US, on the FedWire system. The routing number is assigned by the American Bankers Association (ABA).";
		super.example = Arrays.asList("FW123456789");
	}
}