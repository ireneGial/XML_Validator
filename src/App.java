import controller.ProductController;
import view.ProductView;

public class App {
   public static void main(String[] args) {
     ProductView view = new ProductView();

    ProductController controller = new ProductController(view);

    controller.loadProducts("src/test.xml");
    }
}
