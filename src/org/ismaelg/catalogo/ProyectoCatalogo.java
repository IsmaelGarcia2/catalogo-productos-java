package org.ismaelg.catalogo;

import org.ismaelg.catalogo.electronico.IPhone;
import org.ismaelg.catalogo.electronico.TvLcd;
import org.ismaelg.catalogo.producto.Comics;
import org.ismaelg.catalogo.producto.Libro;
import org.ismaelg.catalogo.producto.Producto;

import java.util.Calendar;
import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        cal.set(2025,Calendar.DECEMBER,14);
        Date fechaLibro1 = cal.getTime();
        cal.set(2024,Calendar.APRIL,23);
        Date fechaLibro2 = cal.getTime();
        cal.set(2025,6,8);
        Date fechaLibro3 = cal.getTime();

        Producto[] producto = new Producto[12];

        producto[0] = new TvLcd(15000, "Samsung", 42);
        producto[1] = new TvLcd(18000, "LG", 50);
        producto[2] = new TvLcd(12000, "Sony", 32);

        producto[3] = new IPhone(48000, "Apple", "iPhone 13", "Negro");
        producto[4] = new IPhone(52000, "Apple", "iPhone 14 Pro", "Morado");
        producto[5] = new IPhone(39000, "Apple", "iPhone SE (2022)", "Blanco");

        producto[6] = new Libro(1500, fechaLibro1, "Cien años de soledad", "Gabriel García Márquez", "Sudamericana");
        producto[7] = new Libro(1200, fechaLibro2, "1984", "George Orwell", "Secker & Warburg");
        producto[8] = new Libro(1800, fechaLibro3, "Sapiens: De animales a dioses", "Yuval Noah Harari", "Debate");

        cal.set(2011, Calendar.SEPTEMBER, 14);  // Año, Mes, Día
        Date fechaComics1 = cal.getTime();

        cal.set(2016, Calendar.MAY, 25);
        Date fechaComics2 = cal.getTime();

        cal.set(2020, Calendar.OCTOBER, 7);
        Date fechaComics3 = cal.getTime();

        producto[9] = new Comics(800, fechaComics1, "Batman: El Tribunal de los Búhos", "Scott Snyder", "DC Comics", "Batman");
        producto[10] = new Comics(950, fechaComics2, "Spider-Man: Renueva tus votos", "Gerry Conway", "Marvel Comics", "Spider-Man");
        producto[11] = new Comics(1100, fechaComics3, "Iron Man 2020", "Dan Slott", "Marvel Comics", "Iron Man");

        System.out.println();
        for (Producto prod: producto){
            System.out.println("====================================================");
            System.out.println(prod);
            System.out.println("====================================================");
        }
    }
}
