package test.gen.mm;

import test.gen.mm.MMTopLevelDictionaryEntry;
import test.gen.mm.MMLogicalType;
import test.gen.mm.MMMessageConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageBuildingBlock;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMBusinessComponent;
import java.util.Optional;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;

/**
 * MessageComponent, ExternalSchema, UserDefined or ChoiceComponent
 */
public interface MMMessageComponentType
		extends
			MMTopLevelDictionaryEntry,
			MMLogicalType,
			MMMessageConcept {

	public static interface Members
			extends
				MMTopLevelDictionaryEntry.Members,
				MMLogicalType.Members,
				MMMessageConcept.Members {
		/**
		 * The MessageBuildingBlock that is the context for this
		 * MessageComponentType
		 */
		MetamodelAttribute<MMMessageComponentType, List<MMMessageBuildingBlock>> messageBuildingBlock = newAttribute();
		/**
		 * A property indicating the absense of a semantic relationship to a
		 * BusinessComponent, i.e. it is not derived from a BusinessComponent
		 */
		MetamodelAttribute<MMMessageComponentType, Boolean> isTechnical = newAttribute();
		/**
		 * The BusinessComponent that this MessageComponentType is derived from.
		 */
		MetamodelAttribute<MMMessageComponentType, Optional<MMBusinessComponent>> trace = newAttribute();
	}

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