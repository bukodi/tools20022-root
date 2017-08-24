package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.PersonIdentification;
import java.util.Arrays;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.Person;
import com.tools20022.repository.GeneratedRepository;

public class PersonIdentification extends MMBusinessComponent {

	private final static AtomicReference<PersonIdentification> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrSocialSecurityNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PersonIdentification.repoType();
			super.name = "SocialSecurityNumber";
			super.definition = "Number assigned by a social security agency.";
			super.semanticMarkup = Arrays.asList();
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refPerson = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> Person.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PersonIdentification.repoType();
			super.name = "Person";
			super.definition = "Person for which an identification is provided.";
			super.minOccurs = 0;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDriversLicenseNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PersonIdentification.repoType();
			super.name = "DriversLicenseNumber";
			super.definition = "Number assigned by a license authority to a driver's license.";
			super.semanticMarkup = Arrays.asList();
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrAlienRegistrationNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PersonIdentification.repoType();
			super.name = "AlienRegistrationNumber";
			super.definition = "Number assigned by a government agency to identify foreign nationals.";
			super.semanticMarkup = Arrays.asList();
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPassportNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PersonIdentification.repoType();
			super.name = "PassportNumber";
			super.definition = "Number assigned by a passport authority to a passport.";
			super.semanticMarkup = Arrays.asList();
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrIdentityCardNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PersonIdentification.repoType();
			super.name = "IdentityCardNumber";
			super.definition = "Number assigned by a national authority to an identity card.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrEmployerIdentificationNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PersonIdentification.repoType();
			super.name = "EmployerIdentificationNumber";
			super.definition = "Number assigned to an employer by a registration authority.";
			super.semanticMarkup = Arrays.asList();
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static PersonIdentification repoType() {
		repoTypeRef.compareAndSet(null, new PersonIdentification());
		return repoTypeRef.get();
	}

	private PersonIdentification() {
		super.element = Arrays.asList(attrSocialSecurityNumber, refPerson,
				attrDriversLicenseNumber, attrAlienRegistrationNumber,
				attrPassportNumber, attrIdentityCardNumber,
				attrEmployerIdentificationNumber);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PersonIdentification";
		super.definition = "Unique and unambiguous way to identify a person.";
	}
}