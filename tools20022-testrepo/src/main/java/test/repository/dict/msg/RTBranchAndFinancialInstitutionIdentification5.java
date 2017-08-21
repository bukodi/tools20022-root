package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTBranchAndFinancialInstitutionIdentification5
		extends
			MMMessageComponent {

	private final static AtomicReference<RTBranchAndFinancialInstitutionIdentification5> repoTypeRef = new AtomicReference<>();

	public static RTBranchAndFinancialInstitutionIdentification5 repoType() {
		repoTypeRef.compareAndSet(null,
				new RTBranchAndFinancialInstitutionIdentification5());
		return repoTypeRef.get();
	}

	private RTBranchAndFinancialInstitutionIdentification5() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "BranchAndFinancialInstitutionIdentification5";
		super.definition = "Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.";
	}
}