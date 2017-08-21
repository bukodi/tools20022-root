package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTISODateTime;
import test.repository.dict.entity.RTDateTimePeriod;
import test.repository.dict.datatype.RTNumber;
import java.util.Arrays;
import test.repository.dict.entity.RTAgreement.ValidityPeriod;
import test.repository.GeneratedRepository.DataDictionary;

public class RTDateTimePeriod extends MMBusinessComponent {

	private final static AtomicReference<RTDateTimePeriod> repoTypeRef = new AtomicReference<>();

	public static RTDateTimePeriod repoType() {
		repoTypeRef.compareAndSet(null, new RTDateTimePeriod());
		return repoTypeRef.get();
	}

	private RTDateTimePeriod() {
		super.element = Arrays.asList(FromDateTime.repoType(),
				ToDateTime.repoType(), NumberOfDays.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(ValidityPeriod
				.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "DateTimePeriod";
		super.definition = "Time span defined by a start date and time, and an end date and time.";
	}

	static public class FromDateTime extends MMBusinessAttribute {
		private final static AtomicReference<FromDateTime> repoTypeRef = new AtomicReference<>();

		public static FromDateTime repoType() {
			repoTypeRef.compareAndSet(null, new FromDateTime());
			return repoTypeRef.get();
		}

		private FromDateTime() {
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.elementContext_lazy = () -> RTDateTimePeriod.repoType();
			super.isDerived = false;
			super.name = "FromDateTime";
			super.definition = "Date and time at which the range starts.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class ToDateTime extends MMBusinessAttribute {
		private final static AtomicReference<ToDateTime> repoTypeRef = new AtomicReference<>();

		public static ToDateTime repoType() {
			repoTypeRef.compareAndSet(null, new ToDateTime());
			return repoTypeRef.get();
		}

		private ToDateTime() {
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.elementContext_lazy = () -> RTDateTimePeriod.repoType();
			super.isDerived = false;
			super.name = "ToDateTime";
			super.definition = "Date and time at which the range ends.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class NumberOfDays extends MMBusinessAttribute {
		private final static AtomicReference<NumberOfDays> repoTypeRef = new AtomicReference<>();

		public static NumberOfDays repoType() {
			repoTypeRef.compareAndSet(null, new NumberOfDays());
			return repoTypeRef.get();
		}

		private NumberOfDays() {
			super.simpleType_lazy = () -> RTNumber.repoType();
			super.elementContext_lazy = () -> RTDateTimePeriod.repoType();
			super.isDerived = false;
			super.name = "NumberOfDays";
			super.definition = "Period specified as a number of days.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}