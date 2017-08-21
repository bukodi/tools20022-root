package test.repository.dict.datatype;

import com.tools20022.metamodel.MMAmount;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTCurrencyAndAmount extends MMAmount {

	private final static AtomicReference<RTCurrencyAndAmount> repoTypeRef = new AtomicReference<>();

	public static RTCurrencyAndAmount repoType() {
		repoTypeRef.compareAndSet(null, new RTCurrencyAndAmount());
		return repoTypeRef.get();
	}

	private RTCurrencyAndAmount() {
		super.minInclusive = "0";
		super.totalDigits = 18;
		super.fractionDigits = 5;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("100000");
		super.name = "CurrencyAndAmount";
		super.definition = "Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217.  The decimal separator is a dot.\nNote: A zero amount is considered a positive amount.";
	}
}