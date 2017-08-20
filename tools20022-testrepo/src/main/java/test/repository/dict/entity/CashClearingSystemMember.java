package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class CashClearingSystemMember extends MMBusinessComponent {

	private final static AtomicReference<CashClearingSystemMember> repoTypeRef = new AtomicReference<>();

	public static CashClearingSystemMember repoType() {
		repoTypeRef.compareAndSet(null, new CashClearingSystemMember());
		return repoTypeRef.get();
	}

	private CashClearingSystemMember() {
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.name = "CashClearingSystemMember";
		super.definition = "Unique and unambiguous identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier. The identifier can be used when transmitting, reconciling and confirming payment orders or security transfer instructions prior to settlement, and may include the netting of instructions and the establishment of final positions for settlement.";
	}
}