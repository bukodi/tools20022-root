package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTExternalAccountIdentification1Code extends MMCodeSet {

	private final static AtomicReference<RTExternalAccountIdentification1Code> repoTypeRef = new AtomicReference<>();

	public static RTExternalAccountIdentification1Code repoType() {
		repoTypeRef.compareAndSet(null,
				new RTExternalAccountIdentification1Code());
		return repoTypeRef.get();
	}

	private RTExternalAccountIdentification1Code() {
		super.minLength = 1;
		super.maxLength = 4;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("BBAN");
		super.name = "ExternalAccountIdentification1Code";
		super.definition = "Specifies the external account identification scheme name code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
	}
}