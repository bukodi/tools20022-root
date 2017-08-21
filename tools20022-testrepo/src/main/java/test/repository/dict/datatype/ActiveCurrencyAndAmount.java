package test.repository.dict.datatype;

import com.tools20022.metamodel.MMAmount;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class ActiveCurrencyAndAmount extends MMAmount {

	private final static AtomicReference<ActiveCurrencyAndAmount> repoTypeRef = new AtomicReference<>();

	public static ActiveCurrencyAndAmount repoType() {
		repoTypeRef.compareAndSet(null, new ActiveCurrencyAndAmount());
		return repoTypeRef.get();
	}

	private ActiveCurrencyAndAmount() {
		super.minInclusive = "0";
		super.totalDigits = 18;
		super.fractionDigits = 5;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("6545.56");
		super.constraint = Arrays.asList();
		super.name = "ActiveCurrencyAndAmount";
		super.definition = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.";
	}
}