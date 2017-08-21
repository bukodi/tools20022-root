package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTAnyBICIdentifier;
import test.repository.dict.entity.RTContactPoint;
import test.repository.dict.datatype.RTYesNoIndicator;
import java.util.Arrays;
import test.repository.dict.entity.RTParty.ContactPoint;
import test.repository.GeneratedRepository.DataDictionary;

public class RTContactPoint extends MMBusinessComponent {

	private final static AtomicReference<RTContactPoint> repoTypeRef = new AtomicReference<>();

	public static RTContactPoint repoType() {
		repoTypeRef.compareAndSet(null, new RTContactPoint());
		return repoTypeRef.get();
	}

	private RTContactPoint() {
		super.element = Arrays.asList(BICAddress.repoType(),
				TemporaryIndicator.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(ContactPoint
				.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ContactPoint";
		super.definition = "Number, physical or virtual address, used for communication.";
	}

	static public class BICAddress extends MMBusinessAttribute {
		private final static AtomicReference<BICAddress> repoTypeRef = new AtomicReference<>();

		public static BICAddress repoType() {
			repoTypeRef.compareAndSet(null, new BICAddress());
			return repoTypeRef.get();
		}

		private BICAddress() {
			super.simpleType_lazy = () -> RTAnyBICIdentifier.repoType();
			super.elementContext_lazy = () -> RTContactPoint.repoType();
			super.isDerived = false;
			super.name = "BICAddress";
			super.definition = "BIC address which identifies the contact point.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class TemporaryIndicator extends MMBusinessAttribute {
		private final static AtomicReference<TemporaryIndicator> repoTypeRef = new AtomicReference<>();

		public static TemporaryIndicator repoType() {
			repoTypeRef.compareAndSet(null, new TemporaryIndicator());
			return repoTypeRef.get();
		}

		private TemporaryIndicator() {
			super.simpleType_lazy = () -> RTYesNoIndicator.repoType();
			super.elementContext_lazy = () -> RTContactPoint.repoType();
			super.isDerived = false;
			super.name = "TemporaryIndicator";
			super.definition = "Indicates whether the address is a temporary address.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}