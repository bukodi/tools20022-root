package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTExternalOrganisationIdentification1Code extends MMCodeSet {

	private final static AtomicReference<RTExternalOrganisationIdentification1Code> repoTypeRef = new AtomicReference<>();

	public static RTExternalOrganisationIdentification1Code repoType() {
		repoTypeRef.compareAndSet(null,
				new RTExternalOrganisationIdentification1Code());
		return repoTypeRef.get();
	}

	private RTExternalOrganisationIdentification1Code() {
		super.minLength = 1;
		super.maxLength = 4;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("CUST");
		super.name = "ExternalOrganisationIdentification1Code";
		super.definition = "Specifies the external organisation identification scheme name code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
	}
}