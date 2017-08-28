package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.choice.RTClearingSystemIdentification2Choice;
import com.tools20022.repository.dict.msg.RTClearingSystemMemberIdentification2;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Unique identification, as assigned by a clearing system, to unambiguously identify a member of the clearing system.
 */
public class RTClearingSystemMemberIdentification2 extends MMMessageComponent {

	private final static AtomicReference<RTClearingSystemMemberIdentification2> repoTypeRef = new AtomicReference<>();
	/**
	 * Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.
	 */
	public final MMMessageAssociationEnd refClearingSystemIdentification = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTClearingSystemIdentification2Choice
					.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTClearingSystemMemberIdentification2
					.repoType();
			super.xmlTag = "ClrSysId";
			super.name = "ClearingSystemIdentification";
			super.definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Identification of a member of a clearing system.
	 */
	public final MMMessageAttribute attrMemberIdentification = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTClearingSystemMemberIdentification2
					.repoType();
			super.xmlTag = "MmbId";
			super.name = "MemberIdentification";
			super.definition = "Identification of a member of a clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTClearingSystemMemberIdentification2 repoType() {
		repoTypeRef.compareAndSet(null,
				new RTClearingSystemMemberIdentification2());
		return repoTypeRef.get();
	}

	private RTClearingSystemMemberIdentification2() {
		super.messageElement = Arrays.asList(refClearingSystemIdentification,
				attrMemberIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ClearingSystemMemberIdentification2";
		super.definition = "Unique identification, as assigned by a clearing system, to unambiguously identify a member of the clearing system.";
	} }