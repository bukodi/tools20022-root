package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;

public class FinancialIdentificationSchemeName1Choice extends MMChoiceComponent {

	private final static AtomicReference<FinancialIdentificationSchemeName1Choice> repoTypeRef = new AtomicReference<>();

	public static FinancialIdentificationSchemeName1Choice repoType() {
		repoTypeRef.compareAndSet(null,
				new FinancialIdentificationSchemeName1Choice());
		return repoTypeRef.get();
	}

	private FinancialIdentificationSchemeName1Choice() {
		super.name = "FinancialIdentificationSchemeName1Choice";
		super.definition = "Sets of elements to identify a name of the organisation identification scheme.";
	}
}