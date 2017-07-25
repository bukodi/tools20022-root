package test.gen.mm;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMTopLevelDictionaryEntry;
import test.gen.mm.MMLogicalType;
import test.gen.mm.MMMessageConcept;
import test.gen.mm.MMMessageBuildingBlock;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import test.gen.mm.MMBusinessComponent;
import java.util.Optional;

/**
 * MessageComponent, ExternalSchema, UserDefined or ChoiceComponent
 */
public interface MMMessageComponentType
		extends
			MMTopLevelDictionaryEntry,
			MMLogicalType,
			MMMessageConcept {

	public static MetamodelType<MMMessageComponentType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageComponentType.class);
	}

	/**
	 * The MessageBuildingBlock that is the context for this
	 * MessageComponentType
	 * 
	 * @see MMMessageBuildingBlock#getComplexType()
	 */
	@Opposite(bean = MMMessageBuildingBlock.class, attribute = "complexType")
	List<MMMessageBuildingBlock> getMessageBuildingBlock();

	/**
	 * A property indicating the absense of a semantic relationship to a
	 * BusinessComponent, i.e. it is not derived from a BusinessComponent
	 */
	boolean isIsTechnical();

	/**
	 * The BusinessComponent that this MessageComponentType is derived from.
	 * 
	 * @see MMBusinessComponent#getDerivationComponent()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "derivationComponent")
	Optional<MMBusinessComponent> getTrace();
}