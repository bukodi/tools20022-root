package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTMax350Text;
import com.tools20022.repository.dict.entity.RTAgreement;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTDateTimePeriod;
import com.tools20022.repository.dict.entity.RTDocument;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Contractual details related to an agreement between parties.
 */
public class RTAgreement extends MMBusinessComponent {

	private final static AtomicReference<RTAgreement> repoTypeRef = new AtomicReference<>();
	/**
	 * Full name of an agreement, annexes and amendments in place between the principals.
	 */
	public final MMBusinessAttribute attrDescription = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax350Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAgreement.repoType();
			super.name = "Description";
			super.definition = "Full name of an agreement, annexes and amendments in place between the principals.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Period during which the agreement is valid
	 */
	public final MMBusinessAssociationEnd refValidityPeriod = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTDateTimePeriod.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAgreement.repoType();
			super.name = "ValidityPeriod";
			super.definition = "Period during which the agreement is valid";
			super.minOccurs = 0;
		}
	};
	/**
	 * Document which materialises the agreement.
	 */
	public final MMBusinessAssociationEnd refDocument = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTDocument.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAgreement.repoType();
			super.name = "Document";
			super.definition = "Document which materialises the agreement.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTAgreement repoType() {
		repoTypeRef.compareAndSet(null, new RTAgreement());
		return repoTypeRef.get();
	}

	private RTAgreement() {
		super.element = Arrays.asList(attrDescription, refValidityPeriod,
				refDocument);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Agreement";
		super.definition = "Contractual details related to an agreement between parties.";
	} }