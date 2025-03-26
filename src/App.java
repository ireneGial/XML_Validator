import controller.ProductController;
import javax.swing.SwingUtilities;
import view.ProductView;
import view.XMLLoaderGUI;

public class App {
   public static void main(String[] args) {
     ProductView view = new ProductView();

    ProductController controller = new ProductController(view);
    SwingUtilities.invokeLater(XMLLoaderGUI::new);


    controller.loadProducts("src/test.xml");
    }
}
