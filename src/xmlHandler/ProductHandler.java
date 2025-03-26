package xmlHandler;

import model.Product;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class ProductHandler extends DefaultHandler {
    private ArrayList<Product> products;  // Λίστα με τα προϊόντα
    private Product currentProduct;       // Το τρέχον προϊόν
    private String currentElement;        // Το τρέχον στοιχείο του XML

    public ProductHandler() {
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentElement = qName;

        if (currentElement.equalsIgnoreCase("product")) {
            // Δημιουργία νέου αντικειμένου Product για κάθε νέο προϊόν
            currentProduct = new Product("", "", 0.0f, "", "", "", 0, 0.0f);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String content = new String(ch, start, length).trim();

        if (content.isEmpty()) return;

        // Επεξεργασία κάθε στοιχείου του XML
        switch (currentElement) {
            case "id":
                currentProduct.setId(content);
                break;
            case "title":
                currentProduct.setTitle(content);
                break;
            case "price":
                currentProduct.setPrice(Float.parseFloat(content));
                break;
            case "productLink":
                currentProduct.setProductLink(content);
                break;
            case "productImage":
                currentProduct.setProductImage(content);
                break;
            case "category":
                currentProduct.setCategory(content);
                break;
            case "weight":
                currentProduct.setWeight(Integer.parseInt(content));
                break;
            case "shippingCost":
                currentProduct.setShippingCost(Float.parseFloat(content));
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("product")) {
            // Όταν τελειώνει το στοιχείο product, το προσθέτουμε στη λίστα
            products.add(currentProduct);
        }
    }
}