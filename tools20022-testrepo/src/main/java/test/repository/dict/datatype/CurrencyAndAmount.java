package test.repository.dict.datatype;

import com.tools20022.metamodel.MMAmount;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class CurrencyAndAmount extends MMAmount {

	private final static AtomicReference<CurrencyAndAmount> repoTypeRef = new AtomicReference<>();

	public static CurrencyAndAmount repoType() {
		repoTypeRef.compareAndSet(null, new CurrencyAndAmount());
		return repoTypeRef.get();
	}

	private CurrencyAndAmount() {
		super.totalDigits = 18;
		super.minInclusive = "0";
		super.fractionDigits = 5;
		super.name = "CurrencyAndAmount";
		super.definition = "Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217.  The decimal separator is a dot.\nNote: A zero amount is considered a positive amount.";
		super.example = Arrays.asList("100000");
	}
}