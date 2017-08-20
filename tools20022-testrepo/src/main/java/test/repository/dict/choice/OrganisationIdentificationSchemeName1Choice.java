package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;

public class OrganisationIdentificationSchemeName1Choice
		extends
			MMChoiceComponent {

	private final static AtomicReference<OrganisationIdentificationSchemeName1Choice> repoTypeRef = new AtomicReference<>();

	public static OrganisationIdentificationSchemeName1Choice repoType() {
		repoTypeRef.compareAndSet(null,
				new OrganisationIdentificationSchemeName1Choice());
		return repoTypeRef.get();
	}

	private OrganisationIdentificationSchemeName1Choice() {
		super.name = "OrganisationIdentificationSchemeName1Choice";
		super.definition = "Sets of elements to identify a name of the organisation identification scheme.";
	}
}