package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAuthenticationChannel1Choice extends MMChoiceComponent {

	private final static AtomicReference<RTAuthenticationChannel1Choice> repoTypeRef = new AtomicReference<>();

	public static RTAuthenticationChannel1Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthenticationChannel1Choice());
		return repoTypeRef.get();
	}

	private RTAuthenticationChannel1Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "AuthenticationChannel1Choice";
		super.definition = "Choice of format for an authentication channel.";
	}
}