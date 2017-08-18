package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class OrganisationIdentification extends MMBusinessComponent {

	private final static OrganisationIdentification INSTANCE = new OrganisationIdentification();

	public static OrganisationIdentification instance() {
		return INSTANCE;
	}
}