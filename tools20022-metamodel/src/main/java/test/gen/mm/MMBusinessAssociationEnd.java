package test.gen.mm;

import test.gen.mm.MMBusinessElement;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMBusinessAssociationEnd;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMAggregation;
import test.gen.mm.MMBusinessComponent;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import test.gen.mm.MMMessageElement;
import java.util.List;
import test.gen.mm.MMBusinessElementType;
import test.gen.mm.MMRepositoryType;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * The context of a BusinessAssociation must be the type of its opposite and
 * vice-versa
 */
public class MMBusinessAssociationEnd implements MMBusinessElement {

	private GeneratedMetamodelBean container;
	private Optional<MMBusinessAssociationEnd> opposite;
	private MMAggregation aggregation;
	private MMBusinessComponent type;
	private boolean isDerived;
	private List<MMMessageElement> derivation;
	private MMBusinessElementType businessElementType;
	private MMBusinessComponent elementContext;
	private MMRepositoryType memberType;
	private String name;
	private Optional<String> definition;
	private List<MMSemanticMarkup> semanticMarkup;
	private List<MMDoclet> doclet;
	private List<String> example;
	private List<MMConstraint> constraint;
	private MMRegistrationStatus registrationStatus;
	private Optional<Date> removalDate;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;
	private Optional<Integer> maxOccurs;
	private Optional<Integer> minOccurs;

	public static interface Members extends MMBusinessElement.Members {
		/**
		 * Opposite end of a bi-directional relationship between 2
		 * BusinessComponents.
		 */
		MetamodelAttribute<MMBusinessAssociationEnd, Optional<MMBusinessAssociationEnd>> opposite = newAttribute();
		/**
		 * Expresses the strength of the semantic relationship between two
		 * BusinessComponents.
		 */
		MetamodelAttribute<MMBusinessAssociationEnd, MMAggregation> aggregation = newAttribute();
		/**
		 * Specifies that a BusinessAssociationEnd always has a complex content
		 * model and is therefore always typed by a BusinessComponent,
		 * contrarily to a BusinessAttribute which may be typed by a data type.
		 */
		MetamodelAttribute<MMBusinessAssociationEnd, MMBusinessComponent> type = newAttribute();
		/**
		 * Two opposite association ends may not have composite or shared
		 * aggregation at the same time not(aggregation <> Aggregation::NONE and
		 * opposite.aggregation <> Aggregation::NONE)
		 */
		MetamodelConstraint<MMBusinessAssociationEnd> checkAtMostOneAggregatedEnd = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
		/**
		 * The context of this end must be the type of the opposite and
		 * vice-versa opposite.elementContext = type and elementContext =
		 * opposite.type
		 */
		MetamodelConstraint<MMBusinessAssociationEnd> checkContextConsistentWithType = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMBusinessAssociationEnd> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessAssociationEnd> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessAssociationEnd.class);
	}

	/**
	 * Opposite end of a bi-directional relationship between 2
	 * BusinessComponents.
	 */
	public Optional<MMBusinessAssociationEnd> getOpposite() {
		return opposite;
	}

	/**
	 * Expresses the strength of the semantic relationship between two
	 * BusinessComponents.
	 */
	public MMAggregation getAggregation() {
		return aggregation;
	}

	/**
	 * Specifies that a BusinessAssociationEnd always has a complex content
	 * model and is therefore always typed by a BusinessComponent, contrarily to
	 * a BusinessAttribute which may be typed by a data type.
	 * 
	 * @see MMBusinessComponent#getAssociationDomain()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "associationDomain")
	public MMBusinessComponent getType() {
		return type;
	}

	@Override
	public boolean isIsDerived() {
		return isDerived;
	}

	@Override
	public List<MMMessageElement> getDerivation() {
		return derivation;
	}

	@Override
	public MMBusinessElementType getBusinessElementType() {
		return businessElementType;
	}

	@Override
	public MMBusinessComponent getElementContext() {
		return elementContext;
	}

	@Override
	public MMRepositoryType getMemberType() {
		return memberType;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition;
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup;
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet;
	}

	@Override
	public List<String> getExample() {
		return example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint;
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate;
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion;
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier;
	}

	@Override
	public Optional<Integer> getMaxOccurs() {
		return maxOccurs;
	}

	@Override
	public Optional<Integer> getMinOccurs() {
		return minOccurs;
	}
}