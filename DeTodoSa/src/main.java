
import Entidades.Producto;
import Entidades.Rubro;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tDev
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TreeSet<Producto> productos = new TreeSet<>();
       Rubro com = new Rubro ("comestible",1);
       Producto arroz = new Producto(10, 10, com, 1234, "arroz");
       Producto cafe = new Producto(6, 40, com, 200, "cafe");
       productos.add(arroz);
       productos.add(cafe);
    }
    
}
