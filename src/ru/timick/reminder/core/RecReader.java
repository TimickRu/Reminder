package ru.timick.reminder.core;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "recordings")
public class RecReader {
    private List recordings;

    @XmlElement(name = "recordings")
    public List getRecordings() {
        return recordings;
    }

    public void setRecordings(List recordings) {
        this.recordings = recordings;
    }
}
