package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class ClearingChannelCode extends MMCodeSet {

	private final static AtomicReference<ClearingChannelCode> repoTypeRef = new AtomicReference<>();

	public static ClearingChannelCode repoType() {
		repoTypeRef.compareAndSet(null, new ClearingChannelCode());
		return repoTypeRef.get();
	}

	private ClearingChannelCode() {
		super.name = "ClearingChannelCode";
		super.definition = "Specifies the clearing channel for the routing of the transaction, as part of the payment type identification.";
		super.example = Arrays.asList("RTGS");
	}
}