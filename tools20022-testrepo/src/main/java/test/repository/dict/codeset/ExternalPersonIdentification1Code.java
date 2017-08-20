package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class ExternalPersonIdentification1Code extends MMCodeSet {

	private final static AtomicReference<ExternalPersonIdentification1Code> repoTypeRef = new AtomicReference<>();

	public static ExternalPersonIdentification1Code repoType() {
		repoTypeRef
				.compareAndSet(null, new ExternalPersonIdentification1Code());
		return repoTypeRef.get();
	}

	private ExternalPersonIdentification1Code() {
		super.maxLength = 4;
		super.minLength = 1;
		super.name = "ExternalPersonIdentification1Code";
		super.definition = "Specifies the external person identification scheme name code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("ARNU");
	}
}