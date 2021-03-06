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

import com.tools20022.core.metamodel.Derived;
import com.tools20022.core.metamodel.EMFName;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.constraints.GeneratedSyntaxDerivation;
import com.tools20022.metamodel.derived.DeriveMMMessageSet_generatedSyntax;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * A set of MessageDefinitions
 */
public class MMMessageSet implements MMTopLevelCatalogueEntry {

	/**
	 * identification of the syntax for a specific EncodingScheme
	 */
	public final static MetamodelAttribute<MMMessageSet, List<MMSyntax>> generatedSyntaxesAttribute = newAttribute();
	/**
	 * the set of encodings considered ISO 20022 valid for this MessageSet
	 */
	public final static MetamodelAttribute<MMMessageSet, List<MMEncoding>> validEncodingsAttribute = newAttribute();
	/**
	 * the MessageDefinition that belongs to the MessageSet
	 */
	public final static MetamodelAttribute<MMMessageSet, List<MMMessageDefinition>> messageDefinitionsAttribute = newAttribute();
	/**
	 * the generated syntax is derived from the syntax for a validEncoding
	 * generatedSyntax-&gt;asBag() = validEncoding.syntax
	 */
	public final static MetamodelConstraint<MMMessageSet> checkGeneratedSyntaxDerivation = newConstraint(b -> {
		new GeneratedSyntaxDerivation().accept(b);
	});
	protected Supplier<List<MMEncoding>> validEncodings_lazy;
	protected Supplier<List<MMMessageDefinition>> messageDefinitions_lazy;
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
	public MetamodelType<? extends MMMessageSet> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageSet> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageSet.class);
	}

	/**
	 * identification of the syntax for a specific EncodingScheme
	 * 
	 * @see MMSyntax#getGeneratedFors()
	 */
	@Derived
	@Opposite(bean = MMSyntax.class, attribute = "generatedFors")
	@EMFName("generatedSyntax")
	public List<MMSyntax> getGeneratedSyntaxes() {
		return (new DeriveMMMessageSet_generatedSyntax()).apply(this);
	}

	/**
	 * the set of encodings considered ISO 20022 valid for this MessageSet
	 * 
	 * @see MMEncoding#getMessageSets()
	 */
	@Opposite(bean = MMEncoding.class, attribute = "messageSets")
	@EMFName("validEncoding")
	public List<MMEncoding> getValidEncodings() {
		return validEncodings_lazy == null ? Collections.emptyList() : validEncodings_lazy.get();
	}

	/**
	 * the MessageDefinition that belongs to the MessageSet
	 * 
	 * @see MMMessageDefinition#getMessageSets()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "messageSets")
	@EMFName("messageDefinition")
	public List<MMMessageDefinition> getMessageDefinitions() {
		return messageDefinitions_lazy == null ? Collections.emptyList() : messageDefinitions_lazy.get();
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