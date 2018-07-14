package bazy.domain;


import javax.persistence.*;

@Entity
public class Boss {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surName;
    @Embedded
    Dane dane;

    public Boss(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
