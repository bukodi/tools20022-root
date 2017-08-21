package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTExternalCode extends MMCodeSet {

	private final static AtomicReference<RTExternalCode> repoTypeRef = new AtomicReference<>();

	public static RTExternalCode repoType() {
		repoTypeRef.compareAndSet(null, new RTExternalCode());
		return repoTypeRef.get();
	}

	private RTExternalCode() {
		super.minLength = 1;
		super.maxLength = 35;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("External  Code 1");
		super.name = "ExternalCode";
		super.definition = "Specifies an external code in the format of character string with a maximum length of 35 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
	}
}