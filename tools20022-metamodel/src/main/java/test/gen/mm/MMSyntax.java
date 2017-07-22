package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMEncoding;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageSet;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;

/**
 * a particular syntax for a MessageInstance
 */
public class MMSyntax implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private List<MMEncoding> possibleEncodings;
	private List<MMMessageSet> generatedFor;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	public static interface Members extends MMModelEntity.Members {
		/**
		 * the set of possible encodings for a given Syntax
		 */
		MetamodelAttribute<MMSyntax, List<MMEncoding>> possibleEncodings = newAttribute();
		/**
		 * the scheme in which a syntax is encoded
		 */
		MetamodelAttribute<MMSyntax, List<MMMessageSet>> generatedFor = newAttribute();
		/**
		 * the syntax that is valid for a MessageSet, based on the Encoding used
		 * generatedFor-&gt; asBag()=possibleEncodings.messageSet
		 */
		MetamodelConstraint<MMSyntax> checkGeneratedForDerivation = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
	}

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMSyntax> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMSyntax> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMSyntax.class);
	}

	/**
	 * the set of possible encodings for a given Syntax
	 * 
	 * @see MMEncoding#getSyntax()
	 */
	@Opposite(bean = MMEncoding.class, attribute = "syntax")
	public List<MMEncoding> getPossibleEncodings() {
		return possibleEncodings;
	}

	/**
	 * the scheme in which a syntax is encoded
	 * 
	 * @see MMMessageSet#getGeneratedSyntax()
	 */
	@Opposite(bean = MMMessageSet.class, attribute = "generatedSyntax")
	public List<MMMessageSet> getGeneratedFor() {
		return generatedFor;
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion;
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier;
	}
}