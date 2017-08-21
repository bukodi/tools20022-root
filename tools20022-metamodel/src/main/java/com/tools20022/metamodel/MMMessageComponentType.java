package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMLogicalType;
import com.tools20022.metamodel.MMMessageConcept;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import java.util.List;
import java.util.function.Supplier;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.metamodel.MMBusinessComponent;
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
	public List<MMMessageBuildingBlock> getMessageBuildingBlock();

	/**
	 * A property indicating the absense of a semantic relationship to a
	 * BusinessComponent, i.e. it is not derived from a BusinessComponent
	 */
	@Derived
	public boolean isIsTechnical();

	/**
	 * The BusinessComponent that this MessageComponentType is derived from.
	 * 
	 * @see MMBusinessComponent#getDerivationComponent()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "derivationComponent")
	public Optional<MMBusinessComponent> getTrace();
}