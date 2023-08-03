import java.util.List;

public class Product {
    private int id;
    private String name;
    private double price;
    private Department department;
    private List<Address> addresses;

    public Product(int id, String name, double price, Department department, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.department = department;
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id= " + id +
                ", name=' " + name + '\'' +
                ", price= " + price +
                ", department= " + department.getName() +
                ",\naddress 1= City IS: " + addresses.get(0).getCity() + " ,ID IS: " + addresses.get(0).getId() +
                "\naddress 2= City IS: " + addresses.get(1).getCity() + " ,ID IS: " + addresses.get(1).getId() +
                "\naddress 3= City IS: " + addresses.get(2).getCity() + " ,ID IS: " + addresses.get(2).getId() +
                '}';
    }
}
