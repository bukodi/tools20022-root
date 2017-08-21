package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class EANGLNIdentifier extends MMIdentifierSet {

	private final static AtomicReference<EANGLNIdentifier> repoTypeRef = new AtomicReference<>();

	public static EANGLNIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new EANGLNIdentifier());
		return repoTypeRef.get();
	}

	private EANGLNIdentifier() {
		super.identificationScheme = "European Association for Numbering; EAN Global Location Number";
		super.pattern = "[0-9]{13,13}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("7265658971233");
		super.name = "EANGLNIdentifier";
		super.definition = "Global Location Number. A non-significant reference number used to identify legal entities, functional entities or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve the detailed information linked to it.";
	}
}