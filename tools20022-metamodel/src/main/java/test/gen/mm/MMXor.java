package test.gen.mm;

import test.gen.mm.MMRepositoryConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageElement;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageComponent;
import java.util.Optional;
import test.gen.mm.MMMessageBuildingBlock;
import test.gen.mm.MMMessageDefinition;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * A rule which enforces a choice amongst a set of Message Elements contained
 * either within a Message Definition or a Message Component.
 */
public class MMXor implements MMRepositoryConcept {

	private GeneratedMetamodelBean container;
	private List<MMMessageElement> impactedElements;
	private Optional<MMMessageComponent> messageComponent;
	private List<MMMessageBuildingBlock> impactedMessageBuildingBlocks;
	private Optional<MMMessageDefinition> messageDefinition;
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

	public static interface Members extends MMRepositoryConcept.Members {
		/**
		 * Message Elements impacted by the XOR.
		 */
		MetamodelAttribute<MMXor, List<MMMessageElement>> impactedElements = newAttribute();
		/**
		 * Message Component owning the XOR.
		 */
		MetamodelAttribute<MMXor, Optional<MMMessageComponent>> messageComponent = newAttribute();
		/**
		 * MessageBuildingBlocks impacted by the XOR.
		 */
		MetamodelAttribute<MMXor, List<MMMessageBuildingBlock>> impactedMessageBuildingBlocks = newAttribute();
		/**
		 * Message Definition owning the XOR.
		 */
		MetamodelAttribute<MMXor, Optional<MMMessageDefinition>> messageDefinition = newAttribute();
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMXor> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMXor> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMXor.class);
	}

	/**
	 * Message Elements impacted by the XOR.
	 */
	public List<MMMessageElement> getImpactedElements() {
		return impactedElements;
	}

	/**
	 * Message Component owning the XOR.
	 * 
	 * @see MMMessageComponent#getXors()
	 */
	@Opposite(bean = MMMessageComponent.class, attribute = "xors")
	@Container
	public Optional<MMMessageComponent> getMessageComponent() {
		return messageComponent;
	}

	/**
	 * MessageBuildingBlocks impacted by the XOR.
	 */
	public List<MMMessageBuildingBlock> getImpactedMessageBuildingBlocks() {
		return impactedMessageBuildingBlocks;
	}

	/**
	 * Message Definition owning the XOR.
	 * 
	 * @see MMMessageDefinition#getXors()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "xors")
	@Container
	public Optional<MMMessageDefinition> getMessageDefinition() {
		return messageDefinition;
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
}