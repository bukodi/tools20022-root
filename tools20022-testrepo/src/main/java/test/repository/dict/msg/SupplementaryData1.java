package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class SupplementaryData1 extends MMMessageComponent {

	private final static AtomicReference<SupplementaryData1> repoTypeRef = new AtomicReference<>();

	public static SupplementaryData1 repoType() {
		repoTypeRef.compareAndSet(null, new SupplementaryData1());
		return repoTypeRef.get();
	}

	private SupplementaryData1() {
		super.messageElement = Arrays.asList();
		super.messageBuildingBlock_lazy = () -> Arrays.asList(null);
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.constraint = Arrays.asList();
		super.name = "SupplementaryData1";
		super.definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
	}
}