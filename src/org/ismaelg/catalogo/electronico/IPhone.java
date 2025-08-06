package org.ismaelg.catalogo.electronico;

public class IPhone extends Electronico{
    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.15;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", PrecioVenta=" + String.format("%.2f",getPrecioVenta()) +
                '}';
    }
}
