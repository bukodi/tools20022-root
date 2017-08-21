package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTGenericAccountIdentification1 extends MMMessageComponent {

	private final static AtomicReference<RTGenericAccountIdentification1> repoTypeRef = new AtomicReference<>();

	public static RTGenericAccountIdentification1 repoType() {
		repoTypeRef.compareAndSet(null, new RTGenericAccountIdentification1());
		return repoTypeRef.get();
	}

	private RTGenericAccountIdentification1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "GenericAccountIdentification1";
		super.definition = "Information related to a generic account identification.";
	}
}