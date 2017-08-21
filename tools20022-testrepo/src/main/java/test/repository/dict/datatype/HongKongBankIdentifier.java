package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class HongKongBankIdentifier extends MMIdentifierSet {

	private final static AtomicReference<HongKongBankIdentifier> repoTypeRef = new AtomicReference<>();

	public static HongKongBankIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new HongKongBankIdentifier());
		return repoTypeRef.get();
	}

	private HongKongBankIdentifier() {
		super.identificationScheme = "Hong Kong Interbank Clearing Ltd (HKICL); Bank Code of Hong Kong";
		super.pattern = "HK[0-9]{3,3}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("HK123");
		super.name = "HongKongBankIdentifier";
		super.definition = "Hong Kong Bank Code. Identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
	}
}