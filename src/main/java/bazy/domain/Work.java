package bazy.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy = "work")
    private Set<Employee> employeeSet = new HashSet<Employee>();

    public Work(String name) {
        this.name = name;
    }
    private Work(){};

    public void addEmployee(Employee employee){
        employeeSet.add(employee);
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeSet=" + employeeSet +
                '}';
    }
}
