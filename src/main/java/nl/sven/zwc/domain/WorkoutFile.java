package nl.sven.zwc.domain;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * https://github.com/h4l/zwift-workout-file-reference/blob/master/zwift_workout_file_tag_reference.md
 */
@XmlRootElement(name = "workout_file")
@XmlAccessorType(XmlAccessType.FIELD)
public class WorkoutFile {

    @XmlElement
    private String activitySaveName;
    @XmlElement
    private String author;
    @XmlElement(name="author_alias")
    private String authorAlias;
//    leaving this out for now.
//    @XmlElement
//    private String authorIcon;
    @XmlElement
    private String category;
    @XmlElement
    private String categoryIndex;
    @XmlElement
    private String description;
    @XmlElement
    private String entid;
    @XmlElement
    private int ftpOverride;
    @XmlElement
    private String name;
    @XmlElement
    private String overrideHash;
    @XmlElement
    private int painIndex;
    @XmlElement(name="ShowCP20")
    private int showCp20;
    @XmlElement(name="Skipable")
    private int skipable;
    @XmlElement
    private SportType sportType;
    @XmlElement(name="subcategory")
    private String subCategory;
    @XmlElementWrapper(name="tags")
    @XmlElement(name="tag")
    private List<String> tags = new ArrayList<>();
    @XmlElement(name="test_details")
    private TestDetails testDetails;
    @XmlElement(name="visibleAfterTime")
    private int visibleAfterTime;
    @XmlElement(name="visibleOutsidePlan")
    private int visibleOutsidePlan;

    public void addTag(String tag){
        this.tags.add(tag);
    }


}
