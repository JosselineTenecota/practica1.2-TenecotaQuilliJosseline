
package ec.edu.ups.practica2.tenecotaquillijosseline.clases;
//Importar la clase Scanner. 
import java.util.Scanner;

//FORMA DE USAR EL SISTEMA.
/**El usuario ingresa el nombre de la persona que va a realizar la compra de algún producto.
 * Tiene opcion a escoger cualquier producto y posterior a eso se registra un código de referencia 
 * y el costo. 
 * Finalmente concluye con una factura o comprobante de compra y da a conocer el producto que adquirió.
 */

//Clase principal que permite realizar la ejecución del código general.
public class PrincipalSistema {
    public static void main(String[] args) {
//Clase Scanner para ingresar e instanciar objetos.
        Scanner scanner = new Scanner(System.in);

//Permite ingresar el nombre del usuario
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();

//Permite la creación del usuario.
        Usuario u = new Usuario(nombre);
//Permite la creación del carrito de compras. 
        Carrito carro = new Carrito();

//Permite la creación de todo lo que va a mostrar la ejecución.
        MostrarPantalla pantalla = new MostrarPantalla();
//Permite la creación de un controlador para todo el código.
        Controlar controla = new Controlar(u, carro, pantalla);
        controla.Sistema(scanner);
    }
}
