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
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.RuntimePropertyAware;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.constraints.MessageAttributeHasExactlyOneType;
import com.tools20022.metamodel.derived.DeriveMMMessageAttribute_isTechnical;
import com.tools20022.metamodel.derived.DeriveMMMessageAttribute_memberType;
import com.tools20022.metamodel.derived.DeriveMMMessageAttribute_xmlMemberType;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * Kind of MessageElement whose type is a DataType or a MessageComponentType
 */
public class MMMessageAttribute<T, V> implements RuntimePropertyAware<T, V>, MMMessageElement {

	/**
	 * the simple content model of a MessageAttribute when it is expressed using
	 * a DataType
	 */
	public final static MetamodelAttribute<MMMessageAttribute, Optional<MMDataType>> simpleTypeAttribute = newAttribute();
	/**
	 * the complex content model of a MessageAttribute when it is expressed
	 * using a MessageComponentType
	 */
	public final static MetamodelAttribute<MMMessageAttribute, Optional<MMMessageComponentType>> complexTypeAttribute = newAttribute();
	/**
	 * A MessageAttribute must have exactly one of the following: simpleType and
	 * complexType complexType-&gt;size() + simpleType-&gt;size() = 1
	 */
	public final static MetamodelConstraint<MMMessageAttribute> checkMessageAttributeHasExactlyOneType = newConstraint(b -> {
		new MessageAttributeHasExactlyOneType().accept(b);
	});
	protected Supplier<MMDataType> simpleType_lazy;
	protected Supplier<MMMessageComponentType> complexType_lazy;
	protected Supplier<MMBusinessComponent> businessComponentTrace_lazy;
	protected Supplier<MMBusinessElement> businessElementTrace_lazy;
	protected Supplier<MMMessageElementContainer> componentContext_lazy;
	protected boolean isDerived;
	protected String xmlTag;
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
	protected Integer maxOccurs;
	protected Integer minOccurs;

	@Override
	public MMMessageElementContainer getContainer() {
		return getComponentContext();
	}

	@Override
	public MetamodelType<? extends MMMessageAttribute> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageAttribute> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageAttribute.class);
	}

	/**
	 * the simple content model of a MessageAttribute when it is expressed using
	 * a DataType
	 */
	public Optional<MMDataType> getSimpleType() {
		return simpleType_lazy == null ? Optional.empty() : Optional.of(simpleType_lazy.get());
	}

	/**
	 * the complex content model of a MessageAttribute when it is expressed
	 * using a MessageComponentType
	 */
	public Optional<MMMessageComponentType> getComplexType() {
		return complexType_lazy == null ? Optional.empty() : Optional.of(complexType_lazy.get());
	}

	@Derived
	@Override
	public boolean isIsTechnical() {
		return (new DeriveMMMessageAttribute_isTechnical()).apply(this);
	}

	@Override
	public Optional<MMBusinessComponent> getBusinessComponentTrace() {
		return businessComponentTrace_lazy == null ? Optional.empty() : Optional.of(businessComponentTrace_lazy.get());
	}

	@Override
	public Optional<MMBusinessElement> getBusinessElementTrace() {
		return businessElementTrace_lazy == null ? Optional.empty() : Optional.of(businessElementTrace_lazy.get());
	}

	@Override
	public MMMessageElementContainer getComponentContext() {
		return componentContext_lazy.get();
	}

	@Override
	public boolean isIsDerived() {
		return isDerived;
	}

	@Override
	public Optional<String> getXmlTag() {
		return xmlTag == null ? Optional.empty() : Optional.of(xmlTag);
	}

	@Derived
	@Override
	public MMLogicalType getXmlMemberType() {
		return (new DeriveMMMessageAttribute_xmlMemberType()).apply(this);
	}

	@Derived
	@Override
	public MMRepositoryType getMemberType() {
		return (new DeriveMMMessageAttribute_memberType()).apply(this);
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
	public Optional<Integer> getMaxOccurs() {
		return maxOccurs == null ? Optional.empty() : Optional.of(maxOccurs);
	}

	@Override
	public Optional<Integer> getMinOccurs() {
		return minOccurs == null ? Optional.empty() : Optional.of(minOccurs);
	}
}