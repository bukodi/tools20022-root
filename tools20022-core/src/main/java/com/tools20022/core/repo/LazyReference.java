package com.tools20022.core.repo;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public class LazyReference<T> implements Supplier<T> {

	private volatile boolean isInitialized = false;
	private T value;
	final Supplier<T> initFunction;

	public static <T> LazyReference<T> create(Supplier<T> initFunction) {
		return new LazyReference<>(initFunction);
	}

	private LazyReference(Supplier<T> initFunction) {
		this.initFunction = Objects.requireNonNull(initFunction);
	}

	@Override
	public synchronized T get() {
		if (!isInitialized) {
			value = initFunction.get();
			isInitialized = true;
		}
		return value;
	}

}
