package bazy;


import bazy.domain.Employee;
import bazy.domain.Work;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AplikacjaPostgreSQL");
    static EntityManager manager = entityManagerFactory.createEntityManager();

    public static void main(String[] args) {



        Employee ania = manager.merge(new Employee("Ania", "Kot", "11"));
        Work jakasFirma = manager.merge(new Work("jakasFirma"));
        manager.getTransaction().begin();
        manager.merge(ania);
        manager.merge(jakasFirma);
        ania.setWork(jakasFirma);

        manager.getTransaction().commit();
        jakasFirma.addEmployee(ania);


        Work uniwersity = manager.find(Work.class, 3);
        System.out.println(uniwersity);
    }

}
