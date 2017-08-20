package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class CashClearingSystemCode extends MMCodeSet {

	private final static AtomicReference<CashClearingSystemCode> repoTypeRef = new AtomicReference<>();

	public static CashClearingSystemCode repoType() {
		repoTypeRef.compareAndSet(null, new CashClearingSystemCode());
		return repoTypeRef.get();
	}

	private CashClearingSystemCode() {
		super.name = "CashClearingSystemCode";
		super.definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is to be processed.";
		super.example = Arrays.asList("ABE");
	}
}