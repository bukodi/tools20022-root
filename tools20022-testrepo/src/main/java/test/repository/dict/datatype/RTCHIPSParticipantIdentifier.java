package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTCHIPSParticipantIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTCHIPSParticipantIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTCHIPSParticipantIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTCHIPSParticipantIdentifier());
		return repoTypeRef.get();
	}

	private RTCHIPSParticipantIdentifier() {
		super.identificationScheme = "American Banker's Association (ABA); CHIPS Participant Number";
		super.pattern = "CP[0-9]{4,4}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("CP1234");
		super.name = "CHIPSParticipantIdentifier";
		super.definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID). Identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
	}
}