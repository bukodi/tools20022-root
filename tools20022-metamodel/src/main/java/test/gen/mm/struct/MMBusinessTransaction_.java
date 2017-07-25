package test.gen.mm.struct;

import test.gen.mm.struct.MMTopLevelCatalogueEntry_;
import test.gen.mm.MMBusinessTransaction;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMBusinessProcess;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMParticipant;
import java.util.List;
import test.gen.mm.MMMessageTransmission;
import test.gen.mm.MMMessageTransportMode;
import java.util.Optional;
import test.gen.mm.MMMessageChoreography;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMBusinessTransaction_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * the BusinessProcessTrace that is used to trace the BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, MMBusinessProcess> businessProcessTrace = newAttribute();
	/**
	 * the involvement of a BusinessRole in a BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, List<MMParticipant>> participant = newAttribute();
	/**
	 * he conveyance of information from a sending Participant in the context of
	 * a BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, List<MMMessageTransmission>> transmission = newAttribute();
	/**
	 * Provides a set of characterstics for a MessageTransportMode to have in
	 * the context of a single BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, MMMessageTransportMode> messageTransportMode = newAttribute();
	/**
	 * decomposition of a BusinessTransaction into a number of sub transactions
	 * which are BusinessTransactions in their own right.
	 */
	MetamodelAttribute<MMBusinessTransaction, List<MMBusinessTransaction>> subTransaction = newAttribute();
	/**
	 * assembly of a number of BusinessTransactions that together form a
	 * BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, Optional<MMBusinessTransaction>> parentTransaction = newAttribute();
	/**
	 * all of the BusinessTransactionTraces that derive MessageChoreographies
	 * from one BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, List<MMMessageChoreography>> trace = newAttribute();
	/**
	 * All MessageTransmissions contained in this BusinessTransaction shall have
	 * different names. transmission-&gt;forAll(msg1,msg2 | msg1 &lt;&gt; msg2
	 * implies msg1.name &lt;&gt; msg2.name)
	 */
	MetamodelConstraint<MMBusinessTransaction> checkMessageTransmissionsHaveUniqueNames = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
	/**
	 * All Participants of this BusinessTransaction shall have different names.
	 * participant-&gt;forAll(p1,p2 | p1 &lt;&gt; p2 implies p1.name &lt;&gt;
	 * p2.name)
	 */
	MetamodelConstraint<MMBusinessTransaction> checkParticipantsHaveUniqueNames = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}