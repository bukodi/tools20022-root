package test.gen.mm;

import test.gen.mm.MMMessageElement;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageComponentType;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMBusinessComponent;
import java.util.Optional;
import test.gen.mm.MMBusinessElement;
import test.gen.mm.MMMessageElementContainer;
import test.gen.mm.MMLogicalType;
import test.gen.mm.MMRepositoryType;
import test.gen.mm.MMSemanticMarkup;
import java.util.List;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * Kind of MessageElement that relates two MessageComponentTypes.
 */
public class MMMessageAssociationEnd implements MMMessageElement {

	private GeneratedMetamodelBean container;
	private boolean isComposite;
	private MMMessageComponentType type;
	private boolean isTechnical;
	private Optional<MMBusinessComponent> businessComponentTrace;
	private Optional<MMBusinessElement> businessElementTrace;
	private MMMessageElementContainer componentContext;
	private boolean isDerived;
	private Optional<String> xmlTag;
	private MMLogicalType xmlMemberType;
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

	public static interface Members extends MMMessageElement.Members {
		/**
		 * Indicates if the message element is a composite.
		 */
		MetamodelAttribute<MMMessageAssociationEnd, Boolean> isComposite = newAttribute();
		/**
		 * The MessageComponentType which specifies the complex content model of
		 * a MessageAssociationEnd.
		 */
		MetamodelAttribute<MMMessageAssociationEnd, MMMessageComponentType> type = newAttribute();
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageAssociationEnd> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageAssociationEnd> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageAssociationEnd.class);
	}

	/**
	 * Indicates if the message element is a composite.
	 */
	public boolean isIsComposite() {
		return isComposite;
	}

	/**
	 * The MessageComponentType which specifies the complex content model of a
	 * MessageAssociationEnd.
	 */
	public MMMessageComponentType getType() {
		return type;
	}

	@Override
	public boolean isIsTechnical() {
		return isTechnical;
	}

	@Override
	public Optional<MMBusinessComponent> getBusinessComponentTrace() {
		return businessComponentTrace;
	}

	@Override
	public Optional<MMBusinessElement> getBusinessElementTrace() {
		return businessElementTrace;
	}

	@Override
	public MMMessageElementContainer getComponentContext() {
		return componentContext;
	}

	@Override
	public boolean isIsDerived() {
		return isDerived;
	}

	@Override
	public Optional<String> getXmlTag() {
		return xmlTag;
	}

	@Override
	public MMLogicalType getXmlMemberType() {
		return xmlMemberType;
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