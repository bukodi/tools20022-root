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

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * Any set of values drawn from the value space of 'decimal', as specified by
 * W3C Recommendation XML Schema Part 2: Datatypes
 */
public class MMDecimal implements MMDataType {

	/**
	 * the lowest value in the allowed set of values
	 */
	public final static MetamodelAttribute<MMDecimal, Optional<String>> minInclusiveAttribute = newAttribute();
	/**
	 * the lowest but one value in the allowed set of values
	 */
	public final static MetamodelAttribute<MMDecimal, Optional<String>> minExclusiveAttribute = newAttribute();
	/**
	 * the highest value in the allowed set of values
	 */
	public final static MetamodelAttribute<MMDecimal, Optional<String>> maxInclusiveAttribute = newAttribute();
	/**
	 * the highest but one value in the allowed set of values
	 */
	public final static MetamodelAttribute<MMDecimal, Optional<String>> maxExclusiveAttribute = newAttribute();
	/**
	 * the maximum number of allowed digits in a Decimal number
	 */
	public final static MetamodelAttribute<MMDecimal, Optional<Integer>> totalDigitsAttribute = newAttribute();
	/**
	 * the fractional part of a Decimal number
	 */
	public final static MetamodelAttribute<MMDecimal, Optional<Integer>> fractionDigitsAttribute = newAttribute();
	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	public final static MetamodelAttribute<MMDecimal, Optional<String>> patternAttribute = newAttribute();
	protected String minInclusive;
	protected String minExclusive;
	protected String maxInclusive;
	protected String maxExclusive;
	protected Integer totalDigits;
	protected Integer fractionDigits;
	protected String pattern;
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
	public MetamodelType<? extends MMDecimal> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMDecimal> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMDecimal.class);
	}

	/**
	 * the lowest value in the allowed set of values
	 */
	public Optional<String> getMinInclusive() {
		return minInclusive == null ? Optional.empty() : Optional.of(minInclusive);
	}

	/**
	 * the lowest but one value in the allowed set of values
	 */
	public Optional<String> getMinExclusive() {
		return minExclusive == null ? Optional.empty() : Optional.of(minExclusive);
	}

	/**
	 * the highest value in the allowed set of values
	 */
	public Optional<String> getMaxInclusive() {
		return maxInclusive == null ? Optional.empty() : Optional.of(maxInclusive);
	}

	/**
	 * the highest but one value in the allowed set of values
	 */
	public Optional<String> getMaxExclusive() {
		return maxExclusive == null ? Optional.empty() : Optional.of(maxExclusive);
	}

	/**
	 * the maximum number of allowed digits in a Decimal number
	 */
	public Optional<Integer> getTotalDigits() {
		return totalDigits == null ? Optional.empty() : Optional.of(totalDigits);
	}

	/**
	 * the fractional part of a Decimal number
	 */
	public Optional<Integer> getFractionDigits() {
		return fractionDigits == null ? Optional.empty() : Optional.of(fractionDigits);
	}

	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	public Optional<String> getPattern() {
		return pattern == null ? Optional.empty() : Optional.of(pattern);
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