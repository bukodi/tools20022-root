package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTOrganisationIdentification8;
import com.tools20022.repository.dict.choice.RTParty11Choice;
import com.tools20022.repository.dict.msg.RTPersonIdentification5;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Nature or use of the account.
 */
public class RTParty11Choice extends MMChoiceComponent {

	private final static AtomicReference<RTParty11Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Unique and unambiguous way to identify an organisation.
	 */
	public final MMMessageAssociationEnd refOrganisationIdentification = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTOrganisationIdentification8.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTParty11Choice.repoType();
			super.xmlTag = "OrgId";
			super.name = "OrganisationIdentification";
			super.definition = "Unique and unambiguous way to identify an organisation.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Unique and unambiguous identification of a person, eg, passport.
	 */
	public final MMMessageAssociationEnd refPrivateIdentification = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTPersonIdentification5.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTParty11Choice.repoType();
			super.xmlTag = "PrvtId";
			super.name = "PrivateIdentification";
			super.definition = "Unique and unambiguous identification of a person, eg, passport.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTParty11Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTParty11Choice());
		return repoTypeRef.get();
	}

	private RTParty11Choice() {
		super.messageElement = Arrays.asList(refOrganisationIdentification,
				refPrivateIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Party11Choice";
		super.definition = "Nature or use of the account.";
	} }