package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTFinancialInstitutionIdentification8 extends MMMessageComponent {

	private final static AtomicReference<RTFinancialInstitutionIdentification8> repoTypeRef = new AtomicReference<>();

	public static RTFinancialInstitutionIdentification8 repoType() {
		repoTypeRef.compareAndSet(null,
				new RTFinancialInstitutionIdentification8());
		return repoTypeRef.get();
	}

	private RTFinancialInstitutionIdentification8() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "FinancialInstitutionIdentification8";
		super.definition = "Set of elements used to identify a financial institution.";
	}
}