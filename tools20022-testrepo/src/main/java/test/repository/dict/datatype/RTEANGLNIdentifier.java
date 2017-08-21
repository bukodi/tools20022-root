package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTEANGLNIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTEANGLNIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTEANGLNIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTEANGLNIdentifier());
		return repoTypeRef.get();
	}

	private RTEANGLNIdentifier() {
		super.identificationScheme = "European Association for Numbering; EAN Global Location Number";
		super.pattern = "[0-9]{13,13}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("7265658971233");
		super.name = "EANGLNIdentifier";
		super.definition = "Global Location Number. A non-significant reference number used to identify legal entities, functional entities or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve the detailed information linked to it.";
	}
}