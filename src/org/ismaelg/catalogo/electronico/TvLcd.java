package org.ismaelg.catalogo.electronico;

public class TvLcd extends Electronico{
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        double recargoPorPulgada = 2.5;
        return getPrecio() + (pulgada * recargoPorPulgada);
    }

    @Override
    public String toString() {
        return super.toString() + "TvLcd{" +
                "pulgada=" + pulgada +
                ", PrecioVenta=" + String.format("%.2f",getPrecioVenta()) +
                '}';
    }
}
