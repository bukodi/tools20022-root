package com.tools20022.core.metamodel;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;

public class TestLazReference {
	
	@Test
	public void testRef() throws Exception {
		
		LazyReference<String> message_lazy = new LazyReference<>( ()-> {
			System.out.println("Init called");
			return "Hello!";
		} );
		System.out.println( "Before first get");		
		String message = message_lazy.get();
		System.out.println( "After first get");		
		System.out.println( "message is: " + message );		
		System.out.println( "Before second get");		
		message = message_lazy.get();
		System.out.println( "After second get");		
		System.out.println( "message is: " + message );		
	}

	@Test
	@Ignore
	public void testRefConcurrent() throws Exception {
		
		LazyReference<Boolean> lazyRef = new LazyReference<>( ()-> {
			return true;
		} );
		lazyRef.get();
		
		int MAX = 10000;
		int CORES = 2;
		
		Runnable calibrtionProc = ()->{
			boolean flag = true;
			for( int i = 0; i  < MAX; i ++ ) {
				//lazyRef.get();
				flag = ! flag;
			}				
		}; 
		Runnable lazyGetProc = ()->{
			for( int i = 0; i  < MAX; i ++ ) {
				lazyRef.get();
			}				
		}; 
		
		long overheadNanos;
		{ // Calibration 
			ExecutorService tp = Executors.newFixedThreadPool(CORES);
			long start = System.nanoTime();
			for( int t = 0; t < CORES; t++ ) {
				tp.execute( calibrtionProc );			
			}
			tp.awaitTermination(10, TimeUnit.SECONDS);
			overheadNanos = System.nanoTime() - start;
		}
		System.out.println("Overhead: " + (overheadNanos / 1000000) + " ms");

		long netTime; 
		{ // Test 
			ExecutorService tp = Executors.newFixedThreadPool(CORES);
			long start = System.nanoTime();
			for( int t = 0; t < CORES; t++ ) {
				tp.execute( lazyGetProc );			
			}
			tp.awaitTermination(10, TimeUnit.SECONDS);
			netTime = (System.nanoTime() - start) - overheadNanos;
		}
				
		System.out.println( (netTime/(MAX*CORES)) + " ns/call");			
	}

}
