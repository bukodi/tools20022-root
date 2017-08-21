package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPersonIdentification5 extends MMMessageComponent {

	private final static AtomicReference<RTPersonIdentification5> repoTypeRef = new AtomicReference<>();

	public static RTPersonIdentification5 repoType() {
		repoTypeRef.compareAndSet(null, new RTPersonIdentification5());
		return repoTypeRef.get();
	}

	private RTPersonIdentification5() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PersonIdentification5";
		super.definition = "Unique and unambiguous way to identify a person.";
	}
}