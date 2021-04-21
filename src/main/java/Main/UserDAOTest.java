package Main;

import Entities.Equipo;
import Entities.Jugador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAOTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("statson");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Equipo equipo = entityManager.find(Equipo.class, 77);

        Jugador persona = new Jugador();
        persona.setNom("Dani");
        persona.setDorsal(12);
        persona.setId_persona(1);
        persona.setEquipo(equipo);

        entityManager.persist(persona);
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }
}