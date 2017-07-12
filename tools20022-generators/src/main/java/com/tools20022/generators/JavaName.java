package com.tools20022.generators;

public class JavaName {

	private final String pkg;
	private final String cuName;
	private final String nestedTypeName;
	private final String memberName;

	private JavaName(String pkg, String cuName, String nestedTypeName, String memberName) {
		if (pkg == null)
			throw new IllegalArgumentException("pkg == null");
		if (cuName == null)
			throw new IllegalArgumentException("cuName == null");

		this.pkg = pkg;
		this.cuName = cuName;
		this.nestedTypeName = nestedTypeName;
		this.memberName = memberName;
	}

	public static JavaName primaryType(String pkg, String cuName) {
		return new JavaName(pkg, cuName, null, null);
	}

	public static JavaName nestedType(String pkg, String cuName, String nestedTypeName) {
		return new JavaName(pkg, cuName, nestedTypeName, null);
	}

	public static JavaName nestedType(JavaName primaryType, String nestedTypeName) {
		if (primaryType.getNestedTypeName() != null || primaryType.getMemberName() != null)
			throw new IllegalArgumentException("Only primary type can declare nested type");
		return new JavaName(primaryType.getPackage(), primaryType.getCompilationUnit(), nestedTypeName, null);
	}

	public static JavaName member(JavaName declaringType, String memberName) {
		if (declaringType.getMemberName() != null )
			throw new IllegalArgumentException("Only types can declare method");
		return new JavaName(declaringType.getPackage(), declaringType.getCompilationUnit(),
				declaringType.getNestedTypeName(), memberName);
	}

	public String getPackage() {
		return pkg;
	}

	public String getCompilationUnit() {
		return cuName;
	}

	public String getNestedTypeName() {
		return nestedTypeName;
	}

	public String getMemberName() {
		return memberName;
	}

	@Override
	public String toString() {
		return "JavaName [pkg=" + pkg + ", cuName=" + cuName + ", nestedTypeName=" + nestedTypeName + ", memberName="
				+ memberName+ "]";
	}

	public String getSimpleName() {
		if (memberName != null)
			return memberName;
		if (nestedTypeName != null)
			return nestedTypeName;
		return cuName;
	}

	public String getFullName() {
		String fqn = pkg + "." + cuName;
		fqn += nestedTypeName != null ? "." + nestedTypeName : "";
		fqn += memberName != null ? "." + memberName : "";
		return fqn;
	}

}
