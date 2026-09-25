package quiz_1.no1;

public class Customer {
    private int custromerId;
    private String custromerName;    
    private String address;
    private String phone;

    public Customer (int customerId, String customerName, String address, String phone) {
      this.custromerId = customerId;
      this.custromerName = customerName;
      this.address = address;
      this.phone = phone;  
    }

    public int getCustomerId() {
        return custromerId;
    }

    public void setCustomerId(int customerId) {
        this.custromerId = customerId;
    }

    public String getCustomerName() {
        return custromerName;
    }

    public void setCustomerName(String customerName) {
        this.custromerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addCustomer() {
    }

    public void editCustomer() {
    }

    public void deleteCustomer() {
    }

    public String getInfo() {
        return "Customer ID : " + custromerId + "\n" +
                " - Nama    : " + custromerName + "\n" +
                " - Alamat  : " + address + "\n" +
                " - No. Telp: " + phone;
    }
}
