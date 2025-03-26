package controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import model.Product;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import view.ProductView;
import xmlHandler.ProductHandler;

public class ProductController {
    private ProductView view;
    private List<Product> products;

    public ProductController(ProductView view) {
        this.view = view;
    }

    public void loadProducts(String filePath) {
        try {
            // Δημιουργία XMLReader (SAX Parser)
            XMLReader xmlReader = XMLReaderFactory.createXMLReader();
            ProductHandler handler = new ProductHandler();  // Δημιουργία του handler
            xmlReader.setContentHandler(handler);  // Ορισμός του handler για τη διαχείριση του XML

            // Ανάγνωση του XML αρχείου
            xmlReader.parse(new InputSource(new FileReader(filePath)));

            // Παίρνουμε τα προϊόντα από το handler
            products = handler.getProducts();

            // Εμφανίζουμε τα προϊόντα μέσω του view
            view.displayProducts(products);

        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
