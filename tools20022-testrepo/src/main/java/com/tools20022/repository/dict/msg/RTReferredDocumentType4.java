package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.choice.RTReferredDocumentType3Choice;
import com.tools20022.repository.dict.msg.RTReferredDocumentType4;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the type of the document referred in the remittance information.
 */
public class RTReferredDocumentType4 extends MMMessageComponent {

	private final static AtomicReference<RTReferredDocumentType4> repoTypeRef = new AtomicReference<>();
	/**
	 * Provides the type details of the referred document.
	 */
	public final MMMessageAssociationEnd refCodeOrProprietary = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTReferredDocumentType3Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTReferredDocumentType4
					.repoType();
			super.xmlTag = "CdOrPrtry";
			super.name = "CodeOrProprietary";
			super.definition = "Provides the type details of the referred document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identification of the issuer of the reference document type.
	 */
	public final MMMessageAttribute attrIssuer = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTReferredDocumentType4
					.repoType();
			super.xmlTag = "Issr";
			super.name = "Issuer";
			super.definition = "Identification of the issuer of the reference document type.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTReferredDocumentType4 repoType() {
		repoTypeRef.compareAndSet(null, new RTReferredDocumentType4());
		return repoTypeRef.get();
	}

	private RTReferredDocumentType4() {
		super.messageElement = Arrays.asList(refCodeOrProprietary, attrIssuer);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ReferredDocumentType4";
		super.definition = "Specifies the type of the document referred in the remittance information.";
	} }