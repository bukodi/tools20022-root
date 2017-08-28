package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTAnyBICIdentifier;
import com.tools20022.repository.dict.entity.RTContactPoint;
import com.tools20022.repository.dict.datatype.RTYesNoIndicator;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.RTParty;
import com.tools20022.repository.GeneratedRepository;/**
 * Number, physical or virtual address, used for communication.
 */
public class RTContactPoint extends MMBusinessComponent {

	private final static AtomicReference<RTContactPoint> repoTypeRef = new AtomicReference<>();
	/**
	 * BIC address which identifies the contact point.
	 */
	public final MMBusinessAttribute attrBICAddress = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTAnyBICIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTContactPoint.repoType();
			super.name = "BICAddress";
			super.definition = "BIC address which identifies the contact point.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Indicates whether the address is a temporary address.
	 */
	public final MMBusinessAttribute attrTemporaryIndicator = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTYesNoIndicator.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTContactPoint.repoType();
			super.name = "TemporaryIndicator";
			super.definition = "Indicates whether the address is a temporary address.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTContactPoint repoType() {
		repoTypeRef.compareAndSet(null, new RTContactPoint());
		return repoTypeRef.get();
	}

	private RTContactPoint() {
		super.element = Arrays.asList(attrBICAddress, attrTemporaryIndicator);
		super.associationDomain_lazy = () -> Arrays
				.asList(RTParty.repoType().refContactPoint);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ContactPoint";
		super.definition = "Number, physical or virtual address, used for communication.";
	} }