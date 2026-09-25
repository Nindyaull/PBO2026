package quiz_1.no1;

public class DemoPenjualan {
    public static void main(String[] args) {
        Stock stockTas = new Stock(1001, 55, 101);
        Stock stockJamTangan = new Stock(1002, 35, 101);

        Product p1 = new Product(1001, 170000.0f, "Tas", stockTas);
        Product p2 = new Product(1002, 300000, "Jam Tangan", stockJamTangan);

        Customer c1 = new Customer(1, "Nindya", "Kediri", "0881027755651");

        Order order1 = new  Order(7001, c1, 400000.0f);
        order1.addProductToOrder(p1);
        order1.addProductToOrder(p2);

        System.out.println(order1.getInfo());
    }
}
