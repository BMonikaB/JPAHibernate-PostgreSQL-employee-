package bazy.domain;


import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surName;
    @Embedded
    private Dane dane;
    @OneToOne(cascade = CascadeType.ALL)
    private Payment payment;
    @ManyToOne
    private Work work;


    private Employee(){

    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Employee(String name, String surName, String payment) {
        this.name = name;
        this.surName = surName;
        this.payment = new Payment(payment);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
