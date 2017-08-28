package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTMax350Text;
import com.tools20022.repository.dict.msg.RTSupplementaryData1;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.other.RTSupplementaryDataEnvelope1;
import java.util.Arrays;
import com.tools20022.repository.catalogue.msgdef.pain.RTMandateInitiationRequestV05;
import com.tools20022.repository.GeneratedRepository;/**
 * Additional information that can not be captured in the structured fields and/or any other specific block.
 */
public class RTSupplementaryData1 extends MMMessageComponent {

	private final static AtomicReference<RTSupplementaryData1> repoTypeRef = new AtomicReference<>();
	/**
	 * Unambiguous reference to the location where the supplementary data must be inserted in the message instance.
	In the case of XML, this is expressed by a valid XPath.
	 */
	public final MMMessageAttribute attrPlaceAndName = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax350Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTSupplementaryData1.repoType();
			super.xmlTag = "PlcAndNm";
			super.name = "PlaceAndName";
			super.definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance.\r\nIn the case of XML, this is expressed by a valid XPath.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Technical element wrapping the supplementary data.
	 */
	public final MMMessageAssociationEnd refEnvelope = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTSupplementaryDataEnvelope1.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTSupplementaryData1.repoType();
			super.xmlTag = "Envlp";
			super.name = "Envelope";
			super.definition = "Technical element wrapping the supplementary data.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTSupplementaryData1 repoType() {
		repoTypeRef.compareAndSet(null, new RTSupplementaryData1());
		return repoTypeRef.get();
	}

	private RTSupplementaryData1() {
		super.messageElement = Arrays.asList(attrPlaceAndName, refEnvelope);
		super.messageBuildingBlock_lazy = () -> Arrays
				.asList(RTMandateInitiationRequestV05.repoType().blockSupplementaryData);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "SupplementaryData1";
		super.definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
		super.constraint = Arrays.asList();
	} }