package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Scheme;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.datatype.Max350Text;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;

public class Scheme extends MMBusinessComponent {

	private final static AtomicReference<Scheme> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrNameShort = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Scheme.repoType();
			super.name = "NameShort";
			super.definition = "Short textual description of the scheme.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Scheme.repoType();
			super.name = "Code";
			super.definition = "Code that represents the enumerated list, for example, ISO 6166 for ISIN.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrVersion = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Scheme.repoType();
			super.name = "Version";
			super.definition = "Version number of the scheme.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrNameLong = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Scheme.repoType();
			super.name = "NameLong";
			super.definition = "Long textual description of the scheme.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDescription = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max350Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Scheme.repoType();
			super.name = "Description";
			super.definition = "Textual description of the scheme.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDomainValueCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Scheme.repoType();
			super.name = "DomainValueCode";
			super.definition = "Code for a specific instance of an entry within the enumerated list, for example, ISIN.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDomainValueName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Scheme.repoType();
			super.name = "DomainValueName";
			super.definition = "Textual description of the DomainValueCode, for example, International Securities Identification Number.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static Scheme repoType() {
		repoTypeRef.compareAndSet(null, new Scheme());
		return repoTypeRef.get();
	}

	private Scheme() {
		super.element = Arrays.asList(attrNameShort, attrCode, attrVersion,
				attrNameLong, attrDescription, attrDomainValueCode,
				attrDomainValueName);
		super.associationDomain_lazy = () -> Arrays
				.asList(GenericIdentification.repoType().refScheme);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Scheme";
		super.definition = "Information regarding an enumerated code list and its owner.";
	}
}