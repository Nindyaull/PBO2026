package quiz_1.no1;

public class Stock {
    private int productId;
    private int quantity;
    private int shopNo;
    
    public Stock(int productId, int quantity, int shopNo) {
        this.productId = productId;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public void addStock() {
        System.out.println("Stok ditambahkan.");
    }

    public void modifyStock(int productId) {
        this.productId = productId;
    }

    public Stock selectStockItem(int productId) {
        return  this;
    }

    public String getInfo() {
        return "Stok [Product ID: " + productId + " | Jumlah: " + quantity + " | Toko #: " + shopNo + "]";
    }
}
