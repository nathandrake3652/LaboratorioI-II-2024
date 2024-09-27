package cl.ucn.modelo;

import cl.ucn.Interfaz.proxy;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.*;

public class Databaseconec implements proxy {
    private int data;
    private String query;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("multimediaApp");
    EntityManager em = emf.createEntityManager();
 
    public Databaseconec(int data, String query){
        this.data = 89830291;
        this.query = "SELECT u from Usuario u WHERE u.rut = :rut";
    }

    public int getData() {
        return data;
    }
    public String SelectQuery(){
        TypedQuery<Usuario> query = em.createQuery(query, Usuario.class);
        query.setParameter("rut", data);
        try {
            Usuario usuario = query.getSingleResult();
            System.out.println("El usuario: " + usuario.getRut() + " existe!");
        }catch (NoResultException e){
            System.out.println("El usuario no existe!");
            return null;
        }
         return query;
     }
}
