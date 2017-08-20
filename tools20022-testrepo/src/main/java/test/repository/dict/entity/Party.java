package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;

public class Party extends MMBusinessComponent {

	private final static AtomicReference<Party> repoTypeRef = new AtomicReference<>();

	public static Party repoType() {
		repoTypeRef.compareAndSet(null, new Party());
		return repoTypeRef.get();
	}

	private Party() {
		super.name = "Party";
		super.definition = "Entity involved in an activity.";
	}
}