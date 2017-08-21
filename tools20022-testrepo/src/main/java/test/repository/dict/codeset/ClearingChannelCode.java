package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.ClearingChannelCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class ClearingChannelCode extends MMCodeSet {

	private final static AtomicReference<ClearingChannelCode> repoTypeRef = new AtomicReference<>();

	public static ClearingChannelCode repoType() {
		repoTypeRef.compareAndSet(null, new ClearingChannelCode());
		return repoTypeRef.get();
	}

	private ClearingChannelCode() {
		super.code = Arrays.asList(RealTimeGrossSettlementSystem.repoType(),
				RealTimeNetSettlementSystem.repoType(),
				MassPaymentNetSystem.repoType(), BookTransfer.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("RTGS");
		super.name = "ClearingChannelCode";
		super.definition = "Specifies the clearing channel for the routing of the transaction, as part of the payment type identification.";
	}

	static public class RealTimeGrossSettlementSystem extends MMCode {
		private final static AtomicReference<RealTimeGrossSettlementSystem> repoTypeRef = new AtomicReference<>();

		public static RealTimeGrossSettlementSystem repoType() {
			repoTypeRef
					.compareAndSet(null, new RealTimeGrossSettlementSystem());
			return repoTypeRef.get();
		}

		private RealTimeGrossSettlementSystem() {
			super.owner_lazy = () -> ClearingChannelCode.repoType();
			super.codeName = "RTGS";
			super.name = "RealTimeGrossSettlementSystem";
			super.definition = "Clearing channel is a real-time gross settlement system.";
		}
	}

	static public class RealTimeNetSettlementSystem extends MMCode {
		private final static AtomicReference<RealTimeNetSettlementSystem> repoTypeRef = new AtomicReference<>();

		public static RealTimeNetSettlementSystem repoType() {
			repoTypeRef.compareAndSet(null, new RealTimeNetSettlementSystem());
			return repoTypeRef.get();
		}

		private RealTimeNetSettlementSystem() {
			super.owner_lazy = () -> ClearingChannelCode.repoType();
			super.codeName = "RTNS";
			super.name = "RealTimeNetSettlementSystem";
			super.definition = "Clearing channel is a real-time net settlement system.";
		}
	}

	static public class MassPaymentNetSystem extends MMCode {
		private final static AtomicReference<MassPaymentNetSystem> repoTypeRef = new AtomicReference<>();

		public static MassPaymentNetSystem repoType() {
			repoTypeRef.compareAndSet(null, new MassPaymentNetSystem());
			return repoTypeRef.get();
		}

		private MassPaymentNetSystem() {
			super.owner_lazy = () -> ClearingChannelCode.repoType();
			super.codeName = "MPNS";
			super.name = "MassPaymentNetSystem";
			super.definition = "Clearing channel is a mass payment net settlement system.";
		}
	}

	static public class BookTransfer extends MMCode {
		private final static AtomicReference<BookTransfer> repoTypeRef = new AtomicReference<>();

		public static BookTransfer repoType() {
			repoTypeRef.compareAndSet(null, new BookTransfer());
			return repoTypeRef.get();
		}

		private BookTransfer() {
			super.owner_lazy = () -> ClearingChannelCode.repoType();
			super.codeName = "BOOK";
			super.name = "BookTransfer";
			super.definition = "Payment through internal book transfer.";
		}
	}
}