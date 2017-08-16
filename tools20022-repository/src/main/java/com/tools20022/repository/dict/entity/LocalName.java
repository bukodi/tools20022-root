package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.SecuritiesIdentification;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.LanguageCode;

/**
 * Name of the security.
 */
public class LocalName extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max350Text FullName;
	private SecuritiesIdentification RelatedSecurity;
	private Max35Text ShortName;
	private LanguageCode Language;

	public Max350Text getFullName() {
		return FullName;
	}

	public void setFullName(Max350Text FullName) {
		this.FullName = FullName;
	}

	public SecuritiesIdentification getRelatedSecurity() {
		return RelatedSecurity;
	}

	public void setRelatedSecurity(SecuritiesIdentification RelatedSecurity) {
		this.RelatedSecurity = RelatedSecurity;
	}

	public Max35Text getShortName() {
		return ShortName;
	}

	public void setShortName(Max35Text ShortName) {
		this.ShortName = ShortName;
	}

	public LanguageCode getLanguage() {
		return Language;
	}

	public void setLanguage(LanguageCode Language) {
		this.Language = Language;
	}
}