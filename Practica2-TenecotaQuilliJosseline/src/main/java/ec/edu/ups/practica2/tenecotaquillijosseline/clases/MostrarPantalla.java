
package ec.edu.ups.practica2.tenecotaquillijosseline.clases;
//Importar lista.
import java.util.List;
//Importar la clase Scanner; 
import java.util.Scanner;

//Nombre de la clase MostrarPantalla. Permite visualizar los comentarios y entrada de datos.
//Ayuda para mejorar la organización del código.
class MostrarPantalla {
//Permite mostrar el menu de opciones.
    public void MenuDeOpciones() {
        System.out.println(".....OPCIONES.....");
        System.out.println("1. Añadir producto para la compra.");
        System.out.println("2. Realizar la compra.");
        System.out.println("3. Finalizar el pedido.");
        System.out.print("Escoja la opción que desea: ");
    }
//Permite ingresar la opcion que escoje el usuario.
    public int Opcion(Scanner scanner) {
        return scanner.nextInt();
    }
//Permite ingresar el nombre del producto que desea.
    public String nombre(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        return scanner.next();
    }
//Permite ingresar el código del producto.
    public int codigo(Scanner scanner) {
        System.out.print("Ingrese el codigo del producto: ");
        return scanner.nextInt();
    }
//Permite ingresar el costo del producto.
    public double costo(Scanner scanner) {
        System.out.print("Ingrese el costo del producto: ");
        return scanner.nextDouble();
    }
//Permite mostrar el total de la compra.
    public void totalCompra(double total) {
        System.out.println("Total del pedido: $" + total);
    }
//Permite mostrar un resumen o factura de los productos comprados.
    public void factura(List<Producto> productos) {
        System.out.println("Factura de la compra realizada: ");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
//Permite mostrar un mensaje al finalizar el pedido.
    public void mensajeFinal() {
        System.out.println("Finalizada su compra con éxito!");
    }
}
