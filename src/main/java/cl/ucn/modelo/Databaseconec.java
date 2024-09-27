package cl.ucn.modelo;

import cl.ucn.Interfaz.proxy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Databaseconec implements proxy {
    private int data;
    private String query;
    private EntityManagerFactory emf;
    private EntityManager em;
 
    public Databaseconec(int data, String query){
        this.data = 89830291;
        this.query = "SELECT u from Usuario u WHERE u.rut = :rut";
        this.emf = Persistence.createEntityManagerFactory("multimediaApp");
        this.em = emf.createEntityManager();
    }

    public int getData() {
        return data;
    }
    @Override
    public String SelectQuery(){
        TypedQuery<Usuario> query2 = em.createQuery(query, Usuario.class);
        query2.setParameter("rut", data);
        try {
            Usuario usuario = query2.getSingleResult();
            System.out.println("El usuario: " + usuario.getRut() + " existe!");
        }catch (NoResultException e){
            System.out.println("El usuario no existe en la base de datos buscando en el csv");
            return null;
        }
         return query;
     }
}

