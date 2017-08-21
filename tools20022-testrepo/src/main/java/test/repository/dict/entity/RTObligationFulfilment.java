package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTISODate;
import test.repository.dict.entity.RTObligationFulfilment;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTObligationFulfilment extends MMBusinessComponent {

	private final static AtomicReference<RTObligationFulfilment> repoTypeRef = new AtomicReference<>();

	public static RTObligationFulfilment repoType() {
		repoTypeRef.compareAndSet(null, new RTObligationFulfilment());
		return repoTypeRef.get();
	}

	private RTObligationFulfilment() {
		super.element = Arrays.asList(Date.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ObligationFulfilment";
		super.definition = "Processes by which an obligation is extinguished fully or partially.";
	}

	static public class Date extends MMBusinessAttribute {
		private final static AtomicReference<Date> repoTypeRef = new AtomicReference<>();

		public static Date repoType() {
			repoTypeRef.compareAndSet(null, new Date());
			return repoTypeRef.get();
		}

		private Date() {
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.elementContext_lazy = () -> RTObligationFulfilment.repoType();
			super.isDerived = false;
			super.name = "Date";
			super.definition = "Date and time on which assets become available.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}