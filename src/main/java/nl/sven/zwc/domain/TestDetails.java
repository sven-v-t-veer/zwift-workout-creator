package nl.sven.zwc.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class TestDetails {

    @XmlAttribute(name="name")
    private String name;
    @XmlAttribute(name="paceid")
    private int paceId;
    @XmlAttribute(name="tracking_text_paceid")
    private int trackingTextPaceId;
    @XmlAttribute(name="tracking_text_post")
    private String trackingTextPost;
    @XmlAttribute(name="tracking_text_pre")
    private String trackingTextPre;

    public TestDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaceId() {
        return paceId;
    }

    public void setPaceId(int paceId) {
        this.paceId = paceId;
    }

    public int getTrackingTextPaceId() {
        return trackingTextPaceId;
    }

    public void setTrackingTextPaceId(int trackingTextPaceId) {
        this.trackingTextPaceId = trackingTextPaceId;
    }

    public String getTrackingTextPost() {
        return trackingTextPost;
    }

    public void setTrackingTextPost(String trackingTextPost) {
        this.trackingTextPost = trackingTextPost;
    }

    public String getTrackingTextPre() {
        return trackingTextPre;
    }

    public void setTrackingTextPre(String trackingTextPre) {
        this.trackingTextPre = trackingTextPre;
    }
}
