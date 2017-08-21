package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTSouthAfricanNCCIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTSouthAfricanNCCIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTSouthAfricanNCCIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTSouthAfricanNCCIdentifier());
		return repoTypeRef.get();
	}

	private RTSouthAfricanNCCIdentifier() {
		super.identificationScheme = "South African Bankers Services Company Ltd (Bank Serv); South African National Clearing system Code";
		super.pattern = "ZA[0-9]{6,6}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("ZA123456");
		super.name = "SouthAfricanNCCIdentifier";
		super.definition = "South African National Clearing Code (NCC). Identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
	}
}