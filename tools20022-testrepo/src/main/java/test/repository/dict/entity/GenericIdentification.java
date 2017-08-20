package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class GenericIdentification extends MMBusinessComponent {

	private final static AtomicReference<GenericIdentification> repoTypeRef = new AtomicReference<>();

	public static GenericIdentification repoType() {
		repoTypeRef.compareAndSet(null, new GenericIdentification());
		return repoTypeRef.get();
	}

	private GenericIdentification() {
		super.associationDomain_lazy = () -> Arrays.asList(null, null, null);
		super.name = "GenericIdentification";
		super.definition = "Information related to a non-standardised identification, such as a proprietary party identification or account identification.";
	}
}