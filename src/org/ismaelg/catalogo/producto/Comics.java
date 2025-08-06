package org.ismaelg.catalogo.producto;

import java.util.Date;

public class Comics extends Libro{
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String titulo, String autor, String editorial, String personaje) {
        super(precio, fechaPublicacion, titulo, autor, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        double precioBase = getPrecio();


        long anios = (new Date().getTime() - getFechaPublicacion().getTime()) / (1000L * 60 * 60 * 24 * 365);


        if (anios >= 10) {
            return precioBase * 1.50;
        } else if (anios >= 5) {
            return precioBase * 1.30;
        } else {
            return precioBase * 1.10;
        }
    }

}
