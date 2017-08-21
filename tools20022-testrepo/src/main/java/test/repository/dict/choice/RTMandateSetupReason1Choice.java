package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMandateSetupReason1Choice extends MMChoiceComponent {

	private final static AtomicReference<RTMandateSetupReason1Choice> repoTypeRef = new AtomicReference<>();

	public static RTMandateSetupReason1Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateSetupReason1Choice());
		return repoTypeRef.get();
	}

	private RTMandateSetupReason1Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "MandateSetupReason1Choice";
		super.definition = "Specifies the reason for the setup of the mandate.";
	}
}