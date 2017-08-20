package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class MandateClassificationCode extends MMCodeSet {

	private final static AtomicReference<MandateClassificationCode> repoTypeRef = new AtomicReference<>();

	public static MandateClassificationCode repoType() {
		repoTypeRef.compareAndSet(null, new MandateClassificationCode());
		return repoTypeRef.get();
	}

	private MandateClassificationCode() {
		super.name = "MandateClassificationCode";
		super.definition = "Specifies the type of direct debit amount, such as fixed or variable.";
		super.example = Arrays.asList("FIXE");
	}
}