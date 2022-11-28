
package test;
import beans.Habitacion;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    public static void main(String[] args) {
      actualizarHabitacion(1,"");
        listarHabitacion();  
    }
    public static void actualizarHabitacion(int id_habitacion, String categoria){
        DBConnection con = new DBConnection();
        String sql = "UPDATE habitacion SET categoria =' "+categoria+" 'WHERE id_habitacion="+id_habitacion;
        try {
           Statement st = con.getConnection().createStatement();
           st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        } 
   } 
    public static void listarHabitacion(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM habitacion";
        try {
           Statement st = con.getConnection().createStatement();
           ResultSet rs = st.executeQuery(sql);
           while(rs.next()){
               int id_habitacion = rs.getInt("id_habitacion");
               String descripcion = rs.getString("descripcion");
               String categoria = rs.getString("categoria");
               String estado = rs.getString("estado");
               
               
               Habitacion habitaciones = new Habitacion(id_habitacion, descripcion, categoria, estado);
               System.out.println(habitaciones.toString());
             }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        } 
    }
}
