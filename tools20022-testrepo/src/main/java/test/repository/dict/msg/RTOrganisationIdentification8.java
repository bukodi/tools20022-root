package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTOrganisationIdentification8 extends MMMessageComponent {

	private final static AtomicReference<RTOrganisationIdentification8> repoTypeRef = new AtomicReference<>();

	public static RTOrganisationIdentification8 repoType() {
		repoTypeRef.compareAndSet(null, new RTOrganisationIdentification8());
		return repoTypeRef.get();
	}

	private RTOrganisationIdentification8() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "OrganisationIdentification8";
		super.definition = "Unique and unambiguous way to identify an organisation.";
	}
}