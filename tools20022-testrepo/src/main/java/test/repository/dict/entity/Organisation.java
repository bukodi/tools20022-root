package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;

public class Organisation extends MMBusinessComponent {

	private final static AtomicReference<Organisation> repoTypeRef = new AtomicReference<>();

	public static Organisation repoType() {
		repoTypeRef.compareAndSet(null, new Organisation());
		return repoTypeRef.get();
	}

	private Organisation() {
		super.name = "Organisation";
		super.definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
	}
}