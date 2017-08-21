package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class GenericPersonIdentification1 extends MMMessageComponent {

	private final static AtomicReference<GenericPersonIdentification1> repoTypeRef = new AtomicReference<>();

	public static GenericPersonIdentification1 repoType() {
		repoTypeRef.compareAndSet(null, new GenericPersonIdentification1());
		return repoTypeRef.get();
	}

	private GenericPersonIdentification1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "GenericPersonIdentification1";
		super.definition = "Information related to an identification of a person.";
	}
}