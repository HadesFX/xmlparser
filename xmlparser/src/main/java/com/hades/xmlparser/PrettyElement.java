package com.hades.xmlparser;

import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.tree.DefaultElement;

public class PrettyElement extends DefaultElement {

    private int lineNum = 0, colNum = 0;

    public PrettyElement(QName qname) {
        super(qname);
        // TODO Auto-generated constructor stub
    }

    public PrettyElement(QName qname, int attrCount) {
        super(qname, attrCount);
    }

    public PrettyElement(String name) {
        super(name);
    }

    public PrettyElement(String name, Namespace namespace) {
        super(name, namespace);
    }

    public int getColumnNumber() {
        return this.colNum;
    }

    public int getLineNumber() {
        return this.lineNum;
    }

    public void setLocation(int lineNum, int colNum) {
        this.lineNum = lineNum;
        this.colNum = colNum;
    }
}
