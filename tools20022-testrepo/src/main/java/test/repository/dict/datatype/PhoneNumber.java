package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class PhoneNumber extends MMText {

	private final static AtomicReference<PhoneNumber> repoTypeRef = new AtomicReference<>();

	public static PhoneNumber repoType() {
		repoTypeRef.compareAndSet(null, new PhoneNumber());
		return repoTypeRef.get();
	}

	private PhoneNumber() {
		super.pattern = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PhoneNumber";
		super.definition = "The collection of information which identifies a specific phone or FAX number as defined by telecom services.\nIt consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).";
	}
}