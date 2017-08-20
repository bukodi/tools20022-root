package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class IndianFinancialSystemCodeIdentifier extends MMIdentifierSet {

	private final static AtomicReference<IndianFinancialSystemCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static IndianFinancialSystemCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null,
				new IndianFinancialSystemCodeIdentifier());
		return repoTypeRef.get();
	}

	private IndianFinancialSystemCodeIdentifier() {
		super.identificationScheme = "Indian Financial System; Payment Routing Number";
		super.pattern = "IN[a-zA-Z0-9]{11,11}";
		super.name = "IndianFinancialSystemCodeIdentifier";
		super.definition = "Indian Financial System Code Identifier. Identifies Indian financial institutions on the Indian national clearing system.";
		super.example = Arrays.asList("IN12azBX12345");
	}
}