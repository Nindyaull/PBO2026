package quiz_1.no1;

public class Product {
    private int productId;
    private float productPrice;
    private String productType;
    private Stock stock;

    public Product(int productId, float price, String type, Stock stock) {
        this.productId = productId;
        this.productPrice = price;
        this.productType = type;
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProdyctPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void addProduct() {
        System.out.println("Produk ditambahkan.");
    }

    public void modifyProduct() {
        System.out.println("Produk diperbarui.");
    }

    public Product selectProduct(int productId) {
        return this;
    }

    public String getInfo() {
        return "Produk ID: " + productId + "\n" +
                "- Jenis  : " + productType + "\n" +
                "- Harga  : Rp " + productPrice + "\n" +
                "- " + (stock != null ? stock.getInfo() : "Stok tidak tersedia"); 
    }
}
