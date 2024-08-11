package hibernate_one_to_one.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name ="employees")
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private  String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "department")
    private String department;
    @Column(name = "salary")
    private  int salary;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private  Detail empDetail;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


}
