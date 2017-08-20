package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;

public class MandateAuthentication1 extends MMMessageComponent {

	private final static AtomicReference<MandateAuthentication1> repoTypeRef = new AtomicReference<>();

	public static MandateAuthentication1 repoType() {
		repoTypeRef.compareAndSet(null, new MandateAuthentication1());
		return repoTypeRef.get();
	}

	private MandateAuthentication1() {
		super.name = "MandateAuthentication1";
		super.definition = "Specifies the transport authentication details related to the mandate.";
	}
}