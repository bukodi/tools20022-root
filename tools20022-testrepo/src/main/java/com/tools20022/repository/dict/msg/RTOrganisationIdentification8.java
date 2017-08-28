package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTAnyBICIdentifier;
import com.tools20022.repository.dict.msg.RTOrganisationIdentification8;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTGenericOrganisationIdentification1;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Unique and unambiguous way to identify an organisation.
 */
public class RTOrganisationIdentification8 extends MMMessageComponent {

	private final static AtomicReference<RTOrganisationIdentification8> repoTypeRef = new AtomicReference<>();
	/**
	 * Code allocated to a financial institution or non financial institution by the ISO 9362 Registration Authority as described in ISO 9362 "Banking - Banking telecommunication messages - Business identifier code (BIC)".
	 */
	public final MMMessageAttribute attrAnyBIC = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTAnyBICIdentifier.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTOrganisationIdentification8
					.repoType();
			super.xmlTag = "AnyBIC";
			super.name = "AnyBIC";
			super.definition = "Code allocated to a financial institution or non financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Unique identification of an organisation, as assigned by an institution, using an identification scheme.
	 */
	public final MMMessageAssociationEnd refOther = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTGenericOrganisationIdentification1
					.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTOrganisationIdentification8
					.repoType();
			super.xmlTag = "Othr";
			super.name = "Other";
			super.definition = "Unique identification of an organisation, as assigned by an institution, using an identification scheme.";
			super.minOccurs = 0;
		}
	};

	public static RTOrganisationIdentification8 repoType() {
		repoTypeRef.compareAndSet(null, new RTOrganisationIdentification8());
		return repoTypeRef.get();
	}

	private RTOrganisationIdentification8() {
		super.messageElement = Arrays.asList(attrAnyBIC, refOther);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "OrganisationIdentification8";
		super.definition = "Unique and unambiguous way to identify an organisation.";
	} }