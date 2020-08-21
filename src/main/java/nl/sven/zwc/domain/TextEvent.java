package nl.sven.zwc.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class TextEvent {

    @XmlAttribute(name="Duration")
    private int durationInSeconds;
    @XmlAttribute(name="message")
    private String message;
    @XmlAttribute(name="TimeOffset")
    private int timeOffset1;
    @XmlAttribute(name="timeOffset")
    private int timeOffset2;

    public TextEvent() {
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTimeOffset1() {
        return timeOffset1;
    }

    public void setTimeOffset1(int timeOffset1) {
        this.timeOffset1 = timeOffset1;
    }

    public int getTimeOffset2() {
        return timeOffset2;
    }

    public void setTimeOffset2(int timeOffset2) {
        this.timeOffset2 = timeOffset2;
    }
}
