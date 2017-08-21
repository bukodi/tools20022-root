package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTFrequencyCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTFrequencyCode extends MMCodeSet {

	private final static AtomicReference<RTFrequencyCode> repoTypeRef = new AtomicReference<>();

	public static RTFrequencyCode repoType() {
		repoTypeRef.compareAndSet(null, new RTFrequencyCode());
		return repoTypeRef.get();
	}

	private RTFrequencyCode() {
		super.code = Arrays.asList(Annual.repoType(), Monthly.repoType(),
				Quarterly.repoType(), SemiAnnual.repoType(), Weekly.repoType(),
				Daily.repoType(), Adhoc.repoType(), IntraDay.repoType(),
				Overnight.repoType(), TenDays.repoType(),
				Fortnightly.repoType(), TriggeredByMovement.repoType(),
				Never.repoType(), Rate.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("YEAR");
		super.name = "FrequencyCode";
		super.definition = "Specifies the regularity of an event.";
	}

	static public class Annual extends MMCode {
		private final static AtomicReference<Annual> repoTypeRef = new AtomicReference<>();

		public static Annual repoType() {
			repoTypeRef.compareAndSet(null, new Annual());
			return repoTypeRef.get();
		}

		private Annual() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "YEAR";
			super.semanticMarkup = Arrays.asList();
			super.name = "Annual";
			super.definition = "Event takes place every year or once a year.";
		}
	}

	static public class Monthly extends MMCode {
		private final static AtomicReference<Monthly> repoTypeRef = new AtomicReference<>();

		public static Monthly repoType() {
			repoTypeRef.compareAndSet(null, new Monthly());
			return repoTypeRef.get();
		}

		private Monthly() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "MNTH";
			super.semanticMarkup = Arrays.asList();
			super.name = "Monthly";
			super.definition = "Event takes place every month or once a month.";
		}
	}

	static public class Quarterly extends MMCode {
		private final static AtomicReference<Quarterly> repoTypeRef = new AtomicReference<>();

		public static Quarterly repoType() {
			repoTypeRef.compareAndSet(null, new Quarterly());
			return repoTypeRef.get();
		}

		private Quarterly() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "QURT";
			super.semanticMarkup = Arrays.asList();
			super.name = "Quarterly";
			super.definition = "Event takes place every three months or four times a year.";
		}
	}

	static public class SemiAnnual extends MMCode {
		private final static AtomicReference<SemiAnnual> repoTypeRef = new AtomicReference<>();

		public static SemiAnnual repoType() {
			repoTypeRef.compareAndSet(null, new SemiAnnual());
			return repoTypeRef.get();
		}

		private SemiAnnual() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "MIAN";
			super.semanticMarkup = Arrays.asList();
			super.name = "SemiAnnual";
			super.definition = "Event takes place every six months or two times a year.";
		}
	}

	static public class Weekly extends MMCode {
		private final static AtomicReference<Weekly> repoTypeRef = new AtomicReference<>();

		public static Weekly repoType() {
			repoTypeRef.compareAndSet(null, new Weekly());
			return repoTypeRef.get();
		}

		private Weekly() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "WEEK";
			super.semanticMarkup = Arrays.asList();
			super.name = "Weekly";
			super.definition = "Event takes place once a week.";
		}
	}

	static public class Daily extends MMCode {
		private final static AtomicReference<Daily> repoTypeRef = new AtomicReference<>();

		public static Daily repoType() {
			repoTypeRef.compareAndSet(null, new Daily());
			return repoTypeRef.get();
		}

		private Daily() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "DAIL";
			super.semanticMarkup = Arrays.asList();
			super.name = "Daily";
			super.definition = "Event takes place every day.";
		}
	}

	static public class Adhoc extends MMCode {
		private final static AtomicReference<Adhoc> repoTypeRef = new AtomicReference<>();

		public static Adhoc repoType() {
			repoTypeRef.compareAndSet(null, new Adhoc());
			return repoTypeRef.get();
		}

		private Adhoc() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "ADHO";
			super.semanticMarkup = Arrays.asList();
			super.name = "Adhoc";
			super.definition = "Event takes place on request or as necessary.";
		}
	}

	static public class IntraDay extends MMCode {
		private final static AtomicReference<IntraDay> repoTypeRef = new AtomicReference<>();

		public static IntraDay repoType() {
			repoTypeRef.compareAndSet(null, new IntraDay());
			return repoTypeRef.get();
		}

		private IntraDay() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "INDA";
			super.semanticMarkup = Arrays.asList();
			super.name = "IntraDay";
			super.definition = "Event takes place several times a day.";
		}
	}

	static public class Overnight extends MMCode {
		private final static AtomicReference<Overnight> repoTypeRef = new AtomicReference<>();

		public static Overnight repoType() {
			repoTypeRef.compareAndSet(null, new Overnight());
			return repoTypeRef.get();
		}

		private Overnight() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "OVNG";
			super.name = "Overnight";
			super.definition = "Event takes place overnight.";
		}
	}

	static public class TenDays extends MMCode {
		private final static AtomicReference<TenDays> repoTypeRef = new AtomicReference<>();

		public static TenDays repoType() {
			repoTypeRef.compareAndSet(null, new TenDays());
			return repoTypeRef.get();
		}

		private TenDays() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "TEND";
			super.name = "TenDays";
			super.definition = "Event takes place every ten business days.";
		}
	}

	static public class Fortnightly extends MMCode {
		private final static AtomicReference<Fortnightly> repoTypeRef = new AtomicReference<>();

		public static Fortnightly repoType() {
			repoTypeRef.compareAndSet(null, new Fortnightly());
			return repoTypeRef.get();
		}

		private Fortnightly() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "FRTN";
			super.name = "Fortnightly";
			super.definition = "Event takes place every two weeks.";
		}
	}

	static public class TriggeredByMovement extends MMCode {
		private final static AtomicReference<TriggeredByMovement> repoTypeRef = new AtomicReference<>();

		public static TriggeredByMovement repoType() {
			repoTypeRef.compareAndSet(null, new TriggeredByMovement());
			return repoTypeRef.get();
		}

		private TriggeredByMovement() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "MOVE";
			super.name = "TriggeredByMovement";
			super.definition = "Event takes place at the end of the day if there was a movement on the account, otherwise nothing is sent that day. ";
		}
	}

	static public class Never extends MMCode {
		private final static AtomicReference<Never> repoTypeRef = new AtomicReference<>();

		public static Never repoType() {
			repoTypeRef.compareAndSet(null, new Never());
			return repoTypeRef.get();
		}

		private Never() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "NEVR";
			super.name = "Never";
			super.definition = "Event does never take place.";
		}
	}

	static public class Rate extends MMCode {
		private final static AtomicReference<Rate> repoTypeRef = new AtomicReference<>();

		public static Rate repoType() {
			repoTypeRef.compareAndSet(null, new Rate());
			return repoTypeRef.get();
		}

		private Rate() {
			super.owner_lazy = () -> RTFrequencyCode.repoType();
			super.codeName = "RATE";
			super.name = "Rate";
			super.definition = "Event takes place based on a change of a rate.";
		}
	}
}