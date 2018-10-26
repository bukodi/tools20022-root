package com.tools20022.mmgenerator;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.core.metamodel.ISODoc;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelAttribute;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelConstraint;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelEnum;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelEnumLiteral;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelType;

public class InspectECoreMetamodel {

	private static EPackage metamodelPkg;

	@BeforeClass
	public static void loadECore() {
		metamodelPkg = ECoreIOHelper.loadECorePackage("/model/ISO20022.ecore");
	}

	@Test
	public void listAttrsWithDeafultValues() throws Exception {
		List<EClass> eClasses = metamodelPkg.getEClassifiers().stream().filter(ec -> ec instanceof EClass).map(ec->(EClass)ec).collect(Collectors.toList());
		for( EClass eClass : eClasses ) {
			for(EStructuralFeature eSF : eClass.getEStructuralFeatures() ) {
				Object defValue = eSF.getDefaultValue();
				if( defValue != null ) {
					System.out.println( eClass.getName() + "." + eSF.getName() + " = [" + defValue.getClass().getSimpleName() + "]" + defValue );
				}
			}
		}
	}
	
	@Test
	@Ignore
	public void testLoadMetamodelFromECore() throws Exception {

		RawMetamodel mm = new ECoreBackedMetamodel(metamodelPkg);

		System.out.println("--- Classes ---");
		for (MetamodelType mc : mm.listTypes().collect(Collectors.toList())) {
			System.out.println(mc.getName());
			for (MetamodelAttribute dm : mc.listDeclaredAttributes().collect(Collectors.toList())) {
				if (dm instanceof MetamodelAttribute) {
					MetamodelAttribute mAttr = (MetamodelAttribute) dm;
					String type = (mAttr.getValueJavaClass() == null ? mAttr.getEnumType().getName()
							: mAttr.getValueJavaClass().getTypeName());
					if (mAttr.isOptional())
						type = "Optional<" + type + ">";

					System.out.println("  - Attr  :" + type + " " + dm.getName());
				} else if (dm instanceof MetamodelConstraint) {
					System.out.println("  - Constr:" + dm.getName() + " (" + dm.getClass().getSimpleName() + ")");
				} else {
					throw new RuntimeException(dm.toString());
				}
			}
		}
		System.out.println("--- Enums ---");
		for (MetamodelEnum mc : mm.listEnums().collect(Collectors.toList())) {
			System.out.println("enum " + mc.getName());
			for (MetamodelEnumLiteral mel : mc.listEnumLiterals().collect(Collectors.toList())) {
				System.out.println("  -" + mel.getName());
			}
		}
	}

	@Test
	@Ignore
	public void dumpEClassifiers() {
		for (EObject e : metamodelPkg.eContents()) {
			System.out.println(e.getClass() + " : " + e.toString());
		}
	}

	@Test
	// @Ignore
	public void dumpEOperations() {
		for (EObject e : (Iterable<EObject>) () -> metamodelPkg.eAllContents()) {
			if (e instanceof EOperation) {
				EOperation eop = (EOperation) e;
				System.out.print(eop.getEContainingClass().isAbstract() ? "abstract " : "         ");
				System.out.print(
						eop.getEType().getName() + " " + eop.getEContainingClass().getName() + "." + eop.getName());
				System.out.print("(");
				eop.getEParameters().forEach(p -> {
					System.out.print(p.getName() + " ");
				});
				System.out.println(")");

				Assert.assertEquals(EcorePackage.eINSTANCE.getEBoolean(), eop.getEType());
				Assert.assertEquals(2, eop.getEParameters().size());
				Assert.assertEquals("context", eop.getEParameters().get(0).getName());
				Assert.assertEquals("diagnostics", eop.getEParameters().get(1).getName());

			}
		}
	}

	@Test
	@Ignore
	public void dumpEAttributes() {
		for (EObject e : (Iterable<EObject>) () -> metamodelPkg.eAllContents()) {
			if (e instanceof EAttribute) {
				EAttribute eattr = (EAttribute) e;
				System.out.print(eattr.getLowerBound() + ".." + eattr.getUpperBound() + "  ");
				System.out.print(eattr.getEType().getName() + " " + eattr.getEContainingClass().getName() + "."
						+ eattr.getName());
				System.out.println("");

				// Assert.assertEquals(EcorePackage.eINSTANCE.getEBoolean(), eattr.getEType());
				// Assert.assertEquals(2, eattr.getEParameters().size());
				// Assert.assertEquals("context", eattr.getEParameters().get(0).getName());
				// Assert.assertEquals("diagnostics", eattr.getEParameters().get(1).getName());

			}
		}
	}

