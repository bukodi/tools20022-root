import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.xml.sax.InputSource;

import com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msgpart.GroupHeader33;

public class ParsePacs008 {
	
	@Test
	public void testName() throws Exception {
		JAXBContext ctx = TestUtil.createJaxbContext();
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

		
	}

}
