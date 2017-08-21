package test.repository.dict.datatype;

import com.tools20022.metamodel.MMDateTime;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class RTISODateTime extends MMDateTime {

	private final static AtomicReference<RTISODateTime> repoTypeRef = new AtomicReference<>();

	public static RTISODateTime repoType() {
		repoTypeRef.compareAndSet(null, new RTISODateTime());
		return repoTypeRef.get();
	}

	private RTISODateTime() {
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ISODateTime";
		super.definition = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.\nNote on the time format:\n1) beginning / end of calendar day\n00:00:00 = the beginning of a calendar day\n24:00:00 = the end of a calendar day\n2) fractions of second in time format\nDecimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.";
	}
}