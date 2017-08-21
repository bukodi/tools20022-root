package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class OrganisationIdentification extends MMBusinessComponent {

	private final static AtomicReference<OrganisationIdentification> repoTypeRef = new AtomicReference<>();

	public static OrganisationIdentification repoType() {
		repoTypeRef.compareAndSet(null, new OrganisationIdentification());
		return repoTypeRef.get();
	}

	private OrganisationIdentification() {
		super.element = Arrays.asList();
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "OrganisationIdentification";
		super.definition = "Unique and unambiguous way to identify an organisation.";
	}
}