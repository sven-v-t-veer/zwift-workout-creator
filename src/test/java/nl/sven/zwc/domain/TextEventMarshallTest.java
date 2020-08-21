package nl.sven.zwc.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;

public class TextEventMarshallTest {

    private static final String RESULT = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
            "<textEvent Duration=\"10\" message=\"message\" TimeOffset=\"1\" timeOffset=\"2\" xmlns=\"nl.sven.zwc.model\"/>";

    private JAXBContext jaxbContext;
    private Marshaller jaxbMarshaller;

    public TextEventMarshallTest() {
        try {
            jaxbContext = JAXBContext.newInstance(TextEvent.class);
            jaxbMarshaller = jaxbContext.createMarshaller();
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testMarshall() {
        TextEvent textEvent = new TextEvent();
        textEvent.setDurationInSeconds(10);
        textEvent.setMessage("message");
        textEvent.setTimeOffset1(1);
        textEvent.setTimeOffset2(2);
        StringWriter writer = new StringWriter();
        try {
            QName qName = new QName("nl.sven.zwc.model", "textEvent");
            JAXBElement<TextEvent> root = new JAXBElement<>(qName, TextEvent.class, textEvent);
            jaxbMarshaller.marshal(root, writer);
            String result = writer.toString();
            Assertions.assertEquals(result, RESULT);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
}
