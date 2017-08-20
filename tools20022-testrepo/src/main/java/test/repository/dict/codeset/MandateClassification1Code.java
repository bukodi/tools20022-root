package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;

public class MandateClassification1Code extends MMCodeSet {

	private final static AtomicReference<MandateClassification1Code> repoTypeRef = new AtomicReference<>();

	public static MandateClassification1Code repoType() {
		repoTypeRef.compareAndSet(null, new MandateClassification1Code());
		return repoTypeRef.get();
	}

	private MandateClassification1Code() {
		super.name = "MandateClassification1Code";
		super.definition = "Specifies the type of direct debit amount, such as fixed or variable.";
	}
}