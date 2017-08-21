package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class ExternalClearingSystemIdentification1Code extends MMCodeSet {

	private final static AtomicReference<ExternalClearingSystemIdentification1Code> repoTypeRef = new AtomicReference<>();

	public static ExternalClearingSystemIdentification1Code repoType() {
		repoTypeRef.compareAndSet(null,
				new ExternalClearingSystemIdentification1Code());
		return repoTypeRef.get();
	}

	private ExternalClearingSystemIdentification1Code() {
		super.minLength = 1;
		super.maxLength = 5;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("AUBSB");
		super.name = "ExternalClearingSystemIdentification1Code";
		super.definition = "Specifies the clearing system identification code, as published in an external clearing system identification code list.\r\nExternal code sets can be downloaded from www.iso20022.org.";
	}
}