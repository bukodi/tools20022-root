package test.repository.dict.datatype;

import com.tools20022.metamodel.MMAmount;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class ActiveCurrencyAndAmount extends MMAmount {

	private final static AtomicReference<ActiveCurrencyAndAmount> repoTypeRef = new AtomicReference<>();

	public static ActiveCurrencyAndAmount repoType() {
		repoTypeRef.compareAndSet(null, new ActiveCurrencyAndAmount());
		return repoTypeRef.get();
	}

	private ActiveCurrencyAndAmount() {
		super.totalDigits = 18;
		super.minInclusive = "0";
		super.fractionDigits = 5;
		super.name = "ActiveCurrencyAndAmount";
		super.definition = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.";
		super.example = Arrays.asList("6545.56");
	}
}