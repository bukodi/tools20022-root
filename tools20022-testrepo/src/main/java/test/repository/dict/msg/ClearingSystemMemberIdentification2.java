package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;

public class ClearingSystemMemberIdentification2 extends MMMessageComponent {

	private final static AtomicReference<ClearingSystemMemberIdentification2> repoTypeRef = new AtomicReference<>();

	public static ClearingSystemMemberIdentification2 repoType() {
		repoTypeRef.compareAndSet(null,
				new ClearingSystemMemberIdentification2());
		return repoTypeRef.get();
	}

	private ClearingSystemMemberIdentification2() {
		super.name = "ClearingSystemMemberIdentification2";
		super.definition = "Unique identification, as assigned by a clearing system, to unambiguously identify a member of the clearing system.";
	}
}