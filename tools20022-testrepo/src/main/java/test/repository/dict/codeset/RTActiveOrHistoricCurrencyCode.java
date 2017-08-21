package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTActiveOrHistoricCurrencyCode extends MMCodeSet {

	private final static AtomicReference<RTActiveOrHistoricCurrencyCode> repoTypeRef = new AtomicReference<>();

	public static RTActiveOrHistoricCurrencyCode repoType() {
		repoTypeRef.compareAndSet(null, new RTActiveOrHistoricCurrencyCode());
		return repoTypeRef.get();
	}

	private RTActiveOrHistoricCurrencyCode() {
		super.pattern = "[A-Z]{3,3}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("USD");
		super.constraint = Arrays.asList();
		super.name = "ActiveOrHistoricCurrencyCode";
		super.definition = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".";
	}
}