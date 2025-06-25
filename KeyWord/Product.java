public class Product {

    // Static variable shared by all products
    static double discount = 0.0;

    // Final variable for unique product ID
    private final String productID;

    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to initialize variables
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Getters and setters for productName, price, and quantity
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductID() {
        return productID;
    }

    // Method to process product details with instanceof check
    public void processProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Object is not an instance of Product");
        }
    }

    public static void main(String[] args) {
        Product.updateDiscount(10.0);

        Product product1 = new Product("Laptop", 1200.00, 2, "P001");
        Product product2 = new Product("Smartphone", 800.00, 3, "P002");

        product1.processProductDetails();
        product2.processProductDetails();

        // Demonstrating that productID cannot be changed
        // product1.productID = "P999"; // This line would cause a compilation error

        product1.setPrice(1100.00);
        product1.processProductDetails();
    }
}
