package cl.ucn.modelo;

import java.util.List;

import cl.ucn.Interfaz.proxy;
import cl.ucn.util.Util;
 
public class DatabaseProxy implements proxy {
    private Databaseconec databaseconec;
    private Util util;


   public DatabaseProxy() {
        this.databaseconec = new Databaseconec(89830291, "SELECT u from Usuario u WHERE u.rut = :rut");
        this.util = new Util();  
    }
    @Override
 public String SelectQuery(){
    if(databaseconec.SelectQuery() == null){
        int comparar = databaseconec.getData();
        List<Usuario> usuarios = util.loadCsv();
        for (Usuario usuario : usuarios){
           if (comparar == usuario.getRut()) {
              System.out.println("El usuario: " + usuario.getRut() + " existe en el csv" );
                    return usuario.getNombre();
           }
        }
        }else{ databaseconec.SelectQuery();
            
 }
         return null;
}
}

