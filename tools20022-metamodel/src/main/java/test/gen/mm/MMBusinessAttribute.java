package test.gen.mm;

import test.gen.mm.MMBusinessElement;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMDataType;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMBusinessComponent;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
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
 * A BusinessElement, typed by a BusinessComponent or a DataType (contrary to a
 * BusinessAssociationEnd, which is always typed by another BusinessComponent)
 */
public class MMBusinessAttribute implements MMBusinessElement {

	private GeneratedMetamodelBean container;
	private Optional<MMDataType> simpleType;
	private Optional<MMBusinessComponent> complexType;
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
		 * Expresses that the content model of a BusinessAttribute may be
		 * specified by a type from the XSD type library or a derived datatype.
		 */
		MetamodelAttribute<MMBusinessAttribute, Optional<MMDataType>> simpleType = newAttribute();
		/**
		 * The BusinessComponent that describes the complex content model of the
		 * BusinessAttrribute.
		 */
		MetamodelAttribute<MMBusinessAttribute, Optional<MMBusinessComponent>> complexType = newAttribute();
		/**
		 * A BusinessAttribute must have exactly one of the following:
		 * simpleType and complexType. complexType->size() + simpleType->size()
		 * = 1
		 */
		MetamodelConstraint<MMBusinessAttribute> checkBusinessAttributeHasExactlyOneType = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
		/**
		 * Deriving Code Sets may only be used to type MessageAttributes.
		 * Therefore, a BusinessAttribute may not be typed by a Deriving
		 * CodeSet. simpleType.oclIsKindOf(CodeSet) implies
		 * simpleType.oclAsType(CodeSet).trace->isEmpty()
		 */
		MetamodelConstraint<MMBusinessAttribute> checkNoDerivingCodeSetType = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMBusinessAttribute> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessAttribute> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessAttribute.class);
	}

	/**
	 * Expresses that the content model of a BusinessAttribute may be specified
	 * by a type from the XSD type library or a derived datatype.
	 */
	public Optional<MMDataType> getSimpleType() {
		return simpleType;
	}

	/**
	 * The BusinessComponent that describes the complex content model of the
	 * BusinessAttrribute.
	 */
	public Optional<MMBusinessComponent> getComplexType() {
		return complexType;
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