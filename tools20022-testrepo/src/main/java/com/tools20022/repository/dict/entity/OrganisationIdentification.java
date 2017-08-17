package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.BICFIIdentifier;
import com.tools20022.repository.dict.datatype.AnyBICIdentifier;
import com.tools20022.repository.dict.entity.CashClearingSystemMember;
import com.tools20022.repository.dict.datatype.BICNonFIIdentifier;
import com.tools20022.repository.dict.datatype.EANGLNIdentifier;
import com.tools20022.repository.dict.datatype.CHIPSUniversalIdentifier;
import com.tools20022.repository.dict.datatype.DunsIdentifier;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.MICIdentifier;

/**
 * Unique and unambiguous way to identify an organisation.
 */
public class OrganisationIdentification extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private BICFIIdentifier BICFI;
	private AnyBICIdentifier AnyBIC;
	private CashClearingSystemMember ClearingSystemMemberIdentificationType;
	private BICNonFIIdentifier BICNonFI;
	private EANGLNIdentifier EANGLN;
	private CHIPSUniversalIdentifier CHIPSUniversalIdentifier;
	private DunsIdentifier DUNS;
	private Max35Text BankPartyIdentification;
	private MICIdentifier MIC;

	public BICFIIdentifier getBICFI() {
		return BICFI;
	}

	public void setBICFI(BICFIIdentifier BICFI) {
		this.BICFI = BICFI;
	}

	public AnyBICIdentifier getAnyBIC() {
		return AnyBIC;
	}

	public void setAnyBIC(AnyBICIdentifier AnyBIC) {
		this.AnyBIC = AnyBIC;
	}

	public CashClearingSystemMember getClearingSystemMemberIdentificationType() {
		return ClearingSystemMemberIdentificationType;
	}

	public void setClearingSystemMemberIdentificationType(
			CashClearingSystemMember ClearingSystemMemberIdentificationType) {
		this.ClearingSystemMemberIdentificationType = ClearingSystemMemberIdentificationType;
	}

	public BICNonFIIdentifier getBICNonFI() {
		return BICNonFI;
	}

	public void setBICNonFI(BICNonFIIdentifier BICNonFI) {
		this.BICNonFI = BICNonFI;
	}

	public EANGLNIdentifier getEANGLN() {
		return EANGLN;
	}

	public void setEANGLN(EANGLNIdentifier EANGLN) {
		this.EANGLN = EANGLN;
	}

	public CHIPSUniversalIdentifier getCHIPSUniversalIdentifier() {
		return CHIPSUniversalIdentifier;
	}

	public void setCHIPSUniversalIdentifier(
			CHIPSUniversalIdentifier CHIPSUniversalIdentifier) {
		this.CHIPSUniversalIdentifier = CHIPSUniversalIdentifier;
	}

	public DunsIdentifier getDUNS() {
		return DUNS;
	}

	public void setDUNS(DunsIdentifier DUNS) {
		this.DUNS = DUNS;
	}

	public Max35Text getBankPartyIdentification() {
		return BankPartyIdentification;
	}

	public void setBankPartyIdentification(Max35Text BankPartyIdentification) {
		this.BankPartyIdentification = BankPartyIdentification;
	}

	public MICIdentifier getMIC() {
		return MIC;
	}

	public void setMIC(MICIdentifier MIC) {
		this.MIC = MIC;
	}
}