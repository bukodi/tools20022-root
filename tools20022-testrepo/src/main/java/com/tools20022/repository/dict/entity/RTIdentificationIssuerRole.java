package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.RTCountryCode;
import com.tools20022.repository.dict.entity.RTIdentificationIssuerRole;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Entity that assigns the identification.
 */
public class RTIdentificationIssuerRole extends MMBusinessComponent {

	private final static AtomicReference<RTIdentificationIssuerRole> repoTypeRef = new AtomicReference<>();
	/**
	 * Country of the proprietary identification scheme.
	 */
	public final MMBusinessAttribute attrCountry = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCountryCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTIdentificationIssuerRole
					.repoType();
			super.name = "Country";
			super.definition = "Country of the proprietary identification scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Entity that issues the proprietary identification.
	 */
	public final MMBusinessAttribute attrEntityName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTIdentificationIssuerRole
					.repoType();
			super.name = "EntityName";
			super.definition = "Entity that issues the proprietary identification.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO.
	 */
	public final MMBusinessAttribute attrOwnerCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTIdentificationIssuerRole
					.repoType();
			super.name = "OwnerCode";
			super.definition = "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTIdentificationIssuerRole repoType() {
		repoTypeRef.compareAndSet(null, new RTIdentificationIssuerRole());
		return repoTypeRef.get();
	}

	private RTIdentificationIssuerRole() {
		super.element = Arrays.asList(attrCountry, attrEntityName,
				attrOwnerCode);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "IdentificationIssuerRole";
		super.definition = "Entity that assigns the identification.";
	} }