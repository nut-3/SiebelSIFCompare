package ru.nut3.siebelsifcompare.logic;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "REPOSITORY")
//@XmlType(propOrder = {"NAME", "UPDATED_BY"})
public class SifObject {
    private String file;
    private String name;
    private String createdBy;

    public SifObject(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return name + " " + createdBy;
    }
}
