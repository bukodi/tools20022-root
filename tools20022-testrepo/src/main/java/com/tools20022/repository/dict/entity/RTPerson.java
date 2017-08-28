package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.RTGenderCode;
import com.tools20022.repository.dict.entity.RTPerson;
import com.tools20022.repository.dict.codeset.RTLanguageCode;
import java.util.Arrays;
import com.tools20022.repository.dict.datatype.RTISODateTime;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.codeset.RTResidentialStatusCode;
import com.tools20022.repository.dict.datatype.RTYesNoIndicator;
import com.tools20022.repository.dict.codeset.RTCivilStatusCode;
import com.tools20022.repository.dict.entity.RTPersonIdentification;
import com.tools20022.repository.GeneratedRepository;/**
 * Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').
 */
public class RTPerson extends MMBusinessComponent {

	private final static AtomicReference<RTPerson> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies the gender of the person.
	 */
	public final MMBusinessAttribute attrGender = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTGenderCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.name = "Gender";
			super.definition = "Specifies the gender of the person.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Language in which a person communicates.
	 */
	public final MMBusinessAttribute attrLanguage = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTLanguageCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.name = "Language";
			super.definition = "Language in which a person communicates.";
			super.semanticMarkup = Arrays.asList();
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Date on which a person is born.
	 */
	public final MMBusinessAttribute attrBirthDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.name = "BirthDate";
			super.definition = "Date on which a person is born.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Name of the occupation or job of a person.
	 */
	public final MMBusinessAttribute attrProfession = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.name = "Profession";
			super.definition = "Name of the occupation or job of a person.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Residential status of an individual, for example, non-permanent resident.
	 */
	public final MMBusinessAttribute attrResidentialStatus = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTResidentialStatusCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.name = "ResidentialStatus";
			super.definition = "Residential status of an individual, for example, non-permanent resident.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved.
	 */
	public final MMBusinessAttribute attrMinorIndicator = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTYesNoIndicator.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.name = "MinorIndicator";
			super.definition = "Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Title of the function in an organisation.
	 */
	public final MMBusinessAttribute attrBusinessFunctionTitle = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.name = "BusinessFunctionTitle";
			super.definition = "Title of the function in an organisation.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the civil status of a person.
	 */
	public final MMBusinessAttribute attrCivilStatus = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCivilStatusCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.name = "CivilStatus";
			super.definition = "Specifies the civil status of a person.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Date on which a person is dead.
	 */
	public final MMBusinessAttribute attrDeathDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.name = "DeathDate";
			super.definition = "Date on which a person is dead.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTPerson repoType() {
		repoTypeRef.compareAndSet(null, new RTPerson());
		return repoTypeRef.get();
	}

	private RTPerson() {
		super.element = Arrays.asList(attrGender, attrLanguage, attrBirthDate,
				attrProfession, attrResidentialStatus, attrMinorIndicator,
				attrBusinessFunctionTitle, attrCivilStatus, attrDeathDate);
		super.associationDomain_lazy = () -> Arrays
				.asList(RTPersonIdentification.repoType().refPerson);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Person";
		super.definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
	} }