package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTISODate;
import com.tools20022.repository.dict.msg.RTDateAndPlaceOfBirth;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.codeset.RTCountryCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Date and place of birth of a person.
 */
public class RTDateAndPlaceOfBirth extends MMMessageComponent {

	private final static AtomicReference<RTDateAndPlaceOfBirth> repoTypeRef = new AtomicReference<>();
	/**
	 * Date on which a person is born.
	 */
	public final MMMessageAttribute attrBirthDate = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTDateAndPlaceOfBirth
					.repoType();
			super.xmlTag = "BirthDt";
			super.name = "BirthDate";
			super.definition = "Date on which a person is born.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Province where a person was born.
	 */
	public final MMMessageAttribute attrProvinceOfBirth = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTDateAndPlaceOfBirth
					.repoType();
			super.xmlTag = "PrvcOfBirth";
			super.name = "ProvinceOfBirth";
			super.definition = "Province where a person was born.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * City where a person was born.
	 */
	public final MMMessageAttribute attrCityOfBirth = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTDateAndPlaceOfBirth
					.repoType();
			super.xmlTag = "CityOfBirth";
			super.name = "CityOfBirth";
			super.definition = "City where a person was born.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Country where a person was born.
	 */
	public final MMMessageAttribute attrCountryOfBirth = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTCountryCode.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTDateAndPlaceOfBirth
					.repoType();
			super.xmlTag = "CtryOfBirth";
			super.name = "CountryOfBirth";
			super.definition = "Country where a person was born.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTDateAndPlaceOfBirth repoType() {
		repoTypeRef.compareAndSet(null, new RTDateAndPlaceOfBirth());
		return repoTypeRef.get();
	}

	private RTDateAndPlaceOfBirth() {
		super.messageElement = Arrays.asList(attrBirthDate,
				attrProvinceOfBirth, attrCityOfBirth, attrCountryOfBirth);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DateAndPlaceOfBirth";
		super.definition = "Date and place of birth of a person.";
	} }