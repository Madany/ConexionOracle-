
package conexionoracle;

import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionOracle {

    public static void main(String[] args) {
        if (Conexion.conectar() == null) {
            System.out.println("La conexion fallo!!!!!!");
            
        } else {
            System.out.println("La conexion fue exitosa.");
            
            try {
                 Statement st=Conexion.conectar().createStatement();
                 ResultSet rs=st.executeQuery("SELECT * FROM PERSONA");
                 while (rs.next()) {
                     System.out.println("id" +rs.getInt("ID_PERSONA")
                             +" "+rs.getString("NOMBRE")
                             +" "+rs.getString("APELLIDO_MAT")
                             +" "+rs.getString("APELLIDO_PAT"));
                    
                }
            } catch (Exception e) {
            }
 
           
        }
    }
    
}
