package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.Scheme;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.PartyIdentificationInformation;
import com.tools20022.repository.dict.entity.AccountIdentification;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.GeneratedRepository;

public class GenericIdentification extends MMBusinessComponent {

	private final static AtomicReference<GenericIdentification> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> GenericIdentification.repoType();
			super.name = "Identification";
			super.definition = "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrIssueDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ISODate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> GenericIdentification.repoType();
			super.name = "IssueDate";
			super.definition = "Date at which the identification was issued.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrExpiryDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ISODate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> GenericIdentification.repoType();
			super.name = "ExpiryDate";
			super.definition = "Date at which the identification expires.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refScheme = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> Scheme.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> GenericIdentification.repoType();
			super.name = "Scheme";
			super.definition = "Information regarding an enumerated code list and its owner.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static GenericIdentification repoType() {
		repoTypeRef.compareAndSet(null, new GenericIdentification());
		return repoTypeRef.get();
	}

	private GenericIdentification() {
		super.element = Arrays.asList(attrIdentification, attrIssueDate,
				attrExpiryDate, refScheme);
		super.associationDomain_lazy = () -> Arrays
				.asList(PartyIdentificationInformation.repoType().refOtherIdentification,
						AccountIdentification.repoType().refProprietaryIdentification,
						Document.repoType().refDocumentIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "GenericIdentification";
		super.definition = "Information related to a non-standardised identification, such as a proprietary party identification or account identification.";
	}
}