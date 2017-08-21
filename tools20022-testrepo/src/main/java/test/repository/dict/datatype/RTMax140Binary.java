package test.repository.dict.datatype;

import com.tools20022.metamodel.MMBinary;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMax140Binary extends MMBinary {

	private final static AtomicReference<RTMax140Binary> repoTypeRef = new AtomicReference<>();

	public static RTMax140Binary repoType() {
		repoTypeRef.compareAndSet(null, new RTMax140Binary());
		return repoTypeRef.get();
	}

	private RTMax140Binary() {
		super.minLength = 1;
		super.maxLength = 140;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Max140Binary";
		super.definition = "Specifies a binary string with a maximum length of 140 binary bytes.";
	}
}