package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class GroupHeader47 extends MMMessageComponent {

	private final static AtomicReference<GroupHeader47> repoTypeRef = new AtomicReference<>();

	public static GroupHeader47 repoType() {
		repoTypeRef.compareAndSet(null, new GroupHeader47());
		return repoTypeRef.get();
	}

	private GroupHeader47() {
		super.messageBuildingBlock_lazy = () -> Arrays.asList(null);
		super.name = "GroupHeader47";
		super.definition = "Set of characteristics shared by all individual transactions included in the message.";
	}
}