package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;

public class AuthenticationChannel1Choice extends MMChoiceComponent {

	private final static AuthenticationChannel1Choice INSTANCE = new AuthenticationChannel1Choice();

	public static AuthenticationChannel1Choice instance() {
		return INSTANCE;
	}
}