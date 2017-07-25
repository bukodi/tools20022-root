package test.gen.mm.struct;

import test.gen.mm.struct.MMTopLevelDictionaryEntry_;
import test.gen.mm.struct.MMBusinessElementType_;
import test.gen.mm.struct.MMBusinessConcept_;
import test.gen.mm.MMBusinessComponent;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import java.util.Optional;
import test.gen.mm.MMBusinessElement;
import test.gen.mm.MMMessageComponentType;
import test.gen.mm.MMBusinessAssociationEnd;
import test.gen.mm.MMMessageElement;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMBusinessComponent_
		extends
			MMTopLevelDictionaryEntry_,
			MMBusinessElementType_,
			MMBusinessConcept_ {

	/**
	 * The BusinessComponents that specialize this BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessComponent, List<MMBusinessComponent>> subType = newAttribute();
	/**
	 * The BusinessComponent that is specialized by this BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessComponent, Optional<MMBusinessComponent>> superType = newAttribute();
	/**
	 * A semantic property of a BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessComponent, List<MMBusinessElement>> element = newAttribute();
	/**
	 * All of the MessageComponentTypes that derive from this BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessComponent, List<MMMessageComponentType>> derivationComponent = newAttribute();
	/**
	 * Describes the semantics that determine how the BusinessComponent may
	 * participate in the BusinessAssociation.
	 */
	MetamodelAttribute<MMBusinessComponent, List<MMBusinessAssociationEnd>> associationDomain = newAttribute();
	/**
	 * All of the MessageElements that derive from this BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessComponent, List<MMMessageElement>> derivationElement = newAttribute();
	/**
	 * All BusinessElements contained by this BusinessComponents have different
	 * names element-&gt;forAll(el1,el2 : BusinessElement| el1 &lt;&gt; el2
	 * implies el1.name &lt;&gt; el2.name)
	 */
	MetamodelConstraint<MMBusinessComponent> checkBusinessElementsHaveUniqueNames = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}