package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.entity.RTMandate;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTAuthentication;
import com.tools20022.repository.dict.datatype.RTMax35NumericText;
import com.tools20022.repository.dict.datatype.RTTrueFalseIndicator;
import com.tools20022.repository.dict.datatype.RTPercentageRate;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Authorisation given by an issuing party to a holder party to act on the issuer's behalf.
 */
public class RTMandate extends MMBusinessComponent {

	private final static AtomicReference<RTMandate> repoTypeRef = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of the mandate.
	 */
	public final MMBusinessAttribute attrMandateIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.name = "MandateIdentification";
			super.definition = "Unique and unambiguous identification of the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Improvement on a mandate.
	 */
	public final MMBusinessAssociationEnd refAmendment = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTMandate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.name = "Amendment";
			super.definition = "Improvement on a mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the transport authentication details related to the mandate.
	 */
	public final MMBusinessAssociationEnd refAuthentication = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTAuthentication.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.name = "Authentication";
			super.definition = "Specifies the transport authentication details related to the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the number of days the mandate must be tracked.
	 */
	public final MMBusinessAttribute attrTrackingDays = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35NumericText.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.name = "TrackingDays";
			super.definition = "Specifies the number of days the mandate must be tracked.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.
	 */
	public final MMBusinessAttribute attrTrackingIndicator = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTTrueFalseIndicator.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.name = "TrackingIndicator";
			super.definition = "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Pre-agreed increase or decrease rate that will be applied to the collection amount.
	 */
	public final MMBusinessAttribute attrRate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTPercentageRate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTMandate.repoType();
			super.name = "Rate";
			super.definition = "Pre-agreed increase or decrease rate that will be applied to the collection amount.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTMandate repoType() {
		repoTypeRef.compareAndSet(null, new RTMandate());
		return repoTypeRef.get();
	}

	private RTMandate() {
		super.element = Arrays.asList(attrMandateIdentification, refAmendment,
				refAuthentication, attrTrackingDays, attrTrackingIndicator,
				attrRate);
		super.associationDomain_lazy = () -> Arrays
				.asList(RTMandate.repoType().refAmendment);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Mandate";
		super.definition = "Authorisation given by an issuing party to a holder party to act on the issuer's behalf.";
	} }