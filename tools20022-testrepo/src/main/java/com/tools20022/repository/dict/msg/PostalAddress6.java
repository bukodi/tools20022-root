package com.tools20022.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class PostalAddress6 extends MMMessageComponent {

	private final static AtomicReference<PostalAddress6> repoTypeRef = new AtomicReference<>();

	public static PostalAddress6 repoType() {
		repoTypeRef.compareAndSet(null, new PostalAddress6());
		return repoTypeRef.get();
	}

	private PostalAddress6() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PostalAddress6";
		super.definition = "Information that locates and identifies a specific address, as defined by postal services.";
	}
}