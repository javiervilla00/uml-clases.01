/**
 * Esta clase está añadida a GIT
 */
public class Procesador {
    //Estados, atributos, propiedades
    public String marca;
    public String modelo;
    public Double precio;
    //Comportamiento o método (funciones)
    //public (+) método accesible desde cualquier clase.
    // String: tipo devuelto por el método

    public String getNombreCompleto() {
        //Concatenar cadenas con +
        //AMD 760032.2
        return marca + " " + modelo + " " + precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPrecioConSimbolo() {
        return precio;
    }

}
