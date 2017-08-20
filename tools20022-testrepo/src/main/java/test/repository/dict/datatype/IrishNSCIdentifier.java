package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class IrishNSCIdentifier extends MMIdentifierSet {

	private final static AtomicReference<IrishNSCIdentifier> repoTypeRef = new AtomicReference<>();

	public static IrishNSCIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new IrishNSCIdentifier());
		return repoTypeRef.get();
	}

	private IrishNSCIdentifier() {
		super.identificationScheme = "Irish Payment Services Organisation (IPSO); Irish National Sort Code";
		super.pattern = "IE[0-9]{6,6}";
		super.name = "IrishNSCIdentifier";
		super.definition = "Irish National Sorting Code. Identifies Irish financial institutions on the Irish national clearing system.";
		super.example = Arrays.asList("IE123456");
	}
}