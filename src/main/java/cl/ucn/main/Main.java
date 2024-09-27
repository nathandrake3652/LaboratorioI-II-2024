package cl.ucn.main;

import cl.ucn.modelo.DatabaseProxy;
import cl.ucn.modelo.Usuario;
import jakarta.persistence.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

       
        Proxy databaseProxy = new DatabaseProxy();
        databaseProxy.SelectQuery();

        // Parte 2
       /*  jpql = "SELECT u from Usuario u";
        TypedQuery<Usuario> query1 = em.createQuery(jpql, Usuario.class);
        List<Usuario> usuarios = query1.getResultList();
        for (Usuario usuario : usuarios){

            System.out.println("Rut: " + usuario.getRut() + " Permiso: " + usuario.isTienePermiso() + " Archivo: " +
                    usuario.getRecursosMultimedia().getNombre() + " Protegido: " + usuario.getRecursosMultimedia().isProtegido());
        */
        }

        em.close();

    }
}
