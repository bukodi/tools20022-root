package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTBICFIIdentifier;
import com.tools20022.repository.dict.msg.RTFinancialInstitutionIdentification8;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTClearingSystemMemberIdentification2;
import com.tools20022.repository.dict.datatype.RTMax140Text;
import com.tools20022.repository.dict.msg.RTPostalAddress6;
import com.tools20022.repository.dict.msg.RTGenericFinancialIdentification1;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Set of elements used to identify a financial institution.
 */
public class RTFinancialInstitutionIdentification8 extends MMMessageComponent {

	private final static AtomicReference<RTFinancialInstitutionIdentification8> repoTypeRef = new AtomicReference<>();
	/**
	 * Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 "Banking - Banking telecommunication messages - Business identifier code (BIC)".
	 */
	public final MMMessageAttribute attrBICFI = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTBICFIIdentifier.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFinancialInstitutionIdentification8
					.repoType();
			super.xmlTag = "BICFI";
			super.name = "BICFI";
			super.definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Information used to identify a member within a clearing system.
	 */
	public final MMMessageAssociationEnd refClearingSystemMemberIdentification = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTClearingSystemMemberIdentification2
					.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFinancialInstitutionIdentification8
					.repoType();
			super.xmlTag = "ClrSysMmbId";
			super.name = "ClearingSystemMemberIdentification";
			super.definition = "Information used to identify a member within a clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Name by which an agent is known and which is usually used to identify that agent.
	 */
	public final MMMessageAttribute attrName = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax140Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFinancialInstitutionIdentification8
					.repoType();
			super.xmlTag = "Nm";
			super.name = "Name";
			super.definition = "Name by which an agent is known and which is usually used to identify that agent.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Information that locates and identifies a specific address, as defined by postal services.
	 */
	public final MMMessageAssociationEnd refPostalAddress = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTPostalAddress6.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFinancialInstitutionIdentification8
					.repoType();
			super.xmlTag = "PstlAdr";
			super.name = "PostalAddress";
			super.definition = "Information that locates and identifies a specific address, as defined by postal services.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Unique identification of an agent, as assigned by an institution, using an identification scheme.
	 */
	public final MMMessageAssociationEnd refOther = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTGenericFinancialIdentification1
					.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFinancialInstitutionIdentification8
					.repoType();
			super.xmlTag = "Othr";
			super.name = "Other";
			super.definition = "Unique identification of an agent, as assigned by an institution, using an identification scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTFinancialInstitutionIdentification8 repoType() {
		repoTypeRef.compareAndSet(null,
				new RTFinancialInstitutionIdentification8());
		return repoTypeRef.get();
	}

	private RTFinancialInstitutionIdentification8() {
		super.messageElement = Arrays.asList(attrBICFI,
				refClearingSystemMemberIdentification, attrName,
				refPostalAddress, refOther);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "FinancialInstitutionIdentification8";
		super.definition = "Set of elements used to identify a financial institution.";
	} }