package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class ExternalLocalInstrument1Code extends MMCodeSet {

	private final static AtomicReference<ExternalLocalInstrument1Code> repoTypeRef = new AtomicReference<>();

	public static ExternalLocalInstrument1Code repoType() {
		repoTypeRef.compareAndSet(null, new ExternalLocalInstrument1Code());
		return repoTypeRef.get();
	}

	private ExternalLocalInstrument1Code() {
		super.maxLength = 35;
		super.minLength = 1;
		super.name = "ExternalLocalInstrument1Code";
		super.definition = "Specifies the external local instrument code in the format of character string with a maximum length of 35 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("LOC1");
	}
}