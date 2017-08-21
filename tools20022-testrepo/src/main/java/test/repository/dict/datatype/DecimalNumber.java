package test.repository.dict.datatype;

import com.tools20022.metamodel.MMQuantity;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class DecimalNumber extends MMQuantity {

	private final static AtomicReference<DecimalNumber> repoTypeRef = new AtomicReference<>();

	public static DecimalNumber repoType() {
		repoTypeRef.compareAndSet(null, new DecimalNumber());
		return repoTypeRef.get();
	}

	private DecimalNumber() {
		super.totalDigits = 18;
		super.fractionDigits = 17;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("123456789.123456789");
		super.name = "DecimalNumber";
		super.definition = "Number of objects represented as a decimal number, eg, 0.75 or 45.6.";
	}
}