package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.CountryCode;
import com.tools20022.repository.dict.entity.IdentificationIssuerRole;
import com.tools20022.repository.dict.datatype.Max35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class IdentificationIssuerRole extends MMBusinessComponent {

	private final static AtomicReference<IdentificationIssuerRole> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrCountry = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CountryCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> IdentificationIssuerRole
					.repoType();
			super.name = "Country";
			super.definition = "Country of the proprietary identification scheme.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrEntityName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> IdentificationIssuerRole
					.repoType();
			super.name = "EntityName";
			super.definition = "Entity that issues the proprietary identification.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrOwnerCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> IdentificationIssuerRole
					.repoType();
			super.name = "OwnerCode";
			super.definition = "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static IdentificationIssuerRole repoType() {
		repoTypeRef.compareAndSet(null, new IdentificationIssuerRole());
		return repoTypeRef.get();
	}

	private IdentificationIssuerRole() {
		super.element = Arrays.asList(attrCountry, attrEntityName,
				attrOwnerCode);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "IdentificationIssuerRole";
		super.definition = "Entity that assigns the identification.";
	}
}