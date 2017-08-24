package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.GenderCode;
import com.tools20022.repository.dict.entity.Person;
import com.tools20022.repository.dict.codeset.LanguageCode;
import java.util.Arrays;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.ResidentialStatusCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.CivilStatusCode;
import com.tools20022.repository.dict.entity.PersonIdentification;
import com.tools20022.repository.GeneratedRepository;

public class Person extends MMBusinessComponent {

	private final static AtomicReference<Person> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrGender = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> GenderCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Person.repoType();
			super.name = "Gender";
			super.definition = "Specifies the gender of the person.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrLanguage = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> LanguageCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Person.repoType();
			super.name = "Language";
			super.definition = "Language in which a person communicates.";
			super.semanticMarkup = Arrays.asList();
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrBirthDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Person.repoType();
			super.name = "BirthDate";
			super.definition = "Date on which a person is born.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrProfession = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Person.repoType();
			super.name = "Profession";
			super.definition = "Name of the occupation or job of a person.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrResidentialStatus = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ResidentialStatusCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Person.repoType();
			super.name = "ResidentialStatus";
			super.definition = "Residential status of an individual, for example, non-permanent resident.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrMinorIndicator = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> YesNoIndicator.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Person.repoType();
			super.name = "MinorIndicator";
			super.definition = "Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrBusinessFunctionTitle = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Person.repoType();
			super.name = "BusinessFunctionTitle";
			super.definition = "Title of the function in an organisation.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrCivilStatus = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CivilStatusCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Person.repoType();
			super.name = "CivilStatus";
			super.definition = "Specifies the civil status of a person.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDeathDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Person.repoType();
			super.name = "DeathDate";
			super.definition = "Date on which a person is dead.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static Person repoType() {
		repoTypeRef.compareAndSet(null, new Person());
		return repoTypeRef.get();
	}

	private Person() {
		super.element = Arrays.asList(attrGender, attrLanguage, attrBirthDate,
				attrProfession, attrResidentialStatus, attrMinorIndicator,
				attrBusinessFunctionTitle, attrCivilStatus, attrDeathDate);
		super.associationDomain_lazy = () -> Arrays.asList(PersonIdentification
				.repoType().refPerson);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Person";
		super.definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
	}
}