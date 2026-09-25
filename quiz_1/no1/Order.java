package quiz_1.no1;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int orderId;
    private Customer customer;
    private ArrayList<Product> products;
    private float amount;
    private Date orderDate;

    public Order(int orderId, Customer customer, float amount) {
        this.orderId = orderId;
        this.customer = customer;
        this.amount = amount;
        this.products = new ArrayList<>();
        this.orderDate = new Date();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return  customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void addProductToOrder(Product product) {
        this.products.add(product);
    }

    public String getInfo() {
        String productListInfo = "";
        for (int i = 0; i < products.size(); i++) {
            productListInfo += "[" + (i+1) + "]" + products.get(i).getInfo() + "\n";
        }

        String customerInfo = (customer != null) ? customer.getInfo() : "Tidak ada data customer";

        return "========== DETAIL ORDER ==========\n" +
                "Order ID     : " + orderId + "\n" +
                "Tanggal      : " + orderDate + "\n" +
                "Total Bayar  : " + amount + "\n" +
                "---------------------------------\n" +
                "INFORMASI PELANGGAN:\n" +
                customerInfo + "\n" +
                "---------------------------------\n" +
                "DAFTAR PRODUK (" + products.size() + " item):\n" +
                productListInfo +
                "=================================";
    }
}
