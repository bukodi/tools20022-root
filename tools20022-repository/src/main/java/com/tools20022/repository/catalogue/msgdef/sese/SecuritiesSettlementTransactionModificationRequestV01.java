package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionModificationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionDetails41;
import com.tools20022.repository.dict.choice.UpdateType5Choice;
import java.util.List;

/**
 * Scope An account owner sends a
 * SecuritiesSettlementTransactionModificationRequest to an account servicer to
 * request the modification of non core business data (matching or non-matching)
 * information in a pending or settled instruction. It can also be used for the
 * enrichment of an incomplete transaction. The account owner will generally be:
 * - a central securities depository participant which has an account with a
 * central securities depository or a market infrastructure - an investment
 * manager which has an account with a custodian acting as accounting and/or
 * settlement agent. Usage The modification must only contain the data to be
 * modified. The message may also be used to: - re-send a message sent by the
 * account owner to the account servicer, - provide a third party with a copy of
 * a message being sent by the account owner for information, - re-send to a
 * third party a copy of a message being sent by the account owner for
 * information. using the relevant elements in the Business Application Header.
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(SecuritiesSettlementTransactionModificationRequestV02.class)
public class SecuritiesSettlementTransactionModificationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TransactionDetails41 ModifiedTransactionDetails;
	private List<UpdateType5Choice> UpdateType;

	public TransactionDetails41 getModifiedTransactionDetails() {
		return ModifiedTransactionDetails;
	}

	public void setModifiedTransactionDetails(
			TransactionDetails41 ModifiedTransactionDetails) {
		this.ModifiedTransactionDetails = ModifiedTransactionDetails;
	}

	public List<UpdateType5Choice> getUpdateType() {
		return UpdateType;
	}

	public void setUpdateType(List<UpdateType5Choice> UpdateType) {
		this.UpdateType = UpdateType;
	}
}