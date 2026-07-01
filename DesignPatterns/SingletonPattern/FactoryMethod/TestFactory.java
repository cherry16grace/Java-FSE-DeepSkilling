public class TestFactory {

    public static void main(String[] args) {

        DocumentFactory f=new PdfFactory();

        Document d=f.createDocument();

        d.open();
    }
}