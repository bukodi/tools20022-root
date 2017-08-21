package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.PartyTypeCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class PartyTypeCode extends MMCodeSet {

	private final static AtomicReference<PartyTypeCode> repoTypeRef = new AtomicReference<>();

	public static PartyTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new PartyTypeCode());
		return repoTypeRef.get();
	}

	private PartyTypeCode() {
		super.code = Arrays.asList(SaleSystem.repoType(),
				POIComponent.repoType(), Issuer.repoType(), Holder.repoType(),
				Investor.repoType(), ExecutingFirm.repoType(),
				BrokerOfCredit.repoType(),
				CorrespondentClearingFirm.repoType(), ContraFirm.repoType(),
				ContraClearingFirm.repoType(), UnderlyingContraFirm.repoType(),
				GiveUpClearingFirm.repoType(), OrderOriginationFirm.repoType(),
				SponsoringFirm.repoType(), Clearingfirm.repoType(),
				IntroducingFirm.repoType(), EnteringFirm.repoType(),
				Client.repoType(), StepInBroker.repoType(),
				AffirmingParty.repoType(), ETCServiceProvider1.repoType(),
				ETCServiceProvider2.repoType(), RequestedBroker.repoType(),
				TaxAuthority.repoType(), DelegateIssuer.repoType(),
				OriginatingPOI.repoType(), CardIssuer.repoType(),
				Acceptor.repoType(), Merchant.repoType(), Acquirer.repoType(),
				IntermediaryAgent.repoType(), MasterTerminalManager.repoType(),
				TerminalManager.repoType(), AcquirerProcessor.repoType(),
				CardIssuerProcessor.repoType(), CardScheme.repoType(),
				CardSchemeProcessor.repoType(), ATMManager.repoType(),
				HostingEntity.repoType(), OriginatingATM.repoType(),
				OriginatingTerminal.repoType(), CardApplication.repoType(),
				POISystem.repoType(), POIGroup.repoType(),
				SinglePOI.repoType(), AccountFromBank.repoType(),
				AccountToBank.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("ISUR");
		super.name = "PartyTypeCode";
		super.definition = "Specifies the entitled party.";
	}

	static public class SaleSystem extends MMCode {
		private final static AtomicReference<SaleSystem> repoTypeRef = new AtomicReference<>();

		public static SaleSystem repoType() {
			repoTypeRef.compareAndSet(null, new SaleSystem());
			return repoTypeRef.get();
		}

		private SaleSystem() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "SALE";
			super.name = "SaleSystem";
			super.definition = "Party selling goods and services.";
		}
	}

	static public class POIComponent extends MMCode {
		private final static AtomicReference<POIComponent> repoTypeRef = new AtomicReference<>();

		public static POIComponent repoType() {
			repoTypeRef.compareAndSet(null, new POIComponent());
			return repoTypeRef.get();
		}

		private POIComponent() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "PCPT";
			super.name = "POIComponent";
			super.definition = "Party component of a POI system or POI terminal (Point of Interaction).";
		}
	}

	static public class Issuer extends MMCode {
		private final static AtomicReference<Issuer> repoTypeRef = new AtomicReference<>();

		public static Issuer repoType() {
			repoTypeRef.compareAndSet(null, new Issuer());
			return repoTypeRef.get();
		}

		private Issuer() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "ISUR";
			super.name = "Issuer";
			super.definition = "Issuer is the entitled party.";
		}
	}

	static public class Holder extends MMCode {
		private final static AtomicReference<Holder> repoTypeRef = new AtomicReference<>();

		public static Holder repoType() {
			repoTypeRef.compareAndSet(null, new Holder());
			return repoTypeRef.get();
		}

		private Holder() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "HLDR";
			super.name = "Holder";
			super.definition = "Holder is the entitled party.";
		}
	}

	static public class Investor extends MMCode {
		private final static AtomicReference<Investor> repoTypeRef = new AtomicReference<>();

		public static Investor repoType() {
			repoTypeRef.compareAndSet(null, new Investor());
			return repoTypeRef.get();
		}

		private Investor() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "INVE";
			super.name = "Investor";
			super.definition = "Party, either an individual or organisation, whose assets are being invested.";
		}
	}

	static public class ExecutingFirm extends MMCode {
		private final static AtomicReference<ExecutingFirm> repoTypeRef = new AtomicReference<>();

		public static ExecutingFirm repoType() {
			repoTypeRef.compareAndSet(null, new ExecutingFirm());
			return repoTypeRef.get();
		}

		private ExecutingFirm() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "EXEC";
			super.name = "ExecutingFirm";
			super.definition = "Party that identifies an executing / give-up broker.";
		}
	}

	static public class BrokerOfCredit extends MMCode {
		private final static AtomicReference<BrokerOfCredit> repoTypeRef = new AtomicReference<>();

		public static BrokerOfCredit repoType() {
			repoTypeRef.compareAndSet(null, new BrokerOfCredit());
			return repoTypeRef.get();
		}

		private BrokerOfCredit() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "BROK";
			super.name = "BrokerOfCredit";
			super.definition = "Party that receives the trade credit.";
		}
	}

	static public class CorrespondentClearingFirm extends MMCode {
		private final static AtomicReference<CorrespondentClearingFirm> repoTypeRef = new AtomicReference<>();

		public static CorrespondentClearingFirm repoType() {
			repoTypeRef.compareAndSet(null, new CorrespondentClearingFirm());
			return repoTypeRef.get();
		}

		private CorrespondentClearingFirm() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "CORR";
			super.name = "CorrespondentClearingFirm";
			super.definition = "Party that is going to carry the position on their books at another clearinghouse (exchanges).";
		}
	}

	static public class ContraFirm extends MMCode {
		private final static AtomicReference<ContraFirm> repoTypeRef = new AtomicReference<>();

		public static ContraFirm repoType() {
			repoTypeRef.compareAndSet(null, new ContraFirm());
			return repoTypeRef.get();
		}

		private ContraFirm() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "COFI";
			super.name = "ContraFirm";
			super.definition = "Party that is the counterparty in a trade.";
		}
	}

	static public class ContraClearingFirm extends MMCode {
		private final static AtomicReference<ContraClearingFirm> repoTypeRef = new AtomicReference<>();

		public static ContraClearingFirm repoType() {
			repoTypeRef.compareAndSet(null, new ContraClearingFirm());
			return repoTypeRef.get();
		}

		private ContraClearingFirm() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "COCL";
			super.name = "ContraClearingFirm";
			super.definition = "Party that is the clearing firm of the counterparty in a trade.";
		}
	}

	static public class UnderlyingContraFirm extends MMCode {
		private final static AtomicReference<UnderlyingContraFirm> repoTypeRef = new AtomicReference<>();

		public static UnderlyingContraFirm repoType() {
			repoTypeRef.compareAndSet(null, new UnderlyingContraFirm());
			return repoTypeRef.get();
		}

		private UnderlyingContraFirm() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "UNDE";
			super.name = "UnderlyingContraFirm";
			super.definition = "Party (broker or other firm), which is the contra side of the trade for the underlying security.";
		}
	}

	static public class GiveUpClearingFirm extends MMCode {
		private final static AtomicReference<GiveUpClearingFirm> repoTypeRef = new AtomicReference<>();

		public static GiveUpClearingFirm repoType() {
			repoTypeRef.compareAndSet(null, new GiveUpClearingFirm());
			return repoTypeRef.get();
		}

		private GiveUpClearingFirm() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "GIVE";
			super.name = "GiveUpClearingFirm";
			super.definition = "Party to which the trade is given up (carries the position that results from a trade).";
		}
	}

	static public class OrderOriginationFirm extends MMCode {
		private final static AtomicReference<OrderOriginationFirm> repoTypeRef = new AtomicReference<>();

		public static OrderOriginationFirm repoType() {
			repoTypeRef.compareAndSet(null, new OrderOriginationFirm());
			return repoTypeRef.get();
		}

		private OrderOriginationFirm() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "ORDE";
			super.name = "OrderOriginationFirm";
			super.definition = "Party that originates an order.";
		}
	}

	static public class SponsoringFirm extends MMCode {
		private final static AtomicReference<SponsoringFirm> repoTypeRef = new AtomicReference<>();

		public static SponsoringFirm repoType() {
			repoTypeRef.compareAndSet(null, new SponsoringFirm());
			return repoTypeRef.get();
		}

		private SponsoringFirm() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "SPON";
			super.name = "SponsoringFirm";
			super.definition = "Party (member of an exchange)that is sponsoring an entering firm to send orders directly to the exchange.";
		}
	}

	static public class Clearingfirm extends MMCode {
		private final static AtomicReference<Clearingfirm> repoTypeRef = new AtomicReference<>();

		public static Clearingfirm repoType() {
			repoTypeRef.compareAndSet(null, new Clearingfirm());
			return repoTypeRef.get();
		}

		private Clearingfirm() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "CLEA";
			super.name = "Clearingfirm";
			super.definition = "Party (broker) that settles security transactions from another broker for a fee = take up broker.";
		}
	}

	static public class IntroducingFirm extends MMCode {
		private final static AtomicReference<IntroducingFirm> repoTypeRef = new AtomicReference<>();

		public static IntroducingFirm repoType() {
			repoTypeRef.compareAndSet(null, new IntroducingFirm());
			return repoTypeRef.get();
		}

		private IntroducingFirm() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "INTR";
			super.name = "IntroducingFirm";
			super.definition = "Party that can relay an order directly to the trading floor, or give clients direct access to the floor. The introducing firm delegates the work of the floor operation, trade execution and accounting.";
		}
	}

	static public class EnteringFirm extends MMCode {
		private final static AtomicReference<EnteringFirm> repoTypeRef = new AtomicReference<>();

		public static EnteringFirm repoType() {
			repoTypeRef.compareAndSet(null, new EnteringFirm());
			return repoTypeRef.get();
		}

		private EnteringFirm() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "ENTE";
			super.name = "EnteringFirm";
			super.definition = "Party that has recorded or reported an execution of a trade. When an entering firm that is not a party to a trade enters the trade into a trade recording system, any inquiries can be directed to the appropriate source.";
		}
	}

	static public class Client extends MMCode {
		private final static AtomicReference<Client> repoTypeRef = new AtomicReference<>();

		public static Client repoType() {
			repoTypeRef.compareAndSet(null, new Client());
			return repoTypeRef.get();
		}

		private Client() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "CLIE";
			super.name = "Client";
			super.definition = "A client is identified in third party-transactions or for investor in intermediary transactions.";
		}
	}

	static public class StepInBroker extends MMCode {
		private final static AtomicReference<StepInBroker> repoTypeRef = new AtomicReference<>();

		public static StepInBroker repoType() {
			repoTypeRef.compareAndSet(null, new StepInBroker());
			return repoTypeRef.get();
		}

		private StepInBroker() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "STEP";
			super.name = "StepInBroker";
			super.definition = "Broker to which the investment manager directs the execution of a portion of the trade.";
		}
	}

	static public class AffirmingParty extends MMCode {
		private final static AtomicReference<AffirmingParty> repoTypeRef = new AtomicReference<>();

		public static AffirmingParty repoType() {
			repoTypeRef.compareAndSet(null, new AffirmingParty());
			return repoTypeRef.get();
		}

		private AffirmingParty() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "AFFI";
			super.name = "AffirmingParty";
			super.definition = "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.";
		}
	}

	static public class ETCServiceProvider1 extends MMCode {
		private final static AtomicReference<ETCServiceProvider1> repoTypeRef = new AtomicReference<>();

		public static ETCServiceProvider1 repoType() {
			repoTypeRef.compareAndSet(null, new ETCServiceProvider1());
			return repoTypeRef.get();
		}

		private ETCServiceProvider1() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "ETC1";
			super.name = "ETCServiceProvider1";
			super.definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 1.";
		}
	}

	static public class ETCServiceProvider2 extends MMCode {
		private final static AtomicReference<ETCServiceProvider2> repoTypeRef = new AtomicReference<>();

		public static ETCServiceProvider2 repoType() {
			repoTypeRef.compareAndSet(null, new ETCServiceProvider2());
			return repoTypeRef.get();
		}

		private ETCServiceProvider2() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "ETC2";
			super.name = "ETCServiceProvider2";
			super.definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 2.";
		}
	}

	static public class RequestedBroker extends MMCode {
		private final static AtomicReference<RequestedBroker> repoTypeRef = new AtomicReference<>();

		public static RequestedBroker repoType() {
			repoTypeRef.compareAndSet(null, new RequestedBroker());
			return repoTypeRef.get();
		}

		private RequestedBroker() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "RQBR";
			super.name = "RequestedBroker";
			super.definition = "In a directed order, broker with which the Receiver of the message is requested to execute the order.";
		}
	}

	static public class TaxAuthority extends MMCode {
		private final static AtomicReference<TaxAuthority> repoTypeRef = new AtomicReference<>();

		public static TaxAuthority repoType() {
			repoTypeRef.compareAndSet(null, new TaxAuthority());
			return repoTypeRef.get();
		}

		private TaxAuthority() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "TAXH";
			super.name = "TaxAuthority";
			super.definition = "Tax authority.";
		}
	}

	static public class DelegateIssuer extends MMCode {
		private final static AtomicReference<DelegateIssuer> repoTypeRef = new AtomicReference<>();

		public static DelegateIssuer repoType() {
			repoTypeRef.compareAndSet(null, new DelegateIssuer());
			return repoTypeRef.get();
		}

		private DelegateIssuer() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "DLIS";
			super.name = "DelegateIssuer";
			super.definition = "Party to whom the card issuer delegates to authorise card payment transactions.";
		}
	}

	static public class OriginatingPOI extends MMCode {
		private final static AtomicReference<OriginatingPOI> repoTypeRef = new AtomicReference<>();

		public static OriginatingPOI repoType() {
			repoTypeRef.compareAndSet(null, new OriginatingPOI());
			return repoTypeRef.get();
		}

		private OriginatingPOI() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "OPOI";
			super.name = "OriginatingPOI";
			super.definition = "Point Of Interaction initiating the card payment transaction.";
		}
	}

	static public class CardIssuer extends MMCode {
		private final static AtomicReference<CardIssuer> repoTypeRef = new AtomicReference<>();

		public static CardIssuer repoType() {
			repoTypeRef.compareAndSet(null, new CardIssuer());
			return repoTypeRef.get();
		}

		private CardIssuer() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "CISS";
			super.name = "CardIssuer";
			super.definition = "Party that issues cards.";
		}
	}

	static public class Acceptor extends MMCode {
		private final static AtomicReference<Acceptor> repoTypeRef = new AtomicReference<>();

		public static Acceptor repoType() {
			repoTypeRef.compareAndSet(null, new Acceptor());
			return repoTypeRef.get();
		}

		private Acceptor() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "ACCP";
			super.name = "Acceptor";
			super.definition = "Card acceptor, party accepting the card and presenting transaction data to the acquirer.";
		}
	}

	static public class Merchant extends MMCode {
		private final static AtomicReference<Merchant> repoTypeRef = new AtomicReference<>();

		public static Merchant repoType() {
			repoTypeRef.compareAndSet(null, new Merchant());
			return repoTypeRef.get();
		}

		private Merchant() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "MERC";
			super.name = "Merchant";
			super.definition = "Merchant providing goods and service in the card payment transaction.";
		}
	}

	static public class Acquirer extends MMCode {
		private final static AtomicReference<Acquirer> repoTypeRef = new AtomicReference<>();

		public static Acquirer repoType() {
			repoTypeRef.compareAndSet(null, new Acquirer());
			return repoTypeRef.get();
		}

		private Acquirer() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "ACQR";
			super.name = "Acquirer";
			super.definition = "Entity acquiring card transactions.";
		}
	}

	static public class IntermediaryAgent extends MMCode {
		private final static AtomicReference<IntermediaryAgent> repoTypeRef = new AtomicReference<>();

		public static IntermediaryAgent repoType() {
			repoTypeRef.compareAndSet(null, new IntermediaryAgent());
			return repoTypeRef.get();
		}

		private IntermediaryAgent() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "ITAG";
			super.name = "IntermediaryAgent";
			super.definition = "Party acting on behalf of other parties to process or forward data to other parties.";
		}
	}

	static public class MasterTerminalManager extends MMCode {
		private final static AtomicReference<MasterTerminalManager> repoTypeRef = new AtomicReference<>();

		public static MasterTerminalManager repoType() {
			repoTypeRef.compareAndSet(null, new MasterTerminalManager());
			return repoTypeRef.get();
		}

		private MasterTerminalManager() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "MTMG";
			super.name = "MasterTerminalManager";
			super.definition = "Responsible for the maintenance of a card payment acceptance terminal.";
		}
	}

	static public class TerminalManager extends MMCode {
		private final static AtomicReference<TerminalManager> repoTypeRef = new AtomicReference<>();

		public static TerminalManager repoType() {
			repoTypeRef.compareAndSet(null, new TerminalManager());
			return repoTypeRef.get();
		}

		private TerminalManager() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "TMGT";
			super.name = "TerminalManager";
			super.definition = "Responsible for one or several maintenance functions of a card payment acceptance terminal.";
		}
	}

	static public class AcquirerProcessor extends MMCode {
		private final static AtomicReference<AcquirerProcessor> repoTypeRef = new AtomicReference<>();

		public static AcquirerProcessor repoType() {
			repoTypeRef.compareAndSet(null, new AcquirerProcessor());
			return repoTypeRef.get();
		}

		private AcquirerProcessor() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "ACQP";
			super.name = "AcquirerProcessor";
			super.definition = "Entity providing acquiring card payment processing services on behalf on an acquirer.";
		}
	}

	static public class CardIssuerProcessor extends MMCode {
		private final static AtomicReference<CardIssuerProcessor> repoTypeRef = new AtomicReference<>();

		public static CardIssuerProcessor repoType() {
			repoTypeRef.compareAndSet(null, new CardIssuerProcessor());
			return repoTypeRef.get();
		}

		private CardIssuerProcessor() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "CISP";
			super.name = "CardIssuerProcessor";
			super.definition = "Entity providing issuing card payment processing services on behalf on an issuer.";
		}
	}

	static public class CardScheme extends MMCode {
		private final static AtomicReference<CardScheme> repoTypeRef = new AtomicReference<>();

		public static CardScheme repoType() {
			repoTypeRef.compareAndSet(null, new CardScheme());
			return repoTypeRef.get();
		}

		private CardScheme() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "CSCH";
			super.name = "CardScheme";
			super.definition = "Entity defining rules and procedures for card payment transactions acting as an intermediary between an acquirer and an issuer.";
		}
	}

	static public class CardSchemeProcessor extends MMCode {
		private final static AtomicReference<CardSchemeProcessor> repoTypeRef = new AtomicReference<>();

		public static CardSchemeProcessor repoType() {
			repoTypeRef.compareAndSet(null, new CardSchemeProcessor());
			return repoTypeRef.get();
		}

		private CardSchemeProcessor() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "SCHP";
			super.name = "CardSchemeProcessor";
			super.definition = "Entity providing card payment processing services acting on behalf of a card scheme.";
		}
	}

	static public class ATMManager extends MMCode {
		private final static AtomicReference<ATMManager> repoTypeRef = new AtomicReference<>();

		public static ATMManager repoType() {
			repoTypeRef.compareAndSet(null, new ATMManager());
			return repoTypeRef.get();
		}

		private ATMManager() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "ATMG";
			super.name = "ATMManager";
			super.definition = "Entity managing the ATM.";
		}
	}

	static public class HostingEntity extends MMCode {
		private final static AtomicReference<HostingEntity> repoTypeRef = new AtomicReference<>();

		public static HostingEntity repoType() {
			repoTypeRef.compareAndSet(null, new HostingEntity());
			return repoTypeRef.get();
		}

		private HostingEntity() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "HSTG";
			super.name = "HostingEntity";
			super.definition = "Entity hosting the ATM.";
		}
	}

	static public class OriginatingATM extends MMCode {
		private final static AtomicReference<OriginatingATM> repoTypeRef = new AtomicReference<>();

		public static OriginatingATM repoType() {
			repoTypeRef.compareAndSet(null, new OriginatingATM());
			return repoTypeRef.get();
		}

		private OriginatingATM() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "OATM";
			super.name = "OriginatingATM";
			super.definition = "ATM initiating the transaction.";
		}
	}

	static public class OriginatingTerminal extends MMCode {
		private final static AtomicReference<OriginatingTerminal> repoTypeRef = new AtomicReference<>();

		public static OriginatingTerminal repoType() {
			repoTypeRef.compareAndSet(null, new OriginatingTerminal());
			return repoTypeRef.get();
		}

		private OriginatingTerminal() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "OTRM";
			super.name = "OriginatingTerminal";
			super.definition = "Application on the terminal which has initiated the transaction.";
		}
	}

	static public class CardApplication extends MMCode {
		private final static AtomicReference<CardApplication> repoTypeRef = new AtomicReference<>();

		public static CardApplication repoType() {
			repoTypeRef.compareAndSet(null, new CardApplication());
			return repoTypeRef.get();
		}

		private CardApplication() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "ICCA";
			super.name = "CardApplication";
			super.definition = "Application in the smart card.";
		}
	}

	static public class POISystem extends MMCode {
		private final static AtomicReference<POISystem> repoTypeRef = new AtomicReference<>();

		public static POISystem repoType() {
			repoTypeRef.compareAndSet(null, new POISystem());
			return repoTypeRef.get();
		}

		private POISystem() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "PSYS";
			super.name = "POISystem";
			super.definition = "Configuration to apply to the whole POI system.";
		}
	}

	static public class POIGroup extends MMCode {
		private final static AtomicReference<POIGroup> repoTypeRef = new AtomicReference<>();

		public static POIGroup repoType() {
			repoTypeRef.compareAndSet(null, new POIGroup());
			return repoTypeRef.get();
		}

		private POIGroup() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "PGRP";
			super.name = "POIGroup";
			super.definition = "Configuration to apply to a subset of the whole POI system.";
		}
	}

	static public class SinglePOI extends MMCode {
		private final static AtomicReference<SinglePOI> repoTypeRef = new AtomicReference<>();

		public static SinglePOI repoType() {
			repoTypeRef.compareAndSet(null, new SinglePOI());
			return repoTypeRef.get();
		}

		private SinglePOI() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "PSNG";
			super.name = "SinglePOI";
			super.definition = "Configuration to apply to a single POI terminal.";
		}
	}

	static public class AccountFromBank extends MMCode {
		private final static AtomicReference<AccountFromBank> repoTypeRef = new AtomicReference<>();

		public static AccountFromBank repoType() {
			repoTypeRef.compareAndSet(null, new AccountFromBank());
			return repoTypeRef.get();
		}

		private AccountFromBank() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "BKAF";
			super.name = "AccountFromBank";
			super.definition = "The bank of the source account.";
		}
	}

	static public class AccountToBank extends MMCode {
		private final static AtomicReference<AccountToBank> repoTypeRef = new AtomicReference<>();

		public static AccountToBank repoType() {
			repoTypeRef.compareAndSet(null, new AccountToBank());
			return repoTypeRef.get();
		}

		private AccountToBank() {
			super.owner_lazy = () -> PartyTypeCode.repoType();
			super.codeName = "BKAT";
			super.name = "AccountToBank";
			super.definition = "The bank of the destination account.";
		}
	}
}