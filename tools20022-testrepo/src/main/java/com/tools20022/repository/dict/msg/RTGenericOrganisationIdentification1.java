package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.msg.RTGenericOrganisationIdentification1;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.choice.RTOrganisationIdentificationSchemeName1Choice;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Information related to an identification of an organisation.
 */
public class RTGenericOrganisationIdentification1 extends MMMessageComponent {

	private final static AtomicReference<RTGenericOrganisationIdentification1> repoTypeRef = new AtomicReference<>();
	/**
	 * Identification assigned by an institution.
	 */
	public final MMMessageAttribute attrIdentification = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTGenericOrganisationIdentification1
					.repoType();
			super.xmlTag = "Id";
			super.name = "Identification";
			super.definition = "Identification assigned by an institution.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Name of the identification scheme.
	 */
	public final MMMessageAssociationEnd refSchemeName = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTOrganisationIdentificationSchemeName1Choice
					.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTGenericOrganisationIdentification1
					.repoType();
			super.xmlTag = "SchmeNm";
			super.name = "SchemeName";
			super.definition = "Name of the identification scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Entity that assigns the identification.
	 */
	public final MMMessageAttribute attrIssuer = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTGenericOrganisationIdentification1
					.repoType();
			super.xmlTag = "Issr";
			super.name = "Issuer";
			super.definition = "Entity that assigns the identification.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTGenericOrganisationIdentification1 repoType() {
		repoTypeRef.compareAndSet(null,
				new RTGenericOrganisationIdentification1());
		return repoTypeRef.get();
	}

	private RTGenericOrganisationIdentification1() {
		super.messageElement = Arrays.asList(attrIdentification, refSchemeName,
				attrIssuer);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "GenericOrganisationIdentification1";
		super.definition = "Information related to an identification of an organisation.";
	} }