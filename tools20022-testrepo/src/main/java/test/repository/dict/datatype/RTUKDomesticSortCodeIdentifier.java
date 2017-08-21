package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTUKDomesticSortCodeIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTUKDomesticSortCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTUKDomesticSortCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTUKDomesticSortCodeIdentifier());
		return repoTypeRef.get();
	}

	private RTUKDomesticSortCodeIdentifier() {
		super.identificationScheme = "Association for Payment Clearing Services (APACS); UK Sort Code";
		super.pattern = "SC[0-9]{6,6}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("SC123456");
		super.name = "UKDomesticSortCodeIdentifier";
		super.definition = "United Kingdom (UK) Sort Code. Identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
	}
}