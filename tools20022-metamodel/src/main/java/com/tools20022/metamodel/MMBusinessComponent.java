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
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.RuntimeInstanceAware;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.constraints.BusinessElementsHaveUniqueNames;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * Representation of a (part of a) key business notion, characterized by
 * specific BusinessElements.
 */
public class MMBusinessComponent implements RuntimeInstanceAware, MMTopLevelDictionaryEntry, MMBusinessElementType, MMBusinessConcept {

	/**
	 * The BusinessComponents that specialize this BusinessComponent.
	 */
	public final static MetamodelAttribute<MMBusinessComponent, List<MMBusinessComponent>> subTypesAttribute = newAttribute();
	/**
	 * The BusinessComponent that is specialized by this BusinessComponent.
	 */
	public final static MetamodelAttribute<MMBusinessComponent, Optional<MMBusinessComponent>> superTypeAttribute = newAttribute();
	/**
	 * A semantic property of a BusinessComponent.
	 */
	public final static MetamodelAttribute<MMBusinessComponent, List<MMBusinessElement>> elementsAttribute = newAttribute();
	/**
	 * All of the MessageComponentTypes that derive from this BusinessComponent.
	 */
	public final static MetamodelAttribute<MMBusinessComponent, List<MMMessageComponentType>> derivationComponentsAttribute = newAttribute();
	/**
	 * Describes the semantics that determine how the BusinessComponent may
	 * participate in the BusinessAssociation.
	 */
	public final static MetamodelAttribute<MMBusinessComponent, List<MMBusinessAssociationEnd>> associationDomainsAttribute = newAttribute();
	/**
	 * All of the MessageElements that derive from this BusinessComponent.
	 */
	public final static MetamodelAttribute<MMBusinessComponent, List<MMMessageElement>> derivationElementsAttribute = newAttribute();
	/**
	 * All BusinessElements contained by this BusinessComponents have different
	 * names element-&gt;forAll(el1,el2 : BusinessElement| el1 &lt;&gt; el2
	 * implies el1.name &lt;&gt; el2.name)
	 */
	public final static MetamodelConstraint<MMBusinessComponent> checkBusinessElementsHaveUniqueNames = newConstraint(b -> {
		new BusinessElementsHaveUniqueNames().accept(b);
	});
	protected Supplier<List<MMBusinessComponent>> subTypes_lazy;
	protected Supplier<MMBusinessComponent> superType_lazy;
	protected Supplier<List<MMBusinessElement>> elements_lazy;
	protected Supplier<List<MMMessageComponentType>> derivationComponents_lazy;
	protected Supplier<List<MMBusinessAssociationEnd>> associationDomains_lazy;
	protected Supplier<List<MMMessageElement>> derivationElements_lazy;
	protected Supplier<MMDataDictionary> dataDictionary_lazy;
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
	public MMDataDictionary getContainer() {
		return getDataDictionary();
	}

	@Override
	public MetamodelType<? extends MMBusinessComponent> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessComponent> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMBusinessComponent.class);
	}

	/**
	 * The BusinessComponents that specialize this BusinessComponent.
	 * 
	 * @see MMBusinessComponent#getSuperType()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "superType")
	@EMFName("subType")
	public List<MMBusinessComponent> getSubTypes() {
		return subTypes_lazy == null ? Collections.emptyList() : subTypes_lazy.get();
	}

	/**
	 * The BusinessComponent that is specialized by this BusinessComponent.
	 * 
	 * @see MMBusinessComponent#getSubType()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "subType")
	public Optional<MMBusinessComponent> getSuperType() {
		return superType_lazy == null ? Optional.empty() : Optional.of(superType_lazy.get());
	}

	/**
	 * A semantic property of a BusinessComponent.
	 * 
	 * @see MMBusinessElement#getElementContext()
	 */
	@Opposite(bean = MMBusinessElement.class, attribute = "elementContext")
	@Containment
	@EMFName("element")
	public List<MMBusinessElement> getElements() {
		return elements_lazy == null ? Collections.emptyList() : elements_lazy.get();
	}

	/**
	 * All of the MessageComponentTypes that derive from this BusinessComponent.
	 * 
	 * @see MMMessageComponentType#getTrace()
	 */
	@Opposite(bean = MMMessageComponentType.class, attribute = "trace")
	@EMFName("derivationComponent")
	public List<MMMessageComponentType> getDerivationComponents() {
		return derivationComponents_lazy == null ? Collections.emptyList() : derivationComponents_lazy.get();
	}

	/**
	 * Describes the semantics that determine how the BusinessComponent may
	 * participate in the BusinessAssociation.
	 * 
	 * @see MMBusinessAssociationEnd#getType()
	 */
	@Opposite(bean = MMBusinessAssociationEnd.class, attribute = "type")
	@EMFName("associationDomain")
	public List<MMBusinessAssociationEnd> getAssociationDomains() {
		return associationDomains_lazy == null ? Collections.emptyList() : associationDomains_lazy.get();
	}

	/**
	 * All of the MessageElements that derive from this BusinessComponent.
	 * 
	 * @see MMMessageElement#getBusinessComponentTrace()
	 */
	@Opposite(bean = MMMessageElement.class, attribute = "businessComponentTrace")
	@EMFName("derivationElement")
	public List<MMMessageElement> getDerivationElements() {
		return derivationElements_lazy == null ? Collections.emptyList() : derivationElements_lazy.get();
	}

	@Override
	public MMDataDictionary getDataDictionary() {
		return dataDictionary_lazy.get();
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