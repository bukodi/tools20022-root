package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.entity.RTPersonIdentification;
import java.util.Arrays;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTPerson;
import com.tools20022.repository.GeneratedRepository;/**
 * Unique and unambiguous way to identify a person.
 */
public class RTPersonIdentification extends MMBusinessComponent {

	private final static AtomicReference<RTPersonIdentification> repoTypeRef = new AtomicReference<>();
	/**
	 * Number assigned by a social security agency.
	 */
	public final MMBusinessAttribute attrSocialSecurityNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.name = "SocialSecurityNumber";
			super.definition = "Number assigned by a social security agency.";
			super.semanticMarkup = Arrays.asList();
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Person for which an identification is provided.
	 */
	public final MMBusinessAssociationEnd refPerson = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTPerson.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.name = "Person";
			super.definition = "Person for which an identification is provided.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Number assigned by a license authority to a driver's license.
	 */
	public final MMBusinessAttribute attrDriversLicenseNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.name = "DriversLicenseNumber";
			super.definition = "Number assigned by a license authority to a driver's license.";
			super.semanticMarkup = Arrays.asList();
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Number assigned by a government agency to identify foreign nationals.
	 */
	public final MMBusinessAttribute attrAlienRegistrationNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.name = "AlienRegistrationNumber";
			super.definition = "Number assigned by a government agency to identify foreign nationals.";
			super.semanticMarkup = Arrays.asList();
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Number assigned by a passport authority to a passport.
	 */
	public final MMBusinessAttribute attrPassportNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.name = "PassportNumber";
			super.definition = "Number assigned by a passport authority to a passport.";
			super.semanticMarkup = Arrays.asList();
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Number assigned by a national authority to an identity card.
	 */
	public final MMBusinessAttribute attrIdentityCardNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.name = "IdentityCardNumber";
			super.definition = "Number assigned by a national authority to an identity card.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Number assigned to an employer by a registration authority.
	 */
	public final MMBusinessAttribute attrEmployerIdentificationNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.name = "EmployerIdentificationNumber";
			super.definition = "Number assigned to an employer by a registration authority.";
			super.semanticMarkup = Arrays.asList();
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTPersonIdentification repoType() {
		repoTypeRef.compareAndSet(null, new RTPersonIdentification());
		return repoTypeRef.get();
	}

	private RTPersonIdentification() {
		super.element = Arrays.asList(attrSocialSecurityNumber, refPerson,
				attrDriversLicenseNumber, attrAlienRegistrationNumber,
				attrPassportNumber, attrIdentityCardNumber,
				attrEmployerIdentificationNumber);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PersonIdentification";
		super.definition = "Unique and unambiguous way to identify a person.";
	} }