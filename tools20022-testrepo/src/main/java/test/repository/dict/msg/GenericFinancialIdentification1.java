package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class GenericFinancialIdentification1 extends MMMessageComponent {

	private final static AtomicReference<GenericFinancialIdentification1> repoTypeRef = new AtomicReference<>();

	public static GenericFinancialIdentification1 repoType() {
		repoTypeRef.compareAndSet(null, new GenericFinancialIdentification1());
		return repoTypeRef.get();
	}

	private GenericFinancialIdentification1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "GenericFinancialIdentification1";
		super.definition = "Information related to an identification of a financial institution.";
	}
}