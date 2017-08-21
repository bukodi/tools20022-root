package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTIBAN2007Identifier extends MMIdentifierSet {

	private final static AtomicReference<RTIBAN2007Identifier> repoTypeRef = new AtomicReference<>();

	public static RTIBAN2007Identifier repoType() {
		repoTypeRef.compareAndSet(null, new RTIBAN2007Identifier());
		return repoTypeRef.get();
	}

	private RTIBAN2007Identifier() {
		super.identificationScheme = "National Banking Association; International Bank Account Number (ISO 13616)";
		super.pattern = "[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("AT611904300234573201");
		super.constraint = Arrays.asList();
		super.name = "IBAN2007Identifier";
		super.definition = "An identifier used internationally by financial institutions to uniquely identify the account of a customer at a financial institution, as described in the latest edition of the international standard ISO 13616:2007 - \"Banking and related financial services - International Bank Account Number (IBAN)\".";
	}
}