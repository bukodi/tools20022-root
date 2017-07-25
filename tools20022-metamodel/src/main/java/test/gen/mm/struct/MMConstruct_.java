package test.gen.mm.struct;

import test.gen.mm.struct.MMRepositoryConcept_;
import test.gen.mm.struct.MMMultiplicityEntity_;
import test.gen.mm.MMConstruct;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMRepositoryType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMConstruct_
		extends
			MMRepositoryConcept_,
			MMMultiplicityEntity_ {

	/**
	 * The type of this Member
	 */
	MetamodelAttribute<MMConstruct, MMRepositoryType> memberType = newAttribute();
}