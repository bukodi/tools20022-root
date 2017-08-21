package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class YesNoIndicator extends MMIndicator {

	private final static AtomicReference<YesNoIndicator> repoTypeRef = new AtomicReference<>();

	public static YesNoIndicator repoType() {
		repoTypeRef.compareAndSet(null, new YesNoIndicator());
		return repoTypeRef.get();
	}

	private YesNoIndicator() {
		super.meaningWhenTrue = "Yes";
		super.meaningWhenFalse = "No";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "YesNoIndicator";
		super.definition = "Indicates a \"Yes\" or \"No\" type of answer for an element.";
	}
}