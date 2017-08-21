package test.repository.dict.datatype;

import com.tools20022.metamodel.MMRate;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTPercentageRate extends MMRate {

	private final static AtomicReference<RTPercentageRate> repoTypeRef = new AtomicReference<>();

	public static RTPercentageRate repoType() {
		repoTypeRef.compareAndSet(null, new RTPercentageRate());
		return repoTypeRef.get();
	}

	private RTPercentageRate() {
		super.baseValue = 100.0;
		super.totalDigits = 11;
		super.fractionDigits = 10;
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("35");
		super.name = "PercentageRate";
		super.definition = "Rate expressed as a percentage, ie, in hundredths, eg, 0.7 is 7/10 of a percent, and 7.0 is 7%.";
	}
}