package nl.sven.zwc.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;

public class TestDetailsMarshallTest {

    private static final String RESULT = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><testDetails " +
            "name=\"name\" paceid=\"1\" tracking_text_paceid=\"2\" tracking_text_post=\"post\" tracking_text_pre=\"pre\" " +
            "xmlns=\"nl.sven.zwc.model\"/>";

    private JAXBContext jaxbContext;
    private Marshaller jaxbMarshaller;

    public  TestDetailsMarshallTest() {
        try {
            jaxbContext = JAXBContext.newInstance(TestDetails.class);
            jaxbMarshaller = jaxbContext.createMarshaller();
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testMarshall() {
        TestDetails testDetails = new TestDetails();
        testDetails.setName("name");
        testDetails.setPaceId(1);
        testDetails.setTrackingTextPaceId(2);
        testDetails.setTrackingTextPost("post");
        testDetails.setTrackingTextPre("pre");
        StringWriter writer = new StringWriter();
        try {
            QName qName = new QName("nl.sven.zwc.model", "testDetails");
            JAXBElement<TestDetails> root = new JAXBElement<>(qName, TestDetails.class, testDetails);
            jaxbMarshaller.marshal(root, writer);
            String result = writer.toString();
            Assertions.assertEquals(result, RESULT);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
}
