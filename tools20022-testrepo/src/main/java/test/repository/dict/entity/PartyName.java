package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class PartyName extends MMBusinessComponent {

	private final static AtomicReference<PartyName> repoTypeRef = new AtomicReference<>();

	public static PartyName repoType() {
		repoTypeRef.compareAndSet(null, new PartyName());
		return repoTypeRef.get();
	}

	private PartyName() {
		super.element = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PartyName";
		super.definition = "Name by which a party is known and which is usually used to identify that party.";
	}
}