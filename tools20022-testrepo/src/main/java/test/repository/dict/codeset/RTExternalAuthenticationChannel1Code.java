package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTExternalAuthenticationChannel1Code extends MMCodeSet {

	private final static AtomicReference<RTExternalAuthenticationChannel1Code> repoTypeRef = new AtomicReference<>();

	public static RTExternalAuthenticationChannel1Code repoType() {
		repoTypeRef.compareAndSet(null,
				new RTExternalAuthenticationChannel1Code());
		return repoTypeRef.get();
	}

	private RTExternalAuthenticationChannel1Code() {
		super.minLength = 1;
		super.maxLength = 4;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("DUPL");
		super.name = "ExternalAuthenticationChannel1Code";
		super.definition = "Specifies the transaction authentication channel, as published in an external authentication channel code set.\r\nExternal code sets can be downloaded from www.iso20022.org.";
	}
}