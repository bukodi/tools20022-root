package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class ElectronicAddress extends MMBusinessComponent {

	private final static ElectronicAddress INSTANCE = new ElectronicAddress();

	public static ElectronicAddress instance() {
		return INSTANCE;
	}
}