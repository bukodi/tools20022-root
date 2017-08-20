package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class CashAccountTypeCode extends MMCodeSet {

	private final static AtomicReference<CashAccountTypeCode> repoTypeRef = new AtomicReference<>();

	public static CashAccountTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new CashAccountTypeCode());
		return repoTypeRef.get();
	}

	private CashAccountTypeCode() {
		super.name = "CashAccountTypeCode";
		super.definition = "Specifies the nature, or  use, of the cash account.";
		super.example = Arrays.asList("CASH");
	}
}