package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTTrueFalseIndicator extends MMIndicator {

	private final static AtomicReference<RTTrueFalseIndicator> repoTypeRef = new AtomicReference<>();

	public static RTTrueFalseIndicator repoType() {
		repoTypeRef.compareAndSet(null, new RTTrueFalseIndicator());
		return repoTypeRef.get();
	}

	private RTTrueFalseIndicator() {
		super.meaningWhenTrue = "True";
		super.meaningWhenFalse = "False";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "TrueFalseIndicator";
		super.definition = "A flag indicating a True or False value.";
	}
}