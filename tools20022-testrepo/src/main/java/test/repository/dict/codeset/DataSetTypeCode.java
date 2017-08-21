package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.DataSetTypeCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class DataSetTypeCode extends MMCodeSet {

	private final static AtomicReference<DataSetTypeCode> repoTypeRef = new AtomicReference<>();

	public static DataSetTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new DataSetTypeCode());
		return repoTypeRef.get();
	}

	private DataSetTypeCode() {
		super.code = Arrays.asList(Baseline.repoType(),
				TransportDataSet.repoType(), CommercialDataSet.repoType(),
				InsuranceDataSet.repoType(), CertificateDataSet.repoType(),
				OtherCertificateDataSet.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("BASE");
		super.name = "DataSetTypeCode";
		super.definition = "Specifies the type of data set that is matched.";
	}

	static public class Baseline extends MMCode {
		private final static AtomicReference<Baseline> repoTypeRef = new AtomicReference<>();

		public static Baseline repoType() {
			repoTypeRef.compareAndSet(null, new Baseline());
			return repoTypeRef.get();
		}

		private Baseline() {
			super.owner_lazy = () -> DataSetTypeCode.repoType();
			super.codeName = "BASE";
			super.name = "Baseline";
			super.definition = "Data set is a baseline.";
		}
	}

	static public class TransportDataSet extends MMCode {
		private final static AtomicReference<TransportDataSet> repoTypeRef = new AtomicReference<>();

		public static TransportDataSet repoType() {
			repoTypeRef.compareAndSet(null, new TransportDataSet());
			return repoTypeRef.get();
		}

		private TransportDataSet() {
			super.owner_lazy = () -> DataSetTypeCode.repoType();
			super.codeName = "TRDS";
			super.name = "TransportDataSet";
			super.definition = "Data set is a transport data set.";
		}
	}

	static public class CommercialDataSet extends MMCode {
		private final static AtomicReference<CommercialDataSet> repoTypeRef = new AtomicReference<>();

		public static CommercialDataSet repoType() {
			repoTypeRef.compareAndSet(null, new CommercialDataSet());
			return repoTypeRef.get();
		}

		private CommercialDataSet() {
			super.owner_lazy = () -> DataSetTypeCode.repoType();
			super.codeName = "CODS";
			super.name = "CommercialDataSet";
			super.definition = "Data set is a commercial data set.";
		}
	}

	static public class InsuranceDataSet extends MMCode {
		private final static AtomicReference<InsuranceDataSet> repoTypeRef = new AtomicReference<>();

		public static InsuranceDataSet repoType() {
			repoTypeRef.compareAndSet(null, new InsuranceDataSet());
			return repoTypeRef.get();
		}

		private InsuranceDataSet() {
			super.owner_lazy = () -> DataSetTypeCode.repoType();
			super.codeName = "INDS";
			super.name = "InsuranceDataSet";
			super.definition = "Data set is an insurance data set.";
		}
	}

	static public class CertificateDataSet extends MMCode {
		private final static AtomicReference<CertificateDataSet> repoTypeRef = new AtomicReference<>();

		public static CertificateDataSet repoType() {
			repoTypeRef.compareAndSet(null, new CertificateDataSet());
			return repoTypeRef.get();
		}

		private CertificateDataSet() {
			super.owner_lazy = () -> DataSetTypeCode.repoType();
			super.codeName = "CEDS";
			super.name = "CertificateDataSet";
			super.definition = "Data set is a certificate data set.";
		}
	}

	static public class OtherCertificateDataSet extends MMCode {
		private final static AtomicReference<OtherCertificateDataSet> repoTypeRef = new AtomicReference<>();

		public static OtherCertificateDataSet repoType() {
			repoTypeRef.compareAndSet(null, new OtherCertificateDataSet());
			return repoTypeRef.get();
		}

		private OtherCertificateDataSet() {
			super.owner_lazy = () -> DataSetTypeCode.repoType();
			super.codeName = "OCDS";
			super.name = "OtherCertificateDataSet";
			super.definition = "Data set is an other special certificate data set.";
		}
	}
}