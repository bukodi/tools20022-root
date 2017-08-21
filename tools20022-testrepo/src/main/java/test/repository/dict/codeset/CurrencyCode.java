package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class CurrencyCode extends MMCodeSet {

	private final static AtomicReference<CurrencyCode> repoTypeRef = new AtomicReference<>();

	public static CurrencyCode repoType() {
		repoTypeRef.compareAndSet(null, new CurrencyCode());
		return repoTypeRef.get();
	}

	private CurrencyCode() {
		super.pattern = "[A-Z]{3,3}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("AWG");
		super.constraint = Arrays.asList();
		super.name = "CurrencyCode";
		super.definition = "Code allocated to a currency, by a maintenance agency, under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\". Valid currency codes are registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters.";
	}
}