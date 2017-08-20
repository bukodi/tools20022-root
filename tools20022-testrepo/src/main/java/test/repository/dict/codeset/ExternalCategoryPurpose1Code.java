package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class ExternalCategoryPurpose1Code extends MMCodeSet {

	private final static AtomicReference<ExternalCategoryPurpose1Code> repoTypeRef = new AtomicReference<>();

	public static ExternalCategoryPurpose1Code repoType() {
		repoTypeRef.compareAndSet(null, new ExternalCategoryPurpose1Code());
		return repoTypeRef.get();
	}

	private ExternalCategoryPurpose1Code() {
		super.maxLength = 4;
		super.minLength = 1;
		super.name = "ExternalCategoryPurpose1Code";
		super.definition = "Specifies the category purpose, as published in an external category purpose code list.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("CORT");
	}
}