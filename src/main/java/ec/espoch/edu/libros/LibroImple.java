/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.libros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KARLA
 */
public class LibroImple {

    private final List<Libro> libros = null;
    private final ArrayList<Object> Libros;

    public LibroImple() {
        this.Libros = new ArrayList<>();
    }

    /**
     *
     * @param cuaderno
     */
    public void agregarCuaderno(Libro libro) {
        libros.add(libro);
    }

    public Libro obtenerPorCodigo(String codigoProducto) {
        for (Libro libro : libros) {
            if (libro.getCodigoProducto().equals(codigoProducto)) {
                return libro;
            }
        }
        return null;
    }

    public List<Libro> obtenerTodos() {
        return libros;
    }

    /**
     *
     * @param actualizarLibro
     */
    
    
    
    public void actualizarCuaderno(Libro actualizarLibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigoProducto().equals(actualizarLibro.getCodigoProducto())) {
                libros.set(i, actualizarLibro);
                return;
            }
        }
    }

    public void eliminarLibro(String codigoProducto) {
        libros.removeIf(libro -> libro.getCodigoProducto().equals(codigoProducto));
    }

}
