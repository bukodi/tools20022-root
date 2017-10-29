package com.tools20022.core.metamodel;

import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class creates a labeled button. The application can cause
 * some action to happen when the button is pushed. This image
 * depicts three views of a "<code>Quit</code>" button as it appears
 * under the Solaris operating system:
 * 
 * <hr>
 * <embed name="E"  src="doc-files/Metamodel2.svg">
 * <hr>
 * <img alt="Class diagram" src="doc-files/Metamodel.svg">
 * <hr>
 * 
 * @author bukodi
 *
 */
public interface Metamodel {

	Stream<? extends MetamodelType<? extends GeneratedMetamodelBean>> listTypes();
	
	default Set<? extends MetamodelType<? extends GeneratedMetamodelBean>> getAllTypes() {
		return listTypes().collect(Collectors.toCollection(LinkedHashSet::new));
	}

	MetamodelType<? extends GeneratedMetamodelBean> getTypeByName( String name );

	<B extends GeneratedMetamodelBean> MetamodelType<B> getTypeByClass( Class<B> beanClass );
	
	<B extends GeneratedMetamodelBean> Class<B> getClassByType(MetamodelType<B> mmType);
	
	Stream<? extends MetamodelEnum<?>> listEnums();

	default Set<? extends MetamodelEnum<?>> getAllEnums() {
		return listEnums().collect(Collectors.toCollection(LinkedHashSet::new));
	}

	MetamodelEnum<?> getEnumByName( String name );
	
	<E extends Enum<?>> MetamodelEnum<E> getEnumByClass( Class<E> enumClass );

	public interface MetamodelElement {		
		String getName();
		MetamodelDocImpl getDocumentation();
	}

	public interface MetamodelType<B extends GeneratedMetamodelBean> extends MetamodelElement {
		boolean isAbstract();
		Class<B> getBeanClass();
		B newInstance();

		Stream<? extends MetamodelType<? super B>> listSuperTypes( boolean includeThis, boolean recursive );
		Stream<? extends MetamodelType<? extends B>> listSubTypes( boolean includeThis, boolean recursive );
		Stream<? extends MetamodelAttribute<B,?>> listDeclaredAttributes();
		Set<? extends MetamodelAttribute<?,?>> getIncomingAttributes();
		Stream<? extends MetamodelConstraint<B>> listDeclaredConstraints();
		
		default Stream<? extends MetamodelAttribute<? super B,?>> listAllAttributes() {
			return listSuperTypes(true, true).flatMap(mmType->mmType.listDeclaredAttributes() );
		}

		default Stream<? extends MetamodelConstraint<? super B>> listAllConstraints() {
			return listSuperTypes( true, true ).flatMap(mmType->mmType.listDeclaredConstraints());
		}

		default Set<? extends MetamodelType<? super B>> getSuperTypes( boolean includeThis, boolean recursive ) {
			return listSuperTypes( includeThis, recursive ).collect(Collectors.toCollection(LinkedHashSet::new));
		}

		default Set<? extends MetamodelType<? extends B>> getSubTypes(  boolean includeThis, boolean recursive  ) {
			return listSubTypes(includeThis, recursive ).collect(Collectors.toCollection(LinkedHashSet::new));
		}		

		default Set<? extends MetamodelAttribute<B,?>> getDeclaredAttributes() {
			return listDeclaredAttributes().collect(Collectors.toCollection(LinkedHashSet::new));
		}

		default Set<? extends MetamodelAttribute<? super B,?>> getAllAttributes() {
			return listAllAttributes().collect(Collectors.toCollection(LinkedHashSet::new));
		}

		default Set<? extends MetamodelConstraint<B>> getDeclaredConstraints() {
			return listDeclaredConstraints().collect(Collectors.toCollection(LinkedHashSet::new));
		}

		default Set<? extends MetamodelConstraint<? super B>> getAllConstraints() {
			return listAllConstraints().collect(Collectors.toCollection(LinkedHashSet::new));
		}
		
		default Set<MetamodelType<?>> getPossibleContainers() {
			Stream<? extends MetamodelAttribute<?,?>> containmentAttrs = getIncomingAttributes().stream().filter(mmAttr->mmAttr.isContainment());
			return containmentAttrs.map(mmAttr->mmAttr.getDeclaringType()).collect(Collectors.toCollection(LinkedHashSet::new));
		}

	}

	public interface MetamodelAttribute<B extends GeneratedMetamodelBean,T> extends MetamodelElement {
		MetamodelType<B> getDeclaringType();
		boolean isDerived();
		boolean isOptional();
		boolean isMultiple();
		boolean isUnique();
		boolean isContainer();
		boolean isContainment();
		MetamodelAttribute<?,? extends B> getOpposite();

		Class<?> getValueJavaClass();
		MetamodelType<?> getReferencedType();
		MetamodelEnum<?> getEnumType();

		Object get(GeneratedMetamodelBean repoObj);
		void set(GeneratedMetamodelBean repoObj,Object value);
		Method getGetterMethod();
	}

	public interface MetamodelConstraint<B extends GeneratedMetamodelBean> extends MetamodelElement {
		MetamodelType<B> getDeclaringType();
		Consumer<B> checker();
	}

	public interface MetamodelEnum<E extends Enum<?>> extends MetamodelElement {
		Class<E> getEnumJavaClass();
		MetamodelEnumLiteral<E> getEnumLiteral( String name );
		Stream<? extends MetamodelEnumLiteral<E>> listEnumLiterals();				
	}

	public interface MetamodelEnumLiteral<E extends Enum<?>> extends MetamodelElement {
		E getValue();
	}

}
