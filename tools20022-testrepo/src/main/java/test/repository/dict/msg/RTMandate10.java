package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMandate10 extends MMMessageComponent {

	private final static AtomicReference<RTMandate10> repoTypeRef = new AtomicReference<>();

	public static RTMandate10 repoType() {
		repoTypeRef.compareAndSet(null, new RTMandate10());
		return repoTypeRef.get();
	}

	private RTMandate10() {
		super.messageElement = Arrays.asList();
		super.messageBuildingBlock_lazy = () -> Arrays.asList(null);
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.constraint = Arrays.asList();
		super.name = "Mandate10";
		super.definition = "Information that serves as a basis to debit an account.";
	}
}