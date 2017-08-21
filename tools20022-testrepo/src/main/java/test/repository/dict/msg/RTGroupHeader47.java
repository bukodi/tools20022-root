package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTGroupHeader47 extends MMMessageComponent {

	private final static AtomicReference<RTGroupHeader47> repoTypeRef = new AtomicReference<>();

	public static RTGroupHeader47 repoType() {
		repoTypeRef.compareAndSet(null, new RTGroupHeader47());
		return repoTypeRef.get();
	}

	private RTGroupHeader47() {
		super.messageElement = Arrays.asList();
		super.messageBuildingBlock_lazy = () -> Arrays.asList(null);
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "GroupHeader47";
		super.definition = "Set of characteristics shared by all individual transactions included in the message.";
	}
}