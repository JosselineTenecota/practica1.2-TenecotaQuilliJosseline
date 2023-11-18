
package ec.edu.ups.practica2.tenecotaquillijosseline.clases;
//Importar la clase Scanner.
import java.util.Scanner;
import java.util.List;

//Nombre de la clase Controlar. Permite controlar toda la funcion del codigo general.
//Ayuda para organizar mejor el codigo.
class Controlar {
//Atributos.
    private Usuario usuario;
    private Carrito carro;
    private MostrarPantalla mostrar;
    
//Controladores.
    public Controlar(){}
    public Controlar(Usuario usuario, Carrito carro, MostrarPantalla mostrar) {
        this.usuario = usuario;
        this.carro = carro;
        this.mostrar = mostrar;
    }
//Permite entrelazar el menú de opciones y posterior a eso escoje la opcion. 
    public void Sistema(Scanner scanner) {
        int opcion = 0;
        while (true) {
            mostrar.MenuDeOpciones();
            opcion = mostrar.Opcion(scanner);
            if (opcion == 3) {
                mostrar.mensajeFinal();
                break;
            }
            Opcion(opcion, scanner);
        }
    }
//Permite realizar el proceso dependiendo de la opción escogida. 
    public void Opcion(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                agregarProducto(scanner);
                break;
            case 2:
                realizarCompra();
                break;
        }
    }
//Permite agregar el producto al carrito de compras. 
    public void agregarProducto(Scanner scanner) {
        String nombre = mostrar.nombre(scanner);
        int codigo = mostrar.codigo(scanner);
        double costo = mostrar.costo(scanner);

//Permite agregar otro producto pero en relacion a las clases hijas.
        Producto producto;
        switch(nombre) {
            case "Electronico":
            System.out.print("¿Cuál es el peso del producto que desea comprar?: ");
            String peso = scanner.next();
            producto = new Electronico(nombre, codigo, costo, peso);
            break;
            case "Ropa":
            System.out.print("¿Cuál es el tipo de ropa que desea comprar?: ");
            String tipo = scanner.next();
            producto = new Ropa(nombre, codigo, costo, tipo);
            break;
            default:
            producto = new Producto(nombre, codigo, costo);
            break;
        }     

        carro.agregarProducto(producto);
    }
//Permite realizar la compra del producto.
    public void realizarCompra() {
        List<Producto> productosEnCarro = carro.getProductos();
        if (!productosEnCarro.isEmpty()) {
            
            mostrar.factura(productosEnCarro);
            mostrar.totalCompra(TotalCompra(carro));
        }
    }
//Permite calcular el total de la compra. 
    public double TotalCompra(Carrito carro) {
        double total = 0.0;
        List<Producto> productosEnCarro = carro.getProductos();

// Calcular el costo total de los productos en el carrito
        for (Producto producto : productosEnCarro) {
            total += producto.getCosto();
        }
        return total;
    }
}