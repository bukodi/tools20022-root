package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class ExternalCashAccountType1Code extends MMCodeSet {

	private final static AtomicReference<ExternalCashAccountType1Code> repoTypeRef = new AtomicReference<>();

	public static ExternalCashAccountType1Code repoType() {
		repoTypeRef.compareAndSet(null, new ExternalCashAccountType1Code());
		return repoTypeRef.get();
	}

	private ExternalCashAccountType1Code() {
		super.maxLength = 4;
		super.minLength = 1;
		super.name = "ExternalCashAccountType1Code";
		super.definition = "Specifies the nature, or use, of the cash account in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("BBAN");
	}
}