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

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * set of non ISO 20022 compliant messages that is defined and used by (a part
 * of) the (financial) industry
 */
public class MMIndustryMessageSet implements MMTopLevelCatalogueEntry {

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
	public MetamodelType<? extends MMIndustryMessageSet> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMIndustryMessageSet> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMIndustryMessageSet.class);
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