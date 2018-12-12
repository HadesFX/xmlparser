package com.hades.xmlparser;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.Locator;
import org.xml.sax.helpers.LocatorImpl;

import java.io.File;
import java.util.Iterator;

public class TestMain {
    public static void main(String[] args) throws DocumentException {
        Locator locator = new LocatorImpl();
        DocumentFactory docFactory = new DocumentFactoryWithLocator(locator);
        SAXReader reader = new PrettySAXReader(docFactory, locator);
        Document document = reader.read(new File("src/main/resources/test.xml"));
        Element root = document.getRootElement();
        for (Iterator i = root.elementIterator(); i.hasNext();) {
            PrettyElement e = (PrettyElement) i.next();
            int num = e.getLineNumber();
            System.out.println(e.getName());
            System.out.println(num);
        }
    }
}
