package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class DataSetTypeCode extends MMCodeSet {

	private final static AtomicReference<DataSetTypeCode> repoTypeRef = new AtomicReference<>();

	public static DataSetTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new DataSetTypeCode());
		return repoTypeRef.get();
	}

	private DataSetTypeCode() {
		super.name = "DataSetTypeCode";
		super.definition = "Specifies the type of data set that is matched.";
		super.example = Arrays.asList("BASE");
	}
}