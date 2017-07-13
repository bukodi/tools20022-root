package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import java.util.Optional;
import test.gen.mm.MMSemanticMarkup;
import java.util.List;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.Opposite;

/**
 * artefact that has been defined during the development of an ISO 20022
 * MessageDefinition and which is stored in the Repository
 */
public interface MMRepositoryConcept extends MMModelEntity {

	public static interface Members extends MMModelEntity.Members {
		/**
		 * a word or set of words by which a RepositoryConcept is known,
		 * addressed or referred to
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
		 * specifies the date at which a RepositoryConcept will cease or has
		 * ceased to be part of the Repository
		 */
		MetamodelAttribute<MMRepositoryConcept, Optional<Date>> removalDate = newAttribute();
		/**
		 * If a removalDate is specified then the registrationStatus must be
		 * OBSOLETE removalDate->notEmpty( ) implies registrationStatus =
		 * RegistrationStatus::OBSOLETE
		 */
		MetamodelConstraint<MMRepositoryConcept> checkRemovalDateRegistrationStatus = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
		/**
		 * First letter of name shall be upper case. [A-Z] Set
		 * {'A','B','C','D','E'
		 * ,'F','G','H','I','J','K','L','M','N','O','P','Q','R'
		 * ,'S','T','U','V','W','X','Y','Z'}->exists(x|x=name.substring(1,1))
		 */
		MetamodelConstraint<MMRepositoryConcept> checkNameFirstLetterUppercase = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
	}

	public static MetamodelType<MMRepositoryConcept> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMRepositoryConcept.class);
	}

	/**
	 * a word or set of words by which a RepositoryConcept is known, addressed
	 * or referred to
	 */
	String getName();

	/**
	 * describes the semantic meaning of a RepositoryConcept
	 */
	Optional<String> getDefinition();

	/**
	 * Enables modelers to markup elements of the Repository with semantic
	 * metadata.
	 */
	@Containment
	List<MMSemanticMarkup> getSemanticMarkup();

	/**
	 * Doclets of the entity, used for documentation.
	 */
	@Containment
	List<MMDoclet> getDoclet();

	/**
	 * provides a representative instance of a RepositoryConcept
	 */
	List<String> getExample();

	/**
	 * a property of a RepositoryConcept specifying a semantic condition or
	 * restriction expressed in natural language text and potentially in a
	 * formal notation
	 * 
	 * @see MMConstraint#getOwner()
	 */
	@Opposite(bean = MMConstraint.class, attribute = "owner")
	@Containment
	List<MMConstraint> getConstraint();

	/**
	 * specifies in which stage of the registration lifecycle a
	 * RepositoryConcept is in
	 */
	MMRegistrationStatus getRegistrationStatus();

	/**
	 * specifies the date at which a RepositoryConcept will cease or has ceased
	 * to be part of the Repository
	 */
	Optional<Date> getRemovalDate();
}