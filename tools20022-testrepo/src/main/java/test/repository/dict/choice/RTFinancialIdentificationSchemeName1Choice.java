package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTFinancialIdentificationSchemeName1Choice
		extends
			MMChoiceComponent {

	private final static AtomicReference<RTFinancialIdentificationSchemeName1Choice> repoTypeRef = new AtomicReference<>();

	public static RTFinancialIdentificationSchemeName1Choice repoType() {
		repoTypeRef.compareAndSet(null,
				new RTFinancialIdentificationSchemeName1Choice());
		return repoTypeRef.get();
	}

	private RTFinancialIdentificationSchemeName1Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "FinancialIdentificationSchemeName1Choice";
		super.definition = "Sets of elements to identify a name of the organisation identification scheme.";
	}
}