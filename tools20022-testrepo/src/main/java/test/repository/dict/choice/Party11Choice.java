package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class Party11Choice extends MMChoiceComponent {

	private final static AtomicReference<Party11Choice> repoTypeRef = new AtomicReference<>();

	public static Party11Choice repoType() {
		repoTypeRef.compareAndSet(null, new Party11Choice());
		return repoTypeRef.get();
	}

	private Party11Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Party11Choice";
		super.definition = "Nature or use of the account.";
	}
}