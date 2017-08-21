package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTOrganisationIdentificationSchemeName1Choice
		extends
			MMChoiceComponent {

	private final static AtomicReference<RTOrganisationIdentificationSchemeName1Choice> repoTypeRef = new AtomicReference<>();

	public static RTOrganisationIdentificationSchemeName1Choice repoType() {
		repoTypeRef.compareAndSet(null,
				new RTOrganisationIdentificationSchemeName1Choice());
		return repoTypeRef.get();
	}

	private RTOrganisationIdentificationSchemeName1Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "OrganisationIdentificationSchemeName1Choice";
		super.definition = "Sets of elements to identify a name of the organisation identification scheme.";
	}
}