package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class ServiceLevelCode extends MMCodeSet {

	private final static AtomicReference<ServiceLevelCode> repoTypeRef = new AtomicReference<>();

	public static ServiceLevelCode repoType() {
		repoTypeRef.compareAndSet(null, new ServiceLevelCode());
		return repoTypeRef.get();
	}

	private ServiceLevelCode() {
		super.name = "ServiceLevelCode";
		super.definition = "Specifies the pre-agreed level of service between the parties.";
		super.example = Arrays.asList("SDVA");
	}
}