package bazy.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String wyplata;

    public Payment(String payment) {
        this.wyplata = payment;
    }

    private Payment() {
    }

    ;

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", payment='" + wyplata + '\'' +
                '}';
    }
}
