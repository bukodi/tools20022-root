/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.EMFName;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * unrealized definition of the business activities undertaken by BusinessRoles
 * within a BusinessArea whereby each BusinessProcess fulfils one type of
 * business activity and whereby a BusinessProcess may include and extend other
 * BusinessProcesses
 */
public class MMBusinessProcess implements MMTopLevelCatalogueEntry {

	/**
	 * specifies the BusinessProcess that is extending another BusinessProcess
	 */
	public final static MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> extendersAttribute = newAttribute();
	/**
	 * specifies the BusinessProcess that is extended by another BusinessProcess
	 */
	public final static MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> extendedsAttribute = newAttribute();
	/**
	 * specifies the BusinessProcess that is included by another BusinessProcess
	 */
	public final static MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> includedsAttribute = newAttribute();
	/**
	 * specifies the BusinessProcess that is incuding another BusinessProcess
	 */
	public final static MetamodelAttribute<MMBusinessProcess, List<MMBusinessProcess>> includersAttribute = newAttribute();
	/**
	 * the BusinessRole that plays a role in BusinessProcess that owns it.
	 */
	public final static MetamodelAttribute<MMBusinessProcess, List<MMBusinessRole>> businessRolesAttribute = newAttribute();
	public final static MetamodelAttribute<MMBusinessProcess, List<MMBusinessTransaction>> businessProcessTracesAttribute = newAttribute();
	protected Supplier<List<MMBusinessProcess>> extenders_lazy;
	protected Supplier<List<MMBusinessProcess>> extendeds_lazy;
	protected Supplier<List<MMBusinessProcess>> includeds_lazy;
	protected Supplier<List<MMBusinessProcess>> includers_lazy;
	protected Supplier<List<MMBusinessRole>> businessRoles_lazy;
	protected Supplier<List<MMBusinessTransaction>> businessProcessTraces_lazy;
	protected Supplier<MMBusinessProcessCatalogue> businessProcessCatalogue_lazy;
	protected String name;
	protected String definition;
	protected Supplier<List<MMSemanticMarkup>> semanticMarkups_lazy;
	protected Supplier<List<MMDoclet>> doclets_lazy;
	protected List<String> examples;
	protected Supplier<List<MMConstraint>> constraints_lazy;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMBusinessProcessCatalogue getContainer() {
		return getBusinessProcessCatalogue();
	}

	@Override
	public MetamodelType<? extends MMBusinessProcess> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessProcess> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMBusinessProcess.class);
	}

	/**
	 * specifies the BusinessProcess that is extending another BusinessProcess
	 * 
	 * @see MMBusinessProcess#getExtended()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "extended")
	@EMFName("extender")
	public List<MMBusinessProcess> getExtenders() {
		return extenders_lazy == null ? Collections.emptyList() : extenders_lazy.get();
	}

	/**
	 * specifies the BusinessProcess that is extended by another BusinessProcess
	 * 
	 * @see MMBusinessProcess#getExtender()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "extender")
	@EMFName("extended")
	public List<MMBusinessProcess> getExtendeds() {
		return extendeds_lazy == null ? Collections.emptyList() : extendeds_lazy.get();
	}

	/**
	 * specifies the BusinessProcess that is included by another BusinessProcess
	 * 
	 * @see MMBusinessProcess#getIncluder()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "includer")
	@EMFName("included")
	public List<MMBusinessProcess> getIncludeds() {
		return includeds_lazy == null ? Collections.emptyList() : includeds_lazy.get();
	}

	/**
	 * specifies the BusinessProcess that is incuding another BusinessProcess
	 * 
	 * @see MMBusinessProcess#getIncluded()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "included")
	@EMFName("includer")
	public List<MMBusinessProcess> getIncluders() {
		return includers_lazy == null ? Collections.emptyList() : includers_lazy.get();
	}

	/**
	 * the BusinessRole that plays a role in BusinessProcess that owns it.
	 * 
	 * @see MMBusinessRole#getBusinessProcess()
	 */
	@Opposite(bean = MMBusinessRole.class, attribute = "businessProcess")
	@Containment
	@EMFName("businessRole")
	public List<MMBusinessRole> getBusinessRoles() {
		return businessRoles_lazy == null ? Collections.emptyList() : businessRoles_lazy.get();
	}

	/**
	 * @see MMBusinessTransaction#getBusinessProcessTrace()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "businessProcessTrace")
	@EMFName("businessProcessTrace")
	public List<MMBusinessTransaction> getBusinessProcessTraces() {
		return businessProcessTraces_lazy == null ? Collections.emptyList() : businessProcessTraces_lazy.get();
	}

	@Override
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue_lazy.get();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition == null ? Optional.empty() : Optional.of(definition);
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkups() {
		return semanticMarkups_lazy == null ? Collections.emptyList() : semanticMarkups_lazy.get();
	}

	@Override
	public List<MMDoclet> getDoclets() {
		return doclets_lazy == null ? Collections.emptyList() : doclets_lazy.get();
	}

	@Override
	public List<String> getExamples() {
		return examples == null ? Collections.emptyList() : examples;
	}

	@Override
	public List<MMConstraint> getConstraints() {
		return constraints_lazy == null ? Collections.emptyList() : constraints_lazy.get();
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate == null ? Optional.empty() : Optional.of(removalDate);
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList() : nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional.of(objectIdentifier);
	}
}