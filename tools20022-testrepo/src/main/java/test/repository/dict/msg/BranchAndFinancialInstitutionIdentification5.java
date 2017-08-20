package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;

public class BranchAndFinancialInstitutionIdentification5
		extends
			MMMessageComponent {

	private final static AtomicReference<BranchAndFinancialInstitutionIdentification5> repoTypeRef = new AtomicReference<>();

	public static BranchAndFinancialInstitutionIdentification5 repoType() {
		repoTypeRef.compareAndSet(null,
				new BranchAndFinancialInstitutionIdentification5());
		return repoTypeRef.get();
	}

	private BranchAndFinancialInstitutionIdentification5() {
		super.name = "BranchAndFinancialInstitutionIdentification5";
		super.definition = "Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.";
	}
}