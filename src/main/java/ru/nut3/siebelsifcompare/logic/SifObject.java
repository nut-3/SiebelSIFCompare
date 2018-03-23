package ru.nut3.siebelsifcompare.logic;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="REPOSITORY")
public class SifObject {
    @XmlAttribute(name="NAME")
    private String name;
    @XmlAttribute(name="CREATED_BY")
    private String createdBy;

    @Override
    public String toString() {
        return "SifObject{" +
                "name='" + name + '\'' +
                ", createdBy='" + createdBy + '\'' +
                '}';
    }
}