package ec.edu.ups.practica2.tenecotaquillijosseline.clases;

                                                 //CLASE HIJA 
//Nombre de la clase.
//Extends permite la relación de herencia entre la clase Electronico y Producto.
class Electronico extends Producto {
//Atributo.
    private String peso; 
//Constructor.
    public Electronico(String nombre, int codigo, double costo, String peso) {
        super(nombre, codigo, costo);
        this.peso =peso;
    }
//Getter y setter.
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

//Metodo toString.

    @Override
    public String toString() {
        return "Electronico{" + "peso=" + peso + '}';
    }
}

