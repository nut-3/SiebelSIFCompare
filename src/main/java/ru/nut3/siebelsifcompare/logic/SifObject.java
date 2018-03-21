package ru.nut3.siebelsifcompare.logic;



import javax.xml.catalog.Catalog;
import java.util.stream.Stream;

public class SifObject implements Catalog {
    @Override
    public String matchSystem(String systemId) {
        return null;
    }

    @Override
    public String matchPublic(String publicId) {
        return null;
    }

    @Override
    public String matchURI(String uri) {
        return null;
    }

    @Override
    public Stream<Catalog> catalogs() {
        return null;
    }
}
