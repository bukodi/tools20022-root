package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class ExternalServiceLevel1Code extends MMCodeSet {

	private final static AtomicReference<ExternalServiceLevel1Code> repoTypeRef = new AtomicReference<>();

	public static ExternalServiceLevel1Code repoType() {
		repoTypeRef.compareAndSet(null, new ExternalServiceLevel1Code());
		return repoTypeRef.get();
	}

	private ExternalServiceLevel1Code() {
		super.minLength = 1;
		super.maxLength = 4;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("SEPA");
		super.name = "ExternalServiceLevel1Code";
		super.definition = "Specifies the external service level code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
	}
}