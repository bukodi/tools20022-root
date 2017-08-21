package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class MandateAdjustment1 extends MMMessageComponent {

	private final static AtomicReference<MandateAdjustment1> repoTypeRef = new AtomicReference<>();

	public static MandateAdjustment1 repoType() {
		repoTypeRef.compareAndSet(null, new MandateAdjustment1());
		return repoTypeRef.get();
	}

	private MandateAdjustment1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "MandateAdjustment1";
		super.definition = "Specifies the details for the adjustment of the mandate.";
	}
}