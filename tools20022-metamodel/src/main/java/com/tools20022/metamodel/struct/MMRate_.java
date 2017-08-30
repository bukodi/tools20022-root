package com.tools20022.metamodel.struct;


import com.tools20022.metamodel.struct.MMDecimal_;
import com.tools20022.metamodel.MMRate;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import java.util.Optional;public interface MMRate_ extends MMDecimal_ {

	/**
	 * specifies the ratio between the base value and the actual value
	 */
	MetamodelAttribute<MMRate, Double> baseValue = newAttribute();
	/**
	 * specifies unit code required to qualify this rate
	 */
	MetamodelAttribute<MMRate, Optional<String>> baseUnitCode = newAttribute(); }