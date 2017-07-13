package test.gen.mm;

import test.gen.mm.MMRepositoryConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMBusinessTransaction;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageDefinition;
import java.util.List;
import test.gen.mm.MMSend;
import test.gen.mm.MMReceive;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.Containment;
import java.util.Optional;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * the passing of information from one Participant to another in the context of
 * a BusinessTransaction
 */
public class MMMessageTransmission implements MMRepositoryConcept {

	private GeneratedMetamodelBean container;
	private MMBusinessTransaction businessTransaction;
	private List<MMMessageDefinition> derivation;
	private String messageTypeDescription;
	private MMSend send;
	private List<MMReceive> receive;
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
		 * the BusinessTransaction to which the MessageTransmission belongs
		 */
		MetamodelAttribute<MMMessageTransmission, MMBusinessTransaction> businessTransaction = newAttribute();
		/**
		 * all of the MessagetypeTraces that derive MessageDefinitions from one
		 * MessageTransmission
		 */
		MetamodelAttribute<MMMessageTransmission, List<MMMessageDefinition>> derivation = newAttribute();
		/**
		 * Describes the purpose and scope of the MessageTransmission in the
		 * BusinessTransaction
		 */
		MetamodelAttribute<MMMessageTransmission, String> messageTypeDescription = newAttribute();
		/**
		 * the passing of a MessagTransmission from a sender instance to a
		 * receiver instance
		 */
		MetamodelAttribute<MMMessageTransmission, MMSend> send = newAttribute();
		/**
		 * the handling of a MessageTransmission passed from a sender instance
		 */
		MetamodelAttribute<MMMessageTransmission, List<MMReceive>> receive = newAttribute();
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageTransmission> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageTransmission> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageTransmission.class);
	}

	/**
	 * the BusinessTransaction to which the MessageTransmission belongs
	 * 
	 * @see MMBusinessTransaction#getTransmission()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "transmission")
	@Container
	public MMBusinessTransaction getBusinessTransaction() {
		return businessTransaction;
	}

	/**
	 * all of the MessagetypeTraces that derive MessageDefinitions from one
	 * MessageTransmission
	 * 
	 * @see MMMessageDefinition#getTrace()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "trace")
	public List<MMMessageDefinition> getDerivation() {
		return derivation;
	}

	/**
	 * Describes the purpose and scope of the MessageTransmission in the
	 * BusinessTransaction
	 */
	public String getMessageTypeDescription() {
		return messageTypeDescription;
	}

	/**
	 * the passing of a MessagTransmission from a sender instance to a receiver
	 * instance
	 * 
	 * @see MMSend#getMessageTransmission()
	 */
	@Opposite(bean = MMSend.class, attribute = "messageTransmission")
	@Containment
	public MMSend getSend() {
		return send;
	}

	/**
	 * the handling of a MessageTransmission passed from a sender instance
	 * 
	 * @see MMReceive#getMessageTransmission()
	 */
	@Opposite(bean = MMReceive.class, attribute = "messageTransmission")
	@Containment
	public List<MMReceive> getReceive() {
		return receive;
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