package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTYesNoIndicator extends MMIndicator {

	private final static AtomicReference<RTYesNoIndicator> repoTypeRef = new AtomicReference<>();

	public static RTYesNoIndicator repoType() {
		repoTypeRef.compareAndSet(null, new RTYesNoIndicator());
		return repoTypeRef.get();
	}

	private RTYesNoIndicator() {
		super.meaningWhenTrue = "Yes";
		super.meaningWhenFalse = "No";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "YesNoIndicator";
		super.definition = "Indicates a \"Yes\" or \"No\" type of answer for an element.";
	}
}