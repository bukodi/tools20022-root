package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTContactPoint;
import test.repository.dict.entity.RTParty;
import test.repository.dict.entity.RTPartyIdentificationInformation;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTParty extends MMBusinessComponent {

	private final static AtomicReference<RTParty> repoTypeRef = new AtomicReference<>();

	public static RTParty repoType() {
		repoTypeRef.compareAndSet(null, new RTParty());
		return repoTypeRef.get();
	}

	private RTParty() {
		super.element = Arrays.asList(ContactPoint.repoType(),
				Identification.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Party";
		super.definition = "Entity involved in an activity.";
	}

	static public class ContactPoint extends MMBusinessAssociationEnd {
		private final static AtomicReference<ContactPoint> repoTypeRef = new AtomicReference<>();

		public static ContactPoint repoType() {
			repoTypeRef.compareAndSet(null, new ContactPoint());
			return repoTypeRef.get();
		}

		private ContactPoint() {
			super.type_lazy = () -> RTContactPoint.repoType();
			super.elementContext_lazy = () -> RTParty.repoType();
			super.isDerived = false;
			super.name = "ContactPoint";
			super.definition = "Number, physical or virtual address, used for communication.";
			super.minOccurs = 1;
		}
	}

	static public class Identification extends MMBusinessAssociationEnd {
		private final static AtomicReference<Identification> repoTypeRef = new AtomicReference<>();

		public static Identification repoType() {
			repoTypeRef.compareAndSet(null, new Identification());
			return repoTypeRef.get();
		}

		private Identification() {
			super.type_lazy = () -> RTPartyIdentificationInformation.repoType();
			super.elementContext_lazy = () -> RTParty.repoType();
			super.isDerived = false;
			super.name = "Identification";
			super.definition = "Specific identification assigned to a party.";
			super.minOccurs = 1;
		}
	}
}