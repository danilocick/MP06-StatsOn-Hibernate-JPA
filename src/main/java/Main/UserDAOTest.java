package Main;

import Entities.Entrenador;
import Entities.Equipo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAOTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("statson");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Equipo equipo = new Equipo();
        equipo.setNom("Sa");
        equipo.setId_equipo(4);

        entityManager.persist(equipo);
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }
}