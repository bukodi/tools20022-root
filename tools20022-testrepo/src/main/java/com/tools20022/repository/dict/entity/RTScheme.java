package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.entity.RTScheme;
import com.tools20022.repository.dict.datatype.RTMax70Text;
import com.tools20022.repository.dict.datatype.RTMax350Text;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.RTGenericIdentification;
import com.tools20022.repository.GeneratedRepository;/**
 * Information regarding an enumerated code list and its owner.
 */
public class RTScheme extends MMBusinessComponent {

	private final static AtomicReference<RTScheme> repoTypeRef = new AtomicReference<>();
	/**
	 * Short textual description of the scheme.
	 */
	public final MMBusinessAttribute attrNameShort = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.name = "NameShort";
			super.definition = "Short textual description of the scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Code that represents the enumerated list, for example, ISO 6166 for ISIN.
	 */
	public final MMBusinessAttribute attrCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.name = "Code";
			super.definition = "Code that represents the enumerated list, for example, ISO 6166 for ISIN.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Version number of the scheme.
	 */
	public final MMBusinessAttribute attrVersion = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.name = "Version";
			super.definition = "Version number of the scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Long textual description of the scheme.
	 */
	public final MMBusinessAttribute attrNameLong = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.name = "NameLong";
			super.definition = "Long textual description of the scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Textual description of the scheme.
	 */
	public final MMBusinessAttribute attrDescription = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax350Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.name = "Description";
			super.definition = "Textual description of the scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Code for a specific instance of an entry within the enumerated list, for example, ISIN.
	 */
	public final MMBusinessAttribute attrDomainValueCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.name = "DomainValueCode";
			super.definition = "Code for a specific instance of an entry within the enumerated list, for example, ISIN.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Textual description of the DomainValueCode, for example, International Securities Identification Number.
	 */
	public final MMBusinessAttribute attrDomainValueName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTScheme.repoType();
			super.name = "DomainValueName";
			super.definition = "Textual description of the DomainValueCode, for example, International Securities Identification Number.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTScheme repoType() {
		repoTypeRef.compareAndSet(null, new RTScheme());
		return repoTypeRef.get();
	}

	private RTScheme() {
		super.element = Arrays.asList(attrNameShort, attrCode, attrVersion,
				attrNameLong, attrDescription, attrDomainValueCode,
				attrDomainValueName);
		super.associationDomain_lazy = () -> Arrays
				.asList(RTGenericIdentification.repoType().refScheme);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Scheme";
		super.definition = "Information regarding an enumerated code list and its owner.";
	} }