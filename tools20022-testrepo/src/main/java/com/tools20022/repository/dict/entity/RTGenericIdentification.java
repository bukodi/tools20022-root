package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.entity.RTGenericIdentification;
import com.tools20022.repository.dict.datatype.RTISODate;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTScheme;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.RTPartyIdentificationInformation;
import com.tools20022.repository.dict.entity.RTAccountIdentification;
import com.tools20022.repository.dict.entity.RTDocument;
import com.tools20022.repository.GeneratedRepository;/**
 * Information related to a non-standardised identification, such as a proprietary party identification or account identification.
 */
public class RTGenericIdentification extends MMBusinessComponent {

	private final static AtomicReference<RTGenericIdentification> repoTypeRef = new AtomicReference<>();
	/**
	 * Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers.
	 */
	public final MMBusinessAttribute attrIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTGenericIdentification
					.repoType();
			super.name = "Identification";
			super.definition = "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Date at which the identification was issued.
	 */
	public final MMBusinessAttribute attrIssueDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTGenericIdentification
					.repoType();
			super.name = "IssueDate";
			super.definition = "Date at which the identification was issued.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Date at which the identification expires.
	 */
	public final MMBusinessAttribute attrExpiryDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTGenericIdentification
					.repoType();
			super.name = "ExpiryDate";
			super.definition = "Date at which the identification expires.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Information regarding an enumerated code list and its owner.
	 */
	public final MMBusinessAssociationEnd refScheme = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTScheme.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTGenericIdentification
					.repoType();
			super.name = "Scheme";
			super.definition = "Information regarding an enumerated code list and its owner.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTGenericIdentification repoType() {
		repoTypeRef.compareAndSet(null, new RTGenericIdentification());
		return repoTypeRef.get();
	}

	private RTGenericIdentification() {
		super.element = Arrays.asList(attrIdentification, attrIssueDate,
				attrExpiryDate, refScheme);
		super.associationDomain_lazy = () -> Arrays
				.asList(RTPartyIdentificationInformation.repoType().refOtherIdentification,
						RTAccountIdentification.repoType().refProprietaryIdentification,
						RTDocument.repoType().refDocumentIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "GenericIdentification";
		super.definition = "Information related to a non-standardised identification, such as a proprietary party identification or account identification.";
	} }