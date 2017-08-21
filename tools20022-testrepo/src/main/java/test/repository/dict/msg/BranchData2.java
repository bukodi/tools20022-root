package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class BranchData2 extends MMMessageComponent {

	private final static AtomicReference<BranchData2> repoTypeRef = new AtomicReference<>();

	public static BranchData2 repoType() {
		repoTypeRef.compareAndSet(null, new BranchData2());
		return repoTypeRef.get();
	}

	private BranchData2() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "BranchData2";
		super.definition = "Information that locates and identifies a specific branch of a financial institution.";
	}
}