package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTOrganisationIdentification;
import test.repository.dict.entity.RTOrganisation;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTOrganisation extends MMBusinessComponent {

	private final static AtomicReference<RTOrganisation> repoTypeRef = new AtomicReference<>();

	public static RTOrganisation repoType() {
		repoTypeRef.compareAndSet(null, new RTOrganisation());
		return repoTypeRef.get();
	}

	private RTOrganisation() {
		super.element = Arrays.asList(OrganisationIdentification.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Organisation";
		super.definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
	}

	static public class OrganisationIdentification
			extends
				MMBusinessAssociationEnd {
		private final static AtomicReference<OrganisationIdentification> repoTypeRef = new AtomicReference<>();

		public static OrganisationIdentification repoType() {
			repoTypeRef.compareAndSet(null, new OrganisationIdentification());
			return repoTypeRef.get();
		}

		private OrganisationIdentification() {
			super.type_lazy = () -> RTOrganisationIdentification.repoType();
			super.elementContext_lazy = () -> RTOrganisation.repoType();
			super.isDerived = false;
			super.name = "OrganisationIdentification";
			super.definition = "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification.";
			super.minOccurs = 0;
		}
	}
}