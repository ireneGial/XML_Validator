package model;

public class Product {
    private String id;
    private String title;
    private float price;
    private String productLink;
    private String productImage;
    private String category;
    private int weight;
    private float shippingCost;

    public Product(String id, String title, float price, String productLink, String productImage, 
                   String category, int weight, float shippingCost) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.productLink = productLink;
        this.productImage = productImage;
        this.category = category;
        this.weight = weight; //later we will fix it to take string and convert it to int eg. 1KG make it 1000
        this.shippingCost = shippingCost;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(float shippingCost) {
        this.shippingCost = shippingCost;
    }

}
