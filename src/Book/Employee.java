package Book;


import java.time.LocalDateTime;

public class Employee {
    private int id;
    private String name;
    private String phone;
    private LocalDateTime exp;
    private static int currId = 0;
    public Employee(String name, String phone, LocalDateTime exp) {
        this.id = ++currId;
        this.name = name;
        this.phone = phone;
        this.exp = exp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDateTime getExp() {
        return exp;
    }

    public int getWorkingYears(){
        int start = exp.getYear();
        int now = LocalDateTime.now().getYear();
        return now - start;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", exp=" + exp +
                '}';
    }
}
