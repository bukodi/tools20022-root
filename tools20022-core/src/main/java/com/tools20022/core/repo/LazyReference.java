package com.tools20022.core.repo;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public class LazyReference<T> implements Supplier<T> {
	final AtomicReference<T> ref = new AtomicReference<T>();
	final Supplier<T> initFunction;

	static <T> LazyReference<T> create(Supplier<T> initFunction) {
		return new LazyReference<>(initFunction);
	}
	
	private LazyReference(Supplier<T> initFunction) {
		this.initFunction = Objects.requireNonNull(initFunction);
	}

	/**
	 * Thread safe implementation of lazy initialization.
	 *   
	 * @see https://stackoverflow.com/a/30247202
	 */
	@Override
	public T get() {
		T obj = ref.get();
		if (obj == null) {
			obj = initFunction.get(); // create and initialize actual instance
			if (ref.compareAndSet(null, obj)) // compareAndSet succeeded
				return obj;
			else // compareAndSet failed: other thread set an object
				return ref.get();
		} else {
			return obj;
		}
	}

}
