package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;

public class TrueFalseIndicator extends MMIndicator {

	private final static AtomicReference<TrueFalseIndicator> repoTypeRef = new AtomicReference<>();

	public static TrueFalseIndicator repoType() {
		repoTypeRef.compareAndSet(null, new TrueFalseIndicator());
		return repoTypeRef.get();
	}

	private TrueFalseIndicator() {
		super.meaningWhenTrue = "True";
		super.meaningWhenFalse = "False";
		super.name = "TrueFalseIndicator";
		super.definition = "A flag indicating a True or False value.";
	}
}