package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class EANGLNIdentifier extends MMIdentifierSet {

	private final static EANGLNIdentifier INSTANCE = new EANGLNIdentifier();

	public static EANGLNIdentifier instance() {
		return INSTANCE;
	}
}