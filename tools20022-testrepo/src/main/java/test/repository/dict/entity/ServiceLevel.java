package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class ServiceLevel extends MMBusinessComponent {

	private final static ServiceLevel INSTANCE = new ServiceLevel();

	public static ServiceLevel instance() {
		return INSTANCE;
	}
}