package org.tarik.creational.factory;

public class DocumentFactory {
    public static Document getDocument(DocumentType type){
        if (type == null) {
            throw new IllegalArgumentException("Document type cannot be null");
        }
        return switch (type) {
            case PDF -> new PDF();
            case EXCEL -> new Excel();
            case WORD -> new Word();
            default -> throw  new IllegalArgumentException("");
        };
    }
}
