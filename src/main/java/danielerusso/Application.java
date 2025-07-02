package danielerusso;

import danielerusso.DAO.EventDAO;
import danielerusso.DAO.LocationDAO;
import danielerusso.DAO.ParticipationDAO;
import danielerusso.DAO.PersonDAO;
import danielerusso.entities.Event;
import danielerusso.entities.EventType;
import danielerusso.entities.GenderType;
import danielerusso.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4w3d3pu");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        System.out.println("Hello World!");

        EventDAO ed = new EventDAO(em);
        PersonDAO pd = new PersonDAO(em);
        LocationDAO ld = new LocationDAO(em);
        ParticipationDAO partd = new ParticipationDAO(em);

        Event event1 = new Event("Welcome Party", LocalDate.now(), "Welcome back party for dad!", EventType.PRIVATE, 30);
        Event event2 = new Event("Book ShowCase", LocalDate.of(2020, 1, 25), "Come see newest books of our neighbourhood.", EventType.PUBBLIC, 150);
        Event event3 = new Event("Open House", LocalDate.now().plusMonths(3), "Open house with buffet", EventType.PUBBLIC, 10);

        Person person1 = new Person("Mario", "Rossi", "mariorossi@gmail.com", LocalDate.of(1985, 05, 18), GenderType.MALE);
        Person person2 = new Person("Giuseppe", "Verdi", "verdibeppe@gmail.com", LocalDate.of(1813, 10, 10), GenderType.MALE);
        Person person3 = new Person("Marie", "Curie", "curiemarie@gmail.com", LocalDate.of(1867, 11, 7), GenderType.FEMALE);

        //  ed.save(event2);
        //  ed.save(event3);
    }
}
