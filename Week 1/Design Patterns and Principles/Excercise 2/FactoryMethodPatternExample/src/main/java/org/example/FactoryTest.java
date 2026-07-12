package org.example;

public class FactoryTest {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();

        System.out.println(word.getClass().getSimpleName());
        System.out.println(pdf.getClass().getSimpleName());
        System.out.println(excel.getClass().getSimpleName());
    }
}