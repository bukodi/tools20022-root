package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;

public class MandateTypeInformation2 extends MMMessageComponent {

	private final static AtomicReference<MandateTypeInformation2> repoTypeRef = new AtomicReference<>();

	public static MandateTypeInformation2 repoType() {
		repoTypeRef.compareAndSet(null, new MandateTypeInformation2());
		return repoTypeRef.get();
	}

	private MandateTypeInformation2() {
		super.name = "MandateTypeInformation2";
		super.definition = "Set of elements used to further detail the information related to the type of payment.";
	}
}