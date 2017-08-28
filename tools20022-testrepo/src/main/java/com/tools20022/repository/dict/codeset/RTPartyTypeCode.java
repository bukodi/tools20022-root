package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTPartyTypeCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the entitled party.
 */
public class RTPartyTypeCode extends MMCodeSet {

	private final static AtomicReference<RTPartyTypeCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Party selling goods and services.
	 */
	public final MMCode codeSaleSystem = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "SALE";
			super.name = "SaleSystem";
			super.definition = "Party selling goods and services.";
		}
	};
	/**
	 * Party component of a POI system or POI terminal (Point of Interaction).
	 */
	public final MMCode codePOIComponent = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "PCPT";
			super.name = "POIComponent";
			super.definition = "Party component of a POI system or POI terminal (Point of Interaction).";
		}
	};
	/**
	 * Issuer is the entitled party.
	 */
	public final MMCode codeIssuer = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "ISUR";
			super.name = "Issuer";
			super.definition = "Issuer is the entitled party.";
		}
	};
	/**
	 * Holder is the entitled party.
	 */
	public final MMCode codeHolder = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "HLDR";
			super.name = "Holder";
			super.definition = "Holder is the entitled party.";
		}
	};
	/**
	 * Party, either an individual or organisation, whose assets are being invested.
	 */
	public final MMCode codeInvestor = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "INVE";
			super.name = "Investor";
			super.definition = "Party, either an individual or organisation, whose assets are being invested.";
		}
	};
	/**
	 * Party that identifies an executing / give-up broker.
	 */
	public final MMCode codeExecutingFirm = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "EXEC";
			super.name = "ExecutingFirm";
			super.definition = "Party that identifies an executing / give-up broker.";
		}
	};
	/**
	 * Party that receives the trade credit.
	 */
	public final MMCode codeBrokerOfCredit = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "BROK";
			super.name = "BrokerOfCredit";
			super.definition = "Party that receives the trade credit.";
		}
	};
	/**
	 * Party that is going to carry the position on their books at another clearinghouse (exchanges).
	 */
	public final MMCode codeCorrespondentClearingFirm = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "CORR";
			super.name = "CorrespondentClearingFirm";
			super.definition = "Party that is going to carry the position on their books at another clearinghouse (exchanges).";
		}
	};
	/**
	 * Party that is the counterparty in a trade.
	 */
	public final MMCode codeContraFirm = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "COFI";
			super.name = "ContraFirm";
			super.definition = "Party that is the counterparty in a trade.";
		}
	};
	/**
	 * Party that is the clearing firm of the counterparty in a trade.
	 */
	public final MMCode codeContraClearingFirm = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "COCL";
			super.name = "ContraClearingFirm";
			super.definition = "Party that is the clearing firm of the counterparty in a trade.";
		}
	};
	/**
	 * Party (broker or other firm), which is the contra side of the trade for the underlying security.
	 */
	public final MMCode codeUnderlyingContraFirm = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "UNDE";
			super.name = "UnderlyingContraFirm";
			super.definition = "Party (broker or other firm), which is the contra side of the trade for the underlying security.";
		}
	};
	/**
	 * Party to which the trade is given up (carries the position that results from a trade).
	 */
	public final MMCode codeGiveUpClearingFirm = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "GIVE";
			super.name = "GiveUpClearingFirm";
			super.definition = "Party to which the trade is given up (carries the position that results from a trade).";
		}
	};
	/**
	 * Party that originates an order.
	 */
	public final MMCode codeOrderOriginationFirm = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "ORDE";
			super.name = "OrderOriginationFirm";
			super.definition = "Party that originates an order.";
		}
	};
	/**
	 * Party (member of an exchange)that is sponsoring an entering firm to send orders directly to the exchange.
	 */
	public final MMCode codeSponsoringFirm = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "SPON";
			super.name = "SponsoringFirm";
			super.definition = "Party (member of an exchange)that is sponsoring an entering firm to send orders directly to the exchange.";
		}
	};
	/**
	 * Party (broker) that settles security transactions from another broker for a fee = take up broker.
	 */
	public final MMCode codeClearingfirm = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "CLEA";
			super.name = "Clearingfirm";
			super.definition = "Party (broker) that settles security transactions from another broker for a fee = take up broker.";
		}
	};
	/**
	 * Party that can relay an order directly to the trading floor, or give clients direct access to the floor. The introducing firm delegates the work of the floor operation, trade execution and accounting.
	 */
	public final MMCode codeIntroducingFirm = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "INTR";
			super.name = "IntroducingFirm";
			super.definition = "Party that can relay an order directly to the trading floor, or give clients direct access to the floor. The introducing firm delegates the work of the floor operation, trade execution and accounting.";
		}
	};
	/**
	 * Party that has recorded or reported an execution of a trade. When an entering firm that is not a party to a trade enters the trade into a trade recording system, any inquiries can be directed to the appropriate source.
	 */
	public final MMCode codeEnteringFirm = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "ENTE";
			super.name = "EnteringFirm";
			super.definition = "Party that has recorded or reported an execution of a trade. When an entering firm that is not a party to a trade enters the trade into a trade recording system, any inquiries can be directed to the appropriate source.";
		}
	};
	/**
	 * A client is identified in third party-transactions or for investor in intermediary transactions.
	 */
	public final MMCode codeClient = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "CLIE";
			super.name = "Client";
			super.definition = "A client is identified in third party-transactions or for investor in intermediary transactions.";
		}
	};
	/**
	 * Broker to which the investment manager directs the execution of a portion of the trade.
	 */
	public final MMCode codeStepInBroker = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "STEP";
			super.name = "StepInBroker";
			super.definition = "Broker to which the investment manager directs the execution of a portion of the trade.";
		}
	};
	/**
	 * Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.
	 */
	public final MMCode codeAffirmingParty = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "AFFI";
			super.name = "AffirmingParty";
			super.definition = "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.";
		}
	};
	/**
	 * Party acting as the Electronic Trade Confirmation (ETC) service provider 1.
	 */
	public final MMCode codeETCServiceProvider1 = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "ETC1";
			super.name = "ETCServiceProvider1";
			super.definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 1.";
		}
	};
	/**
	 * Party acting as the Electronic Trade Confirmation (ETC) service provider 2.
	 */
	public final MMCode codeETCServiceProvider2 = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "ETC2";
			super.name = "ETCServiceProvider2";
			super.definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 2.";
		}
	};
	/**
	 * In a directed order, broker with which the Receiver of the message is requested to execute the order.
	 */
	public final MMCode codeRequestedBroker = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "RQBR";
			super.name = "RequestedBroker";
			super.definition = "In a directed order, broker with which the Receiver of the message is requested to execute the order.";
		}
	};
	/**
	 * Tax authority.
	 */
	public final MMCode codeTaxAuthority = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "TAXH";
			super.name = "TaxAuthority";
			super.definition = "Tax authority.";
		}
	};
	/**
	 * Party to whom the card issuer delegates to authorise card payment transactions.
	 */
	public final MMCode codeDelegateIssuer = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "DLIS";
			super.name = "DelegateIssuer";
			super.definition = "Party to whom the card issuer delegates to authorise card payment transactions.";
		}
	};
	/**
	 * Point Of Interaction initiating the card payment transaction.
	 */
	public final MMCode codeOriginatingPOI = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "OPOI";
			super.name = "OriginatingPOI";
			super.definition = "Point Of Interaction initiating the card payment transaction.";
		}
	};
	/**
	 * Party that issues cards.
	 */
	public final MMCode codeCardIssuer = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "CISS";
			super.name = "CardIssuer";
			super.definition = "Party that issues cards.";
		}
	};
	/**
	 * Card acceptor, party accepting the card and presenting transaction data to the acquirer.
	 */
	public final MMCode codeAcceptor = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "ACCP";
			super.name = "Acceptor";
			super.definition = "Card acceptor, party accepting the card and presenting transaction data to the acquirer.";
		}
	};
	/**
	 * Merchant providing goods and service in the card payment transaction.
	 */
	public final MMCode codeMerchant = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "MERC";
			super.name = "Merchant";
			super.definition = "Merchant providing goods and service in the card payment transaction.";
		}
	};
	/**
	 * Entity acquiring card transactions.
	 */
	public final MMCode codeAcquirer = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "ACQR";
			super.name = "Acquirer";
			super.definition = "Entity acquiring card transactions.";
		}
	};
	/**
	 * Party acting on behalf of other parties to process or forward data to other parties.
	 */
	public final MMCode codeIntermediaryAgent = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "ITAG";
			super.name = "IntermediaryAgent";
			super.definition = "Party acting on behalf of other parties to process or forward data to other parties.";
		}
	};
	/**
	 * Responsible for the maintenance of a card payment acceptance terminal.
	 */
	public final MMCode codeMasterTerminalManager = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "MTMG";
			super.name = "MasterTerminalManager";
			super.definition = "Responsible for the maintenance of a card payment acceptance terminal.";
		}
	};
	/**
	 * Responsible for one or several maintenance functions of a card payment acceptance terminal.
	 */
	public final MMCode codeTerminalManager = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "TMGT";
			super.name = "TerminalManager";
			super.definition = "Responsible for one or several maintenance functions of a card payment acceptance terminal.";
		}
	};
	/**
	 * Entity providing acquiring card payment processing services on behalf on an acquirer.
	 */
	public final MMCode codeAcquirerProcessor = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "ACQP";
			super.name = "AcquirerProcessor";
			super.definition = "Entity providing acquiring card payment processing services on behalf on an acquirer.";
		}
	};
	/**
	 * Entity providing issuing card payment processing services on behalf on an issuer.
	 */
	public final MMCode codeCardIssuerProcessor = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "CISP";
			super.name = "CardIssuerProcessor";
			super.definition = "Entity providing issuing card payment processing services on behalf on an issuer.";
		}
	};
	/**
	 * Entity defining rules and procedures for card payment transactions acting as an intermediary between an acquirer and an issuer.
	 */
	public final MMCode codeCardScheme = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "CSCH";
			super.name = "CardScheme";
			super.definition = "Entity defining rules and procedures for card payment transactions acting as an intermediary between an acquirer and an issuer.";
		}
	};
	/**
	 * Entity providing card payment processing services acting on behalf of a card scheme.
	 */
	public final MMCode codeCardSchemeProcessor = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "SCHP";
			super.name = "CardSchemeProcessor";
			super.definition = "Entity providing card payment processing services acting on behalf of a card scheme.";
		}
	};
	/**
	 * Entity managing the ATM.
	 */
	public final MMCode codeATMManager = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "ATMG";
			super.name = "ATMManager";
			super.definition = "Entity managing the ATM.";
		}
	};
	/**
	 * Entity hosting the ATM.
	 */
	public final MMCode codeHostingEntity = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "HSTG";
			super.name = "HostingEntity";
			super.definition = "Entity hosting the ATM.";
		}
	};
	/**
	 * ATM initiating the transaction.
	 */
	public final MMCode codeOriginatingATM = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "OATM";
			super.name = "OriginatingATM";
			super.definition = "ATM initiating the transaction.";
		}
	};
	/**
	 * Application on the terminal which has initiated the transaction.
	 */
	public final MMCode codeOriginatingTerminal = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "OTRM";
			super.name = "OriginatingTerminal";
			super.definition = "Application on the terminal which has initiated the transaction.";
		}
	};
	/**
	 * Application in the smart card.
	 */
	public final MMCode codeCardApplication = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "ICCA";
			super.name = "CardApplication";
			super.definition = "Application in the smart card.";
		}
	};
	/**
	 * Configuration to apply to the whole POI system.
	 */
	public final MMCode codePOISystem = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "PSYS";
			super.name = "POISystem";
			super.definition = "Configuration to apply to the whole POI system.";
		}
	};
	/**
	 * Configuration to apply to a subset of the whole POI system.
	 */
	public final MMCode codePOIGroup = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "PGRP";
			super.name = "POIGroup";
			super.definition = "Configuration to apply to a subset of the whole POI system.";
		}
	};
	/**
	 * Configuration to apply to a single POI terminal.
	 */
	public final MMCode codeSinglePOI = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "PSNG";
			super.name = "SinglePOI";
			super.definition = "Configuration to apply to a single POI terminal.";
		}
	};
	/**
	 * The bank of the source account.
	 */
	public final MMCode codeAccountFromBank = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "BKAF";
			super.name = "AccountFromBank";
			super.definition = "The bank of the source account.";
		}
	};
	/**
	 * The bank of the destination account.
	 */
	public final MMCode codeAccountToBank = new MMCode() {
		{
			super.owner_lazy = () -> RTPartyTypeCode.repoType();
			super.codeName = "BKAT";
			super.name = "AccountToBank";
			super.definition = "The bank of the destination account.";
		}
	};

	public static RTPartyTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new RTPartyTypeCode());
		return repoTypeRef.get();
	}

	private RTPartyTypeCode() {
		super.code = Arrays.asList(codeSaleSystem, codePOIComponent,
				codeIssuer, codeHolder, codeInvestor, codeExecutingFirm,
				codeBrokerOfCredit, codeCorrespondentClearingFirm,
				codeContraFirm, codeContraClearingFirm,
				codeUnderlyingContraFirm, codeGiveUpClearingFirm,
				codeOrderOriginationFirm, codeSponsoringFirm, codeClearingfirm,
				codeIntroducingFirm, codeEnteringFirm, codeClient,
				codeStepInBroker, codeAffirmingParty, codeETCServiceProvider1,
				codeETCServiceProvider2, codeRequestedBroker, codeTaxAuthority,
				codeDelegateIssuer, codeOriginatingPOI, codeCardIssuer,
				codeAcceptor, codeMerchant, codeAcquirer,
				codeIntermediaryAgent, codeMasterTerminalManager,
				codeTerminalManager, codeAcquirerProcessor,
				codeCardIssuerProcessor, codeCardScheme,
				codeCardSchemeProcessor, codeATMManager, codeHostingEntity,
				codeOriginatingATM, codeOriginatingTerminal,
				codeCardApplication, codePOISystem, codePOIGroup,
				codeSinglePOI, codeAccountFromBank, codeAccountToBank);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PartyTypeCode";
		super.definition = "Specifies the entitled party.";
		super.example = Arrays.asList("ISUR");
	} }