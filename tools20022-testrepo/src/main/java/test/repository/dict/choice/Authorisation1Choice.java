package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;

public class Authorisation1Choice extends MMChoiceComponent {

	private final static Authorisation1Choice INSTANCE = new Authorisation1Choice();

	public static Authorisation1Choice instance() {
		return INSTANCE;
	}
}