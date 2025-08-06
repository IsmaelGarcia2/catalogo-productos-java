package org.ismaelg.catalogo.electronico;

import org.ismaelg.catalogo.interfaces.IElectronico;
import org.ismaelg.catalogo.producto.Producto;

public class Electronico extends Producto implements IElectronico{
    private String fabricante;


    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return "";
    }


    @Override
    public String toString() {
        return "Electronico{" +
                "fabricante='" + fabricante + '\'' +
                '}';
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
