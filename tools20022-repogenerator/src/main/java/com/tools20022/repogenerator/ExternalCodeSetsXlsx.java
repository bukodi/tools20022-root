package com.tools20022.repogenerator;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExternalCodeSetsXlsx {

    final static int FIRST_PROCESSED_SHEET = 3;

    public enum ColName {
        Code(true), Name(true), Definition(true), Origin(true), Status(true), StatusDate(true), IntroducedDate(true), Country(), BankIdPattern(), Example(), Region(), ISOCountryCode(), ISOCurrencyCode(), PaymentSystem(), DD_CT(), Bk2Bk(), Classification(), ISO15022();

        final boolean isMandatory;

        ColName() {
            this(false);
        }

        ColName(boolean isMandatory) {
            this.isMandatory = isMandatory;
        }
    }

    private SortedMap<String,CodeSet> codeSets = new TreeMap<>();
    
    public static void main(String[] args) throws Exception {

        //InputStream is = ProcessExternaCodeSets.class.getResourceAsStream("/ExternalCodeSets_3Q2017_30Nov2017_v1.xlsx");
        //InputStream is = ProcessExternaCodeSets.class.getResourceAsStream("/ExternalCodeSets_4Q2017_05Mar2018_v1.xlsx");
        InputStream is = ExternalCodeSetsXlsx.class.getResourceAsStream("/externalcodes/ExternalCodeSets_1Q2018_May2018_v1.xlsx");
        
        ExternalCodeSetsXlsx parsedXlsx = new ExternalCodeSetsXlsx(is);
        parsedXlsx.dumpCodeSets();
        

    }

	public ExternalCodeSetsXlsx(InputStream is) throws IOException {
		try (XSSFWorkbook wb = new XSSFWorkbook(is)) {

			int maxSheets = wb.getNumberOfSheets();

			for (int s = FIRST_PROCESSED_SHEET; s < maxSheets; s++) {
				XSSFSheet ws = wb.getSheetAt(s);
				processSheet(ws);
			}
		}
	}
	
	public Map<String, CodeSet> getCodeSets() {
		return codeSets;
	}
	
	public CodeSet getCodeSet( String name ) {
		return codeSets.get(name);
	}

	public void dumpCodeSets() {
        dumpColumnNames(codeSets);

        System.out.println("------");
        for (CodeSet cs : codeSets.values()) {
            String line = dumpFirstAndLastCodes(cs);
            System.out.println(line);
        }

        System.out.println("------");
        for (CodeSet cs : codeSets.values()) {
            Consumer<CodeSet> codeSetVerifier = codeSetVerifiers.get(cs.codeSetName);
            try{
                codeSetVerifier.accept(cs);
                System.out.println("OK   : Validation " + cs.codeSetName + "(" + cs.sheetName + ")");
            } catch ( Exception e) {
                System.out.println("ERROR: Validation of " + cs.codeSetName + "(" + cs.sheetName + ") :" + e.getMessage());
            }
        }		
	}

    static Map<String, Consumer<CodeSet>> codeSetVerifiers = new LinkedHashMap<>();

    static {
        codeSetVerifiers.put(                 "ExternalAccountIdentification1Code", cs->verifyCodeSet( cs,   4,  "AIIN",  "UPIC", ""));
        codeSetVerifiers.put(                        "ExternalBalanceSubType1Code", cs->verifyCodeSet( cs,  21,  "ADJT",  "THRE", ""));
        codeSetVerifiers.put(                    "ExternalCashClearingSystem1Code", cs->verifyCodeSet( cs,  92,   "ABE",   "ZIS", ""));
        codeSetVerifiers.put(                       "ExternalCategoryPurpose1Code", cs->verifyCodeSet( cs,  31,  "BONU",  "WHLD", ""));
        codeSetVerifiers.put(          "ExternalClearingSystemIdentification1Code", cs->verifyCodeSet( cs,  26, "ATBLZ", "ZANCC", "Country,BankIdPattern,Example")); // Example column has no value
        codeSetVerifiers.put(    "ExternalFinancialInstitutionIdentification1Code", cs->verifyCodeSet( cs,   0,      "",      "", ""));
        codeSetVerifiers.put(                       "ExternalLocalInstrument1Code", cs->verifyCodeSet( cs,  100,  "DDMC",   "TEL", "Region,ISOCountryCode,ISOCurrencyCode,PaymentSystem,DD_CT,Bk2Bk"));
        codeSetVerifiers.put(                         "ExternalMandateReason1Code", cs->verifyCodeSet( cs,  48,  "AC01",  "SL14", ""));
        codeSetVerifiers.put(            "ExternalOrganisationIdentification1Code", cs->verifyCodeSet( cs,  12,  "BANK",  "TXID", ""));
        codeSetVerifiers.put(                  "ExternalPersonIdentification1Code", cs->verifyCodeSet( cs,   8,  "ARNU",  "TXID", ""));
        codeSetVerifiers.put(                               "ExternalPurpose1Code", cs->verifyCodeSet( cs, 286,  "BKDF",  "WTER", "Classification"));
        codeSetVerifiers.put(                       "ExternalReportingSource1Code", cs->verifyCodeSet( cs,   9,  "ACCT",  "RCPT", ""));
        codeSetVerifiers.put(                          "ExternalReturnReason1Code", cs->verifyCodeSet( cs,  66,  "AC01",  "UPAY", ""));
        codeSetVerifiers.put(                        "ExternalReversalReason1Code", cs->verifyCodeSet( cs,  11,  "AC03",  "TM01", ""));
        codeSetVerifiers.put(                          "ExternalServiceLevel1Code", cs->verifyCodeSet( cs,   9,  "BKTR",  "URNS", ""));
        codeSetVerifiers.put(                          "ExternalStatusReason1Code", cs->verifyCodeSet( cs, 209,  "AB01",  "TS04", ""));
        codeSetVerifiers.put(                 "ExternalTechnicalInputChannel1Code", cs->verifyCodeSet( cs,   4,  "FAXI",  "WEBI", ""));
        codeSetVerifiers.put(                    "ExternalVerificationReason1Code", cs->verifyCodeSet( cs,   0,      "",      "", ""));
        codeSetVerifiers.put(                       "ExternalDocumentPurpose1Code", cs->verifyCodeSet( cs,   2,  "CONF",  "FINV", ""));
        codeSetVerifiers.put(                          "ExternalDocumentType1Code", cs->verifyCodeSet( cs,  17,  "CINV",  "USAR", ""));
        codeSetVerifiers.put(                             "ExternalIncoterms1Code", cs->verifyCodeSet( cs,  11,   "CFR",   "FOB", ""));
        codeSetVerifiers.put(                       "ExternalInformationType1Code", cs->verifyCodeSet( cs,   6,  "INST",  "SLDC", ""));
        codeSetVerifiers.put(                         "ExternalPackagingType1Code", cs->verifyCodeSet( cs,   4,  "HDPE",  "OTHR", ""));
        codeSetVerifiers.put( "ExternalFinancialInstrumentIdentificationType1Code", cs->verifyCodeSet( cs,  22,  "BELC",  "WKNR", "ISO15022"));
        codeSetVerifiers.put(             "ExternalTradeTransactionCondition1Code", cs->verifyCodeSet( cs,  47,  "BCBL",  "XWAR", ""));
        codeSetVerifiers.put(                            "ExternalChargeType1Code", cs->verifyCodeSet( cs,   4,  "BRKF",  "SUMM", ""));
        codeSetVerifiers.put(                       "ExternalCashAccountType1Code", cs->verifyCodeSet( cs,  20,  "CACC",  "TRAS", ""));
        codeSetVerifiers.put(                    "ExternalDiscountAmountType1Code", cs->verifyCodeSet( cs,   3,  "APDS",  "TMDS", ""));
        codeSetVerifiers.put(                         "ExternalTaxAmountType1Code", cs->verifyCodeSet( cs,   5,  "CITY",  "STAT", ""));
        codeSetVerifiers.put(               "ExternalCardTransactionCategory1Code", cs->verifyCodeSet( cs,   0,      "",      "", ""));
        codeSetVerifiers.put(                    "ExternalBillingBalanceType1Code", cs->verifyCodeSet( cs,  23,  "ABRR",  "UCFU", ""));
        codeSetVerifiers.put(               "ExternalBillingCompensationType1Code", cs->verifyCodeSet( cs,  22,  "BACS",  "WAIV", ""));
        codeSetVerifiers.put(             "ExternalBillingRateIdentification1Code", cs->verifyCodeSet( cs,  19,  "AEAR",  "UFUR", ""));
        codeSetVerifiers.put(                   "ExternalRePresentmentReason1Code", cs->verifyCodeSet( cs,   5,  "AMCR",  "VLSD", ""));
        codeSetVerifiers.put(                               "ExternalChannel1Code", cs->verifyCodeSet( cs,  13,  "COUR",  "WEBM", ""));
        codeSetVerifiers.put(                         "ExternalDateFrequency1Code", cs->verifyCodeSet( cs,   5,  "MNTH",  "YEAR", ""));
        codeSetVerifiers.put(                        "ExternalDocumentFormat1Code", cs->verifyCodeSet( cs,   5,  "DPDF",  "XSLT", ""));
        codeSetVerifiers.put(               "ExternalModelFormIdentification1Code", cs->verifyCodeSet( cs,  10,  "ISP1",  "UDG2", ""));
        codeSetVerifiers.put(                         "ExternalNarrativeType1Code", cs->verifyCodeSet( cs,   7,  "ADDI",  "TVAR", ""));
        codeSetVerifiers.put(                            "ExternalRelativeTo1Code", cs->verifyCodeSet( cs,   3,  "GOOD",  "UNDG", ""));
        codeSetVerifiers.put(                           "ExternalTypeOfParty1Code", cs->verifyCodeSet( cs,  13,  "ADVP",  "SPEC", ""));
        codeSetVerifiers.put(        "ExternalUnderlyingTradeTransactionType1Code", cs->verifyCodeSet( cs,   7,  "CONT",  "TEND", ""));
        codeSetVerifiers.put(                 "ExternalUndertakingAmountType1Code", cs->verifyCodeSet( cs,   2,  "INCR",  "REDC", ""));
        codeSetVerifiers.put(                 "ExternalUndertakingChargeType1Code", cs->verifyCodeSet( cs,  10,  "AMND",  "TELE", ""));
        codeSetVerifiers.put(               "ExternalUndertakingDocumentType1Code", cs->verifyCodeSet( cs,   5,  "BENS",  "TRAF", ""));
        codeSetVerifiers.put(               "ExternalUndertakingDocumentType2Code", cs->verifyCodeSet( cs,   3,  "BENS",  "TRAF", ""));
        codeSetVerifiers.put(             "ExternalUndertakingStatusCategory1Code", cs->verifyCodeSet( cs,   9,  "AMND",  "TERM", ""));
        codeSetVerifiers.put(                       "ExternalUndertakingType1Code", cs->verifyCodeSet( cs,  14,  "APAY",  "WARR", ""));
        codeSetVerifiers.put(                      "ExternalDocumentLineType1Code", cs->verifyCodeSet( cs,  19,  "ADPI",  "UPNB", ""));
        codeSetVerifiers.put(                       "ExternalGarnishmentType1Code", cs->verifyCodeSet( cs,   3,  "GNCS",  "GTPP", ""));
        codeSetVerifiers.put(                           "ExternalTradeMarket1Code", cs->verifyCodeSet( cs,   6,  "FDMS",  "FREX", ""));
        codeSetVerifiers.put(                    "ExternalMandateSetupReason1Code", cs->verifyCodeSet( cs,   0,      "",      "", ""));
        codeSetVerifiers.put(          "ExternalValidationRuleIdentification1Code", cs->verifyCodeSet( cs,   4,  "CCTR",  "SMMD", ""));
        codeSetVerifiers.put(                 "ExternalContractClosureReason1Code", cs->verifyCodeSet( cs,   9,  "PCED",  "REXP", "")); // Two tables on same sheet
        codeSetVerifiers.put(                   "ExternalContractBalanceType1Code", cs->verifyCodeSet( cs,   2,  "EXPC",  "EXPT", ""));
        codeSetVerifiers.put(                     "ExternalShipmentCondition1Code", cs->verifyCodeSet( cs,   3,  "ADVN",  "TRLN", ""));
        codeSetVerifiers.put(                            "ExternalMarketArea1Code", cs->verifyCodeSet( cs,  19,  "ANYY",  "TREA", ""));
        codeSetVerifiers.put(                "ExternalEffectiveDateParameter1Code", cs->verifyCodeSet( cs,   2,  "SETT",  "TRAD", ""));
        codeSetVerifiers.put(                     "ExternalSecuritiesPurpose1Code", cs->verifyCodeSet( cs,   3,  "COLL",  "STMT", ""));
        codeSetVerifiers.put(                        "ExternalReceivedReason1Code", cs->verifyCodeSet( cs,   1,  "NSTP",  "NSTP", ""));
        codeSetVerifiers.put(                        "ExternalAcceptedReason1Code", cs->verifyCodeSet( cs,   3,  "ADEA",  "SMPG", ""));
        codeSetVerifiers.put(               "ExternalPendingProcessingReason1Code", cs->verifyCodeSet( cs,  10,  "ADEA",  "PRSY", ""));
        codeSetVerifiers.put(                        "ExternalRejectedReason1Code", cs->verifyCodeSet( cs,  10,  "ADEA",  "TERM", ""));
        codeSetVerifiers.put(              "ExternalPaymentTransactionStatus1Code", cs->verifyCodeSet( cs,  10,  "ACCC",  "RJCT", ""));
        codeSetVerifiers.put(                    "ExternalPaymentGroupStatus1Code", cs->verifyCodeSet( cs,  10,  "ACCP",  "RJCT", ""));
        codeSetVerifiers.put(                    "ExternalCancellationReason1Code", cs->verifyCodeSet( cs,  12,  "AGNT",  "UPAY", ""));
        codeSetVerifiers.put(                         "ExternalMandateStatus1Code", cs->verifyCodeSet( cs,   4,  "ACTV",  "SUSP", ""));
        codeSetVerifiers.put(               "ExternalMandateSuspensionReason1Code", cs->verifyCodeSet( cs,   6,  "CTAM",  "MSUC", ""));
        codeSetVerifiers.put(                 "ExternalAuthenticationChannel1Code", cs->verifyCodeSet( cs,   4,  "ATMA",  "MOBI", ""));
        codeSetVerifiers.put(    "ExternalInvestigationExecutionConfirmation1Code", cs->verifyCodeSet( cs,  25,  "ACDA",  "UWFW", ""));
        codeSetVerifiers.put(                      "ExternalAgentInstruction1Code", cs->verifyCodeSet( cs,  10,  "CHQB",  "TTIL", ""));
        codeSetVerifiers.put(                           "ExternalBalanceType1Code", cs->verifyCodeSet( cs,  10,  "CLAV",  "XPCD", ""));
        codeSetVerifiers.put(              "ExternalClaimNonReceiptRejection1Code", cs->verifyCodeSet( cs,   2,  "NOOR",  "RNPR", ""));
        codeSetVerifiers.put(                   "ExternalCommunicationFormat1Code", cs->verifyCodeSet( cs,   0,      "",      "", ""));
        codeSetVerifiers.put(                        "ExternalCreditLineType1Code", cs->verifyCodeSet( cs,   0,      "",      "", ""));
        codeSetVerifiers.put(                           "ExternalEntryStatus1Code", cs->verifyCodeSet( cs,   4,  "BOOK",  "PDNG", ""));
        codeSetVerifiers.put(          "ExternalPaymentCancellationRejection1Code", cs->verifyCodeSet( cs,  14,  "AC04",  "WSEQ", ""));
        codeSetVerifiers.put(          "ExternalPaymentModificationRejection1Code", cs->verifyCodeSet( cs,  27,  "UM01",  "UM27", ""));
        codeSetVerifiers.put(             "ExternalPaymentCompensationReason1Code", cs->verifyCodeSet( cs,   1,  "VADA",  "VADA", ""));
    }

    static void verifyCodeSet(CodeSet codeSet, int expectedNumberOfCodes, String expectedFirstCode, String expectedLastCode, String expectedAdditionalColumns) {
        String firstCode, lastCode;
        int numCodes = codeSet.codes.size();
        if (numCodes == 0) {
            firstCode = "";
            lastCode = "";
        } else {
            firstCode = codeSet.codes.get(0).get(ColName.Code);
            lastCode = codeSet.codes.get(codeSet.codes.size() - 1).get(ColName.Code);
        }

        StringJoiner additionalColumns = new StringJoiner(",");
        for (ColName colName : codeSet.columns.keySet()) {
            if (colName.isMandatory)
                continue;
            additionalColumns.add(colName.name());
        }

        if (numCodes != expectedNumberOfCodes)
            throw new RuntimeException("Number of codes not as expected.");
        if (!firstCode.equals(expectedFirstCode))
            throw new RuntimeException("First code not as expected.");
        if (!lastCode.equals(expectedLastCode))
            throw new RuntimeException("Last code not as expected.");
        if (!additionalColumns.toString().equals(expectedAdditionalColumns))
            throw new RuntimeException("AdditionalColumns not as expected.");
    }

    static String dumpFirstAndLastCodes(CodeSet codeSet) {
        String firstCode, lastCode;
        int numCodes = codeSet.codes.size();
        if (numCodes == 0) {
            firstCode = "";
            lastCode = "";
        } else {
            firstCode = codeSet.codes.get(0).get(ColName.Code);
            lastCode = codeSet.codes.get(codeSet.codes.size() - 1).get(ColName.Code);
        }

        StringJoiner additionalColumns = new StringJoiner(",");
        for (ColName colName : codeSet.columns.keySet()) {
            if (colName.isMandatory)
                continue;
            additionalColumns.add(colName.name());
        }

        String line = "  codeSetVerifiers.put(\"" + codeSet.codeSetName + "\", cs->verifyCodeSet";
        line += "( cs, " + numCodes + ", \"" + firstCode + "\", \"" + lastCode + "\"));";
        line += " // " + codeSet.sheetName;

        ColName x[] = new ColName[] { ColName.Code, ColName.Name };
        //line = String.format("%32s : %5s - %5s %3d (%s)", codeSet.sheetName, firstCode, lastCode, numCodes, codeSet.codeSetName);
        //line = String.format("%32s : %3d %5s   %s", codeSet.sheetName, numCodes, lastCode, additionalColumns.toString());
        line = String.format("  codeSetVerifiers.put(%53s, cs->verifyCodeSet( cs, %3d, %7s, %7s, %s));", "\"" + codeSet.codeSetName + "\"", numCodes, "\"" + firstCode + "\"", "\"" + lastCode + "\"", "\"" + additionalColumns + "\"");
        return line;
    }

    static void dumpColumnNames(Map<String, CodeSet> codeSets) {
        LinkedHashMap<ColName, List<CodeSet>> colNames = new LinkedHashMap<>();
        for (CodeSet cs : codeSets.values()) {
            for (ColName colName : cs.columns.keySet()) {
                colNames.computeIfAbsent(colName, x -> new ArrayList<>()).add(cs);
            }
        }

        List<Map.Entry<ColName, List<CodeSet>>> entries = new ArrayList<>(colNames.entrySet());
        Collections.sort(entries, (e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));
        entries.stream().forEachOrdered(e -> {
            System.out.print(e.getKey() + " : ");
            if (e.getValue().size() == 1)
                System.out.println("Only in '" + e.getValue().get(0).sheetName + "' sheet");
            else
                System.out.println("Exists in " + e.getValue().size() + " codeSets");
        });
    }

    protected void processSheet(XSSFSheet ws) {
        try {
            CodeSet cs = new CodeSet(ws);
            codeSets.put(cs.codeSetName, cs);
        } catch (Exception e) {
            System.out.println("ERROR: " + ws.getSheetName() + " : " + e.getMessage());
            e.printStackTrace(System.out);
        }
    }

    static Function<String, ColName> normalizeColumnName = n -> {
        n = n.replace("\n", " ").replace("  ", " ");
        if (n.equals("Code") || n.equals("Code*"))
            return ColName.Code;
        if (n.equals("Name"))
            return ColName.Name;
        if (n.equals("Definition") || n.startsWith("Definition "))
            return ColName.Definition;
        if (n.equals("Origin/Requester"))
            return ColName.Origin;
        if (n.equals("Status"))
            return ColName.Status;
        if (n.equals("Status Date"))
            return ColName.StatusDate;
        if (n.equals("Classification") || n.equals("Classification1"))
            return ColName.Classification;
        if (n.equals("Introduced Date"))
            return ColName.IntroducedDate;
        if (n.equals("Country"))
            return ColName.Country;
        if (n.equals("Example"))
            return ColName.Example;
        if (n.equals("Region"))
            return ColName.Region;
        if (n.startsWith("Bank Identifier") && n.contains("Length"))
            return ColName.BankIdPattern;
        if (n.equals("ISO Country Code"))
            return ColName.ISOCountryCode;
        if (n.equals("ISO Currency Code"))
            return ColName.ISOCurrencyCode;
        if (n.equals("Payment System"))
            return ColName.PaymentSystem;
        if (n.contains("DD/CT") && n.contains("Both") && n.contains("Other"))
            return ColName.DD_CT;
        if (n.contains("Corp2Bk") && n.contains("Bk2Bk") && n.contains("Both"))
            return ColName.Bk2Bk;
        if (n.equals("ISO 15022"))
            return ColName.ISO15022;
        return null;
    };

    public static class CodeSet {
        public String sheetName;
        public String codeSetName;
        int headerRow;
        public LinkedHashMap<ColName, Integer> columns;
        public List<LinkedHashMap<ColName, String>> codes = new ArrayList<>();

        CodeSet(XSSFSheet xlsxSheet) {
            sheetName = xlsxSheet.getSheetName();
            codeSetName = getSafeCellString(xlsxSheet.getRow(1).getCell(0));
            if (!codeSetName.startsWith("External"))
                throw new IllegalArgumentException("Invalid sheet name: " + codeSetName + "( Sheet: " + sheetName + ")");

            // Find header row
            for (int r = 3; r < 12; r++) {
                XSSFRow row = xlsxSheet.getRow(r);
                if (row == null)
                    continue;
                List<String> list = getRowAsList(row, 20);
                List<ColName> colNames = new ArrayList<>();
                for (String colTxt : list) {
                    ColName colName = normalizeColumnName.apply(colTxt);
                    if (colName != null) {
                        colNames.add(colName);
                    }
                }
                if (!colNames.contains(ColName.Code))
                    continue;
                if (!colNames.contains(ColName.StatusDate))
                    continue;

                // At this point we found the header row!
                headerRow = r;

                columns = new LinkedHashMap<>();
                for (int c = 0; c < list.size(); c++) {
                    String colTxt = list.get(c).trim();
                    if (colTxt.length() == 0)
                        continue;
                    ColName colName = normalizeColumnName.apply(colTxt);
                    if (colName == null)
                        throw new RuntimeException("Unknown column name: " + colTxt);
                    columns.put(colName, c);
                }
                break;
            }
            if (headerRow == 0)
                throw new IllegalArgumentException("Header column not found ( Sheet: " + xlsxSheet.getSheetName() + ")");

            // Verify all mandatory column present
            for (ColName colName : ColName.values()) {
                if (!colName.isMandatory)
                    continue;
                if (!columns.containsKey(colName))
                    throw new IllegalArgumentException("Missing mandatory column " + colName + " ( Sheet: " + xlsxSheet.getSheetName() + ")");
            }

            codes = new ArrayList<>();
            for (int r = headerRow + 1;; r++) {
                XSSFRow row = xlsxSheet.getRow(r);
                if (row == null)
                    break;
                LinkedHashMap<ColName, String> map = getRowAsMap(row, columns);
                if (!map.containsKey(ColName.Status))
                    break;
                String name = map.get(ColName.Name);
                if (name == null || name.trim().isEmpty())
                    break;
                codes.add(map);
            }
            
            if( "ExternalContractClosureReason1Code".equals(codeSetName) ) {
            	// Two tables on same sheet
                for (int r = 22 + 1;; r++) {
                    XSSFRow row = xlsxSheet.getRow(r);
                    if (row == null)
                        break;
                    LinkedHashMap<ColName, String> map = getRowAsMap(row, columns);
                    if (!map.containsKey(ColName.Status))
                        break;
                    String name = map.get(ColName.Name);
                    if (name == null || name.trim().isEmpty())
                        break;
                    codes.add(map);
                }            	
            }
        }

    }

    /**
     * @return the trimmeg string value of the cell, otherwise empty string.
     */
    static String getSafeCellString(XSSFCell cell) {
        if (cell == null || !cell.getCellTypeEnum().equals(CellType.STRING))
            return "";
        String value = cell.getStringCellValue();
        if (value == null)
            return "";
        return value.trim();
    }

    static List<String> getRowAsList(XSSFRow row, int maxCol) {
        List<String> ret = new ArrayList<>();
        for (int c = 0; c < maxCol; c++) {
            XSSFCell cell = row.getCell(c);
            String value = getSafeCellString(cell);
            ret.add(value);
        }
        return ret;
    }

    static LinkedHashMap<ColName, String> getRowAsMap(XSSFRow row, LinkedHashMap<ColName, Integer> columns) {
        LinkedHashMap<ColName, String> ret = new LinkedHashMap<>();
        for (Entry<ColName, Integer> e : columns.entrySet()) {
            XSSFCell cell = row.getCell(e.getValue());
            String value = getSafeCellString(cell);
            ret.put(e.getKey(), value);
        }
        return ret;
    }

}
