package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.Authentication;
import com.tools20022.repository.dict.datatype.Max35NumericText;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.datatype.PercentageRate;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class Mandate extends MMBusinessComponent {

	private final static AtomicReference<Mandate> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrMandateIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Mandate.repoType();
			super.name = "MandateIdentification";
			super.definition = "Unique and unambiguous identification of the mandate.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refAmendment = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> Mandate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Mandate.repoType();
			super.name = "Amendment";
			super.definition = "Improvement on a mandate.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refAuthentication = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> Authentication.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Mandate.repoType();
			super.name = "Authentication";
			super.definition = "Specifies the transport authentication details related to the mandate.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrTrackingDays = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35NumericText.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Mandate.repoType();
			super.name = "TrackingDays";
			super.definition = "Specifies the number of days the mandate must be tracked.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrTrackingIndicator = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> TrueFalseIndicator.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Mandate.repoType();
			super.name = "TrackingIndicator";
			super.definition = "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrRate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> PercentageRate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Mandate.repoType();
			super.name = "Rate";
			super.definition = "Pre-agreed increase or decrease rate that will be applied to the collection amount.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static Mandate repoType() {
		repoTypeRef.compareAndSet(null, new Mandate());
		return repoTypeRef.get();
	}

	private Mandate() {
		super.element = Arrays.asList(attrMandateIdentification, refAmendment,
				refAuthentication, attrTrackingDays, attrTrackingIndicator,
				attrRate);
		super.associationDomain_lazy = () -> Arrays
				.asList(Mandate.repoType().refAmendment);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Mandate";
		super.definition = "Authorisation given by an issuing party to a holder party to act on the issuer's behalf.";
	}
}