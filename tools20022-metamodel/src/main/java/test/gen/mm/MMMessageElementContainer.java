package test.gen.mm;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMMessageComponentType;
import test.gen.mm.MMMessageElement;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Containment;

/**
 * Re-usable Dictionary Item that is a building block for assembling
 * MessageDefinitions, composed of a sequence of MessageElements
 */
public interface MMMessageElementContainer extends MMMessageComponentType {

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