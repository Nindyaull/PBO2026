package quiz_2;

public class Person {
  protected String userId;
  protected String name;
  
  public Person (String userId, String name) {
    this.userId = userId;
    this.name = name;
  }

  public boolean login() {
    System.out.println(name + " berhasil login ke sistem.");
    return true;
  }

  public String getInfo() {
    return "ID : " + userId + " | Nama : " + name;
  }

  public String getDashboard() {
    return "Menampilkan dashboard umum";
  } 
}
