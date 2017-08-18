package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMTopLevelCatalogueEntry_;
import com.tools20022.metamodel.MMBusinessProcess;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.metamodel.MMBusinessTransaction;

public interface MMBusinessProcess_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * specifies the BusinessProcess that is extending another BusinessProcess
	 */
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> extender = newAttribute();
	/**
	 * specifies the BusinessProcess that is extended by another BusinessProcess
	 */
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> extended = newAttribute();
	/**
	 * specifies the BusinessProcess that is included by another BusinessProcess
	 */
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> included = newAttribute();
	/**
	 * specifies the BusinessProcess that is incuding another BusinessProcess
	 */
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> includer = newAttribute();
	/**
	 * the BusinessRole that plays a role in BusinessProcess that owns it.
	 */
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessRole>> businessRole = newAttribute();
	MetamodelAttribute<MMBusinessProcess, List<MMBusinessTransaction>> businessProcessTrace = newAttribute();
}