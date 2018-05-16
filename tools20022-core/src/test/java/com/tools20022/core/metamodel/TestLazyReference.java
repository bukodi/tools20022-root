package com.tools20022.core.metamodel;

import static org.junit.Assert.*;

import java.util.function.Supplier;

import org.junit.Test;

import com.tools20022.core.repo.LazyReference;

public class TestLazyReference {
	
	int i;
	Supplier<String> name_lazy = LazyReference.create(()->"test" + (i++) );
	
	private String name = "test0";
		
	@Test
	public void testSyncName() throws Exception {
		System.out.print("Sync: ");
		executeTest( 1*1000*1000, this::getSyncName);
	}

	public synchronized String getSyncName() {
		return name;
	}

	public String getUnsyncName() {
		return name;
	}
	
	@Test
	public void testunsyncName() throws Exception {
		System.out.print("Unsync: ");
		executeTest( 1*1000*1000, this::getUnsyncName);
	}

	public void executeTest(  int count , Runnable proc) {
		long start = System.nanoTime();
		for( int i = 0; i < count; i++ ) {
			proc.run();
		}
		long duration = System.nanoTime()-start;
		System.out.println( duration + " ns");
	}
	
}
