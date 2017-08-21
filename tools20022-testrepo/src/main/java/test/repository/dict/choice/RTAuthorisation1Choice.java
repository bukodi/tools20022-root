package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAuthorisation1Choice extends MMChoiceComponent {

	private final static AtomicReference<RTAuthorisation1Choice> repoTypeRef = new AtomicReference<>();

	public static RTAuthorisation1Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthorisation1Choice());
		return repoTypeRef.get();
	}

	private RTAuthorisation1Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Authorisation1Choice";
		super.definition = "Provides the details on the user identification or any user key that allows to check if the initiating party is allowed to issue the transaction.";
	}
}