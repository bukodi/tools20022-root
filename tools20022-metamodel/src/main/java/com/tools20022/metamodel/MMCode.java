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

import com.tools20022.core.metamodel.Container;
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
 * A character string (letters, figures or symbols) that for brevity and/or
 * language independence may be used to represent or replace a definitive value
 * or text of an attribute.
 */
public class MMCode implements MMRepositoryConcept {

	/**
	 * Provides the full, non-abbreviated name of the Code
	 */
	public final static MetamodelAttribute<MMCode, Optional<String>> codeNameAttribute = newAttribute();
	/**
	 * Direct reference to the CodeSet owning this Code.
	 */
	public final static MetamodelAttribute<MMCode, MMCodeSet> ownerAttribute = newAttribute();
	protected String codeName;
	protected Supplier<MMCodeSet> owner_lazy;
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
	protected Supplier<MMCode> traceCode_lazy;

	@Override
	public MMCodeSet getContainer() {
		return getOwner();
	}

	@Override
	public MetamodelType<? extends MMCode> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMCode> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMCode.class);
	}

	/**
	 * Provides the full, non-abbreviated name of the Code
	 */
	public Optional<String> getCodeName() {
		return codeName == null ? Optional.empty() : Optional.of(codeName);
	}

	/**
	 * Direct reference to the CodeSet owning this Code.
	 * 
	 * @see MMCodeSet#getCodes()
	 */
	@Opposite(bean = MMCodeSet.class, attribute = "codes")
	@Container
	public MMCodeSet getOwner() {
		return owner_lazy.get();
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

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof MMCode))
			return false;
		MMCode otherCode = (MMCode) obj;
		if (otherCode.traceCode_lazy != null)
			otherCode = otherCode.traceCode_lazy.get();
		return otherCode.equals(traceCode_lazy == null ? this : traceCode_lazy.get());
	}

	@Override
	public int hashCode() {
		return traceCode_lazy == null ? super.hashCode() : traceCode_lazy.get().hashCode();
	}
}