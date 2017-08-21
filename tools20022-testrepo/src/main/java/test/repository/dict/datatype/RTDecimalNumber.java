package test.repository.dict.datatype;

import com.tools20022.metamodel.MMQuantity;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTDecimalNumber extends MMQuantity {

	private final static AtomicReference<RTDecimalNumber> repoTypeRef = new AtomicReference<>();

	public static RTDecimalNumber repoType() {
		repoTypeRef.compareAndSet(null, new RTDecimalNumber());
		return repoTypeRef.get();
	}

	private RTDecimalNumber() {
		super.totalDigits = 18;
		super.fractionDigits = 17;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("123456789.123456789");
		super.name = "DecimalNumber";
		super.definition = "Number of objects represented as a decimal number, eg, 0.75 or 45.6.";
	}
}