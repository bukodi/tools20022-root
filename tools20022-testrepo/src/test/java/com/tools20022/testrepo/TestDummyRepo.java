package com.tools20022.testrepo;

import org.junit.Test;

import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.dict.entity.AccountIdentification;

public class TestDummyRepo {

	
	
	@Test
	public void test() {
		GeneratedRepository repo = GeneratedRepository.repoType();
		for( MMTopLevelDictionaryEntry tlde : repo.getDataDictionary().getTopLevelDictionaryEntry() ) {
			System.out.println( tlde.getName() );
		}
		
		System.out.println();
		
		System.out.println(AccountIdentification.repoType().attrIBAN.getDefinition().get());
	}

}
