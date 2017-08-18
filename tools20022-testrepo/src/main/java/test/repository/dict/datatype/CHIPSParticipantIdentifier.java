package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class CHIPSParticipantIdentifier extends MMIdentifierSet {

	private final static CHIPSParticipantIdentifier INSTANCE = new CHIPSParticipantIdentifier();

	public static CHIPSParticipantIdentifier instance() {
		return INSTANCE;
	}
}