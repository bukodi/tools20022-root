package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;

public class Frequency36Choice extends MMChoiceComponent {

	private final static AtomicReference<Frequency36Choice> repoTypeRef = new AtomicReference<>();

	public static Frequency36Choice repoType() {
		repoTypeRef.compareAndSet(null, new Frequency36Choice());
		return repoTypeRef.get();
	}

	private Frequency36Choice() {
		super.name = "Frequency36Choice";
		super.definition = "Choice of format for a frequency, for example, the frequency of payment.";
	}
}