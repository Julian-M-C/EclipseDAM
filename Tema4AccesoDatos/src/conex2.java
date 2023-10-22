import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.TimeZone;

public class conex2 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        Connection connection = null;

        // Conectar a BD
        String BD = "practicas";
        String USUARIO = "root";
        String PASS = "";
        String HOST = "127.0.0.1:3308";
        Calendar now = Calendar.getInstance();
        TimeZone zonahoraria = now.getTimeZone();

        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD +
                    "?user=" + USUARIO + "&password=" + PASS +
                    "&useLegacyDatetimeCode=false&serverTimezone=" + zonahoraria.getID());
            
            if (connection != null) {
                System.out.println("Conexion establecida!");
            }

            //String consulta = "SELECT * FROM persona WHERE edad < 30 ORDER BY DNI";
            String consulta = "SELECT * FROM clientes";
            String insertar = "SELECT * FROM clientes";

            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(consulta);

            while (rset.next()) {
                String id = rset.getString("id");
                String nombre = rset.getString("nombre");
                String corr = rset.getString("correo");
                String celular = rset.getString("celular");

                System.out.println("id " + id + " nombre " + nombre + " correo " + corr + " telefono " + celular);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


