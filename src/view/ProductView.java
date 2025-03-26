package view;

import java.util.List;
import model.Product;

public class ProductView {
    
    // Μέθοδος για την εμφάνιση των προϊόντων στην κονσόλα
    public void displayProducts(List<Product> products) {
        if (products == null || products.isEmpty()) {
            System.out.println("No products found.");
            return;
        }

        System.out.println("Products List:");
        for (Product product : products) {
            System.out.println("--------------------------");
            System.out.println("ID: " + product.getId());
            System.out.println("Title: " + product.getTitle());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Product Link: " + product.getProductLink());
            System.out.println("Product Image: " + product.getProductImage());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Weight: " + product.getWeight());
            System.out.println("Shipping Cost: " + product.getShippingCost());
            System.out.println("--------------------------");
        }
    }
}
