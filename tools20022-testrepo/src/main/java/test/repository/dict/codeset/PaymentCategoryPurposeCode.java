package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class PaymentCategoryPurposeCode extends MMCodeSet {

	private final static AtomicReference<PaymentCategoryPurposeCode> repoTypeRef = new AtomicReference<>();

	public static PaymentCategoryPurposeCode repoType() {
		repoTypeRef.compareAndSet(null, new PaymentCategoryPurposeCode());
		return repoTypeRef.get();
	}

	private PaymentCategoryPurposeCode() {
		super.name = "PaymentCategoryPurposeCode";
		super.definition = "Specifies the type of transaction that resulted in the payment.";
		super.example = Arrays.asList("INTC");
	}
}