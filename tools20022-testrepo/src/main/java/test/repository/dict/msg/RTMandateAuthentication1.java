package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMandateAuthentication1 extends MMMessageComponent {

	private final static AtomicReference<RTMandateAuthentication1> repoTypeRef = new AtomicReference<>();

	public static RTMandateAuthentication1 repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateAuthentication1());
		return repoTypeRef.get();
	}

	private RTMandateAuthentication1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "MandateAuthentication1";
		super.definition = "Specifies the transport authentication details related to the mandate.";
	}
}