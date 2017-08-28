package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTFinancialInstitutionIdentification8;
import com.tools20022.repository.dict.msg.RTBranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.RTBranchData2;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.
 */
public class RTBranchAndFinancialInstitutionIdentification5 extends MMMessageComponent {

	private final static AtomicReference<RTBranchAndFinancialInstitutionIdentification5> repoTypeRef = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.
	 */
	public final MMMessageAssociationEnd refFinancialInstitutionIdentification = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTFinancialInstitutionIdentification8
					.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTBranchAndFinancialInstitutionIdentification5
					.repoType();
			super.xmlTag = "FinInstnId";
			super.name = "FinancialInstitutionIdentification";
			super.definition = "Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identifies a specific branch of a financial institution.

	Usage: This component should be used in case the identification information in the financial institution component does not provide identification up to branch level.
	 */
	public final MMMessageAssociationEnd refBranchIdentification = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTBranchData2.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTBranchAndFinancialInstitutionIdentification5
					.repoType();
			super.xmlTag = "BrnchId";
			super.name = "BranchIdentification";
			super.definition = "Identifies a specific branch of a financial institution.\n\nUsage: This component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTBranchAndFinancialInstitutionIdentification5 repoType() {
		repoTypeRef.compareAndSet(null,
				new RTBranchAndFinancialInstitutionIdentification5());
		return repoTypeRef.get();
	}

	private RTBranchAndFinancialInstitutionIdentification5() {
		super.messageElement = Arrays.asList(
				refFinancialInstitutionIdentification, refBranchIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "BranchAndFinancialInstitutionIdentification5";
		super.definition = "Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.";
	} }