package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class Country extends MMBusinessComponent {

	private final static AtomicReference<Country> repoTypeRef = new AtomicReference<>();

	public static Country repoType() {
		repoTypeRef.compareAndSet(null, new Country());
		return repoTypeRef.get();
	}

	private Country() {
		super.element = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Country";
		super.definition = "Nation with its own government.";
	}
}