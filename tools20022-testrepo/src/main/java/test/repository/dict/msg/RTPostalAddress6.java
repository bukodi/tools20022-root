package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPostalAddress6 extends MMMessageComponent {

	private final static AtomicReference<RTPostalAddress6> repoTypeRef = new AtomicReference<>();

	public static RTPostalAddress6 repoType() {
		repoTypeRef.compareAndSet(null, new RTPostalAddress6());
		return repoTypeRef.get();
	}

	private RTPostalAddress6() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PostalAddress6";
		super.definition = "Information that locates and identifies a specific address, as defined by postal services.";
	}
}