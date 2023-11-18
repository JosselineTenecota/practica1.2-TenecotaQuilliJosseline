
package ec.edu.ups.practica2.tenecotaquillijosseline.clases;
//Importar ArrayList.
import java.util.ArrayList;
//Importar lista.
import java.util.List;

//Nombre de la clase.
class Carrito {
//Atributo. Lista de productos.
    private List<Producto> productos;
//Constructor.
    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
//Getter y setter.
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
 
//Metodo toString.
    @Override
    public String toString() {
        return "Carrito{" + "productos=" + productos + '}';
    }

    
}
