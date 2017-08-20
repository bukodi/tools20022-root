package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class UKDomesticSortCodeIdentifier extends MMIdentifierSet {

	private final static AtomicReference<UKDomesticSortCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static UKDomesticSortCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new UKDomesticSortCodeIdentifier());
		return repoTypeRef.get();
	}

	private UKDomesticSortCodeIdentifier() {
		super.identificationScheme = "Association for Payment Clearing Services (APACS); UK Sort Code";
		super.pattern = "SC[0-9]{6,6}";
		super.name = "UKDomesticSortCodeIdentifier";
		super.definition = "United Kingdom (UK) Sort Code. Identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
		super.example = Arrays.asList("SC123456");
	}
}