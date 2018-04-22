package com.tools20022.core.repo;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;

/**
 * Generic utility methods.
 */
public class Tools20022Helper {

	/**
	 * Thread safe implementation of a sigleton with lazy initialization.
	 *  
	 * Usage example:
	 * <pre>  
	 * 	private final static AtomicReference&lt;Foo&gt; lazyRef = new AtomicReference&lt;&gt;();
	 * 	public static Foo getInstance() { return lazySingleton(lazyRef, ()-&gt;new Foo()); }
	 * </pre>
	 * 
	 * @see https://stackoverflow.com/a/30247202
	 */
	public static <T> T lazySingleton(AtomicReference<T> lazyRef, Supplier<T> instanceFactory) {
		T foo = lazyRef.get();
		if (foo == null) {
			foo = instanceFactory.get(); // create and initialize actual instance
			if (lazyRef.compareAndSet(null, foo)) // compareAndSet succeeded
				return foo;
			else // compareAndSet failed: other thread set an object
				return lazyRef.get();
		} else {
			return foo;
		}
	}
	
}
