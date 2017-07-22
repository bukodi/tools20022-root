package test.gen.mm;

import test.gen.mm.MMRepositoryConcept;
import test.gen.mm.MMMultiplicityEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMRepositoryType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;

/**
 * Abstract layer : Abstract meta class for representing a BusinessElement, a
 * MessageElement or a MessageBuildingBlock.
 */
public interface MMConstruct extends MMRepositoryConcept, MMMultiplicityEntity {

	public static interface Members
			extends
				MMRepositoryConcept.Members,
				MMMultiplicityEntity.Members {
		/**
		 * The type of this Member
		 */
		MetamodelAttribute<MMConstruct, MMRepositoryType> memberType = newAttribute();
	}

	public static MetamodelType<MMConstruct> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMConstruct.class);
	}

	/**
	 * The type of this Member
	 */
	MMRepositoryType getMemberType();
}