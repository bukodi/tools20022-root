package com.tools20022.metamodel;


import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import java.util.function.Supplier;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;/**
 * artefact that has been defined during the development of an ISO 20022 MessageDefinition and which is stored in the Repository
 */
public interface MMRepositoryConcept extends MMModelEntity {

	public static MetamodelType<MMRepositoryConcept> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMRepositoryConcept.class);
	}

	/**
	 * a word or set of words by which a RepositoryConcept is known, addressed or referred to
	 */
	public String getName();

	/**
	 * describes the semantic meaning of a RepositoryConcept
	 */
	public Optional<String> getDefinition();

	/**
	 * Enables modelers to markup elements of the Repository with semantic metadata.
	 */
	@Containment
	public List<MMSemanticMarkup> getSemanticMarkup();

	/**
	 * Doclets of the entity, used for documentation.
	 */
	@Containment
	public List<MMDoclet> getDoclet();

	/**
	 * provides a representative instance of a RepositoryConcept
	 */
	public List<String> getExample();

	/**
	 * a property of a RepositoryConcept specifying a semantic condition or restriction expressed in natural language text and potentially in a formal notation
	 * @see MMConstraint#getOwner()
	 */
	@Opposite(bean = MMConstraint.class, attribute = "owner")
	@Containment
	public List<MMConstraint> getConstraint();

	/**
	 * specifies in which stage of the registration lifecycle a RepositoryConcept is in
	 */
	public MMRegistrationStatus getRegistrationStatus();

	/**
	 * specifies the date at which a RepositoryConcept will cease or has ceased to be part of the Repository
	 */
	public Optional<Date> getRemovalDate(); }