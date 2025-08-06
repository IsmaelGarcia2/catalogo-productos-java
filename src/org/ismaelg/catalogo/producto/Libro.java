package org.ismaelg.catalogo.producto;
import org.ismaelg.catalogo.interfaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro{
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;


    public Libro(int precio, Date fechaPublicacion, String titulo, String autor, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        long anios = (new Date().getTime() - fechaPublicacion.getTime()) / (1000L * 60 * 60 * 24 * 365);
        if (anios > 50) {
            System.out.println("⚠️ Libro considerado una obra clásica (más de 50 años).");
        }
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return "\"" + titulo.toUpperCase() + "\"";
    }

    @Override
    public String getEditorial() {
        if (editorial.equalsIgnoreCase("Penguin Random House") ||
                editorial.equalsIgnoreCase("HarperCollins")) {
            return editorial + " (Editorial de prestigio)";
        }
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        double precioBase = getPrecio();
        long aniosAntiguedad = (new Date().getTime() - fechaPublicacion.getTime()) / (1000L * 60 * 60 * 24 * 365);

        double valorAntiguedad = aniosAntiguedad > 10 ? precioBase * 0.25 : 0;
        double recargoAutor = autor.equalsIgnoreCase("Gabriel García Márquez") ? 0.30 : 0.10;
        double recargoEditorial = editorial.equalsIgnoreCase("Penguin Random House") ? 0.15 : 0.05;

        double recargoTotal = precioBase * (recargoAutor + recargoEditorial);
        return precioBase + valorAntiguedad + recargoTotal;
    }

    @Override
    public String toString() {
        return "📘 Título: " + getTitulo() + "\n" +
                "✍️ Autor: " + getAutor() + "\n" +
                "🏛️ Editorial: " + getEditorial() + "\n" +
                "📅 Publicación: " + getFechaPublicacion() + "\n" +
                "💵 Precio de venta: " + getPrecioVenta();
    }
}
