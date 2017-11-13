package com.tools20022.testrepo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tools20022.testrepo.TestClassValue.Descriptor;

public class TestClassValue {
	
	static class Foo {
		String attr;
	}

	static abstract class Descriptor<T> {
		Class<T> beanClass;
		String description;		
	}
	
	static ClassValue<Descriptor> descriptorRegistry = new ClassValue<TestClassValue.Descriptor>() {		
		@Override
		protected Descriptor computeValue(Class<?> type) {
			return null;
		}
	};
	
	@Test
	public void testName() throws Exception {
		
		Descriptor<Foo> fooDesc = new Descriptor<Foo>(){{
			beanClass = Foo.class;
			description = "Foo is a great class!";  
		}};
		
		
	}

}
