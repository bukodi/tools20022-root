package test.gen.mm;

import test.gen.mm.MMTopLevelCatalogueEntry;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMBusinessTransaction;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageDefinition;
import java.util.List;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import test.gen.mm.MMBusinessProcessCatalogue;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * precise and complete description of a MessageInstance exchange within a
 * BusinessTransaction, describing the sequence and correlation of
 * MessageInstances within a conversation, including the constraints on the
 * interaction between Participants
 */
public class MMMessageChoreography implements MMTopLevelCatalogueEntry {

	private GeneratedMetamodelBean container;
	private Optional<MMBusinessTransaction> businessTransactionTrace;
	private List<MMMessageDefinition> messageDefinition;
	private MMBusinessProcessCatalogue businessProcessCatalogue;
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

	public static interface Members extends MMTopLevelCatalogueEntry.Members {
		/**
		 * the BusinessTransactionTrace from the MessageChoreography to the
		 * BusinessTransaction
		 */
		MetamodelAttribute<MMMessageChoreography, Optional<MMBusinessTransaction>> businessTransactionTrace = newAttribute();
		/**
		 * The MessageDefinition that is used in a MessageChoreography.
		 */
		MetamodelAttribute<MMMessageChoreography, List<MMMessageDefinition>> messageDefinition = newAttribute();
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageChoreography> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageChoreography> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageChoreography.class);
	}

	/**
	 * the BusinessTransactionTrace from the MessageChoreography to the
	 * BusinessTransaction
	 * 
	 * @see MMBusinessTransaction#getTrace()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "trace")
	public Optional<MMBusinessTransaction> getBusinessTransactionTrace() {
		return businessTransactionTrace;
	}

	/**
	 * The MessageDefinition that is used in a MessageChoreography.
	 * 
	 * @see MMMessageDefinition#getChoreography()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "choreography")
	public List<MMMessageDefinition> getMessageDefinition() {
		return messageDefinition;
	}

	@Override
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue;
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