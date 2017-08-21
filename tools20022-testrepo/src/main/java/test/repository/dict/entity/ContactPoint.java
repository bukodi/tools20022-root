package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class ContactPoint extends MMBusinessComponent {

	private final static AtomicReference<ContactPoint> repoTypeRef = new AtomicReference<>();

	public static ContactPoint repoType() {
		repoTypeRef.compareAndSet(null, new ContactPoint());
		return repoTypeRef.get();
	}

	private ContactPoint() {
		super.element = Arrays.asList();
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ContactPoint";
		super.definition = "Number, physical or virtual address, used for communication.";
	}
}