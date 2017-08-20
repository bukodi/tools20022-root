package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;

public class ElectronicAddress extends MMBusinessComponent {

	private final static AtomicReference<ElectronicAddress> repoTypeRef = new AtomicReference<>();

	public static ElectronicAddress repoType() {
		repoTypeRef.compareAndSet(null, new ElectronicAddress());
		return repoTypeRef.get();
	}

	private ElectronicAddress() {
		super.name = "ElectronicAddress";
		super.definition = "Address which is accessed by electronic means.";
	}
}