package test;

public class Contact {
    String Name;
    Integer Phone;
    public Contact(String name, Integer phone) {
        this.Name = name;
        this.Phone = phone;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }
}
