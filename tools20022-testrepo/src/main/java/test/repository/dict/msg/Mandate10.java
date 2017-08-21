package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class Mandate10 extends MMMessageComponent {

	private final static AtomicReference<Mandate10> repoTypeRef = new AtomicReference<>();

	public static Mandate10 repoType() {
		repoTypeRef.compareAndSet(null, new Mandate10());
		return repoTypeRef.get();
	}

	private Mandate10() {
		super.messageElement = Arrays.asList();
		super.messageBuildingBlock_lazy = () -> Arrays.asList(null);
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.constraint = Arrays.asList();
		super.name = "Mandate10";
		super.definition = "Information that serves as a basis to debit an account.";
	}
}