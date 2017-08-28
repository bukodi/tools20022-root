package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTMax256Text;
import com.tools20022.repository.dict.entity.RTElectronicAddress;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Address which is accessed by electronic means.
 */
public class RTElectronicAddress extends MMBusinessComponent {

	private final static AtomicReference<RTElectronicAddress> repoTypeRef = new AtomicReference<>();
	/**
	 * Address for electronic mail (e-mail).
	 */
	public final MMBusinessAttribute attrEmailAddress = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax256Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTElectronicAddress.repoType();
			super.name = "EmailAddress";
			super.definition = "Address for electronic mail (e-mail).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTElectronicAddress repoType() {
		repoTypeRef.compareAndSet(null, new RTElectronicAddress());
		return repoTypeRef.get();
	}

	private RTElectronicAddress() {
		super.element = Arrays.asList(attrEmailAddress);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ElectronicAddress";
		super.definition = "Address which is accessed by electronic means.";
	} }