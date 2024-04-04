package org.tarik.creational.factory;

public class Main {

    public static void main(String[] args) {
        PDF pdf = (PDF) DocumentFactory.getDocument(DocumentType.PDF);
        PDF pdf2 = (PDF) DocumentFactory.getDocument(DocumentType.PDF);

        Excel excel = (Excel) DocumentFactory.getDocument(DocumentType.EXCEL);
    }
}
