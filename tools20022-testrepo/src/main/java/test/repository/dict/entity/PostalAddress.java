package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class PostalAddress extends MMBusinessComponent {

	private final static AtomicReference<PostalAddress> repoTypeRef = new AtomicReference<>();

	public static PostalAddress repoType() {
		repoTypeRef.compareAndSet(null, new PostalAddress());
		return repoTypeRef.get();
	}

	private PostalAddress() {
		super.element = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PostalAddress";
		super.definition = "Information that locates and identifies a specific address.";
	}
}