import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.TimeZone;

public class conex {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        Connection connection = null;

        // Conectar a BD
        String BD = "tema4";
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
            String consulta = "SELECT * FROM persona";

            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(consulta);

            while (rset.next()) {
                String DNI = rset.getString("DNI");
                String nombre = rset.getString("NOMBRE");
                String ape = rset.getString("APELLIDO");
                String edad = rset.getString("EDAD");

                System.out.println("DNI " + DNI + " nombre " + nombre + " apellido " + ape + " edad " + edad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

