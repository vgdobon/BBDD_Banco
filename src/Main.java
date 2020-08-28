import com.clases.BaseDeDatos;
import com.clases.Menu;

import java.sql.SQLException;

public class Main {
    public static BaseDeDatos bbdd = new BaseDeDatos();

    public static void main(String[] args) {
        Menu menu= new Menu();

        try {
            bbdd.conectarBD();
            menu.MenuPrincipal();


        }catch(SQLException e){
            System.out.println("Error de SQL "+e.toString());
        }   catch (ClassNotFoundException e) {
        System.out.println("No encuentro la clase: " + e.toString());
        }

    }
}
