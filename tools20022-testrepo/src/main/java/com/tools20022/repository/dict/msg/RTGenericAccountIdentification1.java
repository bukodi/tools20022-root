package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTMax34Text;
import com.tools20022.repository.dict.msg.RTGenericAccountIdentification1;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.choice.RTAccountSchemeName1Choice;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Information related to a generic account identification.
 */
public class RTGenericAccountIdentification1 extends MMMessageComponent {

	private final static AtomicReference<RTGenericAccountIdentification1> repoTypeRef = new AtomicReference<>();
	/**
	 * Identification assigned by an institution.
	 */
	public final MMMessageAttribute attrIdentification = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax34Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTGenericAccountIdentification1
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
			super.type_lazy = () -> RTAccountSchemeName1Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTGenericAccountIdentification1
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
			super.componentContext_lazy = () -> RTGenericAccountIdentification1
					.repoType();
			super.xmlTag = "Issr";
			super.name = "Issuer";
			super.definition = "Entity that assigns the identification.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTGenericAccountIdentification1 repoType() {
		repoTypeRef.compareAndSet(null, new RTGenericAccountIdentification1());
		return repoTypeRef.get();
	}

	private RTGenericAccountIdentification1() {
		super.messageElement = Arrays.asList(attrIdentification, refSchemeName,
				attrIssuer);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "GenericAccountIdentification1";
		super.definition = "Information related to a generic account identification.";
	} }