	@Test
	// @Ignore
	public void dumpDerivedEAttributes() {
		for (EObject e : (Iterable<EObject>) () -> metamodelPkg.eAllContents()) {
			if (!(e instanceof EStructuralFeature))
				continue;
			EStructuralFeature eSF = (EStructuralFeature) e;
			if (!eSF.isDerived())
				continue;

			System.out.println(eSF.getEContainingClass().getName() + "." + eSF.getName());
		}
	}

	@Test
	public void countOptionalFeatures() {
		int optional = 0, required = 0, multiple = 0;
		for (EObject e : (Iterable<EObject>) () -> metamodelPkg.eAllContents()) {
			if (e instanceof EStructuralFeature) {
				EStructuralFeature eattr = (EStructuralFeature) e;
				if (eattr.getUpperBound() == 1) {
					if (eattr.getLowerBound() == 0) {
						optional++;
					} else {
						required++;
					}
				} else {
					multiple++;
				}
			}
		}
		System.out.println("optional: " + optional + ", required: " + required + ", multiple: " + multiple);
	}

	@Test
	// @Ignore
	public void dumpEReferences() {
		Set<EReference> processedRefs = new HashSet<>();
		for (EObject e : (Iterable<EObject>) () -> metamodelPkg.eAllContents()) {
			if (e instanceof EReference) {
				if (!((EReference) e).isDerived())
					continue;
				EReference eRef = (EReference) e;
				if (processedRefs.contains(eRef))
					continue;
				System.out.print(eRef.isContainment() ? "C" : eRef.isContainer() ? "c" : "r");
				System.out.print(" " + eRef.getLowerBound() + ".." + eRef.getUpperBound());
				// if( )
				System.out.print(eRef.getEContainingClass().getName() + "." + eRef.getName());
				if (eRef.getEOpposite() == null) {
					System.out.print(" ---> " + eRef.getEType().getName());
				} else {
					System.out.print(" <--> " + eRef.getEType().getName() + "." + eRef.getEOpposite().getName());
					System.out.print(" " + eRef.getEOpposite().getLowerBound() + ".."
							+ eRef.getEOpposite().getUpperBound() + "  ");
					processedRefs.add(eRef.getEOpposite());
				}
				System.out.println("");

				// Assert.assertEquals(EcorePackage.eINSTANCE.getEBoolean(), eattr.getEType());
				// Assert.assertEquals(2, eattr.getEParameters().size());
				// Assert.assertEquals("context", eattr.getEParameters().get(0).getName());
				// Assert.assertEquals("diagnostics", eattr.getEParameters().get(1).getName());

			}
		}
	}

	@Test
	@Ignore
	public void dumpAnnotations() {
		dumpAnnotations(metamodelPkg);
	}

	private void dumpAnnotations(EObject eObj) {
		if (eObj instanceof EModelElement && !(eObj instanceof EPackage)) {
			EList<EAnnotation> annots = ((EModelElement) eObj).getEAnnotations();
			for (EAnnotation a : annots) {
				Assert.assertTrue(a.getReferences().isEmpty());
				Assert.assertTrue(a.getEAnnotations().isEmpty());
				if (a.getSource().equals("http://www.eclipse.org/emf/2002/GenModel")) {
					Assert.assertTrue(a.getDetails().size() == 1);
					String doc = a.getDetails().get("documentation");
					Assert.assertNotNull(doc);
					// System.out.println(" doc: " + doc );
				} else if (a.getSource().equals("urn:iso:std:iso:20022:2013:ecore:extension")) {
					ISODoc.Basis basis = ISODoc.Basis.valueOf(a.getDetails().get("basis"));
					String desc = a.getDetails().get("description");
					Assert.assertTrue(a.getDetails().size() <= 2);
					System.out.println(basis + " : " + desc);
				} else {
					Assert.fail("Unsupported annot:" + a);
				}
			}
		}
		eObj.eContents().forEach(eeObj -> {
			dumpAnnotations(eeObj);
		});
	}


}
