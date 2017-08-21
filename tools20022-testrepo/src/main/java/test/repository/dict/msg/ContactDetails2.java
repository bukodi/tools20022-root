package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class ContactDetails2 extends MMMessageComponent {

	private final static AtomicReference<ContactDetails2> repoTypeRef = new AtomicReference<>();

	public static ContactDetails2 repoType() {
		repoTypeRef.compareAndSet(null, new ContactDetails2());
		return repoTypeRef.get();
	}

	private ContactDetails2() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ContactDetails2";
		super.definition = "Communication device number or electronic address used for communication.";
	}
}