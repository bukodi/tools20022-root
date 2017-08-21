package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTReferredMandateDocument1 extends MMMessageComponent {

	private final static AtomicReference<RTReferredMandateDocument1> repoTypeRef = new AtomicReference<>();

	public static RTReferredMandateDocument1 repoType() {
		repoTypeRef.compareAndSet(null, new RTReferredMandateDocument1());
		return repoTypeRef.get();
	}

	private RTReferredMandateDocument1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ReferredMandateDocument1";
		super.definition = "Identifies the documents referred to in the remittance information.";
	}
}