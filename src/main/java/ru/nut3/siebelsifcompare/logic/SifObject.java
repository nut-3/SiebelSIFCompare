package ru.nut3.siebelsifcompare.logic;

//@XmlRootElement(name = "REPOSITORY")

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
