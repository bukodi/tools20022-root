package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMandateAdjustment1 extends MMMessageComponent {

	private final static AtomicReference<RTMandateAdjustment1> repoTypeRef = new AtomicReference<>();

	public static RTMandateAdjustment1 repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateAdjustment1());
		return repoTypeRef.get();
	}

	private RTMandateAdjustment1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "MandateAdjustment1";
		super.definition = "Specifies the details for the adjustment of the mandate.";
	}
}