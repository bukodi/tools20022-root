package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTClearingSystemMemberIdentification2 extends MMMessageComponent {

	private final static AtomicReference<RTClearingSystemMemberIdentification2> repoTypeRef = new AtomicReference<>();

	public static RTClearingSystemMemberIdentification2 repoType() {
		repoTypeRef.compareAndSet(null,
				new RTClearingSystemMemberIdentification2());
		return repoTypeRef.get();
	}

	private RTClearingSystemMemberIdentification2() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ClearingSystemMemberIdentification2";
		super.definition = "Unique identification, as assigned by a clearing system, to unambiguously identify a member of the clearing system.";
	}
}