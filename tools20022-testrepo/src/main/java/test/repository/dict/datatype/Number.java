package test.repository.dict.datatype;

import com.tools20022.metamodel.MMQuantity;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class Number extends MMQuantity {

	private final static AtomicReference<Number> repoTypeRef = new AtomicReference<>();

	public static Number repoType() {
		repoTypeRef.compareAndSet(null, new Number());
		return repoTypeRef.get();
	}

	private Number() {
		super.totalDigits = 18;
		super.fractionDigits = 0;
		super.name = "Number";
		super.definition = "Number of objects represented as an integer.";
		super.example = Arrays.asList("123456789012345678");
	}
}