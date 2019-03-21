package com.tools20022.repogenerator.resulttypes;

import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import com.tools20022.generators.RoasterHelper;
import com.tools20022.metamodel.MMModelEntity;

public abstract class MemberResult extends TypeResult {

	public final MainTypeResult containerGen;
	public FieldSource<JavaClassSource> staticFieldSrc;

	public MemberResult(MainTypeResult containerGen, MMModelEntity mmBean) {
		super(containerGen.ctx, mmBean);
		this.containerGen = containerGen;
	}

	@Override
	public void createJavaDoc() {
		if (ctx.isSkipDocGeneration())
			return;
		String docTxt = "An instance of " + mmBean.getMetamodel().getName() + ".";
		// Replace <, >, & chars
		docTxt = RoasterHelper.escapeJavaDoc(docTxt);
		docTxt = docTxt.replaceAll("Scope<br>", "<b>Scope</b><br>");
		docTxt = docTxt.replaceAll("Usage<br>", "<b>Usage</b><br>");
		staticFieldSrc.getJavaDoc().setText(docTxt);
	}

}
