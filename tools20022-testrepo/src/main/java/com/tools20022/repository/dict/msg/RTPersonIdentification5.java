package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTDateAndPlaceOfBirth;
import com.tools20022.repository.dict.msg.RTPersonIdentification5;
import com.tools20022.repository.dict.msg.RTGenericPersonIdentification1;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Unique and unambiguous way to identify a person.
 */
public class RTPersonIdentification5 extends MMMessageComponent {

	private final static AtomicReference<RTPersonIdentification5> repoTypeRef = new AtomicReference<>();
	/**
	 * Date and place of birth of a person.
	 */
	public final MMMessageAssociationEnd refDateAndPlaceOfBirth = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTDateAndPlaceOfBirth.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPersonIdentification5
					.repoType();
			super.xmlTag = "DtAndPlcOfBirth";
			super.name = "DateAndPlaceOfBirth";
			super.definition = "Date and place of birth of a person.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Unique identification of a person, as assigned by an institution, using an identification scheme.
	 */
	public final MMMessageAssociationEnd refOther = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTGenericPersonIdentification1.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPersonIdentification5
					.repoType();
			super.xmlTag = "Othr";
			super.name = "Other";
			super.definition = "Unique identification of a person, as assigned by an institution, using an identification scheme.";
			super.minOccurs = 0;
		}
	};

	public static RTPersonIdentification5 repoType() {
		repoTypeRef.compareAndSet(null, new RTPersonIdentification5());
		return repoTypeRef.get();
	}

	private RTPersonIdentification5() {
		super.messageElement = Arrays.asList(refDateAndPlaceOfBirth, refOther);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PersonIdentification5";
		super.definition = "Unique and unambiguous way to identify a person.";
	} }