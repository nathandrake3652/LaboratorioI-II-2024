package cl.ucn.modelo;

import java.util.List;

import cl.ucn.util.Util;
 
public class DatabaseProxy implements proxy {
    private Databaseconec databaseconec;
    private Util util;

 public void SelectQuery(){
    if(databaseconec.SelectQuery() == null){
        String comparar = databaseconec.getData();
        List<Usuario> usuarios = util.loadCsv();
        for (Usuario usuario : usuarios){
           if (comparar.equals(usuario.getRut())) {
              System.out.println("Rut: " + usuario.getRut() + " Permiso: " + usuario.isTienePermiso() + " Archivo: " +
                    usuario.getRecursosMultimedia().getNombre() + " Protegido: " + usuario.getRecursosMultimedia().isProtegido());
           }
        }
        }else{ databaseconec.SelectQuery();
            
 }
}
}
