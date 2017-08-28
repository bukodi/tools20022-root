package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.RTServiceLevelCode;
import com.tools20022.repository.dict.entity.RTServiceLevel;
import com.tools20022.repository.dict.codeset.RTSWIFTServiceLevelCode;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.RTPaymentProcessing;
import com.tools20022.repository.GeneratedRepository;/**
 * Agreement under which or rules under which the transaction should be processed.
 */
public class RTServiceLevel extends MMBusinessComponent {

	private final static AtomicReference<RTServiceLevel> repoTypeRef = new AtomicReference<>();
	/**
	 * Identification of a pre-agreed level of service between the parties in a coded form.
	 */
	public final MMBusinessAttribute attrCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTServiceLevelCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTServiceLevel.repoType();
			super.name = "Code";
			super.definition = "Identification of a pre-agreed level of service between the parties in a coded form.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * SWIFT defined service level applies to the payment instruction.
	 */
	public final MMBusinessAttribute attrOther = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTSWIFTServiceLevelCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTServiceLevel.repoType();
			super.name = "Other";
			super.definition = "SWIFT defined service level applies to the payment instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Unambiguous identification of a pre-agreed level of service between the parties.
	 */
	public final MMBusinessAttribute attrBilateral = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTServiceLevel.repoType();
			super.name = "Bilateral";
			super.definition = "Unambiguous identification of a pre-agreed level of service between the parties.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTServiceLevel repoType() {
		repoTypeRef.compareAndSet(null, new RTServiceLevel());
		return repoTypeRef.get();
	}

	private RTServiceLevel() {
		super.element = Arrays.asList(attrCode, attrOther, attrBilateral);
		super.associationDomain_lazy = () -> Arrays.asList(RTPaymentProcessing
				.repoType().refServiceLevel);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ServiceLevel";
		super.definition = "Agreement under which or rules under which the transaction should be processed.";
	} }