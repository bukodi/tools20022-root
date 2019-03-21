import org.junit.Test;

public class ParsePacs008 {
	
	@Test
	public void test_pacs008() throws Exception {
/*		JAXBContext ctx = JAXBContext.newInstance( FIToFICustomerCreditTransferV02.Document.class );
		{
			FIToFICustomerCreditTransferV02 msg = new FIToFICustomerCreditTransferV02();
			GroupHeader33 groupHeader = new GroupHeader33();
			groupHeader.setMessageIdentification( new  Max35Text("Cica"));
			msg.setGroupHeader(groupHeader );
			FIToFICustomerCreditTransferV02.Document doc = new FIToFICustomerCreditTransferV02.Document();
			
			doc.messageBody = msg;

			Marshaller marshaller = ctx.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			StreamResult writer = new StreamResult(baos);
			marshaller.marshal(doc, writer);

			String xml = new String(baos.toByteArray(), StandardCharsets.UTF_8);
			System.out.println(xml);
		}
		
		
		InputStream is = ParsePacs008.class.getResourceAsStream("/testMessages/pacs008_1.xml");
		byte[] bytes = TestUtil.readFully(is);
		
		Unmarshaller unmarshaller = ctx.createUnmarshaller();
		InputSource jaxbIs = new InputSource( new ByteArrayInputStream(bytes));
		Object obj = unmarshaller.unmarshal(jaxbIs);

		FIToFICustomerCreditTransferV02.Document doc = (FIToFICustomerCreditTransferV02.Document) obj;
		FIToFICustomerCreditTransferV02 msg = doc.messageBody;
		
		{
			ActiveCurrencyAndAmount currAndAmount = msg.getGroupHeader().getTotalInterbankSettlementAmount().get();		
			System.out.println( "GroupHeader/TotalInterbankSettlementAmount: " + currAndAmount.getAmount() + " "+ currAndAmount.getCurrency());			
		}
		{
			Max35Text msgId = msg.getGroupHeader().getMessageIdentification();		
			System.out.println( "GroupHeader/MessageIdentification: " + msgId);			
		}

	*/	
	}

}
