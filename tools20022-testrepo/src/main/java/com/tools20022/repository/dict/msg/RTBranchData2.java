package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.msg.RTBranchData2;
import com.tools20022.repository.dict.datatype.RTMax140Text;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTPostalAddress6;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Information that locates and identifies a specific branch of a financial institution.
 */
public class RTBranchData2 extends MMMessageComponent {

	private final static AtomicReference<RTBranchData2> repoTypeRef = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of a branch of a financial institution.
	 */
	public final MMMessageAttribute attrIdentification = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTBranchData2.repoType();
			super.xmlTag = "Id";
			super.name = "Identification";
			super.definition = "Unique and unambiguous identification of a branch of a financial institution.";
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
			super.componentContext_lazy = () -> RTBranchData2.repoType();
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
			super.componentContext_lazy = () -> RTBranchData2.repoType();
			super.xmlTag = "PstlAdr";
			super.name = "PostalAddress";
			super.definition = "Information that locates and identifies a specific address, as defined by postal services.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTBranchData2 repoType() {
		repoTypeRef.compareAndSet(null, new RTBranchData2());
		return repoTypeRef.get();
	}

	private RTBranchData2() {
		super.messageElement = Arrays.asList(attrIdentification, attrName,
				refPostalAddress);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "BranchData2";
		super.definition = "Information that locates and identifies a specific branch of a financial institution.";
	} }