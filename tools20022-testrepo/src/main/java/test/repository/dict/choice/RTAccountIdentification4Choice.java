package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAccountIdentification4Choice extends MMChoiceComponent {

	private final static AtomicReference<RTAccountIdentification4Choice> repoTypeRef = new AtomicReference<>();

	public static RTAccountIdentification4Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTAccountIdentification4Choice());
		return repoTypeRef.get();
	}

	private RTAccountIdentification4Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "AccountIdentification4Choice";
		super.definition = "Specifies the unique identification of an account as assigned by the account servicer.";
	}
}