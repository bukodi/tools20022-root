package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMModelEntity_;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMRepositoryConcept_ extends MMModelEntity_ {

	/**
	 * a word or set of words by which a RepositoryConcept is known, addressed
	 * or referred to
	 */
	MetamodelAttribute<MMRepositoryConcept, String> name = newAttribute();
	/**
	 * describes the semantic meaning of a RepositoryConcept
	 */
	MetamodelAttribute<MMRepositoryConcept, Optional<String>> definition = newAttribute();
	/**
	 * Enables modelers to markup elements of the Repository with semantic
	 * metadata.
	 */
	MetamodelAttribute<MMRepositoryConcept, List<MMSemanticMarkup>> semanticMarkup = newAttribute();
	/**
	 * Doclets of the entity, used for documentation.
	 */
	MetamodelAttribute<MMRepositoryConcept, List<MMDoclet>> doclet = newAttribute();
	/**
	 * provides a representative instance of a RepositoryConcept
	 */
	MetamodelAttribute<MMRepositoryConcept, List<String>> example = newAttribute();
	/**
	 * a property of a RepositoryConcept specifying a semantic condition or
	 * restriction expressed in natural language text and potentially in a
	 * formal notation
	 */
	MetamodelAttribute<MMRepositoryConcept, List<MMConstraint>> constraint = newAttribute();
	/**
	 * specifies in which stage of the registration lifecycle a
	 * RepositoryConcept is in
	 */
	MetamodelAttribute<MMRepositoryConcept, MMRegistrationStatus> registrationStatus = newAttribute();
	/**
	 * specifies the date at which a RepositoryConcept will cease or has ceased
	 * to be part of the Repository
	 */
	MetamodelAttribute<MMRepositoryConcept, Optional<Date>> removalDate = newAttribute();
	/**
	 * If a removalDate is specified then the registrationStatus must be
	 * OBSOLETE removalDate-&gt;notEmpty( ) implies registrationStatus =
	 * RegistrationStatus::OBSOLETE
	 */
	MetamodelConstraint<MMRepositoryConcept> checkRemovalDateRegistrationStatus = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
	/**
	 * First letter of name shall be upper case. [A-Z] Set
	 * {'A','B','C','D','E','F'
	 * ,'G','H','I','J','K','L','M','N','O','P','Q','R','S'
	 * ,'T','U','V','W','X','Y','Z'}-&gt;exists(x|x=name.substring(1,1))
	 */
	MetamodelConstraint<MMRepositoryConcept> checkNameFirstLetterUppercase = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}