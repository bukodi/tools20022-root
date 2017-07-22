package test.gen.mm;

import test.gen.mm.MMMessageComponentType;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageElement;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Containment;

/**
 * Re-usable Dictionary Item that is a building block for assembling
 * MessageDefinitions, composed of a sequence of MessageElements
 */
public interface MMMessageElementContainer extends MMMessageComponentType {

	public static interface Members extends MMMessageComponentType.Members {
		/**
		 * a semantic property of a MessageComponentType
		 */
		MetamodelAttribute<MMMessageElementContainer, List<MMMessageElement>> messageElement = newAttribute();
		/**
		 * All MessageElements contained in this MessageComponentContainer must
		 * have different names. messageElement->forAll(el1,el2 | el1 <> el2
		 * implies el1.name <> el2.name)
		 */
		MetamodelConstraint<MMMessageElementContainer> checkMessageElementsHaveUniqueNames = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
		/**
		 * All the elements belonging to a technical MessageComponentContainer
		 * must be technical. self.isTechnical implies messageElement ->
		 * forAll(messageElement|messageElement.isTechnical)
		 */
		MetamodelConstraint<MMMessageElementContainer> checktechnicalElement = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
	}

	public static MetamodelType<MMMessageElementContainer> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageElementContainer.class);
	}

	/**
	 * a semantic property of a MessageComponentType
	 * 
	 * @see MMMessageElement#getComponentContext()
	 */
	@Opposite(bean = MMMessageElement.class, attribute = "componentContext")
	@Containment
	List<MMMessageElement> getMessageElement();
}