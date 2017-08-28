package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTDocumentType6Code;
import com.tools20022.repository.dict.choice.RTReferredDocumentType3Choice;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the type of the document referred in the remittance information.
 */
public class RTReferredDocumentType3Choice extends MMChoiceComponent {

	private final static AtomicReference<RTReferredDocumentType3Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Document type in a coded form.
	 */
	public final MMMessageAttribute attrCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTDocumentType6Code.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTReferredDocumentType3Choice
					.repoType();
			super.xmlTag = "Cd";
			super.name = "Code";
			super.definition = "Document type in a coded form.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Proprietary identification of the type of the remittance document.
	 */
	public final MMMessageAttribute attrProprietary = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTReferredDocumentType3Choice
					.repoType();
			super.xmlTag = "Prtry";
			super.name = "Proprietary";
			super.definition = "Proprietary identification of the type of the remittance document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTReferredDocumentType3Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTReferredDocumentType3Choice());
		return repoTypeRef.get();
	}

	private RTReferredDocumentType3Choice() {
		super.messageElement = Arrays.asList(attrCode, attrProprietary);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ReferredDocumentType3Choice";
		super.definition = "Specifies the type of the document referred in the remittance information.";
	} }