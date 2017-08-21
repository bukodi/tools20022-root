package com.tools20022.testrepo;

import org.junit.Test;

import com.tools20022.metamodel.MMTopLevelDictionaryEntry;

import test.repository.GeneratedRepository;

public class TestDummyRepo {

	
	
	@Test
	public void test() {
		GeneratedRepository repo = GeneratedRepository.repoType();
		for( MMTopLevelDictionaryEntry tlde : repo.getDataDictionary().getTopLevelDictionaryEntry() ) {
			System.out.println( tlde.getName() );
		}
	}

}
