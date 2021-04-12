package Main;

import Entities.Autor;
import Entities.Revista;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.List;

public class AutorJPAManager {

    private static EntityManagerFactory emf;

    public static void main(String[] args) throws IOException {
        try {
            emf = Persistence.createEntityManagerFactory("magazine");
        } catch (Throwable ex) {
            System.err.println("Failed to create EntityManagerFactory object."
                    + ex);
            throw new ExceptionInInitializerError(ex);
        }
        AutorJPAManager MA = new AutorJPAManager();
        FileAccessor fa;
        fa = new FileAccessor();
        fa.readAutorsFile("src/main/java/Docs/autors.txt");
        System.out.println("Autors llegits des del fitxer");
        for (int i = 0; i < fa.llistaAutors.size(); i++) {
            System.out.println(fa.llistaAutors.get(i).toString());
            MA.addAutor(fa.llistaAutors.get(i));
        }
        System.out.println("Autors llegits de la base de dades");
        MA.listAutors();
        MA.deleteAutor(5);
        MA.updateAutor(12, false);
        System.out
                .println("Autors llegits de la base de dades després de des actualitzacions");
        MA.listAutors();
    }

    /* Method to CREATE an Autor in the database */
    public void addAutor(Autor autor) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Autor autor2 = em.find(Autor.class, autor.getId_autor());
        if (autor2 == null){
            System.out.println("insert autor");
            em.persist(autor); //fa un insert
        }else {
            System.out.println("update autor");
            em.merge(autor); //fa un update
        }
        em.getTransaction().commit();
        em.close();
    }

    /* Method to CREATE an Autor in the database */
    public void addRevista(Revista revista) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Revista revista1 = em.find(Revista.class, revista.getId_revista());
        if (revista1 == null){
            System.out.println("insert revista");
            em.persist(revista); //fa un insert
        }else {
            System.out.println("update revista");
            em.merge(revista); //fa un update
        }
        em.getTransaction().commit();
        em.close();
    }

    /* Method to READ all Autors */
    public void listAutors() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Autor> result = em.createQuery("from Autor", Autor.class)
                .getResultList();
        for (Autor autor : result) {
            System.out.println(autor.toString());
        }
        em.getTransaction().commit();
        em.close();
    }

    /* Method to READ all Autors */
    public void listRevista() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Revista> result = em.createQuery("from Revista", Revista.class)
                .getResultList();
        for (Revista revista : result) {
            System.out.println(revista.toString());
        }
        em.getTransaction().commit();
        em.close();
    }

    /* Method to UPDATE activity for an autor */
    public void updateAutor(Integer AutorID, boolean actiu) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Autor autor = em.find(Autor.class, AutorID);
        autor.setActiu(actiu);
        em.merge(autor);
        em.getTransaction().commit();
        em.close();
    }

    /* Method to UPDATE activity for an autor */
    public void updateRevista(Integer revistaID, String titol) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Revista revista = em.find(Revista.class, revistaID);
        revista.setTitol(titol);
        em.merge(revista);
        em.getTransaction().commit();
        em.close();
    }

    /* Method to DELETE an employee from the records */
    public void deleteAutor(Integer AutorID) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Autor autor = em.find(Autor.class, AutorID);
        em.remove(autor);
        em.getTransaction().commit();
        em.close();
    }

    /* Method to DELETE an employee from the records */
    public void deleteRevista(Integer revistaID) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Revista revista = em.find(Revista.class, revistaID);
        em.remove(revista);
        em.getTransaction().commit();
        em.close();
    }
}